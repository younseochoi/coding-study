import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    HashMap<String, Link> Links;
        public int solution(String word, String[] pages) {
            Links = new HashMap<>();
            
            // 자기 자신의 url을 추출한다.
            
            Pattern home_url_pattern = Pattern.compile("<meta property=\"og:url\" content=\"(\\S*)\"");
            
            // 연결된 외부 링크들을 추출한다.
            
            Pattern url_pattern = Pattern.compile("<a href=\"https://(\\S*)\"");
            
            // 기본점수(=word 등장 횟수)를 계산한다. 
            
            Pattern word_pattern = Pattern.compile("\\b(?i)"+word+"\\b");
            
            Matcher url_matcher, word_matcher, home_url_matcher;

            ArrayList<String> ext_urls;
            Link new_Link;
            String body;
            String home_url = "";

            for(int i = 0; i < pages.length; i++){
                url_matcher = url_pattern.matcher(pages[i]);
                home_url_matcher = home_url_pattern.matcher(pages[i]);

                if(home_url_matcher.find()){
                    home_url = home_url_matcher.group().split("=")[2].replaceAll("\"", "");
                }
                
                new_Link = new Link(i, home_url);
                
                ext_urls = new ArrayList<>();

                while(url_matcher.find()) {
                    ext_urls.add(url_matcher.group().split("\"")[1]);
                }
                new_Link.setExtUrls(ext_urls);
                
                
                body = pages[i].split("<body>")[1].split("</body>")[0].replaceAll("[0-9]", " ");            
                word_matcher = word_pattern.matcher(body);
                int word_cnt = 0;
                while(word_matcher.find())
                    word_cnt++;

                new_Link.point = word_cnt;
                new_Link.setLinkPoint();

                Links.put(new_Link.url, new_Link);
            }

            for(Link link: Links.values()){
                for(String ext_url : link.ext_urls){
                    if(Links.containsKey(ext_url)){
                        Links.get(ext_url).point += link.link_point;
                    }
                }
            }
            
            // 매칭점수가 가장 높은 페이지를 찾는다.
            
            double max_point = 0;
            int answer = 0;
            for(Link link: Links.values()){
                if(link.point == max_point){
                    if(link.index < answer)
                        answer = link.index;
                }
                else if(link.point > max_point) {
                    answer = link.index;
                    max_point = link.point;
                }
            }

            return answer;
        }
    
        // 기본점수, 외부 링크들, 링크 점수, 인덱스를 가지는 클래스이다.

        class Link{
            String url;
            String[] ext_urls;
            double point, link_point;
            int index;

            public Link(int i, String url){
                this.index = i;
                this.url = url;
            }
            
            public void setExtUrls(ArrayList<String> urls){
                this.ext_urls = new String[urls.size()];
                for(int i = 0; i < urls.size(); i++){
                    ext_urls[i] = urls.get(i);
                }
            }

            public void setLinkPoint(){
                this.link_point = this.point / ext_urls.length;
            }
        }
}


/*
참고 : https://dev-note-97.tistory.com/244
정확성  테스트
테스트 1 〉	통과 (15.65ms, 75.9MB)
테스트 2 〉	통과 (18.59ms, 83.1MB)
테스트 3 〉	통과 (15.02ms, 79.4MB)
테스트 4 〉	통과 (16.85ms, 89.2MB)
테스트 5 〉	통과 (28.23ms, 87.4MB)
테스트 6 〉	통과 (19.60ms, 84.4MB)
테스트 7 〉	통과 (22.73ms, 88.8MB)
테스트 8 〉	통과 (22.11ms, 85.7MB)
테스트 9 〉	통과 (14.72ms, 80.9MB)
테스트 10 〉	통과 (25.96ms, 89MB)
테스트 11 〉	통과 (16.71ms, 74.8MB)
테스트 12 〉	통과 (17.01ms, 82.4MB)
테스트 13 〉	통과 (15.83ms, 78MB)
테스트 14 〉	통과 (15.64ms, 80.2MB)
테스트 15 〉	통과 (16.95ms, 77.7MB)
테스트 16 〉	통과 (10.55ms, 74.8MB)
테스트 17 〉	통과 (17.29ms, 88.5MB)
테스트 18 〉	통과 (8.85ms, 76.5MB)
테스트 19 〉	통과 (12.41ms, 79.9MB)
테스트 20 〉	통과 (14.15ms, 78.3MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

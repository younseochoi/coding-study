import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList();
        ArrayList<String> genresList = new ArrayList();
        HashMap totalPlays = new HashMap();
        HashMap<Integer, Integer> playsMap = new HashMap();
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap();
        
        for(int i=0; i < genres.length; i++) {
            if(!genresList.contains(genres[i])) {   // 한 번도 안 거친 장르일 경우
                genresList.add(genres[i]);          // 거쳐 간 장르로 추가

                playsMap.put(i, plays[i]);               // plays 키, 값 저장
                music.put(genres[i], playsMap);          // 장르별 plays 담기
                totalPlays.put(genres[i], plays[i]);     // 장르별 총 재생 수 담기
                playsMap = new HashMap();                // 초기화
                
            } else {
                music.get(genres[i]).put(i, plays[i]);   // 장르별 plays 추가 업데이트
                totalPlays.put(genres[i], Integer.parseInt(totalPlays.get(genres[i]).toString()) + plays[i]);   // 재생 수 업데이트
            }
        }
        
        // 곡 많은 수대로 정렬
        List<String> genresOrder = new ArrayList(totalPlays.keySet());
        Collections.sort(genresOrder, (s1, s2) -> Integer.parseInt(totalPlays.get(s2).toString()) 
                                               - Integer.parseInt(totalPlays.get(s1).toString()));
        
        // 장르 별 재생수대로 정렬 후 top2 재생 곡 고유번호 answer에 넣기
        for(String key : genresOrder) {
            List<Integer> playsOrder = new ArrayList(music.get(key).keySet());
            Collections.sort(playsOrder, (s1, s2) -> music.get(key).get(s2) - music.get(key).get(s1));
            answer.add(playsOrder.get(0));
            
            if (playsOrder.size() > 1) {
                answer.add(playsOrder.get(1));
            }
        }
        
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (1.29ms, 72.1MB)
// 테스트 2 〉	통과 (1.88ms, 72.8MB)
// 테스트 3 〉	통과 (1.30ms, 76.9MB)
// 테스트 4 〉	통과 (1.65ms, 73.1MB)
// 테스트 5 〉	통과 (2.61ms, 67.7MB)
// 테스트 6 〉	통과 (1.91ms, 72.6MB)
// 테스트 7 〉	통과 (2.31ms, 76.9MB)
// 테스트 8 〉	통과 (1.72ms, 77.2MB)
// 테스트 9 〉	통과 (1.39ms, 73.5MB)
// 테스트 10 〉	통과 (2.02ms, 77.4MB)
// 테스트 11 〉	통과 (3.91ms, 76.7MB)
// 테스트 12 〉	통과 (3.35ms, 79.7MB)
// 테스트 13 〉	통과 (2.27ms, 81.8MB)
// 테스트 14 〉	통과 (2.27ms, 73.5MB)
// 테스트 15 〉	통과 (1.44ms, 79.5MB)


/* 런타임에러 
ArrayList<Integer> answer = new ArrayList();
ArrayList<String> genresList = new ArrayList();
HashMap totalPlays = new HashMap();
HashMap<Integer, Integer> playsMap = new HashMap();
HashMap<String, HashMap<Integer, Integer>> music = new HashMap();

// 중복 제거
for(int i=0; i < genres.length; i++) {
    if(!genresList.contains(genres[i])) {
        genresList.add(genres[i]);
    }
}

// 총 재생 횟수와 장르별 분리한 리스트 생성
for(int i=0; i < genresList.size(); i++) {
    int sum = 0;        // 총 재생 수 담을 변수

    for(int j=0; j < plays.length; j++) {
        if (genresList.get(i).equals(genres[j])) {
            sum += plays[j];
            playsMap.put(j, plays[j]); 
        }
    }
    totalPlays.put(genresList.get(i), sum);     // 장르별 총 재생 수 담기
    music.put(genresList.get(i), playsMap);     // 장르별 plays 담기
    playsMap = new HashMap();
}

// 곡 많은 수대로 정렬
List<String> genresOrder = new ArrayList(totalPlays.keySet());
Collections.sort(genresOrder, (s1, s2) -> Integer.parseInt(totalPlays.get(s2).toString()) 
                                       - Integer.parseInt(totalPlays.get(s1).toString()));

// 장르 별 재생수대로 정렬 후 top2 재생 곡 고유번호 answer에 넣기
for(String key : genresOrder) {
    List<Integer> playsOrder = new ArrayList(music.get(key).keySet());
    Collections.sort(playsOrder, (s1, s2) -> music.get(key).get(s2) - music.get(key).get(s1));
    answer.add(playsOrder.get(0));

    if (playsOrder.size() > 1) {
        answer.add(playsOrder.get(1));
    }
}

return answer; */
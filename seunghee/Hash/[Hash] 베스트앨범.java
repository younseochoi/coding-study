import java.util.*;

public class Solution {

    static class Music{
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }

    public static int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
        }

        // 1. 장르 선정
        ArrayList<String> genres_ordered = new ArrayList<>();
        while(map.size()!=0){
            int max = -1;
            String max_key = "";
            for(String key : map.keySet()){
                int tmp_cnt = map.get(key);
                if(tmp_cnt>max){
                    max = tmp_cnt;
                    max_key = key;
                }
            }
            genres_ordered.add(max_key);
            map.remove(max_key);
        }
		
        // 2. 장르 내 노래 선정
        ArrayList<Music> result = new ArrayList<>();
        for(String gern : genres_ordered){
            ArrayList<Music> list = new ArrayList<>();
            for(int i=0; i<genres.length; i++){
                if(genres[i].equals(gern)){
                    list.add(new Music(gern, plays[i], i));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play); // 내림차순 소팅
            result.add(list.get(0)); 	// 1개는 무조건 수록
            if(list.size()!=1){ 	// 더 수록할 곡이 있으면(==장르 내의 노래가 1개보다 많으면) 수록
                result.add(list.get(1));
            }
        }
        
        // print result
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i).idx;
        }
        return answer;
    }
}

//혼자 힘으로 풀다가 실패해서 다른분의 코드 참고했습니다 ㅠㅠ
/*
정확성  테스트
테스트 1 〉	통과 (1.81ms, 74.1MB)
테스트 2 〉	통과 (1.30ms, 74.4MB)
테스트 3 〉	통과 (0.88ms, 82.3MB)
테스트 4 〉	통과 (1.06ms, 80.1MB)
테스트 5 〉	통과 (1.26ms, 78.6MB)
테스트 6 〉	통과 (1.21ms, 79.2MB)
테스트 7 〉	통과 (1.37ms, 76.3MB)
테스트 8 〉	통과 (1.91ms, 74.8MB)
테스트 9 〉	통과 (1.13ms, 76.6MB)
테스트 10 〉	통과 (1.34ms, 75.6MB)
테스트 11 〉	통과 (1.22ms, 77.4MB)
테스트 12 〉	통과 (1.53ms, 68.9MB)
테스트 13 〉	통과 (1.10ms, 78.7MB)
테스트 14 〉	통과 (1.30ms, 78.3MB)
테스트 15 〉	통과 (0.75ms, 73.4MB)
*/
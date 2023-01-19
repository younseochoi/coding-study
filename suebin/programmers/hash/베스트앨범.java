import java.util.*;

public class Solution {

    static class Music{
        String genre;
        int play;
        int index;

        public Music(String genre, int play, int index) {
            this.genre = genre;
            this.play = play;
            this.index = index;
        }
    }

    public static int[] solution(String[] genres, int[] plays) {
    
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]); // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        }

        // 장르를 선정한다.
        
        ArrayList<String> genresSort = new ArrayList<>();
        
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
            genresSort.add(max_key);
            map.remove(max_key);
        }
		
        // 장르 내 노래를 선정한다.
        
        ArrayList<Music> result = new ArrayList<>();
        for(String gern : genresSort){
            ArrayList<Music> list = new ArrayList<>();
            for(int i=0; i<genres.length; i++){
                if(genres[i].equals(gern)){
                    list.add(new Music(gern, plays[i], i));
                }
            }
            
            // 내림차순 정렬
            
            Collections.sort(list, (o1, o2) -> o2.play - o1.play); 
            
            // 수록된 곡
            
            result.add(list.get(0));
            
            // 더 수록할 곡이 있으면 수록한다.
            
            if(list.size()!=1){ 	
                result.add(list.get(1));
            }
        }
    
        int[] answer = new int[result.size()];
        
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i).index;
        }
        return answer;
    }
}

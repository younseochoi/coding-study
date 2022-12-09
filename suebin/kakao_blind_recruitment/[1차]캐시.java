import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        // cache size가 0이면 모든 경우는 cache miss 이다.
        
        if (cacheSize == 0) return cities.length*5;
        
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();
        
        for (int i=0; i<cities.length; i++) {
            
            // 대문자로 통일한다.
            
            String s = cities[i].toUpperCase();
            
            // cache hit 인 경우 실행시간은 1이다.
            
            if (cache.remove(s)) {
                answer += 1;
                cache.add(s);
            }
            
            // cache miss 인 경우 실행시간은 5이다.
            
            else {
                answer += 5;
                
                if (cache.size() >= cacheSize) {
                    cache.remove(0);
                }
                cache.add(s);
            }
        }
        
        return answer;
    }
}

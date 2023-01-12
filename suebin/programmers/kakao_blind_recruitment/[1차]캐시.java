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


/*
정확성  테스트
테스트 1 〉	통과 (0.24ms, 75.3MB)
테스트 2 〉	통과 (0.23ms, 77.6MB)
테스트 3 〉	통과 (0.27ms, 74.7MB)
테스트 4 〉	통과 (0.18ms, 66.6MB)
테스트 5 〉	통과 (0.17ms, 77.8MB)
테스트 6 〉	통과 (0.02ms, 85.5MB)
테스트 7 〉	통과 (0.01ms, 72.3MB)
테스트 8 〉	통과 (0.26ms, 73.5MB)
테스트 9 〉	통과 (0.19ms, 71.6MB)
테스트 10 〉	통과 (0.62ms, 75.2MB)
테스트 11 〉	통과 (41.89ms, 126MB)
테스트 12 〉	통과 (0.56ms, 68.8MB)
테스트 13 〉	통과 (0.60ms, 84.7MB)
테스트 14 〉	통과 (0.97ms, 72.3MB)
테스트 15 〉	통과 (1.59ms, 82.3MB)
테스트 16 〉	통과 (1.59ms, 81.1MB)
테스트 17 〉	통과 (0.02ms, 77.2MB)
테스트 18 〉	통과 (1.92ms, 74.7MB)
테스트 19 〉	통과 (2.19ms, 81.3MB)
테스트 20 〉	통과 (2.97ms, 78.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

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
            
            // cachs miss 인 경우 실행시간은 5이다.
            
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
테스트 1 〉	통과 (0.26ms, 76.9MB)
테스트 2 〉	통과 (0.19ms, 77.4MB)
테스트 3 〉	통과 (0.25ms, 76.2MB)
테스트 4 〉	통과 (0.25ms, 73.9MB)
테스트 5 〉	통과 (0.12ms, 76.4MB)
테스트 6 〉	통과 (0.02ms, 80.1MB)
테스트 7 〉	통과 (0.02ms, 75.6MB)
테스트 8 〉	통과 (0.18ms, 73.1MB)
테스트 9 〉	통과 (0.21ms, 80.6MB)
테스트 10 〉	통과 (0.51ms, 77.8MB)
테스트 11 〉	통과 (29.17ms, 128MB)
테스트 12 〉	통과 (0.52ms, 76.6MB)
테스트 13 〉	통과 (0.81ms, 74.4MB)
테스트 14 〉	통과 (0.87ms, 76.2MB)
테스트 15 〉	통과 (1.30ms, 77.1MB)
테스트 16 〉	통과 (1.38ms, 78.2MB)
테스트 17 〉	통과 (0.03ms, 76.2MB)
테스트 18 〉	통과 (3.53ms, 71.6MB)
테스트 19 〉	통과 (2.27ms, 81.9MB)
테스트 20 〉	통과 (1.98ms, 77.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

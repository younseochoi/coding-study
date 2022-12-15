//참고 : https://velog.io/@hyeon930/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%BA%90%EC%8B%9C-Java
//제가 틀렸던 이유는 초반에 cacheSize만큼 할당 해 준게 틀렸더라구요...! 이상하게 어렵게 풀었습니다 ㅠㅠㅋㅋ
import java.util.*;

class Solution {
    
    static final int CACHE_HIT = 1;
    static final int CACHE_MISS = 5;
    
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return 5 * cities.length;
        
        int answer = 0;
        
        LinkedList<String> cache = new LinkedList<>();
        
        for(int i = 0 ; i < cities.length ; ++i){
            String city = cities[i].toUpperCase();
            
            // cache hit
            if(cache.remove(city)){
                cache.addFirst(city);
                answer += CACHE_HIT;
            
            // cache miss
            } else {
                int currentSize = cache.size();
                
                if(currentSize == cacheSize){
                    cache.pollLast();
                }
                
                cache.addFirst(city);
                answer += CACHE_MISS;
            }
        }
        return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (1.38ms, 81MB)
테스트 2 〉	통과 (0.16ms, 82.3MB)
테스트 3 〉	통과 (0.21ms, 75.2MB)
테스트 4 〉	통과 (0.16ms, 74.6MB)
테스트 5 〉	통과 (0.16ms, 76.2MB)
테스트 6 〉	통과 (0.02ms, 70.9MB)
테스트 7 〉	통과 (0.03ms, 79.5MB)
테스트 8 〉	통과 (0.17ms, 72.6MB)
테스트 9 〉	통과 (0.19ms, 74.3MB)
테스트 10 〉	통과 (0.61ms, 74.8MB)
테스트 11 〉	통과 (32.53ms, 123MB)
테스트 12 〉	통과 (0.39ms, 78MB)
테스트 13 〉	통과 (0.65ms, 73.3MB)
테스트 14 〉	통과 (1.10ms, 76.2MB)
테스트 15 〉	통과 (1.67ms, 80.5MB)
테스트 16 〉	통과 (1.47ms, 80MB)
테스트 17 〉	통과 (0.03ms, 73MB)
테스트 18 〉	통과 (1.87ms, 66.8MB)
테스트 19 〉	통과 (2.23ms, 75.3MB)
테스트 20 〉	통과 (2.57ms, 79.2MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
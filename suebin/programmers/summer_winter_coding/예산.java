import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        // 오름차순 정렬
        
        Arrays.sort(d);
        
        // 최대 몇 개의 부서에 물품을 지원할 수 있는지 구한다.
        
        int sum = 0;    
    
        for (int i=0; i<d.length; i++) {
            
            sum += d[i];
            
            if (sum <= budget) {
                answer++;
            }
            else break;
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.33ms, 75.3MB)
테스트 2 〉	통과 (0.44ms, 69.3MB)
테스트 3 〉	통과 (0.34ms, 74.3MB)
테스트 4 〉	통과 (0.32ms, 73.7MB)
테스트 5 〉	통과 (0.31ms, 72.8MB)
테스트 6 〉	통과 (0.34ms, 76.3MB)
테스트 7 〉	통과 (0.34ms, 75.7MB)
테스트 8 〉	통과 (0.45ms, 75MB)
테스트 9 〉	통과 (0.34ms, 75.4MB)
테스트 10 〉	통과 (0.49ms, 85.8MB)
테스트 11 〉	통과 (0.51ms, 74.9MB)
테스트 12 〉	통과 (0.54ms, 85.6MB)
테스트 13 〉	통과 (0.43ms, 76MB)
테스트 14 〉	통과 (0.46ms, 78.9MB)
테스트 15 〉	통과 (0.34ms, 75.3MB)
테스트 16 〉	통과 (0.36ms, 69.8MB)
테스트 17 〉	통과 (0.50ms, 66.6MB)
테스트 18 〉	통과 (0.38ms, 74.4MB)
테스트 19 〉	통과 (0.35ms, 66.8MB)
테스트 20 〉	통과 (0.31ms, 73.2MB)
테스트 21 〉	통과 (0.36ms, 71.1MB)
테스트 22 〉	통과 (0.40ms, 72MB)
테스트 23 〉	통과 (0.35ms, 73.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

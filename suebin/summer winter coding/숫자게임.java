import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        // 오름차순 정렬
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        // B가 이기는 경우 찾기
        
        int B_index = A.length-1;
        
        for (int i=A.length-1; i>=0; i--) {
            
            if (B[B_index] > A[i]){
                answer++;
                B_index--;
            }
        }
        
        return answer;
    }
}


/*
정확성  테스트
테스트 1 〉	통과 (0.34ms, 72.4MB)
테스트 2 〉	통과 (0.37ms, 77.1MB)
테스트 3 〉	통과 (0.32ms, 74MB)
테스트 4 〉	통과 (0.50ms, 74.6MB)
테스트 5 〉	통과 (1.56ms, 72.8MB)
테스트 6 〉	통과 (0.52ms, 74.5MB)
테스트 7 〉	통과 (0.39ms, 73MB)
테스트 8 〉	통과 (0.68ms, 72.4MB)
테스트 9 〉	통과 (0.88ms, 80MB)
테스트 10 〉	통과 (0.83ms, 78MB)
테스트 11 〉	통과 (0.87ms, 75.5MB)
테스트 12 〉	통과 (0.61ms, 80.2MB)
테스트 13 〉	통과 (3.65ms, 85.6MB)
테스트 14 〉	통과 (5.16ms, 77.9MB)
테스트 15 〉	통과 (3.90ms, 82.9MB)
테스트 16 〉	통과 (4.56ms, 88.6MB)
테스트 17 〉	통과 (0.41ms, 79.3MB)
테스트 18 〉	통과 (0.51ms, 75.2MB)
효율성  테스트
테스트 1 〉	통과 (110.94ms, 65.3MB)
테스트 2 〉	통과 (59.86ms, 64.9MB)
테스트 3 〉	통과 (109.31ms, 64.8MB)
채점 결과
정확성: 85.7
효율성: 14.3
합계: 100.0 / 100.0
*/

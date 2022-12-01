import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int a=A.length-1, b=B.length-1;
        while(true){
            if(a==-1||b==-1)
                break;
            
            if (A[a]>=B[b]){ //확실히 못이기는거는 넘어가기
                a--;
                continue;
            }
            answer++;
            a--;
            b--;
        }
        
        return answer;
    }
}
/*
 * 정확성  테스트
테스트 1 〉	통과 (0.85ms, 78.8MB)
테스트 2 〉	통과 (1.18ms, 79.1MB)
테스트 3 〉	통과 (0.43ms, 78.5MB)
테스트 4 〉	통과 (1.16ms, 83.9MB)
테스트 5 〉	통과 (0.35ms, 72.2MB)
테스트 6 〉	통과 (3.96ms, 75.4MB)
테스트 7 〉	통과 (0.53ms, 77.1MB)
테스트 8 〉	통과 (0.43ms, 76.9MB)
테스트 9 〉	통과 (1.30ms, 77.1MB)
테스트 10 〉	통과 (0.89ms, 75.5MB)
테스트 11 〉	통과 (1.31ms, 75.4MB)
테스트 12 〉	통과 (0.62ms, 71.8MB)
테스트 13 〉	통과 (5.25ms, 78.7MB)
테스트 14 〉	통과 (6.94ms, 78.6MB)
테스트 15 〉	통과 (5.32ms, 77.4MB)
테스트 16 〉	통과 (5.66ms, 81MB)
테스트 17 〉	통과 (0.42ms, 74.3MB)
테스트 18 〉	통과 (0.53ms, 77.1MB)
효율성  테스트
테스트 1 〉	통과 (60.09ms, 67.8MB)
테스트 2 〉	통과 (54.77ms, 64MB)
테스트 3 〉	통과 (107.26ms, 64MB)
채점 결과
정확성: 85.7
효율성: 14.3
합계: 100.0 / 100.0
 */
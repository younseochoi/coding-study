import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i=0; i<n; i++) {
            
            // 1. 10진수를 2진수로 변환 : 비트 논리 연산자 OR 사용
            
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            binary = String.format("%" + n + "s", binary);
            
            // 2. replace 함수로 문자열을 치환한다.
            
            binary = binary.replace('0', ' ');
            binary = binary.replace('1', '#');        
            answer[i] = binary;
        }
        return answer;
    }
}


/*
정확성  테스트
테스트 1 〉	통과 (6.57ms, 74.2MB)
테스트 2 〉	통과 (7.89ms, 75.1MB)
테스트 3 〉	통과 (7.25ms, 75.8MB)
테스트 4 〉	통과 (6.54ms, 71.3MB)
테스트 5 〉	통과 (6.65ms, 68.2MB)
테스트 6 〉	통과 (9.05ms, 81.1MB)
테스트 7 〉	통과 (6.79ms, 78.5MB)
테스트 8 〉	통과 (6.97ms, 78.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

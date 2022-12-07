// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/17681
import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<n; i++) {
            // Integer.toBinaryString(arr1[i] | arr2[i]) -> 이렇게 쓰면 두 값 중 하나라도 1이면 1, 두 값 모두 0이면 0으로 처리
            String s1 = String.format("%16s", Integer.toBinaryString(arr1[i])).replace(" ", "0");
            String s2 = String.format("%16s", Integer.toBinaryString(arr2[i])).replace(" ", "0");

            // 지도 길이에 맞게 자르기
            s1 = s1.substring(16-n, 16);
            s2 = s2.substring(16-n, 16);
            
            for (int j=0; j<n; j++) {
                if (s1.charAt(j) == '1' || s2.charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            } 
            answer[i] = sb.substring(0, n);
            sb.delete(0, n);
        }
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (1.29ms, 76.9MB)
// 테스트 2 〉	통과 (1.69ms, 75.9MB)
// 테스트 3 〉	통과 (0.85ms, 79.9MB)
// 테스트 4 〉	통과 (1.77ms, 79.7MB)
// 테스트 5 〉	통과 (0.98ms, 76.4MB)
// 테스트 6 〉	통과 (1.67ms, 73.6MB)
// 테스트 7 〉	통과 (1.23ms, 77.2MB)
// 테스트 8 〉	통과 (1.28ms, 71.9MB)

// for (int i = 0; i < n; i++) {
//     ans[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]))
//     .replace('1', '#').replace('0', ' ');
// }
// 로 쓰면 한 줄로 해결 가능하지만 시간복잡도 증가
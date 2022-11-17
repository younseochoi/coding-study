import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int cur = 0;
        char max;
        
        // 문자 수정이 빈번하게 일어날 때 이용
        StringBuilder sb = new StringBuilder();
        
        // k 수만큼 제거한 글자 수까지
        for (int i=0; i < number.length() - k; i++) {
            max = '0';
            
            // 현재 위치에서 k + i 까지 탐색
            for (int j=cur; j <= k + i; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    cur = j + 1;
                }
            }
            sb.append(max);
        }
        
        answer = sb.toString();
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.03ms, 71.9MB)
// 테스트 2 〉	통과 (0.03ms, 77.7MB)
// 테스트 3 〉	통과 (0.04ms, 75.1MB)
// 테스트 4 〉	통과 (0.25ms, 76.5MB)
// 테스트 5 〉	통과 (0.55ms, 77.2MB)
// 테스트 6 〉	통과 (18.36ms, 88.3MB)
// 테스트 7 〉	통과 (52.28ms, 75.4MB)
// 테스트 8 〉	통과 (233.34ms, 85.7MB)
// 테스트 9 〉	통과 (19.79ms, 94.6MB)
// 테스트 10 〉	통과 (8638.88ms, 86.2MB)
// 테스트 11 〉	통과 (0.03ms, 71MB)
// 테스트 12 〉	통과 (0.04ms, 75.9MB)
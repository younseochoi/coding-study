// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12973#qna
import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        
        // s를 character 형식의 리스트로 만들어 반복문 돌기
        for(char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        answer = stack.isEmpty() ? 1 : 0;
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.20ms, 70.6MB)
// 테스트 2 〉	통과 (17.28ms, 79.7MB)
// 테스트 3 〉	통과 (13.91ms, 71.2MB)
// 테스트 4 〉	통과 (15.29ms, 76.7MB)
// 테스트 5 〉	통과 (16.75ms, 84.8MB)
// 테스트 6 〉	통과 (14.46ms, 86.4MB)
// 테스트 7 〉	통과 (13.52ms, 99.6MB)
// 테스트 8 〉	통과 (15.50ms, 90.9MB)
// 테스트 9 〉	통과 (0.19ms, 74.4MB)
// 테스트 10 〉	통과 (0.25ms, 71.6MB)
// 테스트 11 〉	통과 (0.21ms, 69.9MB)
// 테스트 12 〉	통과 (0.27ms, 76.2MB)
// 테스트 13 〉	통과 (0.18ms, 74.8MB)
// 효율성  테스트
// 테스트 1 〉	통과 (65.07ms, 63.6MB)
// 테스트 2 〉	통과 (45.14ms, 57.8MB)
// 테스트 3 〉	통과 (96.27ms, 60.8MB)
// 테스트 4 〉	통과 (53.87ms, 60.6MB)
// 테스트 5 〉	통과 (56.32ms, 60.3MB)
// 테스트 6 〉	통과 (53.62ms, 60.9MB)
// 테스트 7 〉	통과 (55.83ms, 60.5MB)
// 테스트 8 〉	통과 (55.09ms, 60.1MB)


// 효율성 실패
class Solution {
    public int solution(String s) {
        int answer = -1;
        StringBuffer sb = new StringBuffer(s);
        
        for (int i=0; i < sb.length() -1; i++) {
            if (sb.charAt(i) == sb.charAt(i+1)) {
                sb.delete(i, i+2);
                
                if (i+1 > 1) {
                    i = i -2;
                } else if (i+1 == 1) {
                    i--;
                }
            }
        }
        answer = sb.length() == 0 ? 1 : 0;
        return answer;
    }
}
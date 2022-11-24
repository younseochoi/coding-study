import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i=0; i<s.length(); i++) {
            answer += check(s) ? 1 : 0;
            
            // 문자열 회전
            s = s.substring(1, s.length()) + s.charAt(0);
        }
        return answer;
    }
    
    public static boolean check(String s) {
        Stack<Character> stack = new Stack();
        
        for (int j=0; j<s.length(); j++) {
            // 처음 문자가 시작 괄호일 때 stack에 넣기
            if (s.charAt(j) == '[' || s.charAt(j) == '{' || s.charAt(j) == '(') {
                stack.push(s.charAt(j));

            } else {
                // stack이 비어 있지 않고
                if (!stack.isEmpty()) {
                    // 괄호 짝이 맞을 때 계속 진행
                    if (stack.peek() == '[' && s.charAt(j) == ']') {
                        stack.pop();
                        continue;

                    } else if (stack.peek() == '{' && s.charAt(j) == '}') {
                        stack.pop();
                        continue;

                    } else if (stack.peek() == '(' && s.charAt(j) == ')') {
                        stack.pop();
                        continue;
                    }
                
                // stack이 비어 있는 경우 시작 괄호가 없다는 의미이므로 짝이 맞지 않음 ∴ 반복문 중단
                } else {
                    return false;
                }
            }
        }

        // 반목문이 끝난 후 stack이 비어 있으면 모든 짝이 맞다는 의미이므로 return true
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (27.84ms, 76.8MB)
// 테스트 2 〉	통과 (24.91ms, 83.8MB)
// 테스트 3 〉	통과 (23.20ms, 83.8MB)
// 테스트 4 〉	통과 (29.72ms, 77.5MB)
// 테스트 5 〉	통과 (49.05ms, 92.3MB)
// 테스트 6 〉	통과 (28.89ms, 83.8MB)
// 테스트 7 〉	통과 (31.45ms, 91.6MB)
// 테스트 8 〉	통과 (48.22ms, 81.9MB)
// 테스트 9 〉	통과 (54.41ms, 83.3MB)
// 테스트 10 〉	통과 (74.46ms, 78.3MB)
// 테스트 11 〉	통과 (79.02ms, 81MB)
// 테스트 12 〉	통과 (8.91ms, 74.9MB)
// 테스트 13 〉	통과 (14.12ms, 78.2MB)
// 테스트 14 〉	통과 (13.63ms, 78.3MB)
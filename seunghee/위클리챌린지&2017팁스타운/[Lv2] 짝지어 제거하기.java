//참고 : https://velog.io/@dhk22/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%A7%9D%EC%A7%80%EC%96%B4-%EC%A0%9C%EA%B1%B0%ED%95%98%EA%B8%B0-Java

import java.util.Stack;

class Solution {
	
    public int solution(String s) {
        char[] carr = s.toCharArray();
        Stack<Character> stack = new Stack<>();   
    
        for (int i=0;i<carr.length;i++) {
            char c = carr[i];
            if (stack.isEmpty()) {
            	stack.push(c);
            }
            // 스택이 비어있지 않다면
            else {
                // 스택의 top확인(peek) - 만약 현재 문자와 같다면 반복이므로 스택에서 pop하고 현재 문자도 스택에 넣지 않음
                // 이렇게 되면 스택에는 반복이 발생하는 이전문자와 현재문자 모두 들어가지 않게 됨 (반복제거)
                if (stack.peek() == c) {
                    stack.pop();
                // 스택의 top이 현재 문자와 다르다면 반복이 아니므로 push
                } else {
                    stack.push(c);
                }
            }
        }        
        return stack.isEmpty() ? 1 : 0;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (0.23ms, 81.9MB)
테스트 2 〉	통과 (15.53ms, 82.8MB)
테스트 3 〉	통과 (21.70ms, 92.3MB)
테스트 4 〉	통과 (23.33ms, 79.4MB)
테스트 5 〉	통과 (14.00ms, 77.5MB)
테스트 6 〉	통과 (21.00ms, 78.4MB)
테스트 7 〉	통과 (16.82ms, 88.7MB)
테스트 8 〉	통과 (21.86ms, 86.8MB)
테스트 9 〉	통과 (0.22ms, 72.1MB)
테스트 10 〉	통과 (0.36ms, 69.7MB)
테스트 11 〉	통과 (0.34ms, 75.5MB)
테스트 12 〉	통과 (0.18ms, 71.9MB)
테스트 13 〉	통과 (0.20ms, 75.5MB)
효율성  테스트
테스트 1 〉	통과 (63.18ms, 63.2MB)
테스트 2 〉	통과 (50.09ms, 58.6MB)
테스트 3 〉	통과 (71.91ms, 60.8MB)
테스트 4 〉	통과 (55.85ms, 61.1MB)
테스트 5 〉	통과 (52.17ms, 61.2MB)
테스트 6 〉	통과 (98.10ms, 79.3MB)
테스트 7 〉	통과 (56.24ms, 61.1MB)
테스트 8 〉	통과 (53.60ms, 61.2MB)
채점 결과
정확성: 60.2
효율성: 39.8
합계: 100.0 / 100.0
*/
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // x 칸만큼 반복
        
        for (int i=0; i<s.length(); i++) {
            
            // s를 왼쪽으로 회전한다.
            
            s = s.substring(1) + s.substring(0,1);
            
            // s가 올바른 괄호 문자열이라면, answer에 1을 더한다.
            
            if(check(s)) answer++;
           
        }
        
    return answer;
        
    }
    
    // 올바른 괄호 문자열이라면 true를 반환하는 함수
    
    boolean check(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<s.length(); i++) {
            
            // 여는 괄호 : stack에 add
            // 닫는 괄호 : stack.peek()에 자신과 같은 여는 괄호가 있을 때만 stack.pop()
            
                switch(s.charAt(i)) {
                    case '(' :
                        stack.add('(');
                        break;
                    case '{' :
                        stack.add('{');
                        break;
                    case '[' :
                        stack.add('[');
                        break;
                    case ')' :
                        if (!stack.empty() && stack.peek() == '(') stack.pop();
                        else return false;
                        break;
                     case '}' :
                        if (!stack.empty() && stack.peek() == '{') stack.pop();
                        else return false;
                        break;
                     case ']' :
                        if (!stack.empty() && stack.peek() == '[') stack.pop();
                        else return false;
                        break;
                } 
            }
        
        // stack이 비었다면 올바른 괄호 문자열이다.
        
        if (!stack.empty()) return false;
        
        return true;
    }
}


/*
테스트 1 〉	통과 (22.29ms, 85.8MB)
테스트 2 〉	통과 (16.14ms, 72.1MB)
테스트 3 〉	통과 (12.61ms, 74.4MB)
테스트 4 〉	통과 (16.44ms, 85MB)
테스트 5 〉	통과 (25.50ms, 82.7MB)
테스트 6 〉	통과 (15.18ms, 78.5MB)
테스트 7 〉	통과 (14.33ms, 86.2MB)
테스트 8 〉	통과 (19.85ms, 80.8MB)
테스트 9 〉	통과 (25.78ms, 80MB)
테스트 10 〉	통과 (40.10ms, 90.4MB)
테스트 11 〉	통과 (38.29ms, 91.5MB)
테스트 12 〉	통과 (1.49ms, 68.1MB)
테스트 13 〉	통과 (1.73ms, 76.3MB)
테스트 14 〉	통과 (1.30ms, 76MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

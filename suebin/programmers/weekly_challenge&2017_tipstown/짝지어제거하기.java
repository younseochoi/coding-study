import java.util.*;

class Solution
{
    public int solution(String s)
    {    
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);
        }

        return stack.isEmpty() ? 1 : 0;
    }
}


/*
정확성  테스트
테스트 1 〉	통과 (0.18ms, 79.5MB)
테스트 2 〉	통과 (13.65ms, 87.9MB)
테스트 3 〉	통과 (15.91ms, 77.7MB)
테스트 4 〉	통과 (14.37ms, 73.1MB)
테스트 5 〉	통과 (13.31ms, 82.3MB)
테스트 6 〉	통과 (14.09ms, 84.2MB)
테스트 7 〉	통과 (13.15ms, 80.9MB)
테스트 8 〉	통과 (16.29ms, 90.5MB)
테스트 9 〉	통과 (0.27ms, 74MB)
테스트 10 〉	통과 (0.34ms, 78MB)
테스트 11 〉	통과 (0.18ms, 75MB)
테스트 12 〉	통과 (0.17ms, 73.9MB)
테스트 13 〉	통과 (0.17ms, 76.7MB)
효율성  테스트
테스트 1 〉	통과 (65.43ms, 63MB)
테스트 2 〉	통과 (45.52ms, 58.1MB)
테스트 3 〉	통과 (53.50ms, 60.9MB)
테스트 4 〉	통과 (52.86ms, 60.3MB)
테스트 5 〉	통과 (55.25ms, 60.8MB)
테스트 6 〉	통과 (56.47ms, 61MB)
테스트 7 〉	통과 (53.38ms, 60.6MB)
테스트 8 〉	통과 (55.45ms, 60.2MB)
채점 결과
정확성: 60.2
효율성: 39.8
합계: 100.0 / 100.0
*/

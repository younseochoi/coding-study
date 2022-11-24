import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        
        // n을 3으로 나눈 나머지를 stack에 저장
        while (n > 0) {
            stack.addFirst(n % 3);
            n = n / 3;
        }
        
        // 10진법으로 변환
        int size = stack.size();
        
        for (int i=0; i < size; i++) {
            answer += stack.poll() * Math.pow(3, i);
        }
        
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.07ms, 71.3MB)
// 테스트 2 〉	통과 (0.09ms, 73.9MB)
// 테스트 3 〉	통과 (0.07ms, 74.8MB)
// 테스트 4 〉	통과 (0.06ms, 73.1MB)
// 테스트 5 〉	통과 (0.06ms, 73.3MB)
// 테스트 6 〉	통과 (0.05ms, 74.9MB)
// 테스트 7 〉	통과 (0.06ms, 74.8MB)
// 테스트 8 〉	통과 (0.05ms, 76.8MB)
// 테스트 9 〉	통과 (0.06ms, 68MB)
// 테스트 10 〉	통과 (0.08ms, 76.5MB)
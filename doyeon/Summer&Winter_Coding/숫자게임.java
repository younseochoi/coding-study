// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12987
import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        PriorityQueue<Integer> pqa = new PriorityQueue();
        PriorityQueue<Integer> pqb = new PriorityQueue();
        
        for (int a : A) pqa.add(a);
        for (int b : B) pqb.add(b);
        
        while (!pqa.isEmpty() && !pqb.isEmpty()) {
            if (pqa.peek() < pqb.peek()) {
                pqa.poll();
                pqb.poll();
                answer++;
            } else {
                pqb.poll();
            }
        }
        
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.34ms, 67.2MB)
// 테스트 2 〉	통과 (0.50ms, 74.6MB)
// 테스트 3 〉	통과 (0.58ms, 75.3MB)
// 테스트 4 〉	통과 (0.44ms, 78MB)
// 테스트 5 〉	통과 (0.62ms, 72.6MB)
// 테스트 6 〉	통과 (1.13ms, 72.4MB)
// 테스트 7 〉	통과 (0.94ms, 71.5MB)
// 테스트 8 〉	통과 (0.72ms, 76.7MB)
// 테스트 9 〉	통과 (2.21ms, 75MB)
// 테스트 10 〉	통과 (3.57ms, 75.1MB)
// 테스트 11 〉	통과 (2.98ms, 83MB)
// 테스트 12 〉	통과 (1.70ms, 71.1MB)
// 테스트 13 〉	통과 (10.88ms, 87.7MB)
// 테스트 14 〉	통과 (16.07ms, 80.2MB)
// 테스트 15 〉	통과 (8.38ms, 86.4MB)
// 테스트 16 〉	통과 (9.56ms, 75.6MB)
// 테스트 17 〉	통과 (7.98ms, 74.8MB)
// 테스트 18 〉	통과 (3.61ms, 76.9MB)
// 효율성  테스트
// 테스트 1 〉	통과 (131.72ms, 73.3MB)
// 테스트 2 〉	통과 (101.09ms, 68.9MB)
// 테스트 3 〉	통과 (112.62ms, 71.6MB)
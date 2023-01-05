// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/82612#qna
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        long change = 0;
        
        // 필요한 금액 계산
        for (int i=1; i <= count; i++) {
            sum += price * i;
        }
        // 거스름돈 계산
        change = sum - money;
        answer = change < 0 ? 0 : change;  

        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.06ms, 74.4MB)
// 테스트 2 〉	통과 (0.07ms, 73.6MB)
// 테스트 3 〉	통과 (0.05ms, 71.9MB)
// 테스트 4 〉	통과 (0.18ms, 77.4MB)
// 테스트 5 〉	통과 (0.12ms, 76.9MB)
// 테스트 6 〉	통과 (0.05ms, 77.1MB)
// 테스트 7 〉	통과 (0.05ms, 78.3MB)
// 테스트 8 〉	통과 (0.05ms, 79.4MB)
// 테스트 9 〉	통과 (0.05ms, 78.4MB)
// 테스트 10 〉	통과 (0.05ms, 69.4MB)
// 테스트 11 〉	통과 (0.06ms, 78.3MB)
// 테스트 12 〉	통과 (0.08ms, 73.5MB)
// 테스트 13 〉	통과 (0.07ms, 72MB)
// 테스트 14 〉	통과 (0.11ms, 77.6MB)
// 테스트 15 〉	통과 (0.11ms, 78.6MB)
// 테스트 16 〉	통과 (0.05ms, 70.4MB)
// 테스트 17 〉	통과 (0.07ms, 79.9MB)
// 테스트 18 〉	통과 (0.11ms, 78.8MB)
// 테스트 19 〉	통과 (0.14ms, 80.1MB)
// 테스트 20 〉	통과 (0.09ms, 73.1MB)
// 테스트 21 〉	통과 (0.11ms, 84.9MB)
// 테스트 22 〉	통과 (0.12ms, 80MB)
// 테스트 23 〉	통과 (0.14ms, 75.2MB)
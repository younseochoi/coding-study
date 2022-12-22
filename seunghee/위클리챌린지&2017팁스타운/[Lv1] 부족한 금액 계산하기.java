class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long sum = 0;
        for(int i=1; i<=count; i++) {
        	sum += i*price;
        }
        
        answer = sum - money;
        if( answer < 0 ) {
        	return 0;
        }
        return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (0.07ms, 77.3MB)
테스트 2 〉	통과 (0.08ms, 72.6MB)
테스트 3 〉	통과 (0.04ms, 72.6MB)
테스트 4 〉	통과 (0.07ms, 79.1MB)
테스트 5 〉	통과 (0.06ms, 75.8MB)
테스트 6 〉	통과 (0.05ms, 73.6MB)
테스트 7 〉	통과 (0.06ms, 80.3MB)
테스트 8 〉	통과 (0.05ms, 80MB)
테스트 9 〉	통과 (0.05ms, 69MB)
테스트 10 〉	통과 (0.11ms, 75MB)
테스트 11 〉	통과 (0.05ms, 72.6MB)
테스트 12 〉	통과 (0.06ms, 79.6MB)
테스트 13 〉	통과 (0.07ms, 80.3MB)
테스트 14 〉	통과 (0.12ms, 74.2MB)
테스트 15 〉	통과 (0.10ms, 66MB)
테스트 16 〉	통과 (0.05ms, 77.2MB)
테스트 17 〉	통과 (0.08ms, 76.2MB)
테스트 18 〉	통과 (0.07ms, 68.6MB)
테스트 19 〉	통과 (0.08ms, 78.3MB)
테스트 20 〉	통과 (0.08ms, 77.9MB)
테스트 21 〉	통과 (0.11ms, 74.9MB)
테스트 22 〉	통과 (0.08ms, 67.1MB)
테스트 23 〉	통과 (0.09ms, 73.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
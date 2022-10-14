class Solution {
    public int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int depth, int result) {
        
        if (depth == numbers.length) {
            if (result == target) answer++;     // 마지막 결과가 target과 같으면 answer++
            return;
        }
        
        dfs(numbers, target, depth + 1, result + numbers[depth]);   // 더하거나
        dfs(numbers, target, depth + 1, result - numbers[depth]);   // 빼거나
    }
}

/* 테스트 1 〉	통과 (5.42ms, 75.4MB)
테스트 2 〉	통과 (4.99ms, 86.2MB)
테스트 3 〉	통과 (0.20ms, 72.7MB)
테스트 4 〉	통과 (0.36ms, 74.4MB)
테스트 5 〉	통과 (0.69ms, 74.4MB)
테스트 6 〉	통과 (0.34ms, 75.1MB)
테스트 7 〉	통과 (0.20ms, 75.8MB)
테스트 8 〉	통과 (0.42ms, 72.6MB) */
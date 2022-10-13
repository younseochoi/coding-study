/*

dfs 에서 꼭 구현해야 하는 2가지

1. 수행동작 : 재귀함수가 호출 됐을 때 한 턴마다 수행할 동작 구현
2. 탈출조건 : 어느 시점에 이 재귀함수를 끊을지 구현

*/

class Solution {
    
    // 두 함수에서 사용하기 위해 전역 변수로 선언
    
    int[] numbers;
    int target;
    int answer;
    
    // dfs 함수 

    public void dfs(int index, int sum) { // index : numbers 배열의 인덱스, sum : 누적 합
        
        // 탈출 조건
        
        if (index == numbers.length) { 
            if (sum == target) answer ++; 
            return;
        }
        
        // 수행 동작
        
        dfs(index + 1, sum + numbers[index]); // 더하는 경우 : 누적합에 현재 인덱스 번째 숫자를 더해 다음 dfs 함수 호출
        dfs(index + 1, sum - numbers[index]); // 빼는 경우 : 누적합에 현재 인덱스 번째 숫자를 빼고 다음 dfs 함수 호출
    }
    
    public int solution(int[] numbers, int target) {
        
        this.numbers = numbers;
        this.target = target;
        answer = 0;
        
        dfs(0,0); // dfs 함수 호출
        
        return answer;
    }
}

/*
테스트 1 〉	통과 (8.31ms, 77.7MB)
테스트 2 〉	통과 (6.13ms, 76.2MB)
테스트 3 〉	통과 (0.20ms, 76.3MB)
테스트 4 〉	통과 (0.39ms, 72MB)
테스트 5 〉	통과 (5.27ms, 83.2MB)
테스트 6 〉	통과 (0.29ms, 81.2MB)
테스트 7 〉	통과 (0.19ms, 74MB)
테스트 8 〉	통과 (0.45ms, 72.5MB)
*/

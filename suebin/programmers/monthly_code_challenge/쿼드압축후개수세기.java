class Solution {
    
    int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {

        // 특정 영역 S를 탐색하는 backtracking 함수 호출    

        backtracking(0, arr.length-1, 0, arr.length-1, arr);
        
        return answer;
    }
    
    public void backtracking(int startX, int endX, int startY, int endY, int[][]arr) {
        
        boolean equals = true;

        for(int i = startX; i <= endX; i++) {
            for(int j = startY; j <= endY; j++) {
                if(arr[startX][startY] != arr[i][j]) {
                    equals = false;
                    break;
                }
            }
        }
        
        // 특정 영역 내부에 있는 모든 수가 같은 값이라면 0과 1의 개수를 카운트한다.
        
        if (equals) {
            if (arr[startX][startY] == 0) answer[0]++;
            else answer[1]++;
            return;
        }
        
        // 그렇지 않다면, 4등분을 해서 재귀를 호출한다.
        
        backtracking(startX, (startX+endX)/2, startY, (startY+endY)/2, arr);
        backtracking((startX+endX)/2+1, endX, startY, (startY+endY)/2, arr);
        backtracking(startX, (startX+endX)/2, (startY+endY)/2+1, endY, arr);
        backtracking((startX+endX)/2+1, endX, (startY+endY)/2+1, endY, arr);
    
    }
}

/*
테스트 1 〉	통과 (0.28ms, 73.4MB)
테스트 2 〉	통과 (0.18ms, 75.7MB)
테스트 3 〉	통과 (0.08ms, 77.1MB)
테스트 4 〉	통과 (0.03ms, 83.8MB)
테스트 5 〉	통과 (11.31ms, 88.7MB)
테스트 6 〉	통과 (4.56ms, 94.4MB)
테스트 7 〉	통과 (5.52ms, 99.2MB)
테스트 8 〉	통과 (6.70ms, 84.9MB)
테스트 9 〉	통과 (6.91ms, 97.9MB)
테스트 10 〉	통과 (6.70ms, 122MB)
테스트 11 〉	통과 (0.05ms, 74.1MB)
테스트 12 〉	통과 (0.06ms, 80.1MB)
테스트 13 〉	통과 (8.46ms, 98.9MB)
테스트 14 〉	통과 (19.26ms, 121MB)
테스트 15 〉	통과 (47.61ms, 121MB)
테스트 16 〉	통과 (8.27ms, 99.2MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

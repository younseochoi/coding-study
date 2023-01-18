class Solution {
    public int[] solution(int n) {
        
        int[] answer = new int[n*(n+1)/2];
        
        // 삼각 달팽이를 이차원 배열에 저장
        
        int[][] temp = new int[n][n];
        
        int x = -1, y = 0;
        int num = 1;
        
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                
                // 1. 아래로 이동하는 경우
                
                if (i % 3 == 0) { x++; }
                
                // 2. 오른쪽으로 이동하는 경우
                
                else if (i % 3 == 1) { y++; }
                
                // 3. 왼쪽 우상향하는 대각선으로 이동하는 경우
                
                else { x--; y--; }
                
                temp[x][y] = num++;
            }
        }
        
        // 이차원 배열 값을 순서대로 일차원 배열 answer로 저장
        
        int k = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if(temp[i][j] != 0) {
                    answer[k++] =temp[i][j];
                }
            }
        }
        
        return answer;
    }
}

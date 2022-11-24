// https://minhamina.tistory.com/58

import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n*(n+1))/2]; // n=4일 때 4+3+2+1 이므로 등차수열 합 공식 이용
        int[][] matrix = new int[n][n];

        int x = -1, y = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            // j는 i부터 시작
            for (int j = i; j < n; j++) { 
                // 아래
                if (i % 3 == 0) {
                    x++;
                    
                // 오른쪽
                } else if (i % 3 == 1) {
                    y++;
                    
                // 대각선
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                matrix[x][y] = num++;
            }
        }
        
        // matrix에 있는 값 answer에 담기
        int k = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) 
                	break;
                answer[k++] = matrix[i][j];
            }
        }
       
        return answer;
    }
}
// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/17679
// 참고 : https://taehoung0102.tistory.com/157
import java.util.*;
class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] table = new char[m][n];
        
        // 아래에서부터 좌표 원소 가진 list로 변환하여 table에 저장
        for(int i=0;i < m; i++){
            table[i] = board[m-i-1].toCharArray();
        }
        
        while (true) {
            boolean[][] check = new boolean[m][n];
            boolean pass = false;
            
            // 보드를 순회하며 4블록이 된 곳의 좌표를 집합에 기록
            for (int i=0; i < m-1; i++) {
                for (int j=0; j < n-1; j++) {
                    char t = table[i][j];
                    
                    if (t == '-') continue;

                    if (table[i][j+1] == t && table[i+1][j] == t && table[i+1][j+1] == t) {
                        check[i][j] = true;
                        check[i][j+1] = true;
                        check[i+1][j] = true;
                        check[i+1][j+1] = true;
                        pass = true;
                    }
                }
            }
            // 좌표가 존재하지 않으면 반복문 종료
            if(!pass) break;

            // 좌표가 존재한다면 블록을 지우고 지운 만큼 answer++ 
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(check[i][j]) {
                        table[i][j] = '-';
                        answer++;
                    }
                }
            }
            // 블록을 위에서 아래로 당겨줌
            for(int i=0; i < m; i++){
                for(int j=0; j < n; j++){
                    if(table[i][j] == '-') {
                        for(int k=i; k < m; k++){
                            if(table[k][j] == '-') continue;
                            
                            table[i][j] = table[k][j];
                            table[k][j] = '-';
                            break;
                        }
                    }
                }
            }
        }

        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.04ms, 80.2MB)
// 테스트 2 〉	통과 (0.05ms, 71.5MB)
// 테스트 3 〉	통과 (0.03ms, 73.3MB)
// 테스트 4 〉	통과 (0.59ms, 67.5MB)
// 테스트 5 〉	통과 (19.17ms, 79.7MB)
// 테스트 6 〉	통과 (3.76ms, 73.4MB)
// 테스트 7 〉	통과 (0.24ms, 74.5MB)
// 테스트 8 〉	통과 (0.53ms, 71.5MB)
// 테스트 9 〉	통과 (0.03ms, 85.4MB)
// 테스트 10 〉	통과 (0.21ms, 76.9MB)
// 테스트 11 〉	통과 (1.76ms, 78.1MB)
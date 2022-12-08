import java.util.*;

class Solution {
    
    // 지워져야 하는 블록은 true
    
    static boolean removeBlock[][];
    
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        
        // 판의 배치 정보 board는 char 배열로 복사해서 사용한다.
        
        char boardCopy[][] = new char[m][n];
        for (int i=0; i<m; i++) {
            boardCopy[i] = board[i].toCharArray();
        }
        
        boolean flag  = true;
        
        while (flag) {
            removeBlock = new boolean[m][n];
            flag = false;
            
            for (int i=0; i<m-1; i++) {
                for (int j=0; j<n-1; j++) {
                    if (boardCopy[i][j] == '#') continue;
                    if (check(i,j,boardCopy)) {
                        removeBlock[i][j] = true;
                        removeBlock[i][j+1] = true;
                        removeBlock[i+1][j] = true;
                        removeBlock[i+1][j+1] = true;
                        flag = true;
                    }
                }
            }
            
            answer += erase(m,n,boardCopy);
        }

        return answer;
    }
    
    // 2*2가 같은지 체크하는 함수
    
    public static boolean check(int x, int y, char[][] board) {
      char c = board[x][y];
		
		  if (c == board[x][y+1] && c == board[x+1][y] && c == board[x+1][y+1]) {
			  return true;
		  }
		
		  return false;
	}
  
  // 같은 블록을 제거하는 함수
	
	public static int erase(int m, int n, char[][] board) {
		int count = 0;
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (removeBlock[i][j]) board[i][j] = '.';
			}
		}
		
		// Queue를 이용해 세로로 블록을 제거한다.
		
		for (int i=0; i<n; i++) {
			Queue<Character> queue = new LinkedList<>();
			
			for (int j=m-1; j>=0; j--) {
				
				if(board[j][i] == '.') {
					count++; // 지우는 블록은 카운트한다.
				}
				else {
					queue.add(board[j][i]);
				}
			}
			
			// 삭제한 블록 위의 블록을 내려준다.
			
			int idx = m-1;
			
			while (!queue.isEmpty()) {
				board[idx--][i] = queue.poll();
			}
			
			// 빈칸을 채워준다.
			
			for (int j=idx; j>=0; j--) {
				board[j][i] = '#';
			}
		}
		
		return count;
	}
}


/*
정확성  테스트
테스트 1 〉	통과 (0.36ms, 76.9MB)
테스트 2 〉	통과 (0.49ms, 76.9MB)
테스트 3 〉	통과 (0.31ms, 75.5MB)
테스트 4 〉	통과 (1.25ms, 72.7MB)
테스트 5 〉	통과 (21.63ms, 87.7MB)
테스트 6 〉	통과 (3.58ms, 76.2MB)
테스트 7 〉	통과 (1.05ms, 70.8MB)
테스트 8 〉	통과 (1.18ms, 77.1MB)
테스트 9 〉	통과 (0.28ms, 75.7MB)
테스트 10 〉	통과 (1.34ms, 74.9MB)
테스트 11 〉	통과 (2.35ms, 73.7MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0

참고 : https://code-lab1.tistory.com/87
*/

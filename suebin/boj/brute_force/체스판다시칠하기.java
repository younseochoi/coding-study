import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int count;
	static int minCount = 64;
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 보드판을 Boolean 배열에 저장한다. (B = false, W = true)
		
		boolean [][] board = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			
			for (int j = 0; j < M; j++) {
				
				if (s.charAt(j) == 'B') {
					board[i][j] = false;
				}
				else {
					board[i][j] = true;
				}
			}
		}
		
		
		// 체스판을 자를 수 있는 모든 경우의 수를 구한다.
		
		for (int i = 0; i < N-7; i++) { 
			for (int j = 0; j < M-7; j++) { 
				
				// 자른 체스판에서 다시 칠해야 하는 정사각형 개수를 구한다.
				
				findCount(board, i, j);
				
				// 최솟값을 찾는다.
				
				count = Math.min(count, 64-count);
				if (count < minCount) minCount = count;
			}
		}
		
		System.out.println(minCount);
		
	}
	
	// 자른 체스판에서 다시 칠해야 하는 정사각형 개수를 구한다.
	
	static void	findCount(boolean[][] board, int startX, int startY) {
		
		count = 0;
		boolean check = board[startX][startY];
		
		for (int i = startX; i < startX+8; i++) {
			for (int j = startY; j < startY+8; j++) {
				if (board[i][j] != check) {
					count++;
				}
				
				check = !check;
			}
			check = !check;
		}
		
	}

}
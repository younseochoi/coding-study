package backtracking;

import java.util.Scanner;

public class N_Queen {

	static int count = 0;
	static int[] board ;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		board = new int[N];
		NQueen(N, 0);
		
	}
	
	public static void NQueen(int N, int depth) {
		
		if(depth == N) {
			count++;
			return;
		}
		
		for(int i=0;i<N;i++) {
			
			board[depth] = i ;
			
			for(int j =0;j<depth;j++) {
				
				if(board[j] == 0) {
					NQueen(N, j+1);
				}
			}
		}
	}

}

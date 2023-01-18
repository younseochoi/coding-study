import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 카드의 개수 N, 딜러가 외치는 숫자 M
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		// 카드에 쓰여 있는 수를 담은 배열 
		
		int[] cardNum = new int[N];
		for (int i=0; i<N; i++) {
			cardNum[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// 블랙잭 게임 실행
		
		int sum = blackjackGame(cardNum, N, M);
		System.out.println(sum);
		
	}
	
	static int blackjackGame(int[] cardNum, int N, int M) {
		
		int sum = 0;
		int maxSum = 0;
		
		for (int i=0; i<N-2; i++) {
			for (int j=i+1; j<N-1; j++) {
				for (int k=j+1; k<N; k++) {
					sum = cardNum[i] + cardNum[j] + cardNum[k];
					if (sum == M) return sum;
					if (sum < M && sum > maxSum) {
						maxSum = sum;
					}
				}
			}
		}
		
		return maxSum;
	}
}
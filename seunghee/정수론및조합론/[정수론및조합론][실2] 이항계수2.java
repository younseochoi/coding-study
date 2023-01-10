//출처: https://st-lab.tistory.com/162 & https://camelsource.tistory.com/12

package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	static int[][] dp;
	public static final int div = 10007;
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		dp = new int[N + 1][K + 1];
		System.out.println(BC(N, K));
	}
	//이항계수 : nCk : n!/(n-k)!k!
	//밑에는 팩토리얼을 재귀함수로 타나낸 것
	public static int factorial(int N) {
		if (N == 0) {
			return 1;
		}
		return N * factorial(N - 1);
	}
	static int BC(int n, int k) {
		// 이미 풀었던 sub문제일 경우 값을 재활용
		if (dp[n][k] > 0) {
			return dp[n][k];
		}
 
		if (k == 0 || n == k) {
			return dp[n][k] = 1;
		}
		return dp[n][k] = (BC(n - 1, k - 1) + BC(n - 1, k)) % div;
	}
}
/*
53818523	dnffktmdgml	 11051	맞았습니다!!	17888	136	Java 11 / 수정	1021	
*/
package backtracking;

import java.util.Scanner;

public class N과M3 {

	// 전역변수로 선언하지 않으면 시간 초과
	static int[] answer;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		answer = new int[M];
		dfs(N, M, 0);
		System.out.print(sb);
	}

	/**
	 * 
	 * @param N
	 * @param M
	 * @param depth
	 * 
	 *  1부터 N까지 자연수 중에서 M개를 고른 수열(은 수를 여러 번 골라도 된다.)
	 */
	public static void dfs(int N, int M, int depth) {

		if (depth == M) {
			for (int j = 0; j < answer.length; j++) {
				sb.append(answer[j] + " ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; i++) {

			answer[depth] = i + 1;
			dfs(N, M, depth + 1);

		} // for end

	} // dfs end

}

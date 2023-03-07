package backtracking;

import java.util.Scanner;

public class N과M2 {

	// 전역변수로 선언하지 않으면 시간 초과
	static boolean[] visited;
	static int[] answer;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		visited = new boolean[N];
		answer = new int[M];
		dfs(N, M, 0, 0);
	}

	/**
	 * 
	 * @param N
	 * @param M
	 * @param depth
	 * @param k 현재 위치 (한 번 dfs한 수는 다시 방문하지 않음)
	 * 
	 * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열 (조합)
	 */
	public static void dfs(int N, int M, int depth, int k) {

		if (depth == M) {
			for (int j = 0; j < answer.length; j++) {
				System.out.print(answer[j] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = k; i < N; i++) {

			if (!visited[i]) {
				visited[i] = true;
				answer[depth] = i + 1;
				dfs(N, M, depth + 1,i+1);
				visited[i] = false;
			} // if end
			
		} // for end

	} // dfs end

}

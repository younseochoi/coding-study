package weekly_challenge;

import java.util.ArrayList;
import java.util.List;

public class 교점에별만들기 {

	public static void main(String[] args) {

		교점에별만들기 s = new 교점에별만들기();
		// {"....*....", ".........", ".........", "*.......*", ".........",
		// ".........", ".........", ".........", "*.......*"}
		s.solution(new int[][] { { 2, -1, 4 }, { -2, -1, 4 }, { 0, -1, 1 }, { 5, -8, -12 }, { 5, 8, 12 } });
		// {"*.*"}
		s.solution(new int[][] { { 0, 1, -1 }, { 1, 0, -1 }, { 1, 0, 1 } });
		// {"*"}
		s.solution(new int[][] { { 1, -1, 0 }, { 2, -1, 0 } });
		// {"*"}
		s.solution(new int[][] { { 1, -1, 0 }, { 2, -1, 0 }, { 4, -1, 0 } });
	}

	public String[] solution(int[][] line) {

		String[] answer = {};
		List<Integer> cx = new ArrayList<>();
		List<Integer> cy = new ArrayList<>();
		int max_x = Integer.MIN_VALUE;
		int max_y = Integer.MIN_VALUE;
		int min_x = Integer.MAX_VALUE;
		int min_y = Integer.MAX_VALUE;

		for (int i = 0; i < line.length - 1; i++) {

			long a = line[i][0];
			long b = line[i][1];
			long e = line[i][2];

			for (int j = i + 1; j < line.length; j++) {

				long c = line[j][0];
				long d = line[j][1];
				long f = line[j][2];

				long n = (a * d) - (b * c);

				if (n == 0)
					continue;

				long temp1 = (b * f) - (e * d);
				long temp2 = (e * c) - (a * f);

				if (temp1 % n == 0 && temp2 % n == 0) {
					int x = (int) (temp1 / n);
					int y = (int) (temp2 / n);
					cx.add((int) x);
					cy.add((int) y);

					max_x = Math.max(max_x, (int) x);
					max_y = Math.max(max_y, (int) y);

					min_x = Math.min(min_x, (int) x);
					min_y = Math.min(min_y, (int) y);
				}
			}
		}

		int size_x = max_x - min_x + 1;
		int size_y = max_y - min_y + 1;
		String[] reverse_arr = new String[size_y];
		answer = new String[size_y];

		for (int i = 0; i < size_y; i++) {
			String s = ".";
			reverse_arr[i] = s.repeat(size_x);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cx.size(); i++) {
			// 평행 이동
			int x = cx.get(i) - min_x;
			int y = cy.get(i) - min_y;
			sb = new StringBuilder(reverse_arr[y]);
			sb.setCharAt(x, '*');
			reverse_arr[y] = sb.toString();
		}

		// y축 뒤집기
		for (int i = 0; i < reverse_arr.length; i++) {
			answer[answer.length - 1 - i] = reverse_arr[i];
		}

		return answer;
	}
}

/*
 * 정확성 테스트
 * 테스트 1 〉 통과 (0.15ms, 77.1MB)
 * 테스트 2 〉 통과 (2.25ms, 84.2MB)
 * 테스트 3 〉 통과 (0.10ms, 71.3MB)
 * 테스트 4 〉 통과 (6.37ms, 94MB)
 * 테스트 5 〉 통과 (1.43ms, 79.6MB)
 * 테스트 6 〉 통과 (1.04ms, 81.7MB)
 * 테스트 7 〉 통과 (1.32ms, 82.9MB)
 * 테스트 8 〉 통과 (0.11ms, 75.5MB)
 * 테스트 9 〉 통과 (19.96ms, 73.9MB)
 * 테스트 10 〉 통과 (14.27ms, 85.9MB)
 * 테스트 11 〉 통과 (15.89ms, 79.4MB)
 * 테스트 12 〉 통과 (21.55ms, 93.8MB)
 * 테스트 13 〉 통과 (28.46ms, 76.7MB)
 * 테스트 14 〉 통과 (18.62ms, 86.8MB)
 * 테스트 15 〉 통과 (16.00ms, 72.9MB)
 * 테스트 16 〉 통과 (18.39ms, 75.5MB)
 * 테스트 17 〉 통과 (17.34ms, 72.6MB)
 * 테스트 18 〉 통과 (24.98ms, 87.9MB)
 * 테스트 19 〉 통과 (17.06ms, 83.3MB)
 * 테스트 20 〉 통과 (14.37ms, 86.7MB)
 * 테스트 21 〉 통과 (22.33ms, 90.4MB)
 * 테스트 22 〉 통과 (0.07ms, 75.9MB)
 * 테스트 23 〉 통과 (0.07ms, 74.7MB)
 * 테스트 24 〉 통과 (0.08ms, 77.1MB)
 * 테스트 25 〉 통과 (0.10ms, 76.9MB)
 * 테스트 26 〉 통과 (0.10ms, 74.5MB)
 * 테스트 27 〉 통과 (0.08ms, 83.7MB)
 * 테스트 28 〉 통과 (0.10ms, 78.2MB)
 * 테스트 29 〉 통과 (0.07ms, 82.5MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
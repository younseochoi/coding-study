package summer_winter_coding;

import java.util.Arrays;

public class 예산 {

	public static void main(String[] args) {
		예산 s = new 예산();
		s.solution(new int[] { 1, 3, 2, 5, 4 }, 9); // 3
		s.solution(new int[] { 2, 2, 3, 3 }, 10); // 4

	}

	public int solution(int[] d, int budget) {

		int answer = 0;
		int sum = 0;

		Arrays.sort(d);

		for (int i = 0; i < d.length; i++) {

			sum += d[i];

			if (sum <= budget)
				answer++;

			else
				break;
		}

		return answer;
	}
}

/*
 * 정확성 테스트
 * 테스트 1 〉 통과 (0.47ms, 71.8MB)
 * 테스트 2 〉 통과 (0.39ms, 66MB)
 * 테스트 3 〉 통과 (0.43ms, 77.6MB)
 * 테스트 4 〉 통과 (0.36ms, 76.4MB)
 * 테스트 5 〉 통과 (0.33ms, 69.5MB)
 * 테스트 6 〉 통과 (0.58ms, 79.1MB)
 * 테스트 7 〉 통과 (0.52ms, 71.7MB)
 * 테스트 8 〉 통과 (0.37ms, 77.7MB)
 * 테스트 9 〉 통과 (0.50ms, 73.4MB)
 * 테스트 10 〉 통과 (0.44ms, 75.3MB)
 * 테스트 11 〉 통과 (0.50ms, 79.5MB)
 * 테스트 12 〉 통과 (0.36ms, 76.3MB)
 * 테스트 13 〉 통과 (0.49ms, 73.2MB)
 * 테스트 14 〉 통과 (0.39ms, 73.4MB)
 * 테스트 15 〉 통과 (0.38ms, 77MB)
 * 테스트 16 〉 통과 (0.33ms, 76.3MB)
 * 테스트 17 〉 통과 (0.37ms, 71.9MB)
 * 테스트 18 〉 통과 (0.37ms, 71.8MB)
 * 테스트 19 〉 통과 (0.43ms, 66.8MB)
 * 테스트 20 〉 통과 (0.30ms, 72.8MB)
 * 테스트 21 〉 통과 (0.42ms, 74.5MB)
 * 테스트 22 〉 통과 (0.51ms, 71.5MB)
 * 테스트 23 〉 통과 (0.31ms, 76MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
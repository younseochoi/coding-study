package summer_winter_coding;

public class 소수만들기 {

	public static void main(String[] args) {
		소수만들기 s = new 소수만들기();
		s.solution(new int[] { 1, 2, 3, 4 }); // 1
		s.solution(new int[] { 1, 2, 7, 6, 4 }); // 4
	}

	int answer = 0;

	public int solution(int[] nums) {

		answer = 0;

		pick(nums, 0, 0, 0); // 골라야하는 요소 3개

		return answer;
	}

	public void pick(int[] nums, int k, int sum, int start) {

		if (k == 3) {

			if (isPrimeNum(sum)) {
				answer++;

			}

			return;
		}

		for (int i = start; i < nums.length; i++) {

			pick(nums, k + 1, sum + nums[i], i + 1);

		}
	}

	public boolean isPrimeNum(int n) {

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}

/*
 정확성  테스트
테스트 1 〉	통과 (0.54ms, 76.4MB)
테스트 2 〉	통과 (0.56ms, 77MB)
테스트 3 〉	통과 (0.26ms, 74.5MB)
테스트 4 〉	통과 (0.21ms, 73.5MB)
테스트 5 〉	통과 (0.82ms, 77.1MB)
테스트 6 〉	통과 (0.60ms, 72.6MB)
테스트 7 〉	통과 (0.07ms, 77.5MB)
테스트 8 〉	통과 (1.57ms, 75.4MB)
테스트 9 〉	통과 (0.43ms, 73.6MB)
테스트 10 〉	통과 (1.52ms, 77.8MB)
테스트 11 〉	통과 (0.05ms, 73.3MB)
테스트 12 〉	통과 (0.03ms, 73.8MB)
테스트 13 〉	통과 (0.08ms, 80.1MB)
테스트 14 〉	통과 (0.03ms, 73.7MB)
테스트 15 〉	통과 (0.03ms, 71.6MB)
테스트 16 〉	통과 (2.04ms, 74.5MB)
테스트 17 〉	통과 (0.64ms, 76.9MB)
테스트 18 〉	통과 (0.05ms, 80.1MB)
테스트 19 〉	통과 (0.03ms, 76.5MB)
테스트 20 〉	통과 (1.54ms, 74.9MB)
테스트 21 〉	통과 (2.28ms, 87.3MB)
테스트 22 〉	통과 (0.54ms, 72MB)
테스트 23 〉	통과 (0.02ms, 77.9MB)
테스트 24 〉	통과 (1.48ms, 78.3MB)
테스트 25 〉	통과 (1.75ms, 76.9MB)
테스트 26 〉	통과 (0.02ms, 72.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */
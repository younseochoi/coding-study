package kakao_blind_recruitment;

public class n진수게임 {

	public static void main(String[] args) {

		n진수게임 s = new n진수게임();
		s.solution(2, 4, 2, 1); //"0111"
		s.solution(16, 16, 2, 1); //"02468ACE11111111"
		s.solution(16, 16, 2, 2); //"13579BDF01234567"
	}
	/**
	 * 
	 * @param n : 진법
	 * @param t : 미리 구할 숫자의 갯수
	 * @param m : 게임에 참가하는 인원
	 * @param p : 튜브의 순서
	 * @return : 튜브가 말해야하는 숫자 t개를 공백 없이 차례대로 나타낸 문자열
	 * 숫자를 하나씩 차례대로 말하는 게임(10부터는 한 자리씩 끊어서 말함)
	 */
	public String solution(int n, int t, int m, int p) {
		String answer = "";

		int K = t * m; // 참가인원 * 말하는 개수
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < K; i++) {

			str.append(Integer.toString(i, n)); // n진법 변환
		}

		for (int i = 0; i < str.length(); i++) {

			if (i % m == (p - 1)) {
				answer += str.charAt(i);
			}

			if (answer.length() == t)  break;
		}

		return answer.toUpperCase();
	}

}

/*
정확성  테스트
테스트 1 〉	통과 (9.92ms, 79.6MB)
테스트 2 〉	통과 (11.97ms, 72.2MB)
테스트 3 〉	통과 (12.93ms, 86.1MB)
테스트 4 〉	통과 (11.89ms, 73.1MB)
테스트 5 〉	통과 (11.15ms, 76.1MB)
테스트 6 〉	통과 (14.39ms, 81.5MB)
테스트 7 〉	통과 (12.85ms, 73.8MB)
테스트 8 〉	통과 (9.83ms, 82.8MB)
테스트 9 〉	통과 (16.73ms, 77.9MB)
테스트 10 〉	통과 (13.00ms, 76.4MB)
테스트 11 〉	통과 (11.47ms, 83MB)
테스트 12 〉	통과 (9.89ms, 81.2MB)
테스트 13 〉	통과 (14.20ms, 85MB)
테스트 14 〉	통과 (46.07ms, 101MB)
테스트 15 〉	통과 (41.27ms, 92.1MB)
테스트 16 〉	통과 (32.30ms, 92.4MB)
테스트 17 〉	통과 (14.14ms, 78.1MB)
테스트 18 〉	통과 (25.71ms, 76.5MB)
테스트 19 〉	통과 (13.68ms, 81.1MB)
테스트 20 〉	통과 (15.60ms, 77.2MB)
테스트 21 〉	통과 (21.72ms, 89.5MB)
테스트 22 〉	통과 (20.11ms, 88.2MB)
테스트 23 〉	통과 (25.85ms, 80.6MB)
테스트 24 〉	통과 (29.64ms, 94.3MB)
테스트 25 〉	통과 (79.16ms, 87.8MB)
테스트 26 〉	통과 (22.91ms, 74.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

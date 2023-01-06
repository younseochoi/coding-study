package weekly_challenge;

import java.util.Stack;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		짝지어제거하기 s = new 짝지어제거하기();
		s.solution("baabaa");
	}

	public int solution(String s) {
		Stack<Character> stack = new Stack<>();

		stack.push(s.charAt(0));

		for (int i = 1; i < s.length(); i++) {

			if (stack.size() != 0 && stack.peek() == s.charAt(i))
				stack.pop();
			else
				stack.push(s.charAt(i));

		}

		if (stack.size() == 0)
			return 1;
		else
			return 0;

	}
}

/*
 * 정확성 테스트
 * 테스트 1 〉 통과 (0.20ms, 75.6MB)
 * 테스트 2 〉 통과 (17.74ms, 77.8MB)
 * 테스트 3 〉 통과 (23.16ms, 85MB)
 * 테스트 4 〉 통과 (18.27ms, 78.3MB)
 * 테스트 5 〉 통과 (17.79ms, 82.5MB)
 * 테스트 6 〉 통과 (17.50ms, 73MB)
 * 테스트 7 〉 통과 (18.36ms, 84.4MB)
 * 테스트 8 〉 통과 (21.19ms, 79.9MB)
 * 테스트 9 〉 통과 (0.38ms, 76.7MB)
 * 테스트 10 〉 통과 (0.27ms, 66.6MB)
 * 테스트 11 〉 통과 (0.17ms, 78.9MB)
 * 테스트 12 〉 통과 (0.18ms, 73.5MB)
 * 테스트 13 〉 통과 (0.19ms, 72MB)
 * 효율성 테스트
 * 테스트 1 〉 통과 (66.92ms, 61.9MB)
 * 테스트 2 〉 통과 (39.82ms, 56.1MB)
 * 테스트 3 〉 통과 (50.24ms, 58.6MB)
 * 테스트 4 〉 통과 (52.30ms, 59.2MB)
 * 테스트 5 〉 통과 (52.05ms, 58.8MB)
 * 테스트 6 〉 통과 (49.57ms, 58.7MB)
 * 테스트 7 〉 통과 (52.51ms, 58.9MB)
 * 테스트 8 〉 통과 (52.10ms, 59.1MB)
 * 채점 결과
 * 정확성: 60.2
 * 효율성: 39.8
 * 합계: 100.0 / 100.0
 */
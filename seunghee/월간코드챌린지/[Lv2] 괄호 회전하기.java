import java.util.Stack;

class Solution {
	public int solution(String s) {
		int answer = 0;

		for (int i = 0; i < s.length(); i++) {
			s = s.substring(1, s.length()) + s.substring(0, 1);
			if (checker(s)) {
				answer += 1;
			}
		}
		return answer;
	}

	public boolean checker(String temp) {
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < temp.length(); i++) {
			if (!stack.isEmpty()) {
				if (temp.charAt(i) == ')' && stack.peek().equals("(")) {
					stack.pop();
				} else if (temp.charAt(i) == '}' && stack.peek().equals("{")) {
					stack.pop();
				} else if (temp.charAt(i) == ']' && stack.peek().equals("[")) {
					stack.pop();
				} else {
					stack.add(temp.charAt(i) + "");
				}
			} else {
				if (temp.charAt(i) == ')' || temp.charAt(i) == '}' || temp.charAt(i) == ']') {
					return false;
				}
				stack.add(temp.charAt(i) + "");
			}
		}

		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (19.46ms, 85.8MB)
테스트 2 〉	통과 (15.16ms, 77.7MB)
테스트 3 〉	통과 (18.09ms, 82MB)
테스트 4 〉	통과 (17.41ms, 80.3MB)
테스트 5 〉	통과 (50.81ms, 95.5MB)
테스트 6 〉	통과 (27.16ms, 96.5MB)
테스트 7 〉	통과 (22.89ms, 96MB)
테스트 8 〉	통과 (31.60ms, 90.3MB)
테스트 9 〉	통과 (62.98ms, 99.5MB)
테스트 10 〉	통과 (62.62ms, 103MB)
테스트 11 〉	통과 (87.88ms, 95.4MB)
테스트 12 〉	통과 (1.49ms, 72.1MB)
테스트 13 〉	통과 (6.13ms, 78.2MB)
테스트 14 〉	통과 (6.76ms, 74.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
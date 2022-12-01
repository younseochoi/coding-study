package summer_winter_coding;

import java.util.ArrayList;

public class 영어끝말잇기 {

	public static void main(String[] args) {
		영어끝말잇기 s = new 영어끝말잇기();
		s.solution(3, new String[] { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" }); // [3,3]

		// [0,0]
		s.solution(5, new String[] { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
				"establish", "hang", "gather", "refer", "reference", "estimate", "executive" });

		// [1,3]
		s.solution(2, new String[] { "hello", "one", "even", "never", "now", "world", "draw" });
	}

	public int[] solution(int n, String[] words) {
		
		int[] answer = new int[2];
		ArrayList<String> strList = new ArrayList<>();

		for (int i = 1; i < words.length; i++) {

			strList.add(words[i - 1]);
			
			char last = words[i - 1].charAt(words[i - 1].length() - 1); // 끝글자
			
			if (words[i].charAt(0) != last || strList.contains(words[i])) {
		
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
				return answer;
			}

		}

		return answer;
	}
}

/*
 * 정확성 테스트
 * 테스트 1 〉 통과 (0.03ms, 70.7MB)
 * 테스트 2 〉 통과 (0.05ms, 77.1MB)
 * 테스트 3 〉 통과 (0.02ms, 76.9MB)
 * 테스트 4 〉 통과 (0.04ms, 73.9MB)
 * 테스트 5 〉 통과 (0.10ms, 76.2MB)
 * 테스트 6 〉 통과 (0.04ms, 75.7MB)
 * 테스트 7 〉 통과 (0.04ms, 85MB)
 * 테스트 8 〉 통과 (0.02ms, 74MB)
 * 테스트 9 〉 통과 (0.04ms, 73MB)
 * 테스트 10 〉 통과 (0.15ms, 81.1MB)
 * 테스트 11 〉 통과 (0.13ms, 71.7MB)
 * 테스트 12 〉 통과 (0.05ms, 76.9MB)
 * 테스트 13 〉 통과 (0.05ms, 76.4MB)
 * 테스트 14 〉 통과 (0.05ms, 73.9MB)
 * 테스트 15 〉 통과 (0.05ms, 73.3MB)
 * 테스트 16 〉 통과 (0.02ms, 76.3MB)
 * 테스트 17 〉 통과 (0.04ms, 72.3MB)
 * 테스트 18 〉 통과 (0.06ms, 75.8MB)
 * 테스트 19 〉 통과 (0.04ms, 74.9MB)
 * 테스트 20 〉 통과 (0.36ms, 71.2MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */

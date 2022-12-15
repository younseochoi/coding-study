package kakao_blind_recruitment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class 실패율 {

	public static void main(String[] args) {
		실패율 s = new 실패율();
		s.solution(5, new int[] { 2, 1, 2, 6, 2, 4, 3, 3 }); // 34215
		s.solution(4, new int[] { 4, 4, 4, 4, 4 }); // 4123
	}

	/**
	 * 
	 * @param N : 스테이지 개수
	 * @param stages : 사용자가 현재 도전 중인 스테이지 번호가 들어있는 배열
	 * @return : 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열
	 * 
	 * 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수 
	 */
	public int[] solution(int N, int[] stages) {

		int[] answer = new int[N];
		HashMap<Integer, Double> hm = new HashMap<>();

		for (int level = 1; level <= N; level++) {
			double fail = 0;
			double total = 0;

			for (int i = 0; i < stages.length; i++) {
				if (level <= stages[i])
					total++;
				if (level == stages[i])
					fail++;
			}

			hm.put(level, fail / (total == 0 ? 1 : total));

		}

		// hashmap value로 정렬
		List<Integer> keySet = new ArrayList<>(hm.keySet());
		keySet.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return hm.get(o2).compareTo(hm.get(o1));
			}
		});

		int j = 0;
		for (int key : keySet) {
			answer[j++] = key;
		}

		return answer;
	}

}


/*
정확성  테스트
테스트 1 〉	통과 (0.59ms, 65.5MB)
테스트 2 〉	통과 (0.85ms, 84.1MB)
테스트 3 〉	통과 (41.39ms, 71.6MB)
테스트 4 〉	통과 (136.74ms, 82.9MB)
테스트 5 〉	통과 (412.19ms, 103MB)
테스트 6 〉	통과 (3.73ms, 71.7MB)
테스트 7 〉	통과 (12.10ms, 74.4MB)
테스트 8 〉	통과 (119.67ms, 89.4MB)
테스트 9 〉	통과 (438.76ms, 109MB)
테스트 10 〉	통과 (58.11ms, 89.3MB)
테스트 11 〉	통과 (156.29ms, 105MB)
테스트 12 〉	통과 (79.42ms, 96.2MB)
테스트 13 〉	통과 (196.02ms, 85.8MB)
테스트 14 〉	통과 (0.70ms, 74.5MB)
테스트 15 〉	통과 (10.65ms, 86.1MB)
테스트 16 〉	통과 (6.78ms, 73.3MB)
테스트 17 〉	통과 (19.87ms, 74.1MB)
테스트 18 〉	통과 (11.29ms, 77.8MB)
테스트 19 〉	통과 (3.07ms, 80.9MB)
테스트 20 〉	통과 (10.57ms, 79.2MB)
테스트 21 〉	통과 (10.93ms, 76.5MB)
테스트 22 〉	통과 (285.11ms, 109MB)
테스트 23 〉	통과 (12.22ms, 85.1MB)
테스트 24 〉	통과 (33.16ms, 85.2MB)
테스트 25 〉	통과 (0.52ms, 79.1MB)
테스트 26 〉	통과 (0.42ms, 76MB)
테스트 27 〉	통과 (0.40ms, 74.8MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

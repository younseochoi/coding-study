package kakao_blind_recruitment;

import java.util.LinkedList;
import java.util.Queue;

public class 캐시 {

	public static void main(String[] args) {
		캐시 s = new 캐시();

		// 21
		s.solution(3, new String[] { "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul" });

	}

	/**
	 * 
	 * @param cacheSize : 캐시크기
	 * @param cities    :도시이름 배열
	 * @return : 총 실행시간 
	 * LRU(Least Recently Used) : 가장 오랫동안 사용하지 않은 페이지를 교체함
	 */
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;

		// FIFO 구조인 큐가 적격인 문제!
		Queue<String> q = new LinkedList<String>();

		// cache크기가 0인 경우 예외 처리
		if (cacheSize == 0)
			return cities.length * 5;

		for (String city : cities) {

			city = city.toLowerCase();

			if (q.contains(city)) { // cache hit

				q.remove(city);
				q.add(city);
				answer += 1;
			} else { // cache miss

				if (q.size() < cacheSize) {
					q.add(city);
				} else { // cache 크기가 꽉차있다면 제일 먼저 들어간거 제거
					q.remove();
					q.add(city);
				}
				answer += 5;
			}

		}

		return answer;
	}

}

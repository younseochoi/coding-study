package kakao_blind_recruitment;

import java.util.*;

class Solution {
	
	/**
	 * 
	 * @param n: 셔틀 운행 횟수
	 * @param t: 셔틀 운행 간격
	 * @param m: 한 셔틀에 탈 수 있는 최대 크루 수
	 * @param timetable: 크루가 대기열에 도착하는 시각을 모은 배열
	 * @return : 콘이 무사히 셔틀을 타고 사무실로 갈 수 있는 제일 늦은 도착 시각
	 */
	public String solution(int n, int t, int m, String[] timetable) {
		int bus_count = 0;
		int time = TimeToMinutes("09:00");
		PriorityQueue<Integer> crews = new PriorityQueue<Integer>();
		
		for (String tt : timetable) {
			crews.add(TimeToMinutes(tt));
		}

		
		// (1)막차 탈 수 있다? -> 콘은 막차 시간 도착
		// (2)막차 탈 수 없다? -> 콘은 마지막 사람보다 1분 일찍 와야함.
		
		while (bus_count < n) {

			if (bus_count != 0)
				time += t; // t만큼 간격으로 버스 운행

			int seat_count = 0;

			while (crews.size() != 0 && seat_count < m) {
				
				if (crews.peek() > time)
					break; // 버스보다 늦게옴 -> 못탐

				if (seat_count == m - 1 && bus_count == n - 1) // (2) 막차고 탈 자리가 없다면 콘은 일분 빨리와야함.
					return TimeToStr(crews.poll() - 1);

				crews.poll();
				seat_count++;
			}

			bus_count++;
		}
		
		return TimeToStr(time);
	}

	static public int TimeToMinutes(String time) {
		String[] times = time.split(":");
		int hour = Integer.parseInt(times[0]);
		int min = Integer.parseInt(times[1]);
		return hour * 60 + min;
	}

	static public String TimeToStr(int time) {
		String hour = String.format("%02d", time / 60);
		String min = String.format("%02d", time % 60);
		return hour + ":" + min;
	}

}

/*
정확성  테스트
테스트 1 〉	통과 (9.40ms, 76.2MB)
테스트 2 〉	통과 (14.44ms, 77MB)
테스트 3 〉	통과 (9.74ms, 77MB)
테스트 4 〉	통과 (11.45ms, 83.8MB)
테스트 5 〉	통과 (12.84ms, 77.9MB)
테스트 6 〉	통과 (15.18ms, 88.8MB)
테스트 7 〉	통과 (12.10ms, 84.7MB)
테스트 8 〉	통과 (10.51ms, 74.1MB)
테스트 9 〉	통과 (12.62ms, 89.1MB)
테스트 10 〉	통과 (13.31ms, 75.8MB)
테스트 11 〉	통과 (16.20ms, 78.9MB)
테스트 12 〉	통과 (12.85ms, 78.4MB)
테스트 13 〉	통과 (22.42ms, 82.5MB)
테스트 14 〉	통과 (11.85ms, 74.7MB)
테스트 15 〉	통과 (10.98ms, 86.1MB)
테스트 16 〉	통과 (10.45ms, 76.8MB)
테스트 17 〉	통과 (14.15ms, 78.7MB)
테스트 18 〉	통과 (11.66ms, 78.8MB)
테스트 19 〉	통과 (11.26ms, 79.7MB)
테스트 20 〉	통과 (13.44ms, 79.7MB)
테스트 21 〉	통과 (18.41ms, 77.3MB)
테스트 22 〉	통과 (13.15ms, 80.6MB)
테스트 23 〉	통과 (20.54ms, 85.6MB)
테스트 24 〉	통과 (19.28ms, 82.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
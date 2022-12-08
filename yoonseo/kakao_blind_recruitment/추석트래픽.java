package kakao_blind_recruitment;

public class 추석트래픽 {

	public static void main(String[] args) {
		추석트래픽 s = new 추석트래픽();
		s.solution(new String[] { "2016-09-15 20:59:57.421 0.351s", "2016-09-15 20:59:58.233 1.181s",
				"2016-09-15 20:59:58.299 0.8s", "2016-09-15 20:59:58.688 1.041s", "2016-09-15 20:59:59.591 1.412s",
				"2016-09-15 21:00:00.464 1.466s", "2016-09-15 21:00:00.741 1.581s", "2016-09-15 21:00:00.748 2.31s",
				"2016-09-15 21:00:00.966 0.381s", "2016-09-15 21:00:02.066 2.62s" });
	}

	// 작업의 개수가 변하는 시점은 시작시각 / 끝시각 뿐이다.
	public int solution(String[] lines) {
		int answer = 1;
		int[][] time = new int[lines.length][2]; // 시작 시간과 끝 시간 담음

		int index = 0;

		for (String l : lines) {

			int h = Integer.parseInt(l.substring(11, 13));
			int m = Integer.parseInt(l.substring(14, 16));

			double s = Double.parseDouble(l.substring(17, 23));
			double duration = Double.parseDouble(l.substring(24, l.length() - 1));

			// time[index][1] = ( h * 3600 + m *60 + (int) s ) * 1000 ; // testcase 3, 18 통과 X
			time[index][1] = (h * 3600 + m * 60) * 1000 + (int) (s * 1000);
			time[index][0] = time[index++][1] - (int) (duration * 1000) + 1;

		}

		for (int i = 0; i < time.length; i++) {
			int count = 1;
			for (int j = i + 1; j < time.length; j++) {
				// 한 작업물이 끝난 시각으로부터 999ms 안에 다른 작업물이 있으면, 그 둘은 동시에 진행되는 작업물이다.
				if (time[i][1] + 999 >= time[j][0])
					count++;

			}

			answer = Math.max(answer, count);
		}
		return answer;
	}
}

	/*
	정확성  테스트
	테스트 1 〉	통과 (0.41ms, 73.2MB)
	테스트 2 〉	통과 (9.52ms, 78.3MB)
	테스트 3 〉	통과 (9.97ms, 91.5MB)
	테스트 4 〉	통과 (0.35ms, 75.9MB)
	테스트 5 〉	통과 (1.03ms, 72.5MB)
	테스트 6 〉	통과 (0.93ms, 72.9MB)
	테스트 7 〉	통과 (8.80ms, 84.6MB)
	테스트 8 〉	통과 (9.40ms, 80MB)
	테스트 9 〉	통과 (1.07ms, 77.9MB)
	테스트 10 〉	통과 (0.46ms, 78.1MB)
	테스트 11 〉	통과 (0.50ms, 72.9MB)
	테스트 12 〉	통과 (8.31ms, 72.1MB)
	테스트 13 〉	통과 (0.98ms, 77.1MB)
	테스트 14 〉	통과 (0.38ms, 72.3MB)
	테스트 15 〉	통과 (0.36ms, 74.1MB)
	테스트 16 〉	통과 (0.52ms, 77.7MB)
	테스트 17 〉	통과 (0.36ms, 67.1MB)
	테스트 18 〉	통과 (13.87ms, 99.3MB)
	테스트 19 〉	통과 (14.82ms, 86MB)
	테스트 20 〉	통과 (14.20ms, 79.6MB)
	테스트 21 〉	통과 (0.38ms, 77.1MB)
	테스트 22 〉	통과 (0.35ms, 72MB)
	채점 결과
	정확성: 100.0
	합계: 100.0 / 100.0
	*/


package kakao_blind_recruitment;

public class 다트게임 {

	public static void main(String[] args) {
		다트게임 s = new 다트게임();
		s.solution("1S2D*3T"); // 37
		s.solution("1D2S#10S"); // 9
		s.solution("1D2S0T"); // 3
		s.solution("1S*2T*3S"); // 23
		s.solution("1D#2S*3S"); // 5
		s.solution("1T2D3D#"); // -4
		s.solution("1D2S3T*"); // 59
		s.solution("1S2D*3T*"); // 72
		s.solution("1S2D3T*");// 63

//		" 1 S 2 D * 3 T * " 는 72가 맞고
//		" 1 S 2 D 3 T * " 는 63이 맞습니다
//		1	1S2D*3T	37	11 * 2 + 22 * 2 + 33
//		2	1D2S#10S	9	12 + 21 * (-1) + 101
//		3	1D2S0T	3	12 + 21 + 03
//		4	1S*2T*3S	23	11 * 2 * 2 + 23 * 2 + 31
//		5	1D#2S*3S	5	12 * (-1) * 2 + 21 * 2 + 31
//		6	1T2D3D#	-4	13 + 22 + 32 * (-1)
//		7	1D2S3T*	59	12 + 21 * 2 + 33 * 2
	}

	public int solution(String dartResult) {
		int answer = 0;
		int score = 0;
		int arr[] = new int[3];
		int index = 0;

		// 1. string을 한글자씩 접근하면서 해결한다.
		for (int i = 0; i < dartResult.length(); i++) {

			char c = dartResult.charAt(i);
			
			if (Character.isDigit(c)) { // 숫자인 경우 

				// 10인(두글자) 경우 
				if (i < dartResult.length() - 1 && Character.isDigit(dartResult.charAt(i + 1))) { 
					score = 10;
					i++;
				} 
				else	score = Character.getNumericValue(c); //한 글자 숫자인 경우
			} 
			else { // 문자인 경우

				if (c == 'S') arr[index] = score;
				else if (c == 'D') arr[index] = (int) Math.pow(score, 2);
				else if (c == 'T') arr[index] = (int) Math.pow(score, 3);

				if (i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '#') {
					arr[index] *= (-1);
					i++;
				} 
				else if (i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '*') {
					arr[index] *= 2;
					
					if (index > 0) arr[index - 1] *= 2;
						
					i++;
				}
				
				index++;

			}

		}

		answer = arr[0] + arr[1] + arr[2];
		System.out.println("정답: " + answer);
		return answer;
	}
}

/*
 정확성  테스트
테스트 1 〉	통과 (0.06ms, 74.6MB)
테스트 2 〉	통과 (0.07ms, 80.3MB)
테스트 3 〉	통과 (0.08ms, 74.8MB)
테스트 4 〉	통과 (0.07ms, 71.1MB)
테스트 5 〉	통과 (0.07ms, 70.1MB)
테스트 6 〉	통과 (0.07ms, 76.7MB)
테스트 7 〉	통과 (0.04ms, 72.1MB)
테스트 8 〉	통과 (0.05ms, 67.1MB)
테스트 9 〉	통과 (0.05ms, 77.1MB)
테스트 10 〉	통과 (0.05ms, 80.3MB)
테스트 11 〉	통과 (0.07ms, 73.2MB)
테스트 12 〉	통과 (0.05ms, 86.6MB)
테스트 13 〉	통과 (0.08ms, 70.9MB)
테스트 14 〉	통과 (0.04ms, 72.1MB)
테스트 15 〉	통과 (0.06ms, 84MB)
테스트 16 〉	통과 (0.08ms, 79.3MB)
테스트 17 〉	통과 (0.05ms, 76.3MB)
테스트 18 〉	통과 (0.09ms, 72.3MB)
테스트 19 〉	통과 (0.08ms, 73.1MB)
테스트 20 〉	통과 (0.07ms, 74.3MB)
테스트 21 〉	통과 (0.09ms, 78.1MB)
테스트 22 〉	통과 (0.06ms, 71.3MB)
테스트 23 〉	통과 (0.05ms, 72.5MB)
테스트 24 〉	통과 (0.08ms, 72.5MB)
테스트 25 〉	통과 (0.07ms, 77.5MB)
테스트 26 〉	통과 (0.06ms, 69.9MB)
테스트 27 〉	통과 (0.05ms, 75.6MB)
테스트 28 〉	통과 (0.06ms, 78.2MB)
테스트 29 〉	통과 (0.08ms, 77.9MB)
테스트 30 〉	통과 (0.11ms, 83.1MB)
테스트 31 〉	통과 (0.06ms, 77MB)
테스트 32 〉	통과 (0.09ms, 74.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */

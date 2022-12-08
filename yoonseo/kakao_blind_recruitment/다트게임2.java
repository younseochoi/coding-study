package kakao_blind_recruitment;

//처음 푼 코드 정확도 90
public class 다트게임2 {

	public static void main(String[] args) {
		다트게임2 s = new 다트게임2();
		s.solution("1S2D*3T"); // 37
		s.solution("1D2S#10S"); // 9
		s.solution("1D2S0T"); // 3
		s.solution("1S*2T*3S"); // 23
		s.solution("1D#2S*3S"); // 5
		s.solution("1T2D3D#"); // -4
		s.solution("1D2S3T*"); // 59
		s.solution("1S2D*3T*"); //72
		s.solution("1S2D3T*");//63

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
		int prev = 0;

		// 1. string을 한글자씩 접근하면서 해결한다.
		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i);
			int temp =score;
			// 1-1. 숫자인지 문자인지
			if (Character.isDigit(c)) {

				if (i < dartResult.length() - 1 && Character.isDigit(dartResult.charAt(i + 1))) {
					score = 10;
					i++;
				} else
					score = Character.getNumericValue(c);
				// System.out.println("숫자"+score);
			} else {

				if (c == 'D') {
					score = (int) Math.pow(score, 2);
				} else if (c == 'T') {
					score = (int) Math.pow(score, 3);
				}

				
				if (i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '#') {
					score = (-1) * score;
					i++;
				} else if (i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '*') {
//					int temp = answer;
					answer -= prev;
					score = (prev + score) * 2;
					System.out.println(temp+"->"+answer+":"+score);
					i++;
				}
				
				prev = temp;
				answer += score;
			}
			System.out.println(c+" "+i+" "+answer+"prev: "+prev);

		}

		System.out.println("정답: " + answer);
		return answer;
	}
}

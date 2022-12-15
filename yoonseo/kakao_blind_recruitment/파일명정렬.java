package kakao_blind_recruitment;

import java.util.ArrayList;
import java.util.List;

public class 파일명정렬 {

	public static void main(String[] args) {
		파일명정렬 s = new 파일명정렬();

//		 ["img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"]
		s.solution(new String[] { "img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG" });

//		["A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"]
		s.solution(new String[] { "F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat" });
	}

	
	
	class File {
		String name;
		String head;
		int number;

		File(String name, String head, int number) {
			this.name = name;
			this.head = head;
			this.number = number;
		}

		@Override
		public String toString() {
			return name;
		}

	}

	/**
	 * 
	 * @param files : 파일명이 담긴 배열
	 * @return : 주어진 기준으로 파일명 정렬후 파일명 담긴 배열
	 * 
	 * 1. 파일명은 우선 HEAD 부분을 기준으로 사전 순으로 정렬한다. 이때, 문자열 비교 시 대소문자 구분을 하지 않는다.
	 * 2. 파일명의 HEAD 부분이 대소문자 차이 외에는 같을 경우, NUMBER의 숫자 순으로 정렬한다. 9 < 10 < 0011 < 012 < 13 < 014 순으로 정렬된다. 숫자 앞의 0은 무시되며, 012와 12는 정렬 시에 같은 같은 값으로 처리된다.
	 * 3. 두 파일의 HEAD 부분과, NUMBER의 숫자도 같을 경우, 원래 입력에 주어진 순서를 유지한다.
	 */
	public String[] solution(String[] files) {
		String[] answer = {};
		List<File> list = new ArrayList<>();

		for (String file : files) {

			String temp = file;
			file = file.toLowerCase();

			for (int i = 0; i < file.length(); i++) {

				if (Character.isDigit(file.charAt(i))) { // 숫자 첫 글자를 기준으로 head, number 분리

					String headstr = file.substring(0, i);
					String numberstr = file.substring(i, file.length());

					for (int j = 0; j < numberstr.length(); j++) {

						if (!Character.isDigit(numberstr.charAt(j))) { // 첫 문자를 기준으로 number, tail 분리
							numberstr = numberstr.substring(0, j);
							break;
						}
					}
					
					
					File f = new File(temp, headstr, Integer.parseInt(numberstr));
					list.add(f);
					break;

				}

			}

		}

		// 정렬
		list.sort((a, b) -> {
			if (a.head.equals(b.head)) { // head가 같으면 number로 비교
				return Integer.compare(a.number, b.number);
			}

			return a.head.compareTo(b.head);
		});

		// answer에 e.name 배열 저장
		answer = list.stream().map(e -> e.name).toArray(String[]::new);

		return answer;
	}
}



/*
정확성  테스트
테스트 1 〉	통과 (35.46ms, 92.8MB)
테스트 2 〉	통과 (3.49ms, 71.6MB)
테스트 3 〉	통과 (9.14ms, 73.4MB)
테스트 4 〉	통과 (10.11ms, 86.5MB)
테스트 5 〉	통과 (16.25ms, 78.5MB)
테스트 6 〉	통과 (16.16ms, 86.2MB)
테스트 7 〉	통과 (24.93ms, 78.6MB)
테스트 8 〉	통과 (16.81ms, 73.5MB)
테스트 9 〉	통과 (11.47ms, 73.7MB)
테스트 10 〉	통과 (28.10ms, 72.9MB)
테스트 11 〉	통과 (11.07ms, 77.7MB)
테스트 12 〉	통과 (9.85ms, 86.8MB)
테스트 13 〉	통과 (8.02ms, 75.1MB)
테스트 14 〉	통과 (9.24ms, 90.4MB)
테스트 15 〉	통과 (8.73ms, 73.9MB)
테스트 16 〉	통과 (9.89ms, 80.2MB)
테스트 17 〉	통과 (8.17ms, 77.5MB)
테스트 18 〉	통과 (47.06ms, 83.6MB)
테스트 19 〉	통과 (8.47ms, 77MB)
테스트 20 〉	통과 (8.71ms, 78MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
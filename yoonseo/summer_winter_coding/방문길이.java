package summer_winter_coding;

import java.util.HashSet;

public class 방문길이 {

	public static void main(String[] args) {
		방문길이 s = new 방문길이();
		s.solution("ULURRDLLU");// 7
		s.solution("LULLLLLLU");// 7
		s.solution("UDU");//1
		s.solution("LLLLRLRLRLL"); //5
		s.solution("UUUUDUDUDUUU" ); //5
		s.solution("UUUUUUU" ); //5
		s.solution("LLLLLRRRRR" ); //5
	}

	public int solution(String dirs) {

		HashSet<String> hs = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		int x = 0, y = 0;

		for (int i = 0; i < dirs.length(); i++) {
			char c = dirs.charAt(i);

			String prev_x = Integer.toString(x), prev_y = Integer.toString(y);

			if (c == 'U' && y < 5 ) {
				y++;
			} else if (c == 'D' && y > -5) {
				y--;
			} else if (c == 'L' && x > -5) {
				x--;
			} else if (c == 'R' && x < 5) {
				x++;
			}
			
			String str1 = sb.append(prev_x+prev_y+x+y).toString();
			sb.setLength(0);
			String str2 = sb.append(Integer.toString(x) + y + prev_x + prev_y).toString();
			sb.setLength(0);

			
			if(!str1.equals(str2)) {
				
				hs.add(str1);
				hs.add(str2);
			}
		}

		//System.out.println(hs.size()/2);
		
		//System.out.println(hs);
		return hs.size()/2;
	}
}

/*
 정확성  테스트
테스트 1 〉	통과 (19.64ms, 79.8MB)
테스트 2 〉	통과 (19.11ms, 80.6MB)
테스트 3 〉	통과 (21.58ms, 82.5MB)
테스트 4 〉	통과 (19.05ms, 77.6MB)
테스트 5 〉	통과 (18.25ms, 81MB)
테스트 6 〉	통과 (17.01ms, 78.8MB)
테스트 7 〉	통과 (19.55ms, 75.5MB)
테스트 8 〉	통과 (18.87ms, 76.8MB)
테스트 9 〉	통과 (16.18ms, 75.3MB)
테스트 10 〉	통과 (25.47ms, 90.9MB)
테스트 11 〉	통과 (19.49ms, 82.2MB)
테스트 12 〉	통과 (19.60ms, 82.8MB)
테스트 13 〉	통과 (23.41ms, 76.7MB)
테스트 14 〉	통과 (18.71ms, 83.6MB)
테스트 15 〉	통과 (14.98ms, 80.7MB)
테스트 16 〉	통과 (23.12ms, 78.4MB)
테스트 17 〉	통과 (14.89ms, 73.3MB)
테스트 18 〉	통과 (17.52ms, 75.3MB)
테스트 19 〉	통과 (22.27ms, 83MB)
테스트 20 〉	통과 (17.79ms, 80.7MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */

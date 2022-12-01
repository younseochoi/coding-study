package summer_winter_coding;

import java.util.ArrayList;

public class 스킬트리 {

	public static void main(String[] args) {
		스킬트리 s = new 스킬트리();
		s.solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA" }); // 2
	}

	public int solution(String skill, String[] skill_trees) {

		int answer = 0;

		for (String st : skill_trees) {

			char[] temp = st.toCharArray();
			ArrayList<Character> arrlist = new ArrayList<>(); 
			
			for(int i =0;i<temp.length;i++) {
				
				if(skill.contains(Character.toString(temp[i]))) { //skill에 있는 것만 arrlist에 저장
					arrlist.add(temp[i]);
				}
			}
			
			boolean flag = true;
			
			for(int j =0;j<arrlist.size();j++) {
				
				if(skill.charAt(j) != arrlist.get(j)) {
					flag = false;
					break;
				}
			}
			
			if(flag) answer++;
			

		} // outer for end

		return answer;
	}
}

/*
 정확성  테스트
테스트 1 〉	통과 (0.14ms, 73.4MB)
테스트 2 〉	통과 (0.14ms, 66.7MB)
테스트 3 〉	통과 (0.15ms, 75.4MB)
테스트 4 〉	통과 (0.18ms, 76.7MB)
테스트 5 〉	통과 (0.26ms, 69.1MB)
테스트 6 〉	통과 (0.21ms, 74.9MB)
테스트 7 〉	통과 (0.22ms, 73MB)
테스트 8 〉	통과 (0.18ms, 79.4MB)
테스트 9 〉	통과 (0.21ms, 76.1MB)
테스트 10 〉	통과 (0.18ms, 73.2MB)
테스트 11 〉	통과 (0.37ms, 76.8MB)
테스트 12 〉	통과 (0.28ms, 75.2MB)
테스트 13 〉	통과 (0.23ms, 76.3MB)
테스트 14 〉	통과 (0.20ms, 76MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */
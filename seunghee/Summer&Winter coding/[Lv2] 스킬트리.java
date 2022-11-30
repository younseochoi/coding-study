class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i=0; i<skill_trees.length; i++) {
        	
        	String branch = skill_trees[i];
        	int position = 0; //skill 위치 저장
        	int eachSkill = 0; //skill 길이 저장
        	boolean check = true;
        	
        	for(int j=0; j<branch.length(); j++) {
        		//skill_tress속 스킬 길이가 skill보다 길떄, 예외처리
        		if(eachSkill==skill.length()) {
        			break;
        		}
        		if(skill.contains(String.valueOf(branch.charAt(j)))) {
        			int skillNum = skill.indexOf(String.valueOf(branch.charAt(j)));
        			if(skillNum > 0) { //첫번째 스킬이 아닐떄
        				//앞에 스킬이 있는지 체크
        				if(!branch.contains(String.valueOf(skill.charAt(skillNum-1)))) {
        					check = false;
        					break;
        				}        				
        			}
        			//스킬을 다 갖고있을 때, 순서가 올바른지 체크
        			if(skillNum<position) {
        				check = false;
        				break;
        			}
        			//먼저 나온 스킬의 위치 저장
        			position = skillNum;
        			eachSkill++;
        		}
        	}
        	if(check) {
        		answer++;
        	}
        }
        return answer;
    }
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.17ms, 77.8MB)
테스트 2 〉	통과 (0.26ms, 81.6MB)
테스트 3 〉	통과 (0.33ms, 71.3MB)
테스트 4 〉	통과 (0.31ms, 75.1MB)
테스트 5 〉	통과 (0.11ms, 76MB)
테스트 6 〉	통과 (0.20ms, 74.1MB)
테스트 7 〉	통과 (0.15ms, 74.3MB)
테스트 8 〉	통과 (0.31ms, 76.8MB)
테스트 9 〉	통과 (0.32ms, 75.4MB)
테스트 10 〉	통과 (0.12ms, 73.6MB)
테스트 11 〉	통과 (0.44ms, 73.3MB)
테스트 12 〉	통과 (0.23ms, 73.1MB)
테스트 13 〉	통과 (0.15ms, 73.7MB)
테스트 14 〉	통과 (0.14ms, 74.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */
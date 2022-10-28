import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public String solution(String[] participant, String[] completion) {
    
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		//완주하지 못한 사람이 참가자 기준 맨 마지막 사람이면 추출이 안되므로, 처음에 지정
		answer=participant[participant.length-1];
		
		//완주한 사람이 항상 1 적기 때문에 for문 기준은 완주자
		for(int i=0;i<completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				answer=participant[i];
                return answer;
            }			
		}
		return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (0.18ms, 75MB)
테스트 2 〉	통과 (0.22ms, 73.4MB)
테스트 3 〉	통과 (1.86ms, 77MB)
테스트 4 〉	통과 (2.55ms, 76MB)
테스트 5 〉	통과 (4.18ms, 90.2MB)
효율성  테스트
테스트 1 〉	통과 (142.53ms, 82.2MB)
테스트 2 〉	통과 (160.57ms, 90.1MB)
테스트 3 〉	통과 (206.94ms, 94.3MB)
테스트 4 〉	통과 (353.90ms, 96.3MB)
테스트 5 〉	통과 (241.21ms, 96.4MB)
*/
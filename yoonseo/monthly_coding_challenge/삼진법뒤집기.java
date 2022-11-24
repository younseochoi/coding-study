package monthly_coding_challenge;

import java.util.ArrayList;

public class 삼진법뒤집기 {

	public static void main(String[] args) {
		삼진법뒤집기 s = new 삼진법뒤집기();
		s.solution(45);s.solution(125);
	}
	
	public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arrlist = new ArrayList<>();
        
        while(n>0) {
        	arrlist.add(n%3);
        	n/=3;
        }
        
        for(int i =0;i<arrlist.size();i++) {
        
        	int result = arrlist.get(i);
        	
        	for(int j =arrlist.size()-i-1;j>0;j--) { // 현재 자리수만큼 3 거듭제곱함
        		result*= 3;
        	}
        	answer+=result;
        }
        
        return answer;
    }

}

/*
 정확성  테스트
테스트 1 〉	통과 (0.03ms, 75.2MB)
테스트 2 〉	통과 (0.04ms, 71MB)
테스트 3 〉	통과 (0.04ms, 74.6MB)
테스트 4 〉	통과 (0.04ms, 73.9MB)
테스트 5 〉	통과 (0.04ms, 76.3MB)
테스트 6 〉	통과 (0.04ms, 80.1MB)
테스트 7 〉	통과 (0.05ms, 69.1MB)
테스트 8 〉	통과 (0.04ms, 76MB)
테스트 9 〉	통과 (0.05ms, 71MB)
테스트 10 〉	통과 (0.04ms, 70.5MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0 
 */
 
package greedy;

import java.util.Arrays;

public class 체육복 {

	public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        int i =0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        
     // 현재 도난 당한 학생이 여벌 체육복 가지고 있는 학생인지 검사후 삭제하고 지워줌
        for(int j = 0;j<lost.length;j++) {
        	for(int k =0;k<reserve.length;k++) {
        		if(lost[j] == reserve[k]) {
        			reserve[k] = -1;
        			lost[j] = -1;
        			answer++;
        			break;
        		}
        	}
        }
        
        
        while(i<lost.length) {
        	
        	if(i>=lost.length) break;
        	
        	int curr_theft = lost[i++]; // 현재 도난 당한 학생
        	
        	if(curr_theft==-1) continue; // 이미 필터링된 학생
  
        	
        	for(int k=0;k<reserve.length;k++) { // 현재 도난 당한 학생에게 체육복 빌려줄 수 있는지 검사
        		
        		if(curr_theft+1==reserve[k] || curr_theft-1 == reserve[k]) {
        			System.out.println(curr_theft+"번 학생은 도난당했지만 여벌체육복 "+reserve[k]+"번 학생에게 빌릴 수 ㅇ");
        			reserve[k] = -1;
        			answer++;
        			break;
        		}
        	}
        }
        
        System.out.println(answer);
        return answer;
    }

}


//정확성  테스트
//테스트 1 〉	통과 (0.70ms, 73.5MB)
//테스트 2 〉	통과 (1.36ms, 89.3MB)
//테스트 3 〉	통과 (1.00ms, 72.7MB)
//테스트 4 〉	통과 (0.47ms, 77MB)
//테스트 5 〉	통과 (0.44ms, 71.9MB)
//테스트 6 〉	통과 (0.48ms, 72.5MB)
//테스트 7 〉	통과 (0.50ms, 72.6MB)
//테스트 8 〉	통과 (0.47ms, 71.9MB)
//테스트 9 〉	통과 (0.45ms, 73.7MB)
//테스트 10 〉	통과 (0.66ms, 73.2MB)
//테스트 11 〉	통과 (0.48ms, 77.9MB)
//테스트 12 〉	통과 (0.47ms, 79.4MB)
//테스트 13 〉	통과 (0.50ms, 67.3MB)
//테스트 14 〉	통과 (0.68ms, 69.9MB)
//테스트 15 〉	통과 (0.70ms, 74.9MB)
//테스트 16 〉	통과 (0.51ms, 77.1MB)
//테스트 17 〉	통과 (0.51ms, 70.4MB)
//테스트 18 〉	통과 (0.74ms, 84.3MB)
//테스트 19 〉	통과 (0.60ms, 72.8MB)
//테스트 20 〉	통과 (0.48ms, 73.1MB)
//채점 결과
//정확성: 100.0
//합계: 100.0 / 100.0

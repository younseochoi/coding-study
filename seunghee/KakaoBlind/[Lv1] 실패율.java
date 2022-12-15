import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        ArrayList<Double> arr = new ArrayList<>();
        
        double person = stages.length;
        for (int i=1; i<=N; i++) {
        	double cnt = 0;
        	for(int j=0; j<stages.length; j++) {
        		if(stages[j]==i) {
        			cnt++;
        		}
        	}
        	if (cnt==0) {
        		arr.add(0.0);
        	} else {
        		arr.add(cnt/person);
        	}
        	person -= cnt; 		
        }
        
        Object[] nums = arr.toArray();
        Arrays.sort(nums,Collections.reverseOrder());     
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int k=0; k<N; k++) {
        	for(int l=0; l<N; l++) {
        		int stage = l+1;
        		if(nums[k].equals(arr.get(l)) && (!ans.contains(stage))) {
        			answer[l] = stage;
        			break;
        		}
        	}
        }
        
        for(int m=0; m<N; m++) {
        	answer[m] = ans.get(m);
        }
        
        return answer;
    }
}
/*
질문하기에서 힌트 보고 해결 ㅠㅠ!
-----------------이하 질문하기------------------------------------
테스트 케이스를 5, [3,3,3,3] 으로 하고 해보시면 됩니다.
모든 인원이 3단계에서 실패한 경우, 4,5 단계의 실패율은 0.0이 되야 하는데
분모를 남은 유저 수 로 해놓은 경우 0/0 이 되버려서, Nan으로 값이 잡혀 계속 실패합니다.
--------------------------------------------------------------
정확성  테스트
테스트 1 〉	통과 (0.67ms, 73.2MB)
테스트 2 〉	통과 (0.44ms, 78.4MB)
테스트 3 〉	통과 (35.21ms, 81.4MB)
테스트 4 〉	통과 (68.26ms, 90.5MB)
테스트 5 〉	통과 (205.18ms, 101MB)
테스트 6 〉	통과 (7.24ms, 75.8MB)
테스트 7 〉	통과 (15.00ms, 87.3MB)
테스트 8 〉	통과 (65.13ms, 77.8MB)
테스트 9 〉	통과 (193.86ms, 81.5MB)
테스트 10 〉	통과 (27.18ms, 80.2MB)
테스트 11 〉	통과 (68.25ms, 92.2MB)
테스트 12 〉	통과 (58.46ms, 80.6MB)
테스트 13 〉	통과 (76.19ms, 84.3MB)
테스트 14 〉	통과 (0.66ms, 70.7MB)
테스트 15 〉	통과 (8.11ms, 92.6MB)
테스트 16 〉	통과 (7.60ms, 82.1MB)
테스트 17 〉	통과 (12.97ms, 78.8MB)
테스트 18 〉	통과 (6.64ms, 77.8MB)
테스트 19 〉	통과 (3.35ms, 75.3MB)
테스트 20 〉	통과 (9.95ms, 74.3MB)
테스트 21 〉	통과 (19.39ms, 87.1MB)
테스트 22 〉	통과 (292.19ms, 93.7MB)
테스트 23 〉	통과 (17.04ms, 82.1MB)
테스트 24 〉	통과 (20.73ms, 97MB)
테스트 25 〉	통과 (0.26ms, 72.9MB)
테스트 26 〉	통과 (0.31ms, 77.6MB)
테스트 27 〉	통과 (0.35ms, 78.8MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
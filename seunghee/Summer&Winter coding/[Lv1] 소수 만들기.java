import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++) {
        	for(int j=i+1; j<nums.length-1; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			int num = nums[i] + nums[j] + nums[k];
        			arr.add(num);
        		}
        	}
        }
        
        for(int l=0; l<arr.size(); l++) {
        	int num = arr.get(l);
        	int cnt = 0;
        	for(int m=2; m<num; m++) {
        		int check = num%m;
        		if(check==0) {
        			cnt++;
        		}
        	}
        	if(cnt==0) {
        		answer++;
        	}
        }
        return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (4.80ms, 78.6MB)
테스트 2 〉	통과 (5.34ms, 76.2MB)
테스트 3 〉	통과 (1.31ms, 75.2MB)
테스트 4 〉	통과 (0.89ms, 70MB)
테스트 5 〉	통과 (5.25ms, 78.8MB)
테스트 6 〉	통과 (18.79ms, 76.6MB)
테스트 7 〉	통과 (1.59ms, 74.2MB)
테스트 8 〉	통과 (23.00ms, 84.1MB)
테스트 9 〉	통과 (9.18ms, 78.2MB)
테스트 10 〉	통과 (27.11ms, 78.6MB)
테스트 11 〉	통과 (0.30ms, 72.8MB)
테스트 12 〉	통과 (0.11ms, 77.6MB)
테스트 13 〉	통과 (2.02ms, 80.1MB)
테스트 14 〉	통과 (0.16ms, 77.7MB)
테스트 15 〉	통과 (0.13ms, 78MB)
테스트 16 〉	통과 (91.68ms, 74.6MB)
테스트 17 〉	통과 (159.71ms, 74.3MB)
테스트 18 〉	통과 (2.23ms, 74.9MB)
테스트 19 〉	통과 (0.11ms, 79MB)
테스트 20 〉	통과 (109.64ms, 76.6MB)
테스트 21 〉	통과 (100.40ms, 85.9MB)
테스트 22 〉	통과 (29.68ms, 75.1MB)
테스트 23 〉	통과 (0.03ms, 78.1MB)
테스트 24 〉	통과 (79.46ms, 74.6MB)
테스트 25 〉	통과 (85.83ms, 89.4MB)
테스트 26 〉	통과 (0.04ms, 77.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
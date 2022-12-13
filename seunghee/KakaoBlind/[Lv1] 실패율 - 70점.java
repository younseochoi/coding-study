import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Double> arr2 = new ArrayList<>();
        ArrayList<Double> arr = new ArrayList<>();
        double person = stages.length;
        double cnt = 0;
        
        for (int i=1; i<=N; i++) {
        	for(int j=0; j<stages.length; j++) {
        		if(stages[j]==i) {
        			cnt++;
        		}
        	}
        	arr.add(cnt/person);
        	arr2.add(cnt/person);
        	person -= cnt;
        	cnt = 0;     		
        }
        
        Object[] nums = arr.toArray();
        Arrays.sort(nums,Collections.reverseOrder());
        
        
        for(int k=0; k<nums.length; k++) {
        	for(int l=0; l<arr2.size(); l++) {
        		if(nums[k].equals(arr2.get(l)) && (!ans.contains(l+1))) {
        			ans.add((l+1));
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
이상하게 진짜 어렵게 풀었는데도... 틀렸네요... 접근법이 틀린 듯 ㅜㅜㅋㅋ
정확성  테스트
테스트 1 〉	실패 (0.49ms, 72.4MB)
테스트 2 〉	통과 (0.62ms, 79.4MB)
테스트 3 〉	통과 (36.79ms, 89.1MB)
테스트 4 〉	통과 (58.91ms, 79.1MB)
테스트 5 〉	통과 (246.65ms, 98.8MB)
테스트 6 〉	실패 (6.29ms, 87.6MB)
테스트 7 〉	실패 (12.09ms, 74.7MB)
테스트 8 〉	통과 (97.06ms, 85.9MB)
테스트 9 〉	실패 (265.34ms, 93.8MB)
테스트 10 〉	통과 (34.10ms, 87.6MB)
테스트 11 〉	통과 (81.93ms, 84.2MB)
테스트 12 〉	통과 (67.64ms, 90.9MB)
테스트 13 〉	실패 (94.35ms, 98.8MB)
테스트 14 〉	통과 (1.29ms, 74.8MB)
테스트 15 〉	통과 (10.84ms, 85.5MB)
테스트 16 〉	통과 (5.15ms, 76MB)
테스트 17 〉	통과 (13.03ms, 79.9MB)
테스트 18 〉	통과 (7.43ms, 78.7MB)
테스트 19 〉	통과 (3.58ms, 86.7MB)
테스트 20 〉	통과 (11.21ms, 83.9MB)
테스트 21 〉	통과 (14.85ms, 80.8MB)
테스트 22 〉	통과 (223.22ms, 89MB)
테스트 23 〉	실패 (16.20ms, 96.3MB)
테스트 24 〉	실패 (33.08ms, 96.4MB)
테스트 25 〉	실패 (0.28ms, 73MB)
테스트 26 〉	통과 (0.34ms, 77.9MB)
테스트 27 〉	통과 (0.27ms, 75.9MB)
채점 결과
정확성: 70.4
합계: 70.4 / 100.0
*/
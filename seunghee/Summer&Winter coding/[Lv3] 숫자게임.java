import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        List<Integer> arr = new ArrayList<Integer>();
        for(int n: B) {
        	arr.add(n);        	
        }
        for(int i=0; i<A.length; i++) {
        	for(int j=0; j<arr.size(); j++) {
        		if(A[i]<arr.get(j)) {
        			arr.remove(j);
        			answer ++;
        			break;
        		}
        	}
        }
        return answer;
    }
}
/*
이게 레벨 쓰리...? 곧 레벨 투로 내려갈듯...
정확성  테스트
테스트 1 〉	통과 (0.37ms, 67.1MB)
테스트 2 〉	통과 (0.35ms, 77.5MB)
테스트 3 〉	통과 (0.45ms, 70.7MB)
테스트 4 〉	통과 (0.45ms, 78MB)
테스트 5 〉	통과 (0.50ms, 76MB)
테스트 6 〉	통과 (0.51ms, 75MB)
테스트 7 〉	통과 (0.50ms, 72.3MB)
테스트 8 〉	통과 (0.68ms, 75.6MB)
테스트 9 〉	통과 (5.98ms, 73.2MB)
테스트 10 〉	통과 (2.04ms, 78MB)
테스트 11 〉	통과 (2.53ms, 75.5MB)
테스트 12 〉	통과 (1.90ms, 76MB)
테스트 13 〉	통과 (19.20ms, 85.3MB)
테스트 14 〉	통과 (24.56ms, 85MB)
테스트 15 〉	통과 (31.08ms, 86.7MB)
테스트 16 〉	통과 (32.02ms, 85.4MB)
테스트 17 〉	통과 (2.27ms, 84.8MB)
테스트 18 〉	통과 (54.34ms, 83.6MB)
효율성  테스트
테스트 1 〉	통과 (542.90ms, 67.6MB)
테스트 2 〉	통과 (479.60ms, 67.5MB)
테스트 3 〉	통과 (411.44ms, 70.6MB)
채점 결과
정확성: 85.7
효율성: 14.3
합계: 100.0 / 100.0
*/
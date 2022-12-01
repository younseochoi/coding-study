import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++) {
        	sum += d[i];
        	if(sum > budget) {
        		break;
        	} else {
        		answer ++;        		
        	}
        }
        return answer;
    }
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.36ms, 71.6MB)
테스트 2 〉	통과 (0.44ms, 78.2MB)
테스트 3 〉	통과 (0.46ms, 83.7MB)
테스트 4 〉	통과 (0.44ms, 79.3MB)
테스트 5 〉	통과 (0.33ms, 77.9MB)
테스트 6 〉	통과 (0.30ms, 77.9MB)
테스트 7 〉	통과 (0.34ms, 77.1MB)
테스트 8 〉	통과 (0.39ms, 76.6MB)
테스트 9 〉	통과 (0.55ms, 78.8MB)
테스트 10 〉	통과 (0.41ms, 76.3MB)
테스트 11 〉	통과 (0.37ms, 86.3MB)
테스트 12 〉	통과 (0.46ms, 76.8MB)
테스트 13 〉	통과 (0.37ms, 73.5MB)
테스트 14 〉	통과 (0.40ms, 78.1MB)
테스트 15 〉	통과 (0.38ms, 75.5MB)
테스트 16 〉	통과 (0.39ms, 72.6MB)
테스트 17 〉	통과 (0.43ms, 77.4MB)
테스트 18 〉	통과 (0.35ms, 74.4MB)
테스트 19 〉	통과 (0.52ms, 75.8MB)
테스트 20 〉	통과 (0.47ms, 82.6MB)
테스트 21 〉	통과 (0.35ms, 76MB)
테스트 22 〉	통과 (0.34ms, 73.8MB)
테스트 23 〉	통과 (0.36ms, 70.2MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
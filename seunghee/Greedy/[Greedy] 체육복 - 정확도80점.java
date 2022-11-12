import java.util.*;

class Solution {
     public int solution(int n, int[] lost, int[] reserve) {
     
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        ArrayList<Integer> arr = new ArrayList<>();
        for (int x : reserve) arr.add(x);
        
        for (int i=0; i<lost.length; i++) {
        	for (int j=0; j<arr.size(); j++) {
        		int gap = arr.get(j) - lost[i];
        		if( gap == -1 || gap == 1 ) {
        			answer ++;
        			arr.remove(j);
        			break;
        		}
        	}
        }
        return answer;
    }
}

/*
정확성  테스트
테스트 1 〉	통과 (0.52ms, 78.2MB)
테스트 2 〉	통과 (0.56ms, 74.3MB)
테스트 3 〉	실패 (0.39ms, 72.7MB)
테스트 4 〉	통과 (0.40ms, 76.2MB)
테스트 5 〉	실패 (0.44ms, 74.1MB)
테스트 6 〉	통과 (0.36ms, 76.1MB)
테스트 7 〉	실패 (0.40ms, 77.4MB)
테스트 8 〉	통과 (0.42ms, 77.5MB)
테스트 9 〉	통과 (0.37ms, 75.8MB)
테스트 10 〉	통과 (0.43ms, 84.2MB)
테스트 11 〉	통과 (0.36ms, 84.2MB)
테스트 12 〉	실패 (0.50ms, 73.6MB)
테스트 13 〉	통과 (0.32ms, 72.2MB)
테스트 14 〉	통과 (0.50ms, 84.1MB)
테스트 15 〉	통과 (0.40ms, 75.7MB)
테스트 16 〉	통과 (0.52ms, 71.3MB)
테스트 17 〉	통과 (0.53ms, 76.4MB)
테스트 18 〉	통과 (0.41ms, 75.8MB)
테스트 19 〉	통과 (0.51ms, 73.3MB)
테스트 20 〉	통과 (2.64ms, 74MB)
채점 결과
정확성: 80.0
합계: 80.0 / 100.0
*/
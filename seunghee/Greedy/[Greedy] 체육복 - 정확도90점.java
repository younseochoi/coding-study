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
        		if ( lost[i] == arr.get(j) ) {
        			answer ++;
        			arr.remove(j);
        			break;
        		}
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
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.58ms, 72.9MB)
테스트 2 〉	통과 (0.38ms, 72.1MB)
테스트 3 〉	통과 (0.40ms, 76.3MB)
테스트 4 〉	통과 (0.40ms, 72.8MB)
테스트 5 〉	실패 (0.56ms, 73.3MB)
테스트 6 〉	통과 (0.48ms, 66.4MB)
테스트 7 〉	통과 (0.54ms, 75.7MB)
테스트 8 〉	통과 (0.35ms, 73.8MB)
테스트 9 〉	통과 (0.43ms, 75.9MB)
테스트 10 〉	통과 (0.55ms, 76.6MB)
테스트 11 〉	통과 (0.52ms, 77.8MB)
테스트 12 〉	실패 (0.34ms, 75.6MB)
테스트 13 〉	통과 (0.49ms, 75.1MB)
테스트 14 〉	통과 (0.45ms, 73.2MB)
테스트 15 〉	통과 (0.35ms, 72.6MB)
테스트 16 〉	통과 (0.51ms, 73.4MB)
테스트 17 〉	통과 (0.49ms, 78.4MB)
테스트 18 〉	통과 (0.35ms, 77.4MB)
테스트 19 〉	통과 (0.41ms, 75.7MB)
테스트 20 〉	통과 (0.55ms, 74MB)
채점 결과
정확성: 90.0
합계: 90.0 / 100.0
*/
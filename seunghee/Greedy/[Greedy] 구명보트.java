import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : people) {
        	arr.add(num);
        }
      
        while (!arr.isEmpty()) {
        	if(arr.size()!=1 && arr.get(arr.size()-1)+arr.get(0)<=limit) {
        		arr.remove(0);
        	}
        	arr.remove(arr.size()-1);
        	answer++;
        }
        return answer;
    }
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (3.02ms, 74.9MB)
테스트 2 〉	통과 (2.07ms, 76.6MB)
테스트 3 〉	통과 (3.35ms, 81.8MB)
테스트 4 〉	통과 (3.07ms, 78.7MB)
테스트 5 〉	통과 (3.34ms, 85.8MB)
테스트 6 〉	통과 (1.40ms, 76.1MB)
테스트 7 〉	통과 (1.57ms, 74.5MB)
테스트 8 〉	통과 (0.50ms, 72.8MB)
테스트 9 〉	통과 (0.95ms, 83.1MB)
테스트 10 〉	통과 (2.44ms, 74MB)
테스트 11 〉	통과 (2.66ms, 77.6MB)
테스트 12 〉	통과 (1.94ms, 74.2MB)
테스트 13 〉	통과 (2.10ms, 73.9MB)
테스트 14 〉	통과 (3.89ms, 88.7MB)
테스트 15 〉	통과 (1.07ms, 70.3MB)
효율성  테스트
테스트 1 〉	통과 (47.55ms, 57.4MB)
테스트 2 〉	통과 (20.04ms, 54.2MB)
테스트 3 〉	통과 (44.20ms, 62.3MB)
테스트 4 〉	통과 (17.83ms, 55.3MB)
테스트 5 〉	통과 (19.60ms, 54MB)
채점 결과
정확성: 75.0
효율성: 25.0
합계: 100.0 / 100.0
*/
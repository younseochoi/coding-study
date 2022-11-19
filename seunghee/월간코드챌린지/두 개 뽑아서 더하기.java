import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>();
        
        for (int i=0; i<numbers.length; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		int num = numbers[i]*numbers[j];
        		if (arr.contains(num)) {
        			continue;
        		} else {
        			arr.add(num);
        		}
        	}
        }
        answer = new int[arr.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.34ms, 76MB)
테스트 2 〉	통과 (0.42ms, 74.5MB)
테스트 3 〉	통과 (0.36ms, 76.9MB)
테스트 4 〉	통과 (0.38ms, 71.1MB)
테스트 5 〉	통과 (0.50ms, 76.9MB)
테스트 6 〉	통과 (1.02ms, 72.2MB)
테스트 7 〉	통과 (4.75ms, 76.8MB)
테스트 8 〉	통과 (2.74ms, 87.5MB)
테스트 9 〉	통과 (1.61ms, 77.3MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        // 두 개 더하는 모든 경우를 HashSet에 추가해 중복을 제거한다.
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        // HashSet을 배열로 바꾼다.
        
        Integer[] temp = set.toArray(new Integer[0]);
        
        int[] answer = new int[temp.length];
        
        for (int i=0; i<temp.length; i++) {
            answer[i] = temp[i];
        }
        
        // 오름차순 정렬을 한다.
        
        Arrays.sort(answer);
        
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.40ms, 75.8MB)
테스트 2 〉	통과 (1.46ms, 78.5MB)
테스트 3 〉	통과 (0.49ms, 77.5MB)
테스트 4 〉	통과 (0.40ms, 76.1MB)
테스트 5 〉	통과 (0.49ms, 72.8MB)
테스트 6 〉	통과 (0.74ms, 72.2MB)
테스트 7 〉	통과 (1.67ms, 75.4MB)
테스트 8 〉	통과 (0.91ms, 71.9MB)
테스트 9 〉	통과 (1.08ms, 73.4MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

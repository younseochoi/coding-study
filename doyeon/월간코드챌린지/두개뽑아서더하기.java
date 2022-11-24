import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList();
        
        // numbers 정렬
        Arrays.sort(numbers);
        
        // 앞에서부터 나 자신 제외한 수 덧셈
        for (int i=0; i < numbers.length; i++) {
            for (int j=i+1; j < numbers.length; j++) {
                int plus = numbers[i] + numbers[j];
                
                // 이미 추가한 수가 아니면 추가
                if (!answer.contains(plus)) {
                    answer.add(plus);
                }
            }
        }
        
        // 오름차순 정렬
        Collections.sort(answer);
        
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.55ms, 65.8MB)
// 테스트 2 〉	통과 (0.53ms, 78.2MB)
// 테스트 3 〉	통과 (0.83ms, 78.9MB)
// 테스트 4 〉	통과 (0.78ms, 73.6MB)
// 테스트 5 〉	통과 (1.00ms, 76.3MB)
// 테스트 6 〉	통과 (2.64ms, 70.5MB)
// 테스트 7 〉	통과 (7.17ms, 76.6MB)
// 테스트 8 〉	통과 (2.78ms, 71MB)
// 테스트 9 〉	통과 (1.61ms, 73.8MB)
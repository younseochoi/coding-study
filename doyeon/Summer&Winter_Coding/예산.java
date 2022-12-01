import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d);
        
        for (int n : d) {
            sum += n;
            answer++;
            
            // budget보다 크면 반복문 중단하고 중단 전 더해준 answer 값 1 빼기
            if (sum > budget) {
                answer--;
                break;
            }
        }
        
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.32ms, 77.6MB)
// 테스트 2 〉	통과 (0.44ms, 75.7MB)
// 테스트 3 〉	통과 (0.33ms, 76.4MB)
// 테스트 4 〉	통과 (0.48ms, 76.6MB)
// 테스트 5 〉	통과 (0.46ms, 79MB)
// 테스트 6 〉	통과 (0.34ms, 73.2MB)
// 테스트 7 〉	통과 (0.42ms, 80.1MB)
// 테스트 8 〉	통과 (0.38ms, 74.5MB)
// 테스트 9 〉	통과 (0.47ms, 78.3MB)
// 테스트 10 〉	통과 (0.54ms, 82.4MB)
// 테스트 11 〉	통과 (0.36ms, 75.1MB)
// 테스트 12 〉	통과 (0.37ms, 76.8MB)
// 테스트 13 〉	통과 (0.49ms, 78.8MB)
// 테스트 14 〉	통과 (0.38ms, 81MB)
// 테스트 15 〉	통과 (0.51ms, 75.7MB)
// 테스트 16 〉	통과 (0.35ms, 75.4MB)
// 테스트 17 〉	통과 (0.38ms, 67.2MB)
// 테스트 18 〉	통과 (0.36ms, 77.5MB)
// 테스트 19 〉	통과 (0.33ms, 68.4MB)
// 테스트 20 〉	통과 (0.35ms, 69.9MB)
// 테스트 21 〉	통과 (0.32ms, 77.3MB)
// 테스트 22 〉	통과 (0.34ms, 73.6MB)
// 테스트 23 〉	통과 (0.46ms, 81.7MB)

import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        
        for(int i = 0; i < answer.length; i++){
            int row = (int)((i + left) / n) + 1;
            int col = (int)((i + left) % n) + 1;
            answer[i] = Math.max(row, col);
        }
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (5.10ms, 108MB)
// 테스트 2 〉	통과 (8.11ms, 90.4MB)
// 테스트 3 〉	통과 (5.19ms, 120MB)
// 테스트 4 〉	통과 (0.04ms, 76.6MB)
// 테스트 5 〉	통과 (0.03ms, 79.4MB)
// 테스트 6 〉	통과 (4.97ms, 106MB)
// 테스트 7 〉	통과 (5.13ms, 94.2MB)
// 테스트 8 〉	통과 (7.34ms, 94.4MB)
// 테스트 9 〉	통과 (5.71ms, 104MB)
// 테스트 10 〉	통과 (4.97ms, 109MB)
// 테스트 11 〉	통과 (7.45ms, 90.7MB)
// 테스트 12 〉	통과 (4.65ms, 98.5MB)
// 테스트 13 〉	통과 (5.11ms, 105MB)
// 테스트 14 〉	통과 (4.69ms, 101MB)
// 테스트 15 〉	통과 (4.56ms, 92.3MB)
// 테스트 16 〉	통과 (5.36ms, 89.8MB)
// 테스트 17 〉	통과 (6.25ms, 116MB)
// 테스트 18 〉	통과 (6.79ms, 108MB)
// 테스트 19 〉	통과 (5.05ms, 90.3MB)
// 테스트 20 〉	통과 (4.71ms, 96.8MB)


// 정확성 55점
// class Solution {
//     public ArrayList<Integer> solution(int n, long left, long right) {
//         ArrayList<Integer> answer = new ArrayList();
//         int intRight = (int) right;
//         int intLeft = (int) left;
        
//         for (int i = intLeft; i <= intRight; i++) {
//             int n1 = (i / n) + 1;
//             int n2 = (i % n) + 1;
//             int result = Math.max(n1, n2);
//             answer.add(result);
//         }
//         return answer;
//     }
// }

// 정확성  테스트
// 테스트 1 〉	통과 (7.78ms, 106MB)
// 테스트 2 〉	통과 (7.92ms, 90.5MB)
// 테스트 3 〉	통과 (9.50ms, 111MB)
// 테스트 4 〉	통과 (0.06ms, 78.3MB)
// 테스트 5 〉	통과 (0.08ms, 79.4MB)
// 테스트 6 〉	통과 (8.17ms, 103MB)
// 테스트 7 〉	통과 (12.89ms, 94.2MB)
// 테스트 8 〉	통과 (8.67ms, 106MB)
// 테스트 9 〉	통과 (9.54ms, 106MB)
// 테스트 10 〉	통과 (12.44ms, 105MB)
// 테스트 11 〉	통과 (8.47ms, 94.5MB)
// 테스트 12 〉	실패 (8.41ms, 105MB)
// 테스트 13 〉	실패 (6.83ms, 94.5MB)
// 테스트 14 〉	실패 (11.80ms, 123MB)
// 테스트 15 〉	실패 (8.77ms, 104MB)
// 테스트 16 〉	실패 (7.81ms, 94.5MB)
// 테스트 17 〉	실패 (11.89ms, 114MB)
// 테스트 18 〉	실패 (12.16ms, 111MB)
// 테스트 19 〉	실패 (8.41ms, 102MB)
// 테스트 20 〉	실패 (7.71ms, 99.2MB)
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 정렬 -> 접두어가 같으면 서로 인접하게 됨
        Arrays.sort(phone_book);
        
        for (int i=0; i < phone_book.length-1; i++) {
            // 접두어는 무조건 다음 단어보다 길이가 짧으므로
            if (phone_book[i].length() < phone_book[i+1].length()) {
                
                // 접두어 길이만큼 다음 단어를 자른 다음에 서로 비교
                if(phone_book[i].equals(phone_book[i+1].substring(0, phone_book[i].length()))) {
                    answer = false;
                    break;
                }
                
            } else {
                // 길이가 더 길면 접두어가 아니므로 패스
                continue;
            }
        }
        
        return answer;
    }
}


// 정확성  테스트
// 테스트 1 〉	통과 (0.20ms, 80.7MB)
// 테스트 2 〉	통과 (0.22ms, 75.2MB)
// 테스트 3 〉	통과 (0.19ms, 77.1MB)
// 테스트 4 〉	통과 (0.19ms, 73.3MB)
// 테스트 5 〉	통과 (0.22ms, 74.9MB)
// 테스트 6 〉	통과 (0.18ms, 75.6MB)
// 테스트 7 〉	통과 (0.23ms, 75.8MB)
// 테스트 8 〉	통과 (0.18ms, 71.9MB)
// 테스트 9 〉	통과 (0.21ms, 75.7MB)
// 테스트 10 〉	통과 (0.25ms, 77.8MB)
// 테스트 11 〉	통과 (0.18ms, 77.2MB)
// 테스트 12 〉	통과 (0.26ms, 72.8MB)
// 테스트 13 〉	통과 (0.18ms, 76.6MB)
// 테스트 14 〉	통과 (1.89ms, 80.8MB)
// 테스트 15 〉	통과 (2.32ms, 76.9MB)
// 테스트 16 〉	통과 (2.75ms, 78.7MB)
// 테스트 17 〉	통과 (3.12ms, 81.7MB)
// 테스트 18 〉	통과 (3.43ms, 82.2MB)
// 테스트 19 〉	통과 (3.74ms, 83.3MB)
// 테스트 20 〉	통과 (4.08ms, 84.3MB)
// 효율성  테스트
// 테스트 1 〉	통과 (19.59ms, 55.8MB)
// 테스트 2 〉	통과 (17.11ms, 56.7MB)
// 테스트 3 〉	통과 (334.87ms, 98.2MB)
// 테스트 4 〉	통과 (283.03ms, 95.6MB)

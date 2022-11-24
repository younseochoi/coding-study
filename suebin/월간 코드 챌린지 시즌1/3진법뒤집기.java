import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = "";
        
        // 10진법 -> 3진법, 숫자 뒤집기
        
        while (n != 0) {
            temp += n % 3;
            n /= 3;
        }
        
        // 3진법 -> 10진법
        
        answer = Integer.parseInt(temp, 3);

        return answer;
    }
}


/*
테스트 1 〉	통과 (16.39ms, 86.4MB)
테스트 2 〉	통과 (13.31ms, 79.2MB)
테스트 3 〉	통과 (10.01ms, 74.2MB)
테스트 4 〉	통과 (19.12ms, 83.6MB)
테스트 5 〉	통과 (12.55ms, 80.2MB)
테스트 6 〉	통과 (11.13ms, 77.7MB)
테스트 7 〉	통과 (10.84ms, 77.7MB)
테스트 8 〉	통과 (11.19ms, 75.9MB)
테스트 9 〉	통과 (14.59ms, 78.3MB)
테스트 10 〉	통과 (11.97ms, 75.7MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

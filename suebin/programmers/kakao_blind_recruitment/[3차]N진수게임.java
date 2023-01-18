import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int num = 0;
        
        // m명이 t번 말하는 경우를 StringBuilder로 저장한다.
        
        while(sb.length() < m*t) {
            sb.append(Integer.toString(num++, n));
        }
        
        // 튜브가 말해야 하는 숫자 부분만 answer에 더해준다.
        
        for (int i=p-1; i<m*t; i+=m) {
            answer += sb.charAt(i);
        }
        
        return answer.toUpperCase();
    }
}


/*
정확성  테스트
테스트 1 〉	통과 (13.92ms, 73.7MB)
테스트 2 〉	통과 (13.54ms, 77.1MB)
테스트 3 〉	통과 (9.80ms, 81.3MB)
테스트 4 〉	통과 (13.68ms, 86.3MB)
테스트 5 〉	통과 (16.75ms, 72MB)
테스트 6 〉	통과 (12.96ms, 74.6MB)
테스트 7 〉	통과 (9.01ms, 74.8MB)
테스트 8 〉	통과 (10.03ms, 81.8MB)
테스트 9 〉	통과 (11.95ms, 78.8MB)
테스트 10 〉	통과 (9.81ms, 84.4MB)
테스트 11 〉	통과 (10.16ms, 72.3MB)
테스트 12 〉	통과 (11.22ms, 83.2MB)
테스트 13 〉	통과 (11.10ms, 85.9MB)
테스트 14 〉	통과 (19.36ms, 72.9MB)
테스트 15 〉	통과 (29.65ms, 93.3MB)
테스트 16 〉	통과 (33.11ms, 87.7MB)
테스트 17 〉	통과 (36.47ms, 84.2MB)
테스트 18 〉	통과 (11.91ms, 79MB)
테스트 19 〉	통과 (10.86ms, 79.1MB)
테스트 20 〉	통과 (14.36ms, 79MB)
테스트 21 〉	통과 (13.70ms, 79.9MB)
테스트 22 〉	통과 (13.60ms, 85.5MB)
테스트 23 〉	통과 (18.37ms, 80.3MB)
테스트 24 〉	통과 (21.47ms, 70.1MB)
테스트 25 〉	통과 (13.61ms, 82.6MB)
테스트 26 〉	통과 (14.57ms, 86.2MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

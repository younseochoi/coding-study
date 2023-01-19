import java.util.*;

class Solution {
    public long[] solution(int n, long left, long right) {
        
        // right-left+1 = answer 배열의 크기
        
        long[] answer = new long[(int)(right-left+1)];
        
        // answer의 index
        
        int index = 0;
        
        // 해당 행과 열 중 큰 값이 찾는 값이 된다.
        
        for (long i=left; i<=right; i++) {
           answer[index] = Math.max(i/n+1, i%n+1);
           index++;
       } 

        return answer;
    }
}

/*
처음에는 list로 문제를 풀며 형 변환에 어려움을 겪었지만,
사실 list는 Long타입을 지원하지 않는다고 합니다.
이런 경우에는 새로운 각도에서 보려고 노력해야겠습니다!
/*

테스트 1 〉	통과 (7.62ms, 94.9MB)
테스트 2 〉	통과 (7.35ms, 92.7MB)
테스트 3 〉	통과 (10.38ms, 116MB)
테스트 4 〉	통과 (0.03ms, 73.7MB)
테스트 5 〉	통과 (0.06ms, 78.8MB)
테스트 6 〉	통과 (5.95ms, 96.6MB)
테스트 7 〉	통과 (6.73ms, 112MB)
테스트 8 〉	통과 (5.22ms, 91.4MB)
테스트 9 〉	통과 (5.35ms, 107MB)
테스트 10 〉	통과 (6.84ms, 94.5MB)
테스트 11 〉	통과 (8.32ms, 89.5MB)
테스트 12 〉	통과 (7.23ms, 99.5MB)
테스트 13 〉	통과 (5.30ms, 104MB)
테스트 14 〉	통과 (5.23ms, 83.7MB)
테스트 15 〉	통과 (4.95ms, 110MB)
테스트 16 〉	통과 (7.96ms, 90.2MB)
테스트 17 〉	통과 (7.80ms, 91.1MB)
테스트 18 〉	통과 (6.02ms, 109MB)
테스트 19 〉	통과 (6.32ms, 95.8MB)
테스트 20 〉	통과 (4.99ms, 94.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

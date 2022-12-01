// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12979#
import java.util.*;

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int len = w * 2 + 1;
        float cnt = 0;      // 타입을 미리 지정해주니 효율성 통과함
        
        for(int i=0; i<stations.length; i++) {
            int prev = stations[i] - w;
            int next = stations[i] + w;
            
            // 맨 처음 기지국일 경우
            if (i == 0) {
                // 기지국 앞쪽에서 전파가 안 닿는 곳이 있을 때
                if (prev > 1) {
                    cnt = prev - 1;
                    answer += Math.ceil(cnt / len);
                }
                // 기지국이 하나일 경우
                if (stations.length == 1) {
                    cnt = n - next;
                    answer += Math.ceil(cnt / len);
                }
                
            } else {
                // 맨 처음 기지국이 아닌 경우 사이 거리 계산하여 cnt에 할당
                cnt = prev - (stations[i-1] + w) - 1;
                answer += Math.ceil(cnt / len);
                
                // 마지막 기지국이면서 이후에 전파가 안 닿는 범위가 있을 때
                if (i == stations.length -1 && next < n) {
                    cnt = n - next;
                    answer += Math.ceil(cnt / len);
                }
            }
        }
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.20ms, 69.7MB)
// 테스트 2 〉	통과 (0.25ms, 77.5MB)
// 테스트 3 〉	통과 (0.22ms, 79.4MB)
// 테스트 4 〉	통과 (0.25ms, 68MB)
// 테스트 5 〉	통과 (3.09ms, 71MB)
// 테스트 6 〉	통과 (0.34ms, 78.8MB)
// 테스트 7 〉	통과 (0.20ms, 77.6MB)
// 테스트 8 〉	통과 (0.21ms, 82MB)
// 테스트 9 〉	통과 (0.21ms, 75.3MB)
// 테스트 10 〉	통과 (0.20ms, 74.2MB)
// 테스트 11 〉	통과 (0.32ms, 78.9MB)
// 테스트 12 〉	통과 (0.31ms, 75.3MB)
// 테스트 13 〉	통과 (0.19ms, 78.9MB)
// 테스트 14 〉	통과 (0.27ms, 83.1MB)
// 테스트 15 〉	통과 (0.33ms, 79.2MB)
// 테스트 16 〉	통과 (0.20ms, 70.9MB)
// 테스트 17 〉	통과 (0.22ms, 83.8MB)
// 테스트 18 〉	통과 (0.40ms, 77.2MB)
// 테스트 19 〉	통과 (0.22ms, 78.7MB)
// 테스트 20 〉	통과 (0.28ms, 76.1MB)
// 테스트 21 〉	통과 (0.22ms, 75.3MB)
// 효율성  테스트
// 테스트 1 〉	통과 (2.04ms, 53.7MB)
// 테스트 2 〉	통과 (2.12ms, 52.6MB)
// 테스트 3 〉	통과 (2.61ms, 52.7MB)
// 테스트 4 〉	통과 (1.90ms, 52.8MB)


// 다른 사람 풀이 
// https://iron-jin.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EA%B8%B0%EC%A7%80%EA%B5%AD-%EC%84%A4%EC%B9%98-feat-Java
public class Pro12979 {
    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int location = 1;//기지국을 설치할 현재 위치
        int idx = 0;//설치된 기지국 인덱스

        while(location <= n) {//위치가 전체 갯수보다 작거나 같을 때까지

            //설치된 기지국 범위 안에 있으면서, 현재 위치가 설치된 기지국의 범위보다 클 때,
            if (idx < stations.length && location >= stations[idx]-w) {

                location = stations[idx]+w+1;//설치된 기지국의 범위보다 +1 큰 위치로 이동
                idx++;//다음 인덱스로 이동
            } else {//설치된 기지국 범위 밖일 때,

                location += 2*w+1;//양쪽으로 범위를 가질 최댓값 +1을 해준다.
                answer++;//기지국을 설치했으므로, 결과값을 추가
            }
        }

        return answer;
    }
}
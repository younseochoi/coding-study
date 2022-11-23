//출처 : https://velog.io/@ahnick/programmers-단속카메라

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        
        //진출 시점으로 정렬
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] route1, int[] route2) {
                return route1[1] - route2[1];
            }
        });
        
        //주어진 조건 속 진출 지점의 최솟값
        int cam = -30000;
        
        for(int[] route : routes) {
            if(cam < route[0]) {
                // 현재 카메라의 위치가 route의 시작 지점보다 작으면
                // 새로운 cam을 route의 종료 지점에 설치한다
                cam = route[1];
                answer++;
            }
        }
        
        return answer;
    }
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.42ms, 73.4MB)
테스트 2 〉	통과 (0.41ms, 76.2MB)
테스트 3 〉	통과 (0.55ms, 77.4MB)
테스트 4 〉	통과 (0.62ms, 76.2MB)
테스트 5 〉	통과 (0.47ms, 73.3MB)
효율성  테스트
테스트 1 〉	통과 (4.76ms, 52.9MB)
테스트 2 〉	통과 (2.53ms, 52.9MB)
테스트 3 〉	통과 (7.83ms, 56.3MB)
테스트 4 〉	통과 (0.73ms, 52MB)
테스트 5 〉	통과 (8.52ms, 56.5MB)
채점 결과
정확성: 50.0
효율성: 50.0
합계: 100.0 / 100.0
*/
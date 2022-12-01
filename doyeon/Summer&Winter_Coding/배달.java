// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12978#qna
// 출처 : https://taehoung0102.tistory.com/127
import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[][] map =new int[N][N];
        
        //모든 map값의 INF값을 넣는다.(플로이드 와샬 쓰기위해) map[정점][정점]은 0으로초기화
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (i == j){                                  
                    continue;
                }
                map[i][j] = 500001;  
            }
        }
        // 정점과 정점을 연결해주는 맵을 그린다. 
        for(int[] data:road){
            //새로운 다리가 기존에 있던 다리보다 크면 넘긴다. 작으면 갱신한다. 
            if(map[data[0]-1][data[1]-1]<data[2]){
                continue;
            }
            map[data[0]-1][data[1]-1]=data[2];
            map[data[1]-1][data[0]-1]=data[2];
        }
        //플로이드 와샬 : 정점과 정점 사이의 최소거리를 구해주는 알고리즘
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map.length; j++) {
                for(int k=0; k<map.length; k++) {
                    if(map[j][k] > map[j][i] + map[i][k])
                        map[j][k] = map[j][i] + map[i][k];
                }
            }
        }
        // 1번 마을부터 출발하니, map[0]를 순환한다. 시간이 K이하면 answer++
        for (int i = 0; i < map[0].length; i++) {
            if (map[0][i] <= K) 
                answer++;
        }
        
        return answer;
    }
}
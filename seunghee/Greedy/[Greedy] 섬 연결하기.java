//참고 : https://moons-memo.tistory.com/208

import java.util.*;
class Solution {
    static PriorityQueue<int[]> pq;
    static List<int[]> list[];
    public int solution(int n, int[][] costs) {
        int answer = 0;
        list = new ArrayList[n];
        for(int i=0; i<n; i++)
            list[i]=new ArrayList<>();
        pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] o, int[] o2){
                return o[1] - o2[1];
            }
        });
        for(int[] cost: costs){
            list[cost[0]].add(new int[]{cost[1], cost[2]});
            list[cost[1]].add(new int[]{cost[0], cost[2]});
        }
        boolean visited[] = new boolean[n];
        pq.add(new int[]{0,0});
        while(!pq.isEmpty()){
            int[] arr = pq.poll();
            if(visited[arr[0]]) continue;
            visited[arr[0]] = true;
            answer += arr[1];
            
            for(int node[]: list[arr[0]]){
                if(!visited[node[0]]){
                    pq.add(new int[]{node[0], node[1]});
                }
            }
        }
        return answer;
    }
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.50ms, 78.3MB)
테스트 2 〉	통과 (0.53ms, 77.5MB)
테스트 3 〉	통과 (0.61ms, 76.5MB)
테스트 4 〉	통과 (0.59ms, 75.7MB)
테스트 5 〉	통과 (0.80ms, 74.8MB)
테스트 6 〉	통과 (0.70ms, 72.6MB)
테스트 7 〉	통과 (0.74ms, 71.4MB)
테스트 8 〉	통과 (0.62ms, 77.7MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
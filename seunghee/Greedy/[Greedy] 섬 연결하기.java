//참고 : https://moons-memo.tistory.com/208

import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        List<int[]> list[] = new ArrayList[n];
        for(int i=0; i<n; i++) {
            list[i]=new ArrayList<>();
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>();
        pq = new PriorityQueue<>(new Comparator<int[]>(){
        	@Override
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
테스트 1 〉	통과 (0.71ms, 78.3MB)
테스트 2 〉	통과 (0.55ms, 75.6MB)
테스트 3 〉	통과 (0.83ms, 67.4MB)
테스트 4 〉	통과 (0.64ms, 78.1MB)
테스트 5 〉	통과 (0.56ms, 86.8MB)
테스트 6 〉	통과 (0.74ms, 70.5MB)
테스트 7 〉	통과 (1.16ms, 72.6MB)
테스트 8 〉	통과 (0.55ms, 75.2MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
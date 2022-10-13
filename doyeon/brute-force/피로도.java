class Solution {
    static boolean[] visited;
    static int answer;
    
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        visited = new boolean[dungeons.length];    // 방문 여부 담는 배열 생성
        dfs(0, k, dungeons);
        return answer;
    }
    
    static void dfs(int depth, int k, int[][] dungeons) {
         answer = Math.max(answer, depth);      // 더 이상 갈 수 있는 던전이 없는 경우 (깊이 = 방문한 던전 수)
        
         for(int i=0; i<dungeons.length; i++) {
             if(k >= dungeons[i][0] && !visited[i]) {   // 방문한 적 없고 최소 필요 피로도 조건 충족 시
                 visited[i] = true;
                 dfs(depth + 1, k-dungeons[i][1], dungeons);
                 visited[i] = false;
             } 
         }
     }
}
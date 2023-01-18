class Solution {
    private int answer = 0;
    private boolean[] visit;
    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        
        //0은 depth, k 는 현재 피로도
        dfs(0, k, dungeons); 
        
        return answer;
    }
    
    private void dfs(int depth, int k, int[][]dungeons){
        for(int i = 0; i<dungeons.length; i++){
             // visit[i]를 방문하지 않았고, 피로도 조건이 맞는 경우
            if(!visit[i]&& dungeons[i][0]<=k){
                visit[i] = true; 
                dfs(depth+1, k-dungeons[i][1], dungeons); 
                visit[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
}

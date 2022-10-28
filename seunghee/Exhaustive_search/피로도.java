class Solution {
    private int answer = 0;
    private boolean[] visit;
    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        
        dfs(0, k, dungeons); //0은 depth, k 는 현재 피로도
        
        return answer;
    }
    
    private void dfs(int depth, int k, int[][]dungeons){
        for(int i = 0; i<dungeons.length; i++){
            if(!visit[i]&& dungeons[i][0]<=k){
                visit[i] = true;
                dfs(depth+1, k-dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
}
//1시간 넘게 풀다가 답이 안나와서 다른 분들 답을 봤는데
//다들 dfs라는 것을 사용해서 완전탐색을 푸시더라고요...!
//혼자는 해결하지 못했고 dfs를 공부하는 계기(?)가 되었던 것 같습니다...!!
//참고한 여러명의 풀이 중 가장 간단한 버전을 참고하여 정리했습니다!
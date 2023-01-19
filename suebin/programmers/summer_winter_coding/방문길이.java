class Solution {
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};
    
    public int solution(String dirs) {
        int answer = 0;
        
        // map = 좌표평면
        
        int map[][] = new int[11][11];
        
        // 방문 여부 체크 (어느 방향에서 오는지를 체크해야 하므로 3차원 배열 사용)
        
        boolean visit[][][] = new boolean[11][11][4];
        int x=5, y=5;
        
        for (int i=0; i<dirs.length(); i++) {
            char c = dirs.charAt(i);
            int d = 0;
            
            if (c == 'U') d=0;
            if (c == 'L') d=1;
            if (c == 'D') d=2;
            if (c == 'R') d=3;
            
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            if (nx<0 || ny<0 || nx>=11 || ny>=11) continue;
            
            // 앞으로 갈 곳을 방문하지 않았다면 true로 체크해둔다. 그래야 되돌아올 경우 answer에 1을 더하지 않는다.
            
            if (!visit[nx][ny][d]) {
                visit[nx][ny][d] = true;
                d = (d%2 == 0)? 2-d: 4-d;
                visit[x][y][d] = true;
                answer++;
            }
            x = nx;
            y = ny;
        }
        
        return answer;
    }
}


/*
테스트 1 〉	통과 (0.04ms, 72.1MB)
테스트 2 〉	통과 (0.04ms, 73.3MB)
테스트 3 〉	통과 (0.07ms, 80.1MB)
테스트 4 〉	통과 (0.06ms, 75.8MB)
테스트 5 〉	통과 (0.09ms, 78.3MB)
테스트 6 〉	통과 (0.06ms, 78.2MB)
테스트 7 〉	통과 (0.05ms, 75.7MB)
테스트 8 〉	통과 (0.05ms, 76.1MB)
테스트 9 〉	통과 (0.07ms, 81.1MB)
테스트 10 〉	통과 (0.07ms, 78.6MB)
테스트 11 〉	통과 (0.07ms, 84MB)
테스트 12 〉	통과 (0.07ms, 72.1MB)
테스트 13 〉	통과 (0.05ms, 70.2MB)
테스트 14 〉	통과 (0.09ms, 72.8MB)
테스트 15 〉	통과 (0.05ms, 74.5MB)
테스트 16 〉	통과 (0.11ms, 81.6MB)
테스트 17 〉	통과 (0.15ms, 78.1MB)
테스트 18 〉	통과 (0.16ms, 75.9MB)
테스트 19 〉	통과 (0.10ms, 75.2MB)
테스트 20 〉	통과 (0.10ms, 69.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

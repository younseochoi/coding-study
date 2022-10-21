class Solution {
    public boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        // 한 번 탐색이 끝나면 연결되어 있지 않은 네트워크부터 다시 탐색
        for(int i=0; i<computers.length; i++) {
            if (!visited[i]) {
                dfs(i, computers);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int depth, int[][] computers) {
        // 방문 표시
        visited[depth] = true;
        
        if(depth == computers.length) {
            return;
        }
        
        // 연결되어 있는 네트워크들 다 탐색
        for(int j=0; j<computers.length; j++) {
            if (computers[depth][j] == 1 && visited[j] == false) {
                dfs(j, computers);
            }
        }
    }
}


/*
테스트 1 〉	통과 (0.02ms, 72.1MB)
테스트 2 〉	통과 (0.03ms, 75MB)
테스트 3 〉	통과 (0.03ms, 74.5MB)
테스트 4 〉	통과 (0.03ms, 76.3MB)
테스트 5 〉	통과 (0.03ms, 71.8MB)
테스트 6 〉	통과 (0.10ms, 75.4MB)
테스트 7 〉	통과 (0.03ms, 78.9MB)
테스트 8 〉	통과 (0.05ms, 78.3MB)
테스트 9 〉	통과 (0.04ms, 78.5MB)
테스트 10 〉통과 (0.04ms, 85.9MB)
테스트 11 〉통과 (0.19ms, 77.3MB)
테스트 12 〉통과 (0.16ms, 77.8MB)
테스트 13 〉통과 (0.08ms, 76.3MB)*/
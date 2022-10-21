import java.util.*;

class Solution {
    int[] dx = {0, 0, 1, -1};
    int[] dy = {-1, 1, 0, 0};
    
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length] [maps[0].length];
        
        visited[0][0] = 1; // 시작 위치 방문체크
        
        // bfs 탐색
        bfs(maps, visited);
        // 도착지 값을 넣어주기
        answer = visited[maps.length - 1][maps[0].length - 1];

        // 갈 수 없다면 1리턴
        if (answer == 0) {
            answer = -1;
        }
        return answer;
    }

    public void bfs(int[][] maps, int[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        
        while (!q.isEmpty()){
            int[] now = q.poll();
            int x = now [0];
            int y = now [1];
            
            // 4방탐색
            for (int i = 0; i < 4; i++) {
                // 이동했을 때 위치
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // 범위 벗어나는지 체크
                // 방문했는지 체크
                // 갈 수 있는지 체크
                if (nx >= 0 && nx < maps. length && ny >= 0 && ny < maps[0].length
                && visited[nx][ny] == 0 && maps [nx][ny] == 1) {
                    // 방문했다고 체크해주기
                    visited[nx][ny] = visited[x][y] + 1;
                    // 큐에 넣기
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
}

// 원문 : https://blackvill.tistory.com/177

/* 정확성 테스트
테스트 1 〉	통과 (0.16ms, 80.1MB)
테스트 2 〉	통과 (0.12ms, 75.6MB)
테스트 3 〉	통과 (0.20ms, 74.6MB)
테스트 4 〉	통과 (0.16ms, 71.2MB)
테스트 5 〉	통과 (0.19ms, 75.5MB)
테스트 6 〉	통과 (0.15ms, 74.4MB)
테스트 7 〉	통과 (0.22ms, 73.1MB)
테스트 8 〉	통과 (0.20ms, 79.3MB)
테스트 9 〉	통과 (0.16ms, 72.2MB)
테스트 10 〉통과 (0.19ms, 76.3MB)
테스트 11 〉통과 (0.13ms, 70.6MB)
테스트 12 〉통과 (0.14ms, 76.2MB)
테스트 13 〉통과 (0.13ms, 75.3MB)
테스트 14 〉통과 (0.15ms, 73MB)
테스트 15 〉통과 (0.18ms, 68.2MB)
테스트 16 〉통과 (0.15ms, 70.8MB)
테스트 17 〉통과 (0.23ms, 79.9MB)
테스트 18 〉통과 (0.11ms, 77.3MB)
테스트 19 〉통과 (0.15ms, 73.4MB)
테스트 20 〉통과 (0.16ms, 73.9MB)
테스트 21 〉통과 (0.13ms, 78.7MB)

효율성 테스트
테스트 1 〉	통과 (10.42ms, 53.1MB)
테스트 2 〉	통과 (2.94ms, 56.3MB)
테스트 3 〉	통과 (6.98ms, 53.9MB)
테스트 4 〉	통과 (4.75ms, 54.2MB) */
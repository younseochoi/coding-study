import java.util.*;

class Solution {
    
    int[] dx = {1,0,-1,0}; // x축 이동 (동, 남, 서, 북)
    int[] dy = {0,1,0,-1}; // y축 이동
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        // 지나온 칸의 개수를 저장
        
        int[][] visited = new int[maps.length][maps[0].length];
         
        // bfs 함수 호출
        
        bfs(maps, visited);
        
        // 상대 팀 진영에 도착했을 때 여태껏 지나온 칸의 개수 = answer
        
        answer = visited[maps.length-1][maps[0].length-1];
        
        if(answer == 0) {answer = -1;}
        
        return answer;
    }
    
     // bfs 함수
    
    public void bfs(int[][] maps, int[][] visited){   
        int x = 0;
        int y = 0;
        
        visited[x][y] = 1; // 현재 지나온 칸의 개수는 1
       
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[]{x, y}); // 이 부분이 이해가 안 가는데 아시는 분 있을까요 ,,?
        
        while(!queue.isEmpty()){
            int[] current = queue.remove(); // 현재 위치 빼기
            int cX = current[0]; // 현재 x축
            int cY = current[1]; // 현재 y축
            
            for(int i = 0; i < 4; i++){
                int nX = cX + dx[i]; // 다음 x축 예상
                int nY = cY + dy[i]; // 다음 y축 예상
                
                // 게임 맵을 벗어나는 경우 
                
                if(nX < 0 || nX > maps.length-1 || nY < 0 || nY > maps[0].length-1)
                    continue;
                
                 // 방문한 적이 없고, 갈 수 있는 길인 경우
                
                if(visited[nX][nY] == 0 && maps[nX][nY] == 1){
                    
                    // 지금까지 지나온 칸의 개수에 1을 더해준다.
                    
                    visited[nX][nY] = visited[cX][cY] + 1;
                    
                    // 새로 가는 곳의 x축과 y축을 queue에 넣어준다. 
                    
                    queue.add(new int[]{nX, nY});
                }
            }
            
        } 
        
    }
}

/*
정확성  테스트

테스트 1 〉	통과 (0.13ms, 79.2MB)
테스트 2 〉	통과 (0.15ms, 77MB)
테스트 3 〉	통과 (0.23ms, 68.6MB)
테스트 4 〉	통과 (0.17ms, 75.4MB)
테스트 5 〉	통과 (0.18ms, 73.5MB)
테스트 6 〉	통과 (0.20ms, 74.5MB)
테스트 7 〉	통과 (0.16ms, 76.4MB)
테스트 8 〉	통과 (0.22ms, 79.1MB)
테스트 9 〉	통과 (0.18ms, 78.7MB)
테스트 10 〉통과 (0.14ms, 76.6MB)
테스트 11 〉통과 (0.18ms, 86.9MB)
테스트 12 〉통과 (0.18ms, 76.4MB)
테스트 13 〉통과 (0.16ms, 75.3MB)
테스트 14 〉통과 (0.14ms, 76.4MB)
테스트 15 〉통과 (0.14ms, 71.1MB)
테스트 16 〉통과 (0.13ms, 73.3MB)
테스트 17 〉통과 (0.22ms, 72.9MB)
테스트 18 〉통과 (0.17ms, 76.6MB)
테스트 19 〉통과 (0.13ms, 74MB)
테스트 20 〉통과 (0.12ms, 73.6MB)
테스트 21 〉통과 (0.12ms, 77.6MB)

효율성  테스트

테스트 1 〉	통과 (9.61ms, 53.1MB)
테스트 2 〉	통과 (3.94ms, 53.4MB)
테스트 3 〉	통과 (14.12ms, 53.4MB)
테스트 4 〉	통과 (5.04ms, 56.6MB)
*/

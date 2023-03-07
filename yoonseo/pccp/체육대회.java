package pccp;

public class 체육대회 {

	public static void main(String[] args) {
		체육대회 s = new 체육대회();
		// 210
		s.solution(new int[][]{{40, 10, 10}, {20, 5, 0}, {30, 30, 30}, {70, 0, 70}, {100, 100, 100}});
	
		//60
		s.solution(new int [][]  {{20, 30}, {30, 20}, {20, 30}});
		
	}

	int answer = 0;
    public int solution(int[][] ability) {
        
        boolean [] visited = new boolean[ability.length];
        
        dfs(visited, 0,0 ,ability);
        
        System.out.println(answer);
        return answer;
    }
    
    public void dfs(boolean[] visited, int k, int sum, int[][] ability){
        if( k == ability[0].length) {
            answer = Math.max(answer, sum);
            return ;
        }
            
        
        for(int i =0;i<ability.length;i++){
            
        	if(!visited[i]) {
          
            	visited[i] = true;
            	dfs(visited, k+1, sum+ability[i][k], ability);
            	visited[i] = false;
            }
        }
    }
}

/*
 정확성  테스트
테스트 1 〉	통과 (4.13ms, 73.9MB)
테스트 2 〉	통과 (2.37ms, 72.6MB)
테스트 3 〉	통과 (87.41ms, 94.8MB)
테스트 4 〉	통과 (2.80ms, 74.7MB)
테스트 5 〉	통과 (0.41ms, 76.4MB)
테스트 6 〉	통과 (0.03ms, 75.4MB)
테스트 7 〉	통과 (0.23ms, 68.8MB)
테스트 8 〉	통과 (100.93ms, 76.2MB)
테스트 9 〉	통과 (4.91ms, 76.7MB)
테스트 10 〉	통과 (3.80ms, 75.8MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */
 
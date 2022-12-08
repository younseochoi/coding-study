package kakao_blind_recruitment;

public class 프렌즈4블록 {

	public static void main(String[] args) {
		프렌즈4블록 s = new 프렌즈4블록();
		s.solution(4, 5, new String[] {"CCBDE", "AAADE", "AAABF", "CCBBF"}); //14
		s.solution(6, 6, new String[] {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"}); //15
		
	}
	
	public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] arr = new char[m][n]; 
        
        for(int i =0;i<m;i++) {
        	arr[i] =  board[m-i-1].toCharArray();
        }
        
        while(true) {
        	boolean flag = true;
        	boolean [][] visited = new boolean[m][n];
        	
        	for(int i =0;i<m-1;i++) {
        		for(int j =0;j<n-1;j++) {
        			if(arr[i][j] == '0') continue;
        			
        			if(checkBlock(arr, i , j, visited)) flag= false;
        		}
        	}
        	
        	if(flag) break;
        	answer+= deleteBlock(arr, visited);
        	updateBlock(arr);
        	
        }
        System.out.println(answer);
        return answer;
    }
	
	public boolean checkBlock(char[][] arr, int i, int j, boolean[][] visited) {
		
		char c = arr[i][j];
		if(arr[i][j+1] == c && arr[i+1][j] ==c && arr[i][j+1] ==c &&arr[i+1][j+1]==c) {
			visited[i][j] = true;
			visited[i+1][j] = true;
			visited[i][j+1] = true;
			visited[i+1][j+1] = true;
			return true;
		}
		
		return false;
	}
	
	public int deleteBlock(char[][] arr, boolean[][] visited) {
		int count = 0;
		
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				if(visited[i][j]) {
					arr[i][j] = '0';
					count++;
				}
			}
		}
		
		return count;
	}
	
	public void updateBlock(char[][] arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				
				if(arr[i][j] == '0') {
					
					for(int k = i ;k<arr.length;k++) {
						if(arr[k][j] != '0') {
							arr[i][j] = arr[k][j];
							arr[k][j] = '0';
							break;
						}
					}
				}
			}
		}
	}

}


/*
 정확성  테스트
테스트 1 〉	통과 (0.06ms, 73.4MB)
테스트 2 〉	통과 (0.05ms, 79.1MB)
테스트 3 〉	통과 (0.04ms, 75.6MB)
테스트 4 〉	통과 (0.48ms, 79.1MB)
테스트 5 〉	통과 (18.71ms, 83.5MB)
테스트 6 〉	통과 (2.78ms, 76.6MB)
테스트 7 〉	통과 (0.46ms, 76.3MB)
테스트 8 〉	통과 (0.53ms, 73.7MB)
테스트 9 〉	통과 (0.05ms, 76.5MB)
테스트 10 〉	통과 (0.24ms, 75.1MB)
테스트 11 〉	통과 (1.12ms, 83.7MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */

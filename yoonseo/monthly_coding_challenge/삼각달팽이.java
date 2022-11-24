package monthly_coding_challenge;

public class 삼각달팽이 {

	public static void main(String[] args) {
		삼각달팽이 s = new 삼각달팽이();
		s.solution(4);
		s.solution(5);
		s.solution(6);
		
//		4	[1,2,9,3,10,8,4,5,6,7]
//		5	[1,2,12,3,13,11,4,14,15,10,5,6,7,8,9]
//		6	[1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11]
	}

	 public int[] solution(int n) {
	        int[] answer = new int[n*(n+1)/2];
	        int arr[][] = new int[n][n];
	        int flag = 1;
	        int x=-1,y = 0;
	        
	        
	        for(int i =0;i<n;i++) {
	        	for(int j = i ; j<n;j++) { // 3-> 2 -> 1 번 반복
	        		// 1. 위 -> 아래
	        		if(i%3 == 0) {
	        			x++;
	        		}
	        		else if(i%3 ==1) {// 2. 좌 -> 우
	        			y++;
	        		}
	        		else {// 3. 대각선
	        			x--; y--;
	        		}
	        		
	        		arr[x][y] = flag++;
	        	}
	        }
	        
	        x= 0 ;
	        
	        for(int i =0;i<n;i++) {
	        	for(int j =0;j<=i;j++) {
	        		answer[x++] = arr[i][j];
	        	}
	        }
	        return answer;
	    }
}
/*
 정확성  테스트
테스트 1 〉	통과 (0.02ms, 75.4MB)
테스트 2 〉	통과 (0.02ms, 72.6MB)
테스트 3 〉	통과 (0.03ms, 75.8MB)
테스트 4 〉	통과 (0.30ms, 74.8MB)
테스트 5 〉	통과 (0.29ms, 76.8MB)
테스트 6 〉	통과 (0.48ms, 93.3MB)
테스트 7 〉	통과 (23.94ms, 123MB)
테스트 8 〉	통과 (29.31ms, 125MB)
테스트 9 〉	통과 (13.11ms, 122MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */

package monthly_coding_challenge;

public class 쿼드압축후개수세기 {

	public static void main(String[] args) {

		쿼드압축후개수세기 s = new 쿼드압축후개수세기();
		s.solution(new int[][] {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}}); //{4,9}
		s.solution(new int[][]	{{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}}); //{10,15}
		
	}
	
	int count0 = 0;
	int count1 = 0;
	
	 public int[] solution(int[][] arr) {
	        int[] answer = new int[2];
	       
	        count0 = count1 = 0;
	       
	        rec(arr, 0, 0, arr.length);
	        
	        answer[0] = count0;
	        answer[1] = count1;
	        
	        System.out.println(answer[0]+" "+answer[1]);
	        System.out.println();
	        return answer;
	    }
	 
	 public void rec(int [][] arr,int x, int y,int size){
		 
		 
		 boolean flag = false;
		 
		 Loop1:
		 for(int i=x;i<x+size;i++) {
			
			 for(int j=y;j<y+size;j++) {
			
				 if(arr[i][j] ==arr[x][y]) { // 연속된 숫자 인지
					 flag = true;
				 }
				 else {
					 flag = false;
					 break Loop1;
				 }
			 }
		 }
		 
		 if(flag) {
			 if(arr[x][y] == 0)  count0++;
			 
			 else	count1++;
			 
			 return ;
		 }
		 
		
		 int len = size/2;
		 
		 rec(arr, x, y,  len); // 2사분면
		 rec(arr, x+ len, y, len); // 1사분면
		 rec(arr, x, y+len,  len); //3사분면
		 rec(arr, x+ len,y+ len, len); //4사분면
		 
	 }
}

/*
 정확성  테스트
테스트 1 〉	통과 (15.94ms, 69.5MB)
테스트 2 〉	통과 (25.49ms, 84.7MB)
테스트 3 〉	통과 (14.76ms, 86.4MB)
테스트 4 〉	통과 (13.68ms, 71.8MB)
테스트 5 〉	통과 (20.88ms, 90.4MB)
테스트 6 〉	통과 (18.97ms, 80.6MB)
테스트 7 〉	통과 (17.80ms, 87.6MB)
테스트 8 〉	통과 (23.57ms, 85.2MB)
테스트 9 〉	통과 (16.63ms, 84.2MB)
테스트 10 〉	통과 (28.12ms, 114MB)
테스트 11 〉	통과 (17.09ms, 77.9MB)
테스트 12 〉	통과 (12.64ms, 79.2MB)
테스트 13 〉	통과 (17.41ms, 90.4MB)
테스트 14 〉	통과 (33.88ms, 137MB)
테스트 15 〉	통과 (36.97ms, 115MB)
테스트 16 〉	통과 (14.09ms, 92.4MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */


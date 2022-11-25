package monthly_coding_challenge;

public class 풍선터뜨리기 {


		public int solution(int[] a) {
			 int answer = 2;
				int l_min = a[0];
				int r_min = a[a.length-1];
				
				int x = 1, y = a.length-2;
			   
				for(int i =1;i<a.length-1;i++) {
					
					if(l_min > r_min) { // 큰값보다 a[]값이 더 크면 a[] 값은 남길 수 없음 
				
						if(l_min > a[x]) {
							answer++;
							l_min = a[x];
						}
						x++;
					}else {
						
						if(r_min>a[y]) {
							answer++;
							r_min = a[y];
						}
						y--;
					}
					
					
				}
			   
			  
				
				return answer;
		}
	

}
/*
 정확성  테스트
테스트 1 〉	통과 (0.02ms, 72.9MB)
테스트 2 〉	통과 (0.01ms, 72.5MB)
테스트 3 〉	통과 (0.04ms, 76.6MB)
테스트 4 〉	통과 (1.96ms, 83.5MB)
테스트 5 〉	통과 (4.15ms, 121MB)
테스트 6 〉	통과 (6.52ms, 118MB)
테스트 7 〉	통과 (8.56ms, 130MB)
테스트 8 〉	통과 (7.22ms, 138MB)
테스트 9 〉	통과 (4.86ms, 125MB)
테스트 10 〉	통과 (4.98ms, 128MB)
테스트 11 〉	통과 (9.68ms, 122MB)
테스트 12 〉	통과 (10.79ms, 139MB)
테스트 13 〉	통과 (9.35ms, 133MB)
테스트 14 〉	통과 (11.88ms, 129MB)
테스트 15 〉	통과 (8.74ms, 142MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
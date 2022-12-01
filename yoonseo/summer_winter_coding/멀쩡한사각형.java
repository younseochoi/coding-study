package summer_winter_coding;

public class 멀쩡한사각형 {

	public static void main(String[] args) {
		멀쩡한사각형 s= new 멀쩡한사각형();
		s.solution(3, 4);
		s.solution(4, 3);
		s.solution(2, 9);
		s.solution(8, 12);
	}

	 public long solution(int w, int h) {
	        long answer = 0;
	        
	        for(int i =1;i<w;i++) {
	        	 long temp = (long) (((double)h*i)/w);
	             
	             answer+=  temp;
	        	
	        }

	       
	        
	        System.out.println(answer*2);
	        return answer*2;
	    }
}

/*
 정확성  테스트
테스트 1 〉	통과 (0.08ms, 87.5MB)
테스트 2 〉	통과 (0.17ms, 71MB)
테스트 3 〉	통과 (0.09ms, 73.6MB)
테스트 4 〉	통과 (0.33ms, 88.3MB)
테스트 5 〉	통과 (0.11ms, 71.2MB)
테스트 6 〉	통과 (0.27ms, 76.4MB)
테스트 7 〉	통과 (0.24ms, 71.4MB)
테스트 8 〉	통과 (0.14ms, 73MB)
테스트 9 〉	통과 (0.14ms, 74.8MB)
테스트 10 〉	통과 (0.07ms, 72.3MB)
테스트 11 〉	통과 (398.63ms, 97.9MB)
테스트 12 〉	통과 (398.39ms, 77.4MB)
테스트 13 〉	통과 (40.01ms, 91MB)
테스트 14 〉	통과 (356.29ms, 84.3MB)
테스트 15 〉	통과 (54.37ms, 73.3MB)
테스트 16 〉	통과 (1.72ms, 89.5MB)
테스트 17 〉	통과 (51.65ms, 87MB)
테스트 18 〉	통과 (0.07ms, 77.4MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */


/*
 class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        double a = ((double)h)/w; // 기울기 
    
        for(int i = 1;i<w;i++){
           
	        long temp = (long) (a*i);
	        answer+=  temp;
        }
       
        
        return answer*2;
    }
}
테스트 케이스 6번 틀림
틀린 이유 : 
자료형이 가지는 오차로 인해 발생합니다.
아래와 같이 먼저 곱하고 나누는 순서로 계산하는 경우 오차가 줄어 통과가 됩니다.
h*x/w

 */

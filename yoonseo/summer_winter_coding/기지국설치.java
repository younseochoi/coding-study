package summer_winter_coding;

public class 기지국설치 {

	public static void main(String[] args) {
		기지국설치 s= new 기지국설치();
		s.solution(11, new int[]{4,11}, 1); //3
		s.solution(16, new int[]{9}, 2); //3
		
	}

	public int solution(int n , int[] stations, int w) {
		
		int answer = 0;
		int flag = 1;
		int i = 0;
		
		while(flag<=n) {
			
			if(i>=stations.length|| flag< stations[i] -w) { // 전파 도달 X
				answer++;
				flag += 2*w+1; 
				
			}
			else {
				flag = stations[i]+w+1;
				i++;
			}
		}
		
		System.out.println(answer);
		return answer;
	}
}

package greedy;

import java.util.Arrays;

public class 단속카메라 {


	 public int solution(int[][] routes) {
	        int answer = 0;
	        Arrays.sort(routes, (int[] o1, int o2[]) -> (o1[1]-o2[1]) ); //  "진출" 기준 오름차순 정렬
	        //for(int[] r:routes) System.out.println(r[0]+"->"+r[1]);
	        
	        int camera = routes[0][1]; // 카메라 위치 -> 제일 먼저 진출한 위치에 카메라 세움
	        answer++; 
	        
	        for(int i =0;i<routes.length;i++) {
	        	if(camera < routes[i][0]) {
	        		camera = routes[i][1];
	        		answer++;
	        	}
	        }
	        
	        System.out.println(answer);
	        return answer;
	    }
}


//정확성  테스트
//테스트 1 〉	통과 (0.45ms, 75.2MB)
//테스트 2 〉	통과 (0.53ms, 78MB)
//테스트 3 〉	통과 (0.82ms, 74.2MB)
//테스트 4 〉	통과 (0.85ms, 73.1MB)
//테스트 5 〉	통과 (0.57ms, 73.9MB)
//효율성  테스트
//테스트 1 〉	통과 (4.96ms, 54MB)
//테스트 2 〉	통과 (1.95ms, 52.8MB)
//테스트 3 〉	통과 (6.93ms, 54.3MB)
//테스트 4 〉	통과 (0.83ms, 51.8MB)
//테스트 5 〉	통과 (9.93ms, 56MB)
//채점 결과
//정확성: 50.0
//효율성: 50.0
//합계: 100.0 / 100.0
package exhaustive_search;

//최소 직사각형
public class MinimumRectangle {

	 public int solution(int[][] sizes) {
	        int answer = 0;
	        int max_width=0;
	        int max_height=0;
	        
	        for(int i =0;i<sizes.length;i++) {
	        	//가로보다 세로가 작으면 위치 바꿈 
	        	if(sizes[i][0]<sizes[i][1]) { 
	        		int tmp = sizes[i][0];
	        		sizes[i][0] = sizes[i][1];
	        		sizes[i][1] = tmp;
	        	}
	        	
	        	if(sizes[i][0]>max_width) { // 가로 중에서 큰거 찾기 
	        		max_width = sizes[i][0];
	        	}
	        	
	        	if(sizes[i][1]>max_height) { // 세로 중에서 큰거 찾기 
	        		max_height = sizes[i][1];
	        	}
	        }
	        answer= max_width*max_height;
	     
	        return answer;
	    }
}


//테스트 1 〉	통과 (0.02ms, 77.7MB)
//테스트 2 〉	통과 (0.02ms, 73.2MB)
//테스트 3 〉	통과 (0.01ms, 74.9MB)
//테스트 4 〉	통과 (0.02ms, 77.2MB)
//테스트 5 〉	통과 (0.01ms, 73.6MB)
//테스트 6 〉	통과 (0.02ms, 74.6MB)
//테스트 7 〉	통과 (0.02ms, 76.4MB)
//테스트 8 〉	통과 (0.02ms, 84.1MB)
//테스트 9 〉	통과 (0.02ms, 76.7MB)
//테스트 10 〉	통과 (0.03ms, 74.5MB)
//테스트 11 〉	통과 (0.03ms, 77.3MB)
//테스트 12 〉	통과 (0.03ms, 75.8MB)
//테스트 13 〉	통과 (0.10ms, 76MB)
//테스트 14 〉	통과 (0.19ms, 79.7MB)
//테스트 15 〉	통과 (0.28ms, 78.2MB)
//테스트 16 〉	통과 (0.42ms, 82.9MB)
//테스트 17 〉	통과 (0.83ms, 90.7MB)
//테스트 18 〉	통과 (0.78ms, 84.3MB)
//테스트 19 〉	통과 (0.72ms, 82.4MB)
//테스트 20 〉	통과 (1.29ms, 87.7MB)
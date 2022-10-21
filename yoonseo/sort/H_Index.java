package sort;

import java.util.Arrays;

public class H_Index {


	 public int solution(int[] citations) {
	        int answer = 0;
	        
	        Arrays.sort(citations); // 배열 정렬
	        
	       for(int i =0 ;i<citations.length;i++) {
	    	   int h_index = citations.length-i; //자신 포함 뒤에 남은 배열 개수
	    	   if(citations[i]>=h_index) { // 인용된 횟수 >= H-Index
	    		   answer=h_index;
	    		   break;
	    	   }
	       }
	        return answer;
	    }
}

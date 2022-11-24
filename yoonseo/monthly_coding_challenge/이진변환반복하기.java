package monthly_coding_challenge;

public class 이진변환반복하기 {

	public static void main(String[] args) {
		이진변환반복하기 s = new 이진변환반복하기();
		s.solution("110010101001"); //[3,8]
		s.solution("01110"); // [3,3] 
		s.solution("1111111"); //[4,1]

	}
	
	public int[] solution(String s) {
	      int[] answer = new int[2];
	      String str=s;
	      int count1 =0, count2 =0;
	     
	      while(str.length()>1) {
	    	  
	    	  int str_len = str.length();
	    	  
	    	  str = str.replace("0", "");
	    	  
	    	  int after_len = str.length();
	    	  
	    	  str_len -= after_len; // 0 제거 개수 =  0 제거 전 길이 - 0 제거 후 길이 
	    	  
	    	  str = Integer.toBinaryString(after_len);
	    	  
	    	  count1+= str_len;
	    	  
	    	  count2++;
	    	  
	      }
	      
	      answer[0] = count2; // 이진 변환 횟수
	      answer[1] = count1; // 제거한 0 개수
	      
	      return answer;
	}

}


/*
정확성  테스트
테스트 1 〉	통과 (0.07ms, 75.2MB)
테스트 2 〉	통과 (8.40ms, 82.1MB)
테스트 3 〉	통과 (0.05ms, 65.9MB)
테스트 4 〉	통과 (0.05ms, 76.7MB)
테스트 5 〉	통과 (0.05ms, 76MB)
테스트 6 〉	통과 (0.14ms, 81.6MB)
테스트 7 〉	통과 (0.35ms, 67.3MB)
테스트 8 〉	통과 (0.60ms, 82.6MB)
테스트 9 〉	통과 (4.50ms, 71MB)
테스트 10 〉	통과 (7.10ms, 79.5MB)
테스트 11 〉	통과 (9.14ms, 82.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0 
 */

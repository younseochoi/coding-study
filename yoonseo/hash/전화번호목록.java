package hash;

import java.util.Arrays;

public class 전화번호목록 {

	 public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        Arrays.sort(phone_book);
	        
	        // 2중 for문으로 구현했을 시 효율성 3,4 실패라 정렬 후 1중 for문으로 바꿈
	        for(int i=1;i<phone_book.length;i++) {
//	        	if(phone_book[i].indexOf(phone_book[i-1])==0) {
//	        		return false;
//	        	}
	        	// indexOf 대신 startsWith로 찾을 수 있음!
	        	if(phone_book[i].startsWith(phone_book[i-1])) {
	        		return false;
	        	}
	        }
	        return answer;
	    }

}

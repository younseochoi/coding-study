package sort;

import java.util.Arrays;

public class 가장큰수 {

	 public String solution(int[] numbers) {
	        String answer = "";
	        String[] strArr = new String[numbers.length];

	        for (int i = 0; i < numbers.length; i++) { // int[] -> String[]
	            strArr[i] = String.valueOf(numbers[i]);
	        }
	        
	        Arrays.sort(strArr, (x, y) -> (y + x).compareTo(x + y)); //문자열 조합중 큰 수
	        // 정렬 기준이 1의 자리가 큰 수 부터 정렬이 되어야함.
	        
	        //모든 배열의 값이 0일 경우 0 한 개만 리턴
	        if(strArr[0].equals("0")) return "0"; 
	        
	        for(int i =0;i<strArr.length;i++) {
	        	answer += strArr[i]; // StringBuilder() 쓰면 더 빨라진다고 함.
	        }
	        return answer;
	    }
}

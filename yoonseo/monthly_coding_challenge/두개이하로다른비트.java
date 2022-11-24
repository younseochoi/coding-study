package monthly_coding_challenge;

public class 두개이하로다른비트 {

	public static void main(String[] args) {
		두개이하로다른비트 s= new 두개이하로다른비트();
		s.solution(new long[] {2,7}); // [3,11]
	}

	
	 public long[] solution(long[] numbers) {
	        long[] answer = new long[numbers.length];
	        int j = 0;
	        for(long n : numbers) {
	        	
	        	if(n%2==0) { //짝수면 그다음 홀수가 정답
	        		answer[j++] = n+1;
	        	}
	        	else {
	        		
	        		long temp = n+1;
	        		
	        		boolean flag = true;
	        		
	        		String binary1 = Long.toBinaryString(n);
	        		
	        		while(flag) {
	        			
	        			String binary2 = Long.toBinaryString(temp);
	        			
	        			int count=0;
	        			int len = 0;
	        			if(binary1.length() < binary2.length()) {
	        				
	        				len = binary2.length()-binary1.length();
	        				
	        				String str = "";
	        				
	        				for(long k=0 ; k<len;k++) {
	        					str+= "0";
	        				}
	        				binary1= str+binary1;
	        				
	        			}
	        			
	        			System.out.println(binary1+" //// "+binary2);
	        			
	        			long result = Long.parseLong(binary2) ^ Long.parseLong(binary1);
	        			
	        			String sss = Long.toBinaryString(result);
	        			
	        			System.out.println("this is a "+sss+"   "+result);
	        			
	        			for(int i=0;i<binary1.length();i++) { // 여기가 문제 자리수 바뀌는 걸 생각해야함
	        				
	        				
	        				if(binary1.charAt( i) != binary2.charAt(i)) {
	        					
	        					count++;
	        				}
	        				
	        				if(count==3) break;
	        			}
	        			
	        			
	        			if(count<=2) {
	        				answer[j++] = temp;
	        				flag = false;
	        			}
	        			
	        			temp++;
	        			
	        		} // while Loop end
	        	}
	        	
	        
	        } //for 
	        
	        for(int i=0;i<answer.length;i++ )System.out.println(answer[i]);
	        return answer;
	    }
}

/*
  비트연산시 피연산자는 32비트 정수로 변환되며 일련의 비트(0과 1)로 표현됩니다. 32비트 이상인 숫자는 최상위 비트가 삭제됩니다. 예를 들어 32비트 이상인 다음 정수는 32비트 정수로 변환됩니다
   */

/*
 정확성  테스트
테스트 1 〉	통과 (6.33ms, 79.5MB)
테스트 2 〉	통과 (86.77ms, 111MB)
테스트 3 〉	통과 (3.62ms, 80.5MB)
테스트 4 〉	통과 (3.57ms, 73.4MB)
테스트 5 〉	통과 (11.34ms, 84.9MB)
테스트 6 〉	통과 (11.20ms, 74.7MB)
테스트 7 〉	통과 (152.36ms, 152MB)
테스트 8 〉	통과 (105.37ms, 123MB)
테스트 9 〉	통과 (110.74ms, 124MB)
테스트 10 〉	실패 (시간 초과)
테스트 11 〉	실패 (시간 초과) 
채점 결과
정확성: 81.8
합계: 81.8 / 100.0
 */

package monthly_coding_challenge;

public class 두개이하로다른비트2 {


	public static void main(String[] args) {
		두개이하로다른비트2 s= new 두개이하로다른비트2();
		s.solution(new long[] {2,7}); // [3,11]
//		String gg= "1234";
//		System.out.println(gg.substring(1));
	}

	
	 public long[] solution(long[] numbers) {
	        long[] answer = new long[numbers.length];
	        int j =0;
	        for(int i =0;i<numbers.length;i++) {
	        	
	        	long n = numbers[i];
	        	
	        	if(n%2==0) {
	        		answer[j++] = n+1;
	        	}
	        	else {
	        		long temp = n+1;
	        		String str = Long.toBinaryString(n);
	        		
	        		if(!str.contains("0")) {
	        			str="10"+ str.substring(1).replace("0", "1"); // 이게 답
	        		}
	        		else { //마지막 0->1, 1->0으로 바꿔주기
	        			int last_0 = str.lastIndexOf("0"); // 마지막 0의 위치
	        			int last_1 = str.indexOf("1",last_0); // 마지막0 다음의 1 위치
	        			
	        			char[] chars = str.toCharArray();
	        			chars[last_0] = '1';
	        			chars[last_1] = '0';
	        			
	        			str="";
	        			
	        			for(int k=0;k<chars.length;k++) {
	        				str+=chars[k];
	        			}
	        			
	        		}
	        		
	        		answer[j++] = Long.parseLong(str,2);
	        		
	        		
	        	}
	        	
	        }

	        for(int i =0;i<answer.length;i++) System.out.println(answer[i]);
	        
	        return answer;
	    }

}

/*
정확성  테스트
테스트 1 〉	통과 (17.47ms, 81.7MB)
테스트 2 〉	통과 (139.68ms, 136MB)
테스트 3 〉	통과 (18.65ms, 75.2MB)
테스트 4 〉	통과 (21.67ms, 83.1MB)
테스트 5 〉	통과 (18.94ms, 74.4MB)
테스트 6 〉	통과 (21.75ms, 85.9MB)
테스트 7 〉	통과 (139.64ms, 158MB)
테스트 8 〉	통과 (142.45ms, 144MB)
테스트 9 〉	통과 (123.86ms, 132MB)
테스트 10 〉	통과 (289.66ms, 335MB)
테스트 11 〉	통과 (336.94ms, 331MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */

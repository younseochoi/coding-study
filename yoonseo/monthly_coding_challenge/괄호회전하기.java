package monthly_coding_challenge;

import java.util.Stack;

public class 괄호회전하기 {

	
	public static void main(String[] args) {
		괄호회전하기 s = new 괄호회전하기();
		s.solution("[](){}"); //3 
		s.solution("}]()[{");//2
		s.solution("[)(]");//0
		s.solution("}}}");//0
		
	}

	
	 public int solution(String s) {
	        int answer = 0;
	        
	        if(s.length()%2!=0) { // 길이가 홀수라면 괄호를 닫을 수 없음
	        	 return 0;
	        }
	        else {
	        	
	        	int n = s.length();
	        	StringBuilder sb= new StringBuilder();
	        	
	        	for(int i =0;i< n ;i++) {
	        		sb.setLength(0);
	        		//String temp =  s.substring(0, i) ;
	        		sb.append(s.substring(0, i));
	        		
	        		//temp = s.substring(i,n)+temp ; // 검사할 문자 
	        		sb.insert(0, s.substring(i,n));
	        		
	        		Stack<Character> stack = new Stack<>();
	        		
	        		for(int j =0;j<n;j++) {
	        			char c = sb.charAt(j);
	        				
	        			/* (40 , ):41 , {:123, }:125, [:91, ]:93 아스키코드가 1 또는 2 차이.
	        			 	스택에 먼저 들어온 게 여는 괄호이고, 현재 검사하는 문자가 닫는 괄호라면 스택 여는 괄호 pop.
	        			*/
	        			if(stack.size()!=0 &&( stack.peek() == c-1 ||	stack.peek() ==  c-2)) {
	        				stack.pop();
	        			}
	        			else {
	        				stack.add(c);
	        			}
	        			
	        				
	        		} // inner for end
	        		
	        		if(stack.size()==0) { // 스택이 비어있다면 올바른 괄호 
	        			answer++;
	        		}
	        		
	        	}// outer for end
	        	
	        }// else end
	        
	       
	        
	        return answer;
	    }
}

/*
 정확성  테스트
테스트 1 〉	통과 (55.21ms, 93.9MB)
테스트 2 〉	통과 (69.52ms, 86.9MB)
테스트 3 〉	통과 (53.38ms, 81.2MB)
테스트 4 〉	통과 (56.15ms, 83MB)
테스트 5 〉	통과 (69.91ms, 92MB)
테스트 6 〉	통과 (63.64ms, 85.6MB)
테스트 7 〉	통과 (72.86ms, 82.7MB)
테스트 8 〉	통과 (65.25ms, 94.2MB)
테스트 9 〉	통과 (57.86ms, 90.2MB)
테스트 10 〉	통과 (77.38ms, 88.9MB)
테스트 11 〉	통과 (55.33ms, 80.5MB)
테스트 12 〉	통과 (0.02ms, 73.5MB)
테스트 13 〉	통과 (0.02ms, 67.2MB)
테스트 14 〉	통과 (1.96ms, 74.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0

정확성  테스트
테스트 1 〉	통과 (69.50ms, 93.5MB)
테스트 2 〉	통과 (57.48ms, 82.5MB)
테스트 3 〉	통과 (57.10ms, 73.3MB)
테스트 4 〉	통과 (72.24ms, 87.8MB)
테스트 5 〉	통과 (98.06ms, 76.9MB)
테스트 6 〉	통과 (80.80ms, 87.6MB)
테스트 7 〉	통과 (81.90ms, 75.6MB)
테스트 8 〉	통과 (88.80ms, 80.8MB)
테스트 9 〉	통과 (75.24ms, 82.2MB)
테스트 10 〉	통과 (66.14ms, 84.4MB)
테스트 11 〉	통과 (66.57ms, 75.5MB)
테스트 12 〉	통과 (0.02ms, 72.8MB)
테스트 13 〉	통과 (0.02ms, 83.7MB)
테스트 14 〉	통과 (0.29ms, 84.4MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */

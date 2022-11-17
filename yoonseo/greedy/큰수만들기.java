package greedy;

import java.util.Stack;

public class 큰수만들기 {

	public String solution(String number, int k) {
        //String answer = "";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<number.length();i++) {
        	char curr_c = number.charAt(i); 
        	
        	while(!stack.isEmpty() && curr_c > stack.peek()&& k>0) { // 현재 curr_c보다 작고,  없앨 횟수가 남아있을 때 (k>0) pop
        		stack.pop();
        		k--;
        	}
        	
        	stack.add(curr_c);
        }
        
        // 예외:  4 3 2 1 은 모두 스택에 저장되므로 k만큼 뺀 횟수만 더하기
        int len = stack.size(); 
        
        if(stack.size() == number.length()) len = stack.size()-k;
        
        
        for(int i =0;i<len;i++) {
        	sb.append(stack.get(i));
        }
        
        return sb.toString();
    }
}


//정확성  테스트
//테스트 1 〉	통과 (1.44ms, 78.1MB)
//테스트 2 〉	통과 (1.43ms, 79.7MB)
//테스트 3 〉	통과 (1.91ms, 74.1MB)
//테스트 4 〉	통과 (3.73ms, 78.8MB)
//테스트 5 〉	통과 (4.18ms, 74.3MB)
//테스트 6 〉	통과 (19.24ms, 95.3MB)
//테스트 7 〉	통과 (274.73ms, 405MB)
//테스트 8 〉	통과 (496.10ms, 379MB)
//테스트 9 〉	통과 (9437.28ms, 471MB)
//테스트 10 〉	통과 (5493.96ms, 379MB)
//테스트 11 〉	통과 (1.55ms, 79.3MB)
//테스트 12 〉	통과 (1.39ms, 72.3MB)


//정확성  테스트 -	StringBuilder 사용
//테스트 1 〉	통과 (0.32ms, 80.3MB)
//테스트 2 〉	통과 (0.38ms, 79.6MB)
//테스트 3 〉	통과 (0.50ms, 77.3MB)
//테스트 4 〉	통과 (2.66ms, 74.7MB)
//테스트 5 〉	통과 (3.57ms, 74.7MB)
//테스트 6 〉	통과 (17.77ms, 74MB)
//테스트 7 〉	통과 (21.17ms, 83.5MB)
//테스트 8 〉	통과 (37.15ms, 75.9MB)
//테스트 9 〉	통과 (60.60ms, 117MB)
//테스트 10 〉	통과 (93.07ms, 102MB)
//테스트 11 〉	통과 (0.25ms, 71.9MB)
//테스트 12 〉	통과 (0.27ms, 77MB)
import java.util.*;

class Solution {
	public int[] solution(int[] answers) {
      
        int[] answer = {};
        int one = 0;
        int two = 0;
        int three = 0;
        
        for (int i=0; i<answers.length; i++){
            //1번 학생
            if ( answers[i] == ((i % 5)+1)){
                one ++;
            }
            
            //2번 학생
            if ( i%2 == 0 ){ //홀수번 째 0,2,4,6 인덱스
                if ( answers[i] == 2 ){
                    two ++;
                }
            } else if ( i%2 == 1) { //짝수번 째 1,3,5,7 인덱스
                int[] nums = {1,3,4,5};
                if ( answers[i] == nums[(i/2)%4] ){
                    two ++;
                }
            }
            
            //3번 학생            
            int[] nums = {3,1,2,4,5};
            if ( answers[i] == nums[(i/2)%5] ) {
                three ++;
            }
        }
            
        
        int max = Math.max(Math.max(one, two),three); // max값 구하기
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(max==one) list.add(1); //max값이랑 같으면 넣는다.
        if(max==two) list.add(2);
        if(max==three) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
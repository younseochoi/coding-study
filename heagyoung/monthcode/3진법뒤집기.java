import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        while(true){
            if(n%3==0)
                queue.add(0);
            else if(n%3==1)
                queue.add(1);
            else
                queue.add(2);
            n/=3;
            
            if(n==0)
                break;
        }
        System.out.println(queue);
        while(true){
            if(queue.size()==0)
                break;
            answer+=queue.peek()*(int)Math.pow(3.0, (double)queue.size()-1.0);
            queue.remove();
        }
        return answer;
    }
}
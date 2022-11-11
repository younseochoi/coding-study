import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scov_queue = new PriorityQueue<>();
        //참고 : new PriorityQueue<>(Collections.reverseOrder());는 우선순위가 높은 숫자 순
        for(int i=0; i<scoville.length; i++) {
        	scov_queue.add(scoville[i]);
        }
        
        while(scov_queue.size() > 1) {
        	if(scov_queue.peek() >= K) {
        		return answer;
        	}
        	int scov0 = scov_queue.poll();
        	int scov1 = scov_queue.poll();
        	int new_scov = scov0 + 2*scov1;
        	scov_queue.offer(new_scov);
        	answer++;
        }
        if(scov_queue.peek() >= K) {
        	return answer;        	
        }
        return -1;
    }
}
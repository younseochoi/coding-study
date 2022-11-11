package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 이중우선순위큐 {
	
	/**
	 * 
	 * @param operations 큐가 수행할 연산
	 * @return 큐의 [최댓값, 최솟값]
	 */
	 public int[] solution(String[] operations) {
	        
		 
		 	int[] answer = {};
	        
		 	PriorityQueue<Integer> maxheap = new PriorityQueue<>(new Comparator<Integer>() { // 내림차순 

				@Override
				public int compare(Integer o1, Integer o2) {
					return Integer.compare(o2, o1);
				}
	        	
			});
	       
	        PriorityQueue<Integer> minheap = new PriorityQueue<>();
	        
	        for(String s : operations) {
	        	
	        	String command = s.substring(0,1);
	        	
	        	int num = Integer.parseInt(s.substring(2,s.length()));
	        	
	        	if(command.equals("I")) {
	        		
	        		minheap.add(num);
	        		
	        		maxheap.add(num);
	        	}
	        	else if(command.equals("D")) {
	        		
	        		if(maxheap.size()>0) {
		        		
	        			if(num<0) { //최솟값 삭제 
		        		
	        				maxheap.remove(minheap.poll());
	        			}
	        			else { //최댓값 삭제 
		        			
	        				minheap.remove(maxheap.poll());
	        			}
	        		}
	        	}
	        }
	        
	        if(maxheap.size()<1) {
	        
	        	answer = new int[] {0,0};
	        }
	        else {
	        	
	        	answer = new int[] {maxheap.peek(),minheap.peek()};
	        }

	        return answer;
	    }

}

//정확성  테스트
//테스트 1 〉	통과 (0.74ms, 75.1MB)
//테스트 2 〉	통과 (0.52ms, 69.1MB)
//테스트 3 〉	통과 (0.52ms, 74.6MB)
//테스트 4 〉	통과 (0.68ms, 82.4MB)
//테스트 5 〉	통과 (0.70ms, 80.5MB)
//테스트 6 〉	통과 (0.77ms, 67.4MB)

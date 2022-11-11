package heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://codevang.tistory.com/316
public class 디스크컨트롤러 {

	public static void main(String[] args) {
		디스크컨트롤러 s= new 디스크컨트롤러();
		s.solution(new int[][] {{0, 3},{1, 9},{2, 6},{20,1}});
		s.solution(new int[][] {{7, 8},{3, 5},{9, 6}});
//		[[0, 3], [1, 9], [2, 6]]	9
//		[[7, 8], [3, 5], [9, 6]]	9
	}

	/**
	 * 
	 * @param jobs의 각 행은 하나의 작업에 대한 [작업이 요청되는 시점, 작업의 소요시간]
	 * @return 작업의 요청부터 종료까지 걸린 시간의 평균의 최솟값 
	 */
	public int solution(int[][] jobs) {
        
		int answer = 0;
        int end_time = 0;
        int count =0;
        int i=0;
        
        Arrays.sort(jobs, new Comparator<int[]>() { //요청 순서대로 정렬
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}
        	
		});
        
        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() { //소요시간 짧은 순으로 정렬하는 우선순위큐(힙)
        	
        	@Override
        	public int compare(int[] o1, int[] o2) {
        		return Integer.compare(o1[1], o2[1]);
        	}
        	
        });
        
        for(count=0;count<jobs.length;) {

        	while(i<jobs.length && end_time >=jobs[i][0]) { // 수행 가능한 작업 힙에 넣음
        		
        		heap.add(jobs[i++]);
        	}
        	
        	if(heap.isEmpty()) { // 힙이 빈 경우 
        		
        		end_time = jobs[i][0]; // 가장 빠른 요청 시간으로 종료 시간 (update) 
        	}
        	else { //힙이 비어있지 않은 경우
        		
        		int[] temp = heap.poll(); // 힙에서 작업 하나 가져옴
        		
        		answer+=end_time+temp[1] - temp[0]; // 작업 처리 시간 = (전 작업 종료 시간 + 현 작업 소요시간) - 현 작업 요청시간   
        		
        		end_time+=temp[1]; // 전 작업 종료시간 += 현 작업 소요시간 (update)
        		
        		count++;
        	}
        }	
        return (int)answer/jobs.length;
    }
}

//
//정확성  테스트
//테스트 1 〉	통과 (2.39ms, 79.8MB)
//테스트 2 〉	통과 (2.61ms, 66.8MB)
//테스트 3 〉	통과 (2.72ms, 89.1MB)
//테스트 4 〉	통과 (2.29ms, 76.2MB)
//테스트 5 〉	통과 (3.79ms, 74.1MB)
//테스트 6 〉	통과 (0.85ms, 73.8MB)
//테스트 7 〉	통과 (2.21ms, 74.4MB)
//테스트 8 〉	통과 (2.11ms, 73.6MB)
//테스트 9 〉	통과 (1.73ms, 78.2MB)
//테스트 10 〉	통과 (2.50ms, 75.3MB)
//테스트 11 〉	통과 (1.06ms, 70.5MB)
//테스트 12 〉	통과 (1.24ms, 76MB)
//테스트 13 〉	통과 (0.93ms, 77.4MB)
//테스트 14 〉	통과 (0.76ms, 77.2MB)
//테스트 15 〉	통과 (0.79ms, 77.3MB)
//테스트 16 〉	통과 (0.75ms, 71.5MB)
//테스트 17 〉	통과 (0.96ms, 76.7MB)
//테스트 18 〉	통과 (0.75ms, 73.4MB)
//테스트 19 〉	통과 (0.77ms, 74.5MB)
//테스트 20 〉	통과 (0.83ms, 77.1MB)

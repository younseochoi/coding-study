package heap;

import java.util.PriorityQueue;

public class 더맵게 {

	public static void main(String[] args) {
		더맵게 s = new 더맵게();
		s.solution(new int[] {1, 2, 3, 9, 10, 12}, 7); //2
	}
	/**
	 * 
	 * @param scoville 스코빌 지수를 담은 int 배열
	 * @param K 목표 스코빌 지수
	 * @return scoville의 모든 요소를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수
	 */
	public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();// 우선순위 큐 정렬
        
        for(int s:scoville) { // 오름차순 정렬되서 들어감
        	heap.add(s);
        }
        
        while(heap.peek()<K) { // 최솟값이 K보다 작은 동안 
        	
        	if(heap.size()<=1) return -1; // 섞을 것이 없고, K에 도달하지 못함
        	
        	int min = heap.poll();  // 첫번째로 작은 수
        	
        	if(min<K) { //  첫번째로 작은 수 < 스코빌 지수
        	
        		int tmp = min + 2*heap.poll(); // 두번째로 작은 수 꺼내서 조건에 따라 섞기
        		
        		heap.add(tmp);
        		
        		answer++;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
	
//	정확성  테스트
//	테스트 1 〉	통과 (0.30ms, 75MB)
//	테스트 2 〉	통과 (0.47ms, 71.5MB)
//	테스트 3 〉	통과 (0.45ms, 81.2MB)
//	테스트 4 〉	통과 (0.34ms, 71.8MB)
//	테스트 5 〉	통과 (0.34ms, 75.8MB)
//	테스트 6 〉	통과 (2.63ms, 77MB)
//	테스트 7 〉	통과 (2.49ms, 71.9MB)
//	테스트 8 〉	통과 (0.76ms, 76.9MB)
//	테스트 9 〉	통과 (0.75ms, 77.8MB)
//	테스트 10 〉	통과 (1.67ms, 78.2MB)
//	테스트 11 〉	통과 (1.63ms, 80.6MB)
//	테스트 12 〉	통과 (2.34ms, 74.4MB)
//	테스트 13 〉	통과 (1.91ms, 77.9MB)
//	테스트 14 〉	통과 (0.38ms, 73.5MB)
//	테스트 15 〉	통과 (1.90ms, 79.5MB)
//	테스트 16 〉	통과 (0.30ms, 80.7MB)
//	효율성  테스트
//	테스트 1 〉	통과 (126.01ms, 65.5MB)
//	테스트 2 〉	통과 (295.77ms, 88.5MB)
//	테스트 3 〉	통과 (1401.11ms, 122MB)
//	테스트 4 〉	통과 (110.27ms, 64.4MB)
//	테스트 5 〉	통과 (1464.72ms, 123MB)
}

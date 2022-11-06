import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int first = 0;
        int second = 0;
        int newNum = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // scoville 원소 heap에 담기
        for(int n : scoville) {
            heap.add(n);
        }

        while (heap.size() > 1) {
            first = heap.poll();
            second = heap.poll();
            newNum = first + (second * 2);
            heap.add(newNum);
            answer += 1;

            // heap 첫번째 원소가 K보다 크면 중지
            if(heap.peek() > K) {
                break;
            }
        }

        // heap 전체 원소를 다 계산한 후에도 K보다 작으면 -1 리턴 
        if(heap.size() == 1 && heap.peek() < K) {
            answer = -1;
        }

        return answer;
    }
}

/*정확성  테스트
테스트 1 〉	통과 (0.51ms, 72.7MB)
테스트 2 〉	통과 (0.41ms, 73.8MB)
테스트 3 〉	통과 (0.53ms, 73.1MB)
테스트 4 〉	통과 (0.34ms, 74.8MB)
테스트 5 〉	통과 (0.53ms, 76.7MB)
테스트 6 〉	통과 (2.08ms, 72.5MB)
테스트 7 〉	통과 (2.44ms, 72.6MB)
테스트 8 〉	통과 (0.92ms, 71.8MB)
테스트 9 〉	통과 (1.26ms, 66.5MB)
테스트 10 〉	통과 (3.13ms, 85.2MB)
테스트 11 〉	통과 (1.75ms, 82.7MB)
테스트 12 〉	통과 (3.53ms, 76.1MB)
테스트 13 〉	통과 (1.98ms, 79MB)
테스트 14 〉	통과 (0.40ms, 74.5MB)
테스트 15 〉	통과 (3.30ms, 72.9MB)
테스트 16 〉	통과 (0.32ms, 73.2MB)
효율성  테스트
테스트 1 〉	통과 (160.59ms, 68.8MB)
테스트 2 〉	통과 (282.38ms, 86.9MB)
테스트 3 〉	통과 (1679.89ms, 123MB)
테스트 4 〉	통과 (118.13ms, 63.9MB)
테스트 5 〉	통과 (1654.82ms, 144MB)*/
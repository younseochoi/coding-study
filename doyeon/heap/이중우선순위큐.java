import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        List<String> list = new ArrayList();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (String s : operations) {
            // 명령어 공백 기준으로 자르기
            list = Arrays.asList(s.split(" "));
            int num = Integer.parseInt(list.get(1));

            if(s.indexOf("I") == 0) {
                minHeap.add(num);
                maxHeap.add(num);

            } else if (s.indexOf("D") == 0) {
                // 최소힙이 비어 있지 않고
                if(!minHeap.isEmpty()) {
                    // 명령어가 D -1이면 최소값 제거
                    if (num == -1) {
                        minHeap.poll();

                    // 명령어가 D 1이면 최대값 제거 후 최소 힙에서 최대값 제거 
                    } else {
                        int max = maxHeap.poll();
                        minHeap.remove(max);
                    }
                }
            }
        }

        // 최소힙의 길이가 0이면 모든 연산 후 큐가 비어있으므로 [0,0]
        if(minHeap.size() == 0) {
            answer[0] = 0; 
            answer[1] = 0; 

        // 아니면 최소값, 최대값 반환
        } else {
            answer[0] = maxHeap.peek();
            answer[1] = minHeap.peek();
        }

        return answer;
    }
}

/*정확성  테스트
테스트 1 〉	통과 (0.76ms, 65.7MB)
테스트 2 〉	통과 (0.52ms, 82.9MB)
테스트 3 〉	통과 (0.71ms, 68.9MB)
테스트 4 〉	통과 (1.96ms, 81.1MB)
테스트 5 〉	통과 (0.64ms, 77.3MB)
테스트 6 〉	통과 (0.53ms, 75.6MB)*/
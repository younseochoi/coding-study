import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어 수 정보를 담은 배열
        
        int[] stageCount = new int[N+2];
        
        for (int stage : stages) {
            stageCount[stage]++;
        }
        
        // 스테이지에 도달한 플레이어 수 정보를 담은 배열
        
        int[] stagePassCount = new int[N+1];
        
        stagePassCount[N] = stageCount[N] + stageCount[N+1];
        
        for (int i=N-1; i>=1; i--) {
            stagePassCount[i] = stageCount[i] + stagePassCount[i+1];
        }
        
        // HashMap을 사용해 실패율 저장 (Key: 스테이지 번호, value: 실패율)
        
        HashMap<Integer,Double> map = new HashMap<>();
        
        for (int i=1; i<=N; i++) {
            
            if (stagePassCount[i] == 0) {
                map.put(i, (double)0);
            }
            else {
                map.put(i, (double)stageCount[i]/stagePassCount[i]);
            }
        }
        
        // 각 스테이지 번호(key)를 실패율(value)의 내림차순으로 정렬
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        int idx = 0;
        for (int stage : keySet) {
            answer[idx++] = stage;
        }
        
        return answer;
    }
}


/*
정확성  테스트
테스트 1 〉	통과 (0.89ms, 73.3MB)
테스트 2 〉	통과 (0.95ms, 80.3MB)
테스트 3 〉	통과 (3.09ms, 95MB)
테스트 4 〉	통과 (5.38ms, 88.7MB)
테스트 5 〉	통과 (4.74ms, 93.6MB)
테스트 6 〉	통과 (1.30ms, 78.9MB)
테스트 7 〉	통과 (1.81ms, 80.7MB)
테스트 8 〉	통과 (3.68ms, 78.8MB)
테스트 9 〉	통과 (5.63ms, 90.1MB)
테스트 10 〉	통과 (3.40ms, 82.8MB)
테스트 11 〉	통과 (5.91ms, 104MB)
테스트 12 〉	통과 (3.84ms, 79.9MB)
테스트 13 〉	통과 (6.37ms, 79.3MB)
테스트 14 〉	통과 (1.00ms, 78.6MB)
테스트 15 〉	통과 (2.60ms, 86.3MB)
테스트 16 〉	통과 (3.88ms, 85.2MB)
테스트 17 〉	통과 (2.04ms, 80.4MB)
테스트 18 〉	통과 (1.45ms, 76MB)
테스트 19 〉	통과 (0.79ms, 77.1MB)
테스트 20 〉	통과 (2.76ms, 82.4MB)
테스트 21 〉	통과 (2.88ms, 89.5MB)
테스트 22 〉	통과 (6.36ms, 94.5MB)
테스트 23 〉	통과 (5.80ms, 84.2MB)
테스트 24 〉	통과 (3.90ms, 84.3MB)
테스트 25 〉	통과 (1.05ms, 75.3MB)
테스트 26 〉	통과 (0.92ms, 81.3MB)
테스트 27 〉	통과 (0.88ms, 77.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

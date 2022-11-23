// 출처 : https://born2bedeveloper.tistory.com/32

import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        int[] parent = new int[n];
        
        // 노드 개수에 따라 부모 리스트 생성
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        
        // 건설 비용에 따라 정렬
        Arrays.sort(costs, (int[] o1, int[] o2) -> o1[2] - o2[2]);
        
        // 부모가 같지 않으면 건설 비용 더하기
        for (int i = 0; i < costs.length; i++) {
            if(findParent(parent, costs[i][0]) != findParent(parent, costs[i][1])) {
                answer += costs[i][2];
                union(parent, costs[i][0], costs[i][1]);
            }
        }
        return answer;
    }
    
    // 부모가 같은지 탐색
    public int findParent(int[] parent, int node) {
        if (parent[node] == node)
            return node;
        return findParent(parent, parent[node]);
    }
    
    // 부모가 같으면 합치기
    public void union(int[] parent, int node1, int node2) {
        int p1 = findParent(parent, node1);
        int p2 = findParent(parent, node2);
        
        if (p1 < p2)
            parent[p2] = p1;
        else
            parent[p1] = p2;
    } 
}


// 정확성  테스트
// 테스트 1 〉	통과 (0.53ms, 76.5MB)
// 테스트 2 〉	통과 (0.55ms, 72.3MB)
// 테스트 3 〉	통과 (0.47ms, 71MB)
// 테스트 4 〉	통과 (0.48ms, 75.3MB)
// 테스트 5 〉	통과 (0.55ms, 77MB)
// 테스트 6 〉	통과 (0.85ms, 70.8MB)
// 테스트 7 〉	통과 (0.62ms, 74.3MB)
// 테스트 8 〉	통과 (0.49ms, 76.6MB)
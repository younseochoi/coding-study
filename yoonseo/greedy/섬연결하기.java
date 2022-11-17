package greedy;

import java.util.Arrays;

public class 섬연결하기 {
	
	int [] parent;
	
	public int solution(int n, int[][] costs) {
		parent = new int[n];
        int answer = 0;
        Arrays.sort(costs,(int []o1,int []o2)-> (o1[2] - o2[2])); // 가중치기준으로 오름차순 정렬
		
        for(int i=0;i<n;i++) { // 자기자신을 부모노드로 초기화
        	parent[i] = i;
        }
        
        for(int i =0;i<costs.length;i++ ) {
			int start = costs[i][0];
        	int end = costs[i][1];
        	
        	int start_parent = findParent(start);
        	int end_parent = findParent(end);
        	if(start_parent == end_parent) {System.out.println(); continue;}
        	
        	answer+=costs[i][2];
        	parent[end_parent] = start_parent;
        	
        	
        }
        System.out.println(answer);
        return answer;
    }
	
	// 크루스칼 알고리즘
	// Union Find : 임의의 두 원소를 선택했을 때, 두 원소가 같은 집합에 속하는지 판별하는 방법
	// 각 노드들의 부모 노드를 찾아 갱신하는 과정을 통해 집합을 알아냄
	// 같은 집합에 속하는 노드들의 부모 노드 동일한 값을 가리킴
	
	public int findParent(int node) {
		
		if(parent[node] == node) {
			return node;
		}
		return parent[node] = findParent(parent[node]);
	}
}

//https://maetdori.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-Kruskal-Algorithm-Union-Find-%ED%81%AC%EB%A3%A8%EC%8A%A4%EC%B9%BC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%9C%A0%EB%8B%88%EC%98%A8-%ED%8C%8C%EC%9D%B8%EB%93%9C?category=857970

//정확성  테스트
//테스트 1 〉	통과 (0.91ms, 77.6MB)
//테스트 2 〉	통과 (0.67ms, 66.8MB)
//테스트 3 〉	통과 (0.96ms, 78.4MB)
//테스트 4 〉	통과 (1.08ms, 76.5MB)
//테스트 5 〉	통과 (0.98ms, 75.5MB)
//테스트 6 〉	통과 (1.88ms, 68.6MB)
//테스트 7 〉	통과 (1.79ms, 74MB)
//테스트 8 〉	통과 (0.69ms, 74.6MB)
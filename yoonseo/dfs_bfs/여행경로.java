package dfs_bfs;

import java.util.ArrayList;
import java.util.Collections;

public class 여행경로 {

	boolean[] visited ;
	ArrayList<String> routes;

	
	 public String[] solution(String[][] tickets) {
	        String[] answer = {};
	        visited = new boolean[tickets.length];
	        routes = new ArrayList<>();
	        // 백트래킹으로 전체 탐색
	        dfs(tickets,"ICN","ICN",0);
	        Collections.sort(routes); // 정렬
	        answer = routes.get(0).split(" "); // 공백 기준으로 분리
	       
	        return answer;
	    }
	 
	 public void dfs(String[][] tickets, String last_visited , String tmp, int i) {
		 if(i == tickets.length) {
			 routes.add(tmp);
			 return;
		 }
		 
		 for(int j=0;j<tickets.length;j++) {
			 if(visited[j]) continue; // 방문 X 만 탐색
			 if(last_visited.equals(tickets[j][0])) { // 맨마지막 방문지 == 현재 첫번째 방문지
				 visited[j]= true;
				 tmp += " "+tickets[j][1]; //1 공백 넣어 도착지 추가
				 dfs(tickets, tickets[j][1], tmp, i+1);
				 visited[j] = false;
				 tmp = tmp.substring(0,tmp.length()-4); //1 에서 tmp에 추가한 글자 빼주기
			 }
		 }
	 }

}

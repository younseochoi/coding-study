import java.util.*;
class Solution {
    static boolean[] visited;
    static List<String> route;
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        route = new ArrayList<>();
        visited = new boolean[tickets.length];
        DFS("ICN","ICN",tickets,0);
        //알파벳 순을 위해서 정렬
        Collections.sort(route);
        answer = route.get(0).split(" ");
        return answer;
    }
    static void DFS(String start, String addRoute, String[][] tickets, int L) {
        if(L == tickets.length){
            //모든 티켓을 써야하므로 tickets.length만큼 돌면 return
            route.add(addRoute);
            return;
        }else {
            for(int i=0; i<tickets.length; i++){
                if(visited[i] == false && start.equals(tickets[i][0])) {
                    visited[i] = true; //방문 여부 = true로 바꿈
                    DFS(tickets[i][1], addRoute + " " + tickets[i][1], tickets,L+1);
                    //티켓 배열에서 도착지가 start랑 같으면 addroute 에 공백 기준으로 추가하며 전달
                    visited[i] = false;
                }
            }
        }
    }
}
/*
테스트 1 〉	통과 (74.97ms, 103MB)
테스트 2 〉	통과 (8.36ms, 75.1MB)
테스트 3 〉	통과 (8.91ms, 74.5MB)
테스트 4 〉	통과 (10.21ms, 78.4MB)
*/
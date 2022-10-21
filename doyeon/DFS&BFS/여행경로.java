import java.util.*;
class Solution {
    public boolean[] visited;
    public ArrayList<String> arr = new ArrayList();
    
    public String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length+1];
        visited = new boolean[tickets.length];
        // 알파벳 순서 앞서는 경로 return 하기 위해 sort
        Arrays.sort(tickets, (String[] o1, String[] o2) -> (o1[1].compareTo(o2[1])));
       
        // 첫 번째 도시는 무조건 ICN
        dfs(0, tickets, "ICN", "ICN");
        
        // 최종 arr 결과를 ,로 분리
        answer = arr.get(0).split(",");
        
        return answer;
    }
    
    public void dfs(int depth, String[][] tickets, String start, String path) {
        
        if(depth == tickets.length) {
            // 지금까지의 경로 arr에 담기
            arr.add(path);
            return;
        }
        
        for (int i=0; i < tickets.length; i++) {
             if(start.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true;
                dfs(depth+1, tickets, tickets[i][1], path +","+ tickets[i][1]);
                visited[i] = false;
            }
        }
    }
}

/*
테스트 1 〉	통과 (66.16ms, 113MB)
테스트 2 〉	통과 (10.32ms, 88.4MB)
테스트 3 〉	통과 (9.57ms, 77.7MB)
테스트 4 〉	통과 (9.46ms, 74.3MB) */
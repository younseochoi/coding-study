class Solution {
    static boolean[] visited;
    static int answer = 0;
    
    public int solution(String begin, String target, String[] words) {
        
        visited = new boolean[words.length];
        
        // dfs 함수 호출
        
        dfs(begin, target, words, 0);
        
        return answer;
    }
    
    // dfs 함수
    
    public static void dfs (String begin, String target, String[] words, int cnt) {
        
        // 2. 탈출 조건 : begin 과 target 이 같은 경우
        
        if (begin.equals(target)) {
            answer = cnt; 
            return;
        }
        
        // 1. 수행 동작
        
        for (int i=0; i<words.length; i++) {
            
            // 이미 찾아 본 단어는 지나간다.
            
            if (visited[i]) {continue;}
            
            // 같은 스펠링 개수 
            
            int spelling = 0;
            
            for (int j=0; j<begin.length(); j++) {
                
                if (begin.charAt(j) == words[i].charAt(j)) {
                    spelling++;
                }
            }
            
            // 한글자 빼고 모두 같은 경우
            
            if (spelling == begin.length()-1) {
                
                // 이해가 어려운 부분 ,,
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
            
            
        }
    }
}

/*
테스트 1 〉	통과 (0.03ms, 75.1MB)
테스트 2 〉	통과 (0.05ms, 74.3MB)
테스트 3 〉	통과 (0.32ms, 75.5MB)
테스트 4 〉	통과 (0.05ms, 79.4MB)
테스트 5 〉	통과 (0.03ms, 75.3MB)
*/

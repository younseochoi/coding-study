class Solution {
    int answer;
    boolean [] visited;
    
    public int solution(String begin, String target, String[] words) {
        // 최소값을 구하기 위해 answer를 최대값으로 초기화
        answer = 51;
        visited = new boolean[words.length];
        dfs(begin, target, words, 0);
        
        if(answer == 51) {
            answer = 0;
        }
        
        return answer;
    }
    
    
    public void dfs(String begin, String target, String[] words, int depth) {
        
        if (depth >= words.length) {
            return;
        }
        
        // 타겟 값이 되면 최소값으로 answer 할당
        if (begin.equals(target)) {
            answer = Math.min(answer, depth);
        }
        
        for (int i=0; i<words.length; i++) {
            int diff = 0;
    
            for (int j=0; j < begin.length(); j++) {
                if(begin.charAt(j) != words[i].charAt(j)) {
                    diff++;
                } 
            }
            
            // 다른 글자 차이가 1이고, 방문한 적 없으면 다음 탐색
            if (diff == 1 && visited[i] == false) {
                visited[i] = true;
                dfs(words[i], target, words, depth+1);
                visited[i] = false;
            }
        }

    }
}


/*
테스트 1 〉	통과 (0.04ms, 78.9MB)
테스트 2 〉	통과 (0.09ms, 79.2MB)
테스트 3 〉	통과 (0.56ms, 79.3MB)
테스트 4 〉	통과 (0.04ms, 73.6MB)
테스트 5 〉	통과 (0.04ms, 76.5MB) */
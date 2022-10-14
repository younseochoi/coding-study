class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        // 체크 여부 확인
        
        boolean[] check = new boolean[n];
        
        for (int i=0; i<n; i++) {
            
            // 체크 되어 있지 않는 경우 (false)
            
            if (!check[i]) {
                
                // dfs 함수 호출
                
                dfs(computers, i, check);
                answer ++;
            }
        }
        
        return answer;
    }
    
    // dfs 함수
    
    boolean[] dfs (int[][] computers, int i, boolean[] check) {
        
        // 체크하기
        
        check[i] = true;
        
        for (int j=0; j<computers.length; j++) {
            
            // 자기 자신이 아니고, 값이 1이고, 체크가 되지 않은 경우
            
            if (i != j && computers[i][j] == 1 && check[j] == false) {
                
                // dfs 함수 호출 
                
                check = dfs(computers, j, check); // ★
            }
        }
        return check;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 72.8MB)
테스트 2 〉	통과 (0.03ms, 77.4MB)
테스트 3 〉	통과 (0.06ms, 72.6MB)
테스트 4 〉	통과 (0.04ms, 78.1MB)
테스트 5 〉	통과 (0.01ms, 75.5MB)
테스트 6 〉	통과 (0.08ms, 80.3MB)
테스트 7 〉	통과 (0.03ms, 77.2MB)
테스트 8 〉	통과 (0.06ms, 75.6MB)
테스트 9 〉	통과 (0.07ms, 88.1MB)
테스트 10 〉통과 (0.05ms, 78.2MB)
테스트 11 〉통과 (0.33ms, 74.6MB)
테스트 12 〉통과 (0.29ms, 69.5MB)
테스트 13 〉통과 (0.15ms, 74.7MB)
*/

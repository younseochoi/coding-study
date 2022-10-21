import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        // commands 배열의 길이 = answer 배열의 길이
        
        int[] answer = new int[commands.length];
        
        for (int i=0; i<commands.length; i++) {
            
            // i번째 숫자(= commands[i][0])부터 j번째 숫자(= commands[i][1]) 까지 array를 자른다.
            
            int[] now = Arrays.copyOfRange(array, commands[i][0]-1,  commands[i][1]);
            
            // 정렬한다.
            
            Arrays.sort(now);
            
            // k번째에 있는 수 (= commands[i][2]-1)를 answer 배열에 담는다.
            
            answer[i] = now[commands[i][2]-1];
            
        }
        
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.34ms, 78.8MB)
테스트 2 〉	통과 (0.34ms, 73.5MB)
테스트 3 〉	통과 (0.34ms, 72.6MB)
테스트 4 〉	통과 (0.34ms, 75MB)
테스트 5 〉	통과 (0.34ms, 74.2MB)
테스트 6 〉	통과 (0.37ms, 72.9MB)
테스트 7 〉	통과 (0.35ms, 76.3MB)
*/

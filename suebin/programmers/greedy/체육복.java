import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        // n - lost.length = 체육복을 가져온 학생 수
        
        int answer = n- lost.length;
        
        // 오름차순 정렬
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 체육복을 가져온 학생이 도난을 당한 경우
        
        for(int i=0; i < lost.length; i++) {

            for(int j=0; j < reserve.length; j++) {
                
                if(lost[i] == reserve[j]) {
                    
                    lost[i] = reserve[j] = -1;
                    answer++;
                    break;
                    
                }
            }
        }
        
        // 여벌 체육복이 있는 학생이 다른 학생에게 체육복을 빌려주는 경우
        
        for (int i=0; i < lost.length; i++) {
            
            for (int j=0; j < reserve.length; j++) {
                
                if(lost[i] == reserve[j]+1 || lost[i] == reserve[j]-1) {
                    
                    answer++;
                    reserve[j] = -1;
                    break;

                }
            }
        }
        
        return answer;

    }
}

/*
테스트 1 〉	통과 (0.57ms, 71MB)
테스트 2 〉	통과 (0.51ms, 77.4MB)
테스트 3 〉	통과 (0.50ms, 71.3MB)
테스트 4 〉	통과 (0.34ms, 72.4MB)
테스트 5 〉	통과 (0.51ms, 65.9MB)
테스트 6 〉	통과 (0.33ms, 73.9MB)
테스트 7 〉	통과 (0.47ms, 76.3MB)
테스트 8 〉	통과 (0.50ms, 78.9MB)
테스트 9 〉	통과 (0.33ms, 74.4MB)
테스트 10 〉	통과 (0.37ms, 68.1MB)
테스트 11 〉	통과 (0.46ms, 76.1MB)
테스트 12 〉	통과 (0.48ms, 75.3MB)
테스트 13 〉	통과 (0.44ms, 78.5MB)
테스트 14 〉	통과 (0.32ms, 75.5MB)
테스트 15 〉	통과 (0.50ms, 74.6MB)
테스트 16 〉	통과 (0.44ms, 82MB)
테스트 17 〉	통과 (0.45ms, 73.6MB)
테스트 18 〉	통과 (0.35ms, 78.7MB)
테스트 19 〉	통과 (0.31ms, 77.6MB)
테스트 20 〉	통과 (0.36ms, 71.8MB)
*/

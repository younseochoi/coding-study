import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        // 오름차순 정렬 0 1 3 5 6
        
        Arrays.sort(citations);
        
        for (int i=0; i<citations.length; i++) {
            
            // 인덱스가 i 일 때 인용된 논문의 수 
            
            int h = citations.length - i;
            
            // h번 이상 인용된 논문(= citations[i])이 h편 이상일 경우
            
            if (citations[i] >= h) {
                
                // h는 H-Index
                
                answer = h;
                break;
            }
        }
        
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.51ms, 72.2MB)
테스트 2 〉	통과 (0.59ms, 77.6MB)
테스트 3 〉	통과 (0.53ms, 77.2MB)
테스트 4 〉	통과 (0.55ms, 71.8MB)
테스트 5 〉	통과 (0.93ms, 79.9MB)
테스트 6 〉	통과 (0.64ms, 76.2MB)
테스트 7 〉	통과 (1.24ms, 76.7MB)
테스트 8 〉	통과 (0.38ms, 76.2MB)
테스트 9 〉	통과 (0.40ms, 72.3MB)
테스트 10 〉	통과 (0.52ms, 75.8MB)
테스트 11 〉	통과 (0.61ms, 78.1MB)
테스트 12 〉	통과 (0.41ms, 78.2MB)
테스트 13 〉	통과 (0.70ms, 70.1MB)
테스트 14 〉	통과 (0.77ms, 76.9MB)
테스트 15 〉	통과 (0.60ms, 76MB)
테스트 16 〉	통과 (0.33ms, 76.2MB)
*/

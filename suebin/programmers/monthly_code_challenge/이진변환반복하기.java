class Solution {
    public int[] solution(String s) {
        
        // answer[0] = 이진 변환한 개수, answer[1] = 0을 제거한 개수
        
        int[] answer = new int[2];
        
        // s가 "1"이 될 때까지 반복한다.
        
        while (s.length() > 1) {
            
            // length = 0 제거 후 길이
            
            int length = 0;
            
            for (int i=0; i<s.length(); i++) {
                
                // 0이 나오는 경우, 0을 제거한 개수(= answer[1])를 더한다.
                
                if (s.charAt(i) == '0') answer[1]++;
                
                // 1이 나오는 경우를 더한다.
                
                else length++;
                
            }
            
            // 2진법으로 변경한다.
            
            s = Integer.toBinaryString(length);
            
            // 이진 변환(=answer[0])한 개수를 더한다.
            
            answer[0]++;  
        }
    
        return answer;
    }
}


/*
테스트 1 〉	통과 (0.05ms, 74MB)
테스트 2 〉	통과 (6.00ms, 77.5MB)
테스트 3 〉	통과 (0.03ms, 77MB)
테스트 4 〉	통과 (0.03ms, 74MB)
테스트 5 〉	통과 (0.03ms, 75.3MB)
테스트 6 〉	통과 (0.11ms, 66.8MB)
테스트 7 〉	통과 (0.14ms, 73.7MB)
테스트 8 〉	통과 (0.10ms, 72.9MB)
테스트 9 〉	통과 (4.61ms, 76.7MB)
테스트 10 〉	통과 (7.90ms, 70.4MB)
테스트 11 〉	통과 (8.37ms, 86.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

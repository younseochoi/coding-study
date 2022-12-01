class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        
        // index = station의 인덱스
        
        int index = 0; 
        
        // place = 동
        
        int place = 1;
        
        while (place <= n) {
            
            // 기지국이 설치된 경우
            
            if (index < stations.length && place >= stations[index]-w) {
                place = stations[index] + w + 1;
                index ++;
            }
            
            // 기지국이 설치되지 않은 경우
            
            else {
                answer += 1;
                place += (w*2) + 1;
            }
        }
        return answer;
    }
}


/*
정확성  테스트
테스트 1 〉	통과 (0.02ms, 77.8MB)
테스트 2 〉	통과 (0.03ms, 75.8MB)
테스트 3 〉	통과 (0.03ms, 75MB)
테스트 4 〉	통과 (0.01ms, 78.4MB)
테스트 5 〉	통과 (0.01ms, 75.8MB)
테스트 6 〉	통과 (0.03ms, 76.1MB)
테스트 7 〉	통과 (0.02ms, 71.1MB)
테스트 8 〉	통과 (0.01ms, 74.6MB)
테스트 9 〉	통과 (0.03ms, 78.9MB)
테스트 10 〉	통과 (0.02ms, 69.4MB)
테스트 11 〉	통과 (0.03ms, 79.7MB)
테스트 12 〉	통과 (0.01ms, 73.1MB)
테스트 13 〉	통과 (0.03ms, 70.6MB)
테스트 14 〉	통과 (0.02ms, 74.7MB)
테스트 15 〉	통과 (0.03ms, 72.8MB)
테스트 16 〉	통과 (0.01ms, 73.4MB)
테스트 17 〉	통과 (0.02ms, 76.3MB)
테스트 18 〉	통과 (0.02ms, 74.1MB)
테스트 19 〉	통과 (0.04ms, 76.4MB)
테스트 20 〉	통과 (0.01ms, 72.7MB)
테스트 21 〉	통과 (0.03ms, 76.8MB)
효율성  테스트
테스트 1 〉	통과 (0.82ms, 52.8MB)
테스트 2 〉	통과 (1.20ms, 52.3MB)
테스트 3 〉	통과 (0.93ms, 52.5MB)
테스트 4 〉	통과 (1.02ms, 52MB)
채점 결과
정확성: 70.5
효율성: 29.5
합계: 100.0 / 100.0
*/

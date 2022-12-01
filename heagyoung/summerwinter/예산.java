import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int how=0;
        for(int a:d){
            if(how+a<=budget){
                how+=a;
                answer++;
                continue;
            }
            break;
        }
        return answer;
    }
}
/*
테스트 1 〉	통과 (0.36ms, 69.8MB)
테스트 2 〉	통과 (0.45ms, 77.9MB)
테스트 3 〉	통과 (0.38ms, 76.9MB)
테스트 4 〉	통과 (0.34ms, 75.4MB)
테스트 5 〉	통과 (0.33ms, 78.4MB)
테스트 6 〉	통과 (0.38ms, 68.2MB)
테스트 7 〉	통과 (0.37ms, 76.1MB)
테스트 8 〉	통과 (0.38ms, 65.4MB)
테스트 9 〉	통과 (0.34ms, 71.9MB)
테스트 10 〉	통과 (0.47ms, 77.2MB)
테스트 11 〉	통과 (0.43ms, 81.7MB)
테스트 12 〉	통과 (0.50ms, 76.6MB)
테스트 13 〉	통과 (0.47ms, 77.6MB)
테스트 14 〉	통과 (0.37ms, 72.6MB)
테스트 15 〉	통과 (0.40ms, 72.5MB)
테스트 16 〉	통과 (0.50ms, 77.9MB)
테스트 17 〉	통과 (0.37ms, 74.5MB)
테스트 18 〉	통과 (0.36ms, 76.4MB)
테스트 19 〉	통과 (0.56ms, 71.6MB)
테스트 20 〉	통과 (0.37ms, 78.7MB)
테스트 21 〉	통과 (0.36ms, 78.4MB)
테스트 22 〉	통과 (0.46ms, 76.6MB)
테스트 23 〉	통과 (0.41ms, 76.9MB)
 */
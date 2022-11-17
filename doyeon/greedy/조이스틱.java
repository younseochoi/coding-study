import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int move = name.length() - 1;
        int next = 0;
        
        for(int i=0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 1 + ('Z' - name.charAt(i)));
            
            // 연속 되는 A가 끝나는 마지막 위치 구하기
            next = i + 1;
            while (next < name.length() && name.charAt(next) == 'A'){
                next++;
            }
            
            // (i * 2) + name.length() - next 
            // => 지금까지 온 만큼 되돌아간 뒤 전체 길이에서 연속되는 A가 끝나는 마지막 위치 뺀 길이
            move = Math.min(move, (i * 2) + name.length() - next);
            
            // 뒤에서부터 시작했을 경우
            move = Math.min(move, i + (name.length() - next) * 2);
        }
        answer += move;
        
        return answer;
    }
}


// 정확성  테스트
// 테스트 1 〉	통과 (0.04ms, 72.5MB)
// 테스트 2 〉	통과 (0.06ms, 73MB)
// 테스트 3 〉	통과 (0.03ms, 73.3MB)
// 테스트 4 〉	통과 (0.04ms, 76.3MB)
// 테스트 5 〉	통과 (0.05ms, 73.3MB)
// 테스트 6 〉	통과 (0.03ms, 73.9MB)
// 테스트 7 〉	통과 (0.04ms, 79.2MB)
// 테스트 8 〉	통과 (0.03ms, 76.5MB)
// 테스트 9 〉	통과 (0.05ms, 80.1MB)
// 테스트 10 〉	통과 (0.05ms, 72.3MB)
// 테스트 11 〉	통과 (0.05ms, 77.9MB)
// 테스트 12 〉	통과 (0.07ms, 76.3MB)
// 테스트 13 〉	통과 (0.06ms, 76.2MB)
// 테스트 14 〉	통과 (0.05ms, 73.4MB)
// 테스트 15 〉	통과 (0.06ms, 74.1MB)
// 테스트 16 〉	통과 (0.05ms, 81.3MB)
// 테스트 17 〉	통과 (0.03ms, 83.8MB)
// 테스트 18 〉	통과 (0.04ms, 76.9MB)
// 테스트 19 〉	통과 (0.03ms, 75.2MB)
// 테스트 20 〉	통과 (0.05ms, 76.1MB)
// 테스트 21 〉	통과 (0.05ms, 77.8MB)
// 테스트 22 〉	통과 (0.04ms, 66.1MB)
// 테스트 23 〉	통과 (0.04ms, 74MB)
// 테스트 24 〉	통과 (0.03ms, 77.6MB)
// 테스트 25 〉	통과 (0.10ms, 75.3MB)
// 테스트 26 〉	통과 (0.03ms, 72.9MB)
// 테스트 27 〉	통과 (0.03ms, 78.5MB)
// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/17676
import java.util.*;

class Solution {
    public int solution(String[] lines) {
        int answer = 0;
        List<int[]> list = new ArrayList();
        
        for(int i = 0; i < lines.length; i++) {
            int hTos = Integer.parseInt(lines[i].substring(11,13)) * 3600;
            int mTos = Integer.parseInt(lines[i].substring(14,16)) * 60;
                        
            int end = (int)((hTos + mTos + Double.parseDouble(lines[i].substring(17,23))) * 1000);
            int treat_time = (int)(Double.parseDouble(lines[i].substring(24, lines[i].length() - 1)) * 1000);
            int start = end - treat_time + 1;
            
            list.add(new int[] {start, end});
        }
        
        int max = 1;
        int cnt;
        for(int i = 0; i < list.size(); i++) {
            cnt = 1;

            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i)[1] + 1000 > list.get(j)[0])
                    cnt++;
            }
            if(max < cnt) max = cnt;
        }
        answer = max;
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.49ms, 75.2MB)
// 테스트 2 〉	통과 (35.02ms, 85.7MB)
// 테스트 3 〉	통과 (31.29ms, 81MB)
// 테스트 4 〉	통과 (0.47ms, 67.7MB)
// 테스트 5 〉	통과 (2.80ms, 73.7MB)
// 테스트 6 〉	통과 (1.35ms, 74.5MB)
// 테스트 7 〉	통과 (32.53ms, 75.2MB)
// 테스트 8 〉	통과 (32.27ms, 74.4MB)
// 테스트 9 〉	통과 (2.01ms, 76.8MB)
// 테스트 10 〉	통과 (0.43ms, 80.8MB)
// 테스트 11 〉	통과 (0.41ms, 66.8MB)
// 테스트 12 〉	통과 (24.59ms, 80.6MB)
// 테스트 13 〉	통과 (1.49ms, 71.9MB)
// 테스트 14 〉	통과 (0.37ms, 75MB)
// 테스트 15 〉	통과 (0.38ms, 66.3MB)
// 테스트 16 〉	통과 (0.50ms, 78.9MB)
// 테스트 17 〉	통과 (0.47ms, 78.3MB)
// 테스트 18 〉	통과 (36.44ms, 93.3MB)
// 테스트 19 〉	통과 (22.98ms, 86.6MB)
// 테스트 20 〉	통과 (31.78ms, 79.7MB)
// 테스트 21 〉	통과 (0.43ms, 76.1MB)
// 테스트 22 〉	통과 (0.34ms, 76.3MB)
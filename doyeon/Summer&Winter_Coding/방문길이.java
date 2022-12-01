import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList();
        // 중복 제거를 위한 HashSet
        HashSet path = new HashSet();
        
        // 길 방향 arr에 넣기
        for (int i=0; i<dirs.length(); i++) {
            arr.add(String.valueOf(dirs.charAt(i)));    
        }
        
        // 좌표
        int x = 0;
        int y = 0;

        for (String s : arr) {
            if (s.equals("L")) {
                if (x == -5) continue;
                
                // 간 길 표시하여 path에 넣기
                path.add((x - 0.5) + "/" + y);
                x--;

            } else if (s.equals("R")) {
                if (x == 5) continue;
                path.add((x + 0.5) + "/" + y);
                x++;

            } else if (s.equals("U")) {
                if (y == 5) continue;
                path.add(x + "/" + (y + 0.5));
                y++;

            } else if (s.equals("D")) {
                if (y == -5) continue;
                path.add(x + "/" + (y - 0.5));
                y--;
            }
        }
        
        answer = path.size();
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (13.90ms, 87.1MB)
// 테스트 2 〉	통과 (18.01ms, 76.3MB)
// 테스트 3 〉	통과 (12.85ms, 77.3MB)
// 테스트 4 〉	통과 (20.89ms, 75.8MB)
// 테스트 5 〉	통과 (14.25ms, 72.6MB)
// 테스트 6 〉	통과 (16.18ms, 79.2MB)
// 테스트 7 〉	통과 (16.61ms, 85.9MB)
// 테스트 8 〉	통과 (14.18ms, 79.7MB)
// 테스트 9 〉	통과 (19.49ms, 72.9MB)
// 테스트 10 〉	통과 (26.66ms, 83.8MB)
// 테스트 11 〉	통과 (15.53ms, 70.4MB)
// 테스트 12 〉	통과 (17.01ms, 77MB)
// 테스트 13 〉	통과 (19.09ms, 79.3MB)
// 테스트 14 〉	통과 (16.50ms, 82.7MB)
// 테스트 15 〉	통과 (14.94ms, 82.3MB)
// 테스트 16 〉	통과 (21.48ms, 75.2MB)
// 테스트 17 〉	통과 (17.07ms, 80.7MB)
// 테스트 18 〉	통과 (17.45ms, 84.2MB)
// 테스트 19 〉	통과 (16.63ms, 82.5MB)
// 테스트 20 〉	통과 (18.50ms, 85.2MB)
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int choose = nums.length / 2;
        
        // 시간 효율성을 위한 정렬 -> 안 해도 됨
        Arrays.sort(nums);
        
        // 중복 제거
        Integer[] resultArr = Arrays.stream(nums).distinct().boxed().toArray(Integer[]::new);
       
        if (resultArr.length >= choose) {   // 중복 제거된 수 종류가 고를 수 있는 수보다 크거나 같으면
            answer = choose;                // 고를 수 있는 최대 종류 수 = 고를 수 있는 수
        } else {
            answer = resultArr.length;      // 그보다 작으면 고를 수 있는 최대 종류 수 = 중복 제거된 수 종류
        }
        
        return answer;
    }
}


// 정확성  테스트
// 테스트 1 〉	통과 (2.69ms, 79.4MB)
// 테스트 2 〉	통과 (2.67ms, 80.3MB)
// 테스트 3 〉	통과 (3.80ms, 74.7MB)
// 테스트 4 〉	통과 (2.83ms, 73.5MB)
// 테스트 5 〉	통과 (2.98ms, 74MB)
// 테스트 6 〉	통과 (3.67ms, 72.1MB)
// 테스트 7 〉	통과 (7.61ms, 76.3MB)
// 테스트 8 〉	통과 (4.71ms, 78MB)
// 테스트 9 〉	통과 (3.31ms, 74.2MB)
// 테스트 10 〉	통과 (3.76ms, 80.8MB)
// 테스트 11 〉	통과 (2.92ms, 79.7MB)
// 테스트 12 〉	통과 (5.75ms, 73.8MB)
// 테스트 13 〉	통과 (8.17ms, 78.1MB)
// 테스트 14 〉	통과 (4.10ms, 74MB)
// 테스트 15 〉	통과 (4.10ms, 79.8MB)
// 테스트 16 〉	통과 (9.93ms, 87.5MB)
// 테스트 17 〉	통과 (11.65ms, 88MB)
// 테스트 18 〉	통과 (11.12ms, 81.9MB)
// 테스트 19 〉	통과 (9.13ms, 79.4MB)
// 테스트 20 〉	통과 (11.69ms, 77MB)
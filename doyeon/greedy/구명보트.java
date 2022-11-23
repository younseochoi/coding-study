import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int weight = 0;
        int min = 0;
        
        // 무게 오름차순 정렬
        Arrays.sort(people);
        
        // 두 명 태우므로 제일 무게가 많이 나가는 사람과 적게 나가는 사람 무게를 더함
        for (int max = people.length - 1; min <= max; max--) {
            weight = people[min] + people[max];
            
            // 무게가 limit보다 적으면 다음 무게로 
            if (weight <= limit) min++;
            answer += 1;
        }
        return answer;
    }
}


// 정확성  테스트
// 테스트 1 〉	통과 (1.97ms, 89.2MB)
// 테스트 2 〉	통과 (1.36ms, 84.7MB)
// 테스트 3 〉	통과 (1.75ms, 74.1MB)
// 테스트 4 〉	통과 (1.36ms, 81.8MB)
// 테스트 5 〉	통과 (0.85ms, 74.8MB)
// 테스트 6 〉	통과 (0.89ms, 83.8MB)
// 테스트 7 〉	통과 (1.09ms, 74.1MB)
// 테스트 8 〉	통과 (0.35ms, 79MB)
// 테스트 9 〉	통과 (0.51ms, 73.5MB)
// 테스트 10 〉	통과 (1.64ms, 67.2MB)
// 테스트 11 〉	통과 (1.21ms, 76MB)
// 테스트 12 〉	통과 (1.01ms, 74.5MB)
// 테스트 13 〉	통과 (1.22ms, 73.7MB)
// 테스트 14 〉	통과 (1.32ms, 79.7MB)
// 테스트 15 〉	통과 (0.61ms, 75.8MB)
// 효율성  테스트
// 테스트 1 〉	통과 (12.08ms, 55.4MB)
// 테스트 2 〉	통과 (10.59ms, 56.3MB)
// 테스트 3 〉	통과 (10.03ms, 53.6MB)
// 테스트 4 〉	통과 (7.31ms, 53.8MB)
// 테스트 5 〉	통과 (8.38ms, 53.3MB)
import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        // 인용횟수 오름차순 정렬
        Arrays.sort(citations);
        
        for(int i=0; i < citations.length; i++) {
            // h번 이상 인용되는 논문 개수
            int useLength = citations.length - i;

            if (citations[i] >= useLength) { // h번 이상 인용되는 논문 개수가 h개 이상이면
                answer = useLength;         // answer는 h개
                break;             // 맨 처음으로 조건 달성 시 최대 h-index이므로 break
            }
        }
        
        return answer;
    }
}


/*
테스트 1 〉	통과 (0.64ms, 78.9MB)
테스트 2 〉	통과 (0.86ms, 73.3MB)
테스트 3 〉	통과 (0.92ms, 73MB)
테스트 4 〉	통과 (0.54ms, 73.6MB)
테스트 5 〉	통과 (0.85ms, 85MB)
테스트 6 〉	통과 (0.83ms, 64.8MB)
테스트 7 〉	통과 (0.74ms, 67.9MB)
테스트 8 〉	통과 (0.48ms, 86.8MB)
테스트 9 〉	통과 (0.40ms, 80.5MB)
테스트 10 〉통과 (0.68ms, 71.6MB)
테스트 11 〉통과 (0.87ms, 75.6MB)
테스트 12 〉통과 (0.55ms, 78.2MB)
테스트 13 〉통과 (0.67ms, 72.9MB)
테스트 14 〉통과 (0.62ms, 73.2MB)
테스트 15 〉통과 (0.87ms, 69.4MB)
테스트 16 〉통과 (0.49ms, 81.6MB)*/
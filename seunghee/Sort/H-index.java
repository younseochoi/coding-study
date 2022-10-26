import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        //정렬
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++) {
        	// 최댓값 = citations의 길이 -> 에서 반복문을 돌릴 떄 마다 1씩 줄어듦
        	int max = citations.length - i;
        	// 정렬을 했으므로 max와 만나는 인덱스값이 더 크다면 그 뒤에것도 모두 큼 = 갯수가 max와 동일해짐
        	if(citations[i] >= max) {
        		answer = max;
        		break;
        	}
        }
        return answer;
    }
}
/*
테스트 1 〉	통과 (0.50ms, 74.7MB)
테스트 2 〉	통과 (0.57ms, 77.5MB)
테스트 3 〉	통과 (0.52ms, 76MB)
테스트 4 〉	통과 (0.52ms, 73.4MB)
테스트 5 〉	통과 (0.64ms, 77.5MB)
테스트 6 〉	통과 (0.61ms, 79MB)
테스트 7 〉	통과 (0.62ms, 72.1MB)
테스트 8 〉	통과 (0.49ms, 82.2MB)
테스트 9 〉	통과 (0.37ms, 76.4MB)
테스트 10 〉	통과 (0.43ms, 77.8MB)
테스트 11 〉	통과 (0.58ms, 76MB)
테스트 12 〉	통과 (0.40ms, 75.6MB)
테스트 13 〉	통과 (0.62ms, 79.4MB)
테스트 14 〉	통과 (0.62ms, 76.7MB)
테스트 15 〉	통과 (0.67ms, 76.7MB)
테스트 16 〉	통과 (0.33ms, 79.4MB)
*/
//사실 처음엔 이중포문으로 갯수 셌는데 테스트 11만 실패했음. 근데 그 이유를 못찾아서 ㅠ 다른분의 답안 참고
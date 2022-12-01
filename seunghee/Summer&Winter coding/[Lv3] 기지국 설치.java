//참고 : https://blog.naver.com/ngm95/222318086945
class Solution {
    public int solution(int n, int[] stations, int w) {
    	int answer = 0;
    	
    	int start = 1;
    	for (int ele : stations) {				// 기존 기지국 앞쪽, 기지국 사이에 남은 공간 처리
    		int end = ele-w-1;
    		if (start <= end) {
    			int length = end-start+1;		// 구간 길이
    			answer += length/(w*2+1);		// (w*2+1)*몫 만큼의 건물을 커버할 수 있음
        		if (length%(w*2+1) != 0)		// 나머지가 존재한다면 1개의 기지국을 추가로 설치해야 함
        			answer++;
    		}
    		start = ele+w+1;
    	}
    	if (start <= n) {						// 기존 기지국 뒤쪽에 남은 공간 처리
    		int length = n-start+1;
			answer += length/(w*2+1);
    		if (length%(w*2+1) != 0)
    			answer++;
    	}
    	
    	return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 74.1MB)
테스트 2 〉	통과 (0.03ms, 70MB)
테스트 3 〉	통과 (0.02ms, 76.9MB)
테스트 4 〉	통과 (0.02ms, 69.8MB)
테스트 5 〉	통과 (0.03ms, 74.9MB)
테스트 6 〉	통과 (0.02ms, 77.9MB)
테스트 7 〉	통과 (0.02ms, 73.9MB)
테스트 8 〉	통과 (0.03ms, 79.5MB)
테스트 9 〉	통과 (0.02ms, 79.4MB)
테스트 10 〉	통과 (0.03ms, 74.1MB)
테스트 11 〉	통과 (0.02ms, 82.4MB)
테스트 12 〉	통과 (0.02ms, 77.9MB)
테스트 13 〉	통과 (0.03ms, 75.2MB)
테스트 14 〉	통과 (0.03ms, 73.4MB)
테스트 15 〉	통과 (0.02ms, 69.2MB)
테스트 16 〉	통과 (0.03ms, 99.1MB)
테스트 17 〉	통과 (0.01ms, 76.4MB)
테스트 18 〉	통과 (0.02ms, 73.6MB)
테스트 19 〉	통과 (0.03ms, 76MB)
테스트 20 〉	통과 (0.03ms, 73.3MB)
테스트 21 〉	통과 (0.02ms, 77.5MB)
효율성  테스트
테스트 1 〉	통과 (0.54ms, 52.5MB)
테스트 2 〉	통과 (0.73ms, 52.5MB)
테스트 3 〉	통과 (0.63ms, 52.6MB)
테스트 4 〉	통과 (0.63ms, 53.3MB)
채점 결과
정확성: 70.5
효율성: 29.5
합계: 100.0 / 100.0
*/
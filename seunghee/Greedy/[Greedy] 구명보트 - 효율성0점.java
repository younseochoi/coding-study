import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : people) {
        	arr.add(num);
        }
        
        int cnt = arr.size();
        
        while (!arr.isEmpty()) {
        	int num1 = arr.get(0);
        	for (int j=cnt-1; j>0; j--) {
        		if(num1 + arr.get(j) <= limit) {
        			arr.remove(j);
        			break;
        		}
        	}
			arr.remove(0);
			answer++ ;
			cnt = arr.size();
        }
        return answer;
    }
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (23.76ms, 80.3MB)
테스트 2 〉	통과 (20.84ms, 80.3MB)
테스트 3 〉	통과 (19.41ms, 79.2MB)
테스트 4 〉	통과 (20.10ms, 78.6MB)
테스트 5 〉	통과 (19.98ms, 85.4MB)
테스트 6 〉	통과 (14.63ms, 74.4MB)
테스트 7 〉	통과 (19.05ms, 79.2MB)
테스트 8 〉	통과 (1.43ms, 71.9MB)
테스트 9 〉	통과 (2.42ms, 74.2MB)
테스트 10 〉	통과 (22.55ms, 83MB)
테스트 11 〉	통과 (18.12ms, 83.3MB)
테스트 12 〉	통과 (17.30ms, 79.6MB)
테스트 13 〉	통과 (23.51ms, 77.1MB)
테스트 14 〉	통과 (20.64ms, 76.5MB)
테스트 15 〉	통과 (4.28ms, 75.1MB)
효율성  테스트
테스트 1 〉	실패 (시간 초과)
테스트 2 〉	실패 (시간 초과)
테스트 3 〉	실패 (시간 초과)
테스트 4 〉	실패 (시간 초과)
테스트 5 〉	실패 (시간 초과)
채점 결과
정확성: 75.0
효율성: 0.0
합계: 75.0 / 100.0
*/
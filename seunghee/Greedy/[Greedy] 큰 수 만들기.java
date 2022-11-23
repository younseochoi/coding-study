class Solution {
    public String solution(String number, int k) {
    	
        StringBuilder answer = new StringBuilder("");
        
        int start = 0;
        int last = k;
        
        for(int i=0; i<number.length() - k; i++) {
        	char max = 0;
        	int maxIdx = 0;
        	for(int j=start; j<=last; j++) 
        		if(max < number.charAt(j)) {
        			max = number.charAt(j);
        			maxIdx = j;
        		}
            answer.append(max);
        	start = maxIdx+1;
        	last++;
        }
        return answer.toString();
    }
}
/*
StringBuilder 처음 써보는데 엄청난 성능에 감탄하며 마무리...ㅎ

채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.02ms, 77.2MB)
테스트 2 〉	통과 (0.04ms, 74.6MB)
테스트 3 〉	통과 (0.07ms, 76.3MB)
테스트 4 〉	통과 (0.13ms, 74.9MB)
테스트 5 〉	통과 (0.49ms, 75.6MB)
테스트 6 〉	통과 (30.77ms, 87.9MB)
테스트 7 〉	통과 (31.22ms, 85MB)
테스트 8 〉	통과 (200.11ms, 90.2MB)
테스트 9 〉	통과 (16.44ms, 79.1MB)
테스트 10 〉	통과 (6795.81ms, 81.3MB)
테스트 11 〉	통과 (0.03ms, 76MB)
테스트 12 〉	통과 (0.03ms, 79.2MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
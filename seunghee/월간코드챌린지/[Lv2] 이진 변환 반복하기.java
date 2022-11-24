class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int remove = 0;
        int times = 0;
        String result = s;
        
        while (!result.equals("1")) {
        	String temp = "";	
            int len = result.length();
            for(int i=0; i<result.length(); i++) {
            	if(String.valueOf(result.charAt(i)).equals("0")) {
            		len--;
            		remove++;
            	}
            }
            while(len>0){
            	temp = (len%2) + temp;
                len=len/2; 
            }
            result = temp;
            times++;
        }
        
        answer[1] = remove;
        answer[0] = times;
        
        return answer;
    }
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (9.55ms, 78.8MB)
테스트 2 〉	통과 (29.86ms, 84.5MB)
테스트 3 〉	통과 (19.09ms, 72.1MB)
테스트 4 〉	통과 (14.27ms, 80.3MB)
테스트 5 〉	통과 (14.42ms, 80.9MB)
테스트 6 〉	통과 (15.18ms, 70MB)
테스트 7 〉	통과 (10.68ms, 77MB)
테스트 8 〉	통과 (12.30ms, 81.5MB)
테스트 9 〉	통과 (19.72ms, 82.6MB)
테스트 10 〉	통과 (28.90ms, 88.4MB)
테스트 11 〉	통과 (33.36ms, 91.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
    	
    	String[] answer = new String[n];

        for(int i=0; i<n; i++) {
        	String map = "";
        	String nTwo = Integer.toBinaryString(arr1[i]|arr2[i]);
        	
    		if(n>nTwo.length()) {
    			map = " ".repeat(n-nTwo.length());
    		}    		
        	for(int j=0; j<nTwo.length(); j++) {
        		if(String.valueOf(nTwo.charAt(j)).equals("1")) {
        			map+="#";
        		} else {
        			map+=" ";    			
        		}
        	}
        	answer[i] = map;
        }
        return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (2.45ms, 77MB)
테스트 2 〉	통과 (2.26ms, 77.4MB)
테스트 3 〉	통과 (1.85ms, 74.2MB)
테스트 4 〉	통과 (2.97ms, 77.7MB)
테스트 5 〉	통과 (1.86ms, 85.4MB)
테스트 6 〉	통과 (2.15ms, 71.9MB)
테스트 7 〉	통과 (1.92ms, 77.9MB)
테스트 8 〉	통과 (1.92ms, 79.4MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
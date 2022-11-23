import java.util.ArrayList;

class Solution {
    public String solution(String number, int k) {
    	
        String answer = "";
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<number.length(); i++) {
        	arr.add(Character.getNumericValue(number.charAt(i)));
        }
        
        int i = 0;
        while(arr.size()>number.length()-k) {
        	if (arr.get(i) < arr.get(i+1)) {
        		arr.remove(i);
        		i = 0;
        	} else {
        		i++;        		
        	}
        }
        
        for(int num : arr) {
        	answer += num;
        }
        
        return answer;
    }
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (12.89ms, 81.8MB)
테스트 2 〉	통과 (9.27ms, 76MB)
테스트 3 〉	통과 (11.98ms, 77.9MB)
테스트 4 〉	통과 (11.02ms, 76.6MB)
테스트 5 〉	통과 (12.76ms, 77.6MB)
테스트 6 〉	통과 (66.63ms, 90.9MB)
테스트 7 〉	통과 (393.33ms, 388MB)
테스트 8 〉	통과 (1035.83ms, 378MB)
테스트 9 〉	통과 (8951.98ms, 476MB)
테스트 10 〉	실패 (시간 초과)
테스트 11 〉	통과 (12.93ms, 79.8MB)
테스트 12 〉	실패 (런타임 에러)
채점 결과
정확성: 83.3
합계: 83.3 / 100.0
*/
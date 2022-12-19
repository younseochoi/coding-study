class Solution {
	
    public static int solution(String s) {
        int answer = -1;
        
        StringBuilder sb = new StringBuilder(s);

        while (sb.length()>1) {
        	for(int i=0; i<sb.length()-1; i++) {
        		String check = sb.substring(i, i+2);
        		if(check.charAt(0)==check.charAt(1)) {
        			sb.delete(i, i+2);
        			break;
        		}
        		if ( i == sb.length()-2 ) {
        			return 0;        			
        		}
        	}
        }
        
        if(sb.length()>0) {
        	answer = 0;
        } else {
        	answer = 1;
        }

        return answer;
    }

}
/*
while - for문 때문에 효율성이 망한 것 같은데... 개선 방향이 떠오르지 않습니다ㅠㅠ
정확성  테스트
테스트 1 〉	통과 (0.06ms, 73.7MB)
테스트 2 〉	통과 (58.75ms, 71.9MB)
테스트 3 〉	실패 (시간 초과)
테스트 4 〉	실패 (시간 초과)
테스트 5 〉	실패 (시간 초과)
테스트 6 〉	실패 (시간 초과)
테스트 7 〉	실패 (시간 초과)
테스트 8 〉	실패 (시간 초과)
테스트 9 〉	통과 (0.04ms, 73.2MB)
테스트 10 〉	통과 (0.44ms, 76.6MB)
테스트 11 〉	통과 (0.08ms, 77.8MB)
테스트 12 〉	통과 (0.04ms, 75.8MB)
테스트 13 〉	통과 (0.07ms, 78.3MB)
효율성  테스트
테스트 1 〉	실패 (시간 초과)
테스트 2 〉	실패 (시간 초과)
테스트 3 〉	실패 (시간 초과)
테스트 4 〉	실패 (시간 초과)
테스트 5 〉	실패 (시간 초과)
테스트 6 〉	실패 (시간 초과)
테스트 7 〉	실패 (시간 초과)
테스트 8 〉	실패 (시간 초과)
채점 결과
정확성: 30.3
효율성: 0.0
합계: 30.3 / 100.0
*/
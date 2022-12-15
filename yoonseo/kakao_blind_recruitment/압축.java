package kakao_blind_recruitment;

import java.util.ArrayList;
import java.util.HashMap;

public class 압축 {

	public static void main(String[] args) {
		압축 s = new 압축();
		s.solution("KAKAO"); //[11, 1, 27, 15]
		
		//[20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34]
		s.solution("TOBEORNOTTOBEORTOBEORNOT");
		
		//[1, 2, 27, 29, 28, 31, 30]
		s.solution("ABABABABABABABAB");
	}

	/**
	 * 
	 * @param msg : 영문 대문자로만 이뤄진 문자열
	 * @return : 문자열을 압축한 후 사전 색인 번호의 배열
	 * 
	 * LZW 압축 
	 * 1. 길이가 1인 모든 단어를 포함하도록 사전을 초기화한다.
	 * 2. 사전에서 현재 입력과 일치하는 가장 긴 문자열 w를 찾는다.
	 * 3. w에 해당하는 사전의 색인 번호를 출력하고, 입력에서 w를 제거한다.
	 * 4. 입력에서 처리되지 않은 다음 글자가 남아있다면(c), w+c에 해당하는 단어를 사전에 등록한다.
	 * 5. 단계 2로 돌아간다.
	 */
	 public int[] solution(String msg) {
	        int[] answer = new int[msg.length()];
	        ArrayList<Integer> arrlist= new ArrayList<>();
	        HashMap<String, Integer> hm = new HashMap<>();
	        int value = 1;
	        
	       for(char c ='A';c<='Z';c++) {
	    	   hm.put(c+"", value++);
	       }
	        int len = msg.length();
	        int i =0;
	        while(i<len) {
	        	int max = 1;
	        	
	        	// 해시맵에 추가할 글자수를 max에 저장
	        	while(i+max<=len && hm.containsKey(msg.substring(i,i+max))) {
	        		max++;
	        	}
	        	
	        	if(i+max> len) { // 문자열 끝나는 경우
	        		arrlist.add(hm.get(msg.substring(i)));
	        		break;
	        	}
	        	// 한글자 뺀 문자열 = w 로 value 찾음.
	        	arrlist.add(hm.get(msg.substring(i, i+max-1)));
	        	
	        	// 해시맵에 w+c 등록 
	        	hm.put(msg.substring(i,i+max), value++);
	        	
	        	 i+=max-1;//다음 글자 인덱스
	        }
	        
	        // arrlist to int arr
	        answer = arrlist.stream().mapToInt(Integer::intValue).toArray();
	        
	        return answer;
	    }
}


/*
정확성  테스트
테스트 1 〉	통과 (7.31ms, 75.5MB)
테스트 2 〉	통과 (9.81ms, 76.2MB)
테스트 3 〉	통과 (7.50ms, 77.5MB)
테스트 4 〉	통과 (11.32ms, 76.6MB)
테스트 5 〉	통과 (9.52ms, 76.9MB)
테스트 6 〉	통과 (11.01ms, 74.6MB)
테스트 7 〉	통과 (12.74ms, 79MB)
테스트 8 〉	통과 (8.96ms, 78.3MB)
테스트 9 〉	통과 (9.13ms, 77.5MB)
테스트 10 〉	통과 (12.28ms, 86.1MB)
테스트 11 〉	통과 (8.99ms, 74.3MB)
테스트 12 〉	통과 (10.71ms, 75.4MB)
테스트 13 〉	통과 (9.27ms, 75.2MB)
테스트 14 〉	통과 (10.26ms, 80.2MB)
테스트 15 〉	통과 (9.65ms, 76.3MB)
테스트 16 〉	통과 (8.24ms, 82.7MB)
테스트 17 〉	통과 (8.82ms, 78.5MB)
테스트 18 〉	통과 (9.50ms, 75.4MB)
테스트 19 〉	통과 (11.03ms, 70.2MB)
테스트 20 〉	통과 (9.48ms, 67.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0 
 */

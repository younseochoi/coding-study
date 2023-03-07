package pccp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * char -> String Character.toString(char); or
 * 			String.valueOf(char)
 * @author choiyoonseo
 *
 */
public class 외톨이알파벳 {

	public static void main(String[] args) {
		외톨이알파벳 s = new 외톨이알파벳();
		s.solution("edeaaabbccd"); //"de"
		s.solution("eeddee"); //"e"
		s.solution("string"); //"N"
		s.solution("zbzbz"); //"bz"
		
	}
	
	
	public String solution(String input_string) {
       
		String answer = "";
        Map<String, Boolean> hm = new HashMap<String, Boolean>();
        Set<Character> set = new TreeSet<>();
        char current = ' ';
        
    
        
        for(int i=0;i<input_string.length();i++) {
        	
        	char temp = input_string.charAt(i);
        	
        	if(current != temp) {
        		
        		if(hm.containsKey(String.valueOf(temp))) //외톨이 확정
        			set.add(temp); 
        		
        		hm.put(Character.toString(temp), true); // 외톨이 후보에 넣기
        		current = temp;
        	}
        }
       
        Iterator<Character> iter = set.iterator();
        while(iter.hasNext()) {
        	answer+=iter.next();
        }
       
        
        if(answer.equals("")) {
        	answer = "N";
        }
       
        return answer;
    }

}

/*
 채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.82ms, 74.3MB)
테스트 2 〉	통과 (0.79ms, 74.8MB)
테스트 3 〉	통과 (1.80ms, 75.5MB)
테스트 4 〉	통과 (2.84ms, 77.1MB)
테스트 5 〉	통과 (2.39ms, 78.9MB)
테스트 6 〉	통과 (2.34ms, 79.1MB)
테스트 7 〉	통과 (2.46ms, 77.8MB)
테스트 8 〉	통과 (2.78ms, 77.7MB)
테스트 9 〉	통과 (2.66ms, 77.7MB)
테스트 10 〉	통과 (2.22ms, 75.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

package kakao_blind_recruitment;

import java.util.ArrayList;

public class 뉴스클러스터링 {

	public static void main(String[] args) {

		뉴스클러스터링 s = new 뉴스클러스터링();
		s.solution("FRANCE", "french"); //16384
		s.solution("handshake", "shake hands");//65536
		s.solution("aa1+aa2", "AAAA12"); //43690
		s.solution("E=M*C^2", "e=m*c^2"); //65536

	}
	
	public int solution(String str1, String str2) {
        int answer = 0;
        ArrayList<String> arrlist = new ArrayList<>();
        ArrayList<String> arrlist2 = new ArrayList<>();
        int intersection = 0; // 교집합의 수
        int union = 0; //합집합의 수
        
        // 1. 모두 대문자로 
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        if(str1.equals(str2)) {
        	return 65536;
        }
        
        
        // 2. str1 2글자씩 분리후 arrlist 저장
        for(int i =0;i<str1.length()-1;i++) {
        	String temp = str1.substring(i,i+2);
        	
        	boolean flag = isAlpabet(temp);
        	
        	if(flag) arrlist.add(temp);
        	
        }
        
        
        
        // 2. str2 2글자씩 분리후 arrlist1 저장
        for(int i =0;i<str2.length()-1;i++) {
        	String temp = str2.substring(i,i+2);
        	boolean flag = isAlpabet(temp);
        	
        	if(flag) {

        		arrlist2.add(temp);
        	}
        	
        }
        
        
        // 3. 합집합 교집합 검사
        // 합집합 : A+B - (A와 B의 교집합)
        // 교집합 : A B 둘다 중복되는 값 count
        for(int i=0;i<arrlist.size();i++) {
        	
        	if(arrlist2.contains(arrlist.get(i))) {
        		arrlist2.remove(arrlist.get(i));
        		intersection++;
        	}
        	
        }
        
        union =  arrlist.size()+arrlist2.size();
        
        answer = 65536*intersection / union;

        return answer;
    }
	
	// 유효문자열인지 검사
	boolean isAlpabet(String temp) {
		
		boolean flag = false;
		
		for(int j =0;j<temp.length();j++) {
    		
    		if(temp.charAt(j)>='A' && temp.charAt(j)<='Z') {
    			flag= true;
    		}
    		else {
    			flag= false;
    			break;
    		};
    		
    	}
		
		return flag;
	}

}


/*
 채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.04ms, 77.4MB)
테스트 2 〉	통과 (0.06ms, 76.9MB)
테스트 3 〉	통과 (0.07ms, 71.6MB)
테스트 4 〉	통과 (1.41ms, 74.9MB)
테스트 5 〉	통과 (0.05ms, 66MB)
테스트 6 〉	통과 (0.04ms, 74MB)
테스트 7 〉	통과 (0.26ms, 73MB)
테스트 8 〉	통과 (0.05ms, 76.1MB)
테스트 9 〉	통과 (0.18ms, 80.9MB)
테스트 10 〉	통과 (0.65ms, 76MB)
테스트 11 〉	통과 (0.79ms, 74.1MB)
테스트 12 〉	통과 (0.05ms, 75.7MB)
테스트 13 〉	통과 (0.18ms, 75.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */

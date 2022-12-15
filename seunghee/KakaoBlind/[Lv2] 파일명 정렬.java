//참조 : https://velog.io/@hyeon930/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%8C%8C%EC%9D%BC%EB%AA%85-%EC%A0%95%EB%A0%AC-Java

import java.util.*;

class Solution {
	public String[] solution(String[] files) {
    		Arrays.sort(files, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String[] file1 = detach(s1);
				String[] file2 = detach(s2);
				
				int headValue = file1[0].compareTo(file2[0]);
				
				if(headValue == 0) {
					int num1 = Integer.parseInt(file1[1]);
					int num2 = Integer.parseInt(file2[1]);
					
					return num1 - num2;
				} else {
					return headValue;
				}
			}
			
			private String[] detach(String str) {
				String head = "";
				String number = "";
				String tail = "";

				int idx = 0;
				for( ; idx < str.length() ; ++idx) {
					char ch = str.charAt(idx);
					if(ch >= '0' && ch <= '9') break;
					head += ch;
				}
				
				for( ; idx < str.length() ; ++idx) {
					char ch = str.charAt(idx);
					if(!(ch >= '0' && ch <= '9')) break;
					number += ch;
				}
				
				for( ; idx < str.length() ; ++idx) {
					char ch = str.charAt(idx);
					tail += ch;
				}
				
				String[] file = {head.toLowerCase(), number, tail};
				
				return file;
			}
		});
		return files;
	}
}
/*
정확성  테스트
테스트 1 〉	통과 (11.95ms, 77.2MB)
테스트 2 〉	통과 (10.99ms, 75MB)
테스트 3 〉	통과 (72.58ms, 105MB)
테스트 4 〉	통과 (75.56ms, 109MB)
테스트 5 〉	통과 (66.01ms, 107MB)
테스트 6 〉	통과 (67.46ms, 86.6MB)
테스트 7 〉	통과 (55.49ms, 101MB)
테스트 8 〉	통과 (49.47ms, 113MB)
테스트 9 〉	통과 (44.71ms, 110MB)
테스트 10 〉	통과 (57.84ms, 94.9MB)
테스트 11 〉	통과 (48.02ms, 102MB)
테스트 12 〉	통과 (44.76ms, 97.6MB)
테스트 13 〉	통과 (28.15ms, 98.2MB)
테스트 14 〉	통과 (31.54ms, 81.6MB)
테스트 15 〉	통과 (37.00ms, 85.7MB)
테스트 16 〉	통과 (54.12ms, 99MB)
테스트 17 〉	통과 (21.26ms, 86.1MB)
테스트 18 〉	통과 (30.92ms, 97.3MB)
테스트 19 〉	통과 (34.93ms, 92.9MB)
테스트 20 〉	통과 (36.27ms, 101MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
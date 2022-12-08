import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;    
        //str1의 글자 배열 만들기
        List<String> arr1 = makeArr(str1);
        //str2의 글자 배열 만들기
        List<String> arr2 = makeArr(str2);
        //교집합, 합집합 도출 (합집합: 집합1+집합2-교집합)
        double same = 0;
        double sum = arr1.size()+arr2.size();
        for(int n=0; n<arr1.size(); n++) {
        	for(int m=0; m<arr2.size(); m++) {
        		if(arr1.get(n).equals(arr2.get(m))) {
        			same++;
        			arr2.remove(m);
        			break;
        		}
        	}
        }
        sum -= same;
        //예외처리: 합집합이 공집합이면 1(=65536)도출
        //교집합 / 합집합 * 65536
        if (sum==0) {
        	answer = 65536;
        } else {
        	answer = (int)((same/sum)*65536);
        }
        return answer;
    }
    //글자를 입력 받으면 2개씩 리스트로 만들어주는 메소드
    private List<String> makeArr(String str){
    	List<String> arr1 = new ArrayList<>();
        for(int i=1; i<str.length(); i++) {
        	boolean check = true;
        	String sub = str.substring(i-1,i+1);
        	for(int j=0; j<2; j++) {
        		if( !(('a'<=sub.charAt(j)&&sub.charAt(j)<='z')||('A'<=sub.charAt(j)&&sub.charAt(j)<='Z')) ) {
        			check = false;
        			break;
        		}
        	}
        	if(check) {
        		arr1.add(sub.toUpperCase());        		
        	}
        }
    	return arr1;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 74.9MB)
테스트 2 〉	통과 (0.08ms, 71.9MB)
테스트 3 〉	통과 (0.05ms, 78.9MB)
테스트 4 〉	통과 (2.95ms, 77.4MB)
테스트 5 〉	통과 (0.06ms, 73.3MB)
테스트 6 〉	통과 (0.08ms, 84.8MB)
테스트 7 〉	통과 (0.52ms, 70.5MB)
테스트 8 〉	통과 (0.09ms, 75.5MB)
테스트 9 〉	통과 (0.44ms, 73.3MB)
테스트 10 〉	통과 (1.13ms, 76.5MB)
테스트 11 〉	통과 (1.16ms, 79.4MB)
테스트 12 〉	통과 (0.03ms, 77.4MB)
테스트 13 〉	통과 (0.22ms, 82.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
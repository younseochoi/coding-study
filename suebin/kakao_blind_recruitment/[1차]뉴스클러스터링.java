import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        // 대문자로 통일한다.
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        // 다중집합 만들기
        
        ArrayList<String> multiSetA = new ArrayList<>();
        ArrayList<String> multiSetB = new ArrayList<>();
        
        for (int i=0; i<str1.length()-1; i++) {
            char first = str1.charAt(i);
            char second = str1.charAt(i+1);
            
            if (first >= 'A' && first <= 'Z' && second >= 'A' && second <= 'Z') {
                multiSetA.add(first + "" + second);
            }
        }
        
        for (int i=0; i<str2.length()-1; i++) {
            char first = str2.charAt(i);
            char second = str2.charAt(i+1);
            
            if (first >= 'A' && first <= 'Z' && second >= 'A' && second <= 'Z') {
                multiSetB.add(first + "" + second);
            }
        }
        
        Collections.sort(multiSetA);
        Collections.sort(multiSetB);
        
         // 합집합과 교집합 만들기
        
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();
        
        for (String s : multiSetA) {
            if (multiSetB.remove(s)) {
                intersection.add(s);
            }
            union.add(s);
        }
        
        for (String s : multiSetB) {
            union.add(s);
        }
        
        // 자카드 유사도 구하기
        
        double jakard = 0;
        
        if (union.size() == 0) {
            jakard = 1;
        }
        else {
            jakard = (double)intersection.size() / (double)union.size();
        }
        
        answer = (int)(jakard * 65536);
        
        return answer;
    }
}


/*
정확성  테스트
테스트 1 〉	통과 (7.72ms, 74.4MB)
테스트 2 〉	통과 (11.28ms, 72MB)
테스트 3 〉	통과 (7.67ms, 72.9MB)
테스트 4 〉	통과 (12.48ms, 77.5MB)
테스트 5 〉	통과 (9.67ms, 89.5MB)
테스트 6 〉	통과 (9.60ms, 78MB)
테스트 7 〉	통과 (9.85ms, 78.6MB)
테스트 8 〉	통과 (10.31ms, 66.7MB)
테스트 9 〉	통과 (10.18ms, 77.2MB)
테스트 10 〉	통과 (13.13ms, 81.8MB)
테스트 11 〉	통과 (12.52ms, 78.1MB)
테스트 12 〉	통과 (0.25ms, 71.3MB)
테스트 13 〉	통과 (8.78ms, 76.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/17677
import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 65536;
        
        List<String> str1_list = makeTwoLetter(str1);
        List<String> str2_list = makeTwoLetter(str2);

        List<String> str1_copy = new ArrayList();
        List<String> str2_copy = new ArrayList();
        str1_copy.addAll(str1_list);
        str2_copy.addAll(str2_list);

        // 교집합
        List<String> inter = new ArrayList();
        for (String s : str1_list) {
            if (str2_copy.contains(s)) {
                inter.add(s);
                str1_copy.remove(s);
                str2_copy.remove(s);
            }
        }
        // 합집합
        List<String> union = new ArrayList();
        union.addAll(inter); 
        union.addAll(str1_copy); 
        union.addAll(str2_copy); 
        
        if (union.size() != 0) {
            answer = (int) Math.floor((double) inter.size() / (double) union.size() * 65536);
        }
        return answer;
    }
    
    // 두 글자씩 리스트에 저장 
    public List<String> makeTwoLetter(String s) {
        s = s.toUpperCase();
        List<String> arr = new ArrayList();

        for (int i=0; i < s.length() -1; i++) {
            if (s.substring(i, i + 2).matches("^[A-Z]*$")) {
                arr.add(s.substring(i, i + 2));
            }
        }
        return arr;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.46ms, 65.1MB)
// 테스트 2 〉	통과 (0.96ms, 74.5MB)
// 테스트 3 〉	통과 (0.71ms, 74.2MB)
// 테스트 4 〉	통과 (11.83ms, 80.7MB)
// 테스트 5 〉	통과 (1.25ms, 73.1MB)
// 테스트 6 〉	통과 (0.54ms, 74.2MB)
// 테스트 7 〉	통과 (2.82ms, 76.7MB)
// 테스트 8 〉	통과 (0.69ms, 74MB)
// 테스트 9 〉	통과 (2.47ms, 75.8MB)
// 테스트 10 〉	통과 (5.02ms, 80.1MB)
// 테스트 11 〉	통과 (5.98ms, 81.4MB)
// 테스트 12 〉	통과 (0.42ms, 75.4MB)
// 테스트 13 〉	통과 (1.31ms, 74.9MB)
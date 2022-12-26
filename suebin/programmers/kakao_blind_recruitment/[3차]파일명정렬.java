import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        
        // Comparator 인터페이스를 활용해 조건에 맞게 정렬한다.
        
        Arrays.sort(files, new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            String[] file1 = fileInfo(s1);
            String[] file2 = fileInfo(s2);
            
            int headValue = file1[0].compareTo(file2[0]);
            
            if (headValue == 0) {
                int num1 = Integer.parseInt(file1[1]);
                int num2 = Integer.parseInt(file2[1]);
                
                return num1 - num2;
            }
            else {
                return headValue;
            }
        }
        
        // head, number, tail 정보를 담은 배열을 리턴하는 함수이다.
            
        private String[] fileInfo(String s) {
            String head = "";
            String number = "";
            String tail = "";
            
            int idx = 0;
            for ( ; idx<s.length(); idx++) {
                char ch = s.charAt(idx);
                if (ch>='0' && ch<='9') break;
                head += ch;
            }
            
            for ( ; idx<s.length(); idx++) {
                char ch = s.charAt(idx);
                if (!(ch>='0' && ch<='9')) break;
                number += ch;
            }
            
            for ( ; idx<s.length(); idx++) {
                char ch = s.charAt(idx);
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
출처 : https://velog.io/@hyeon930/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%8C%8C%EC%9D%BC%EB%AA%85-%EC%A0%95%EB%A0%AC-Java
정확성  테스트
테스트 1 〉	통과 (14.07ms, 77MB)
테스트 2 〉	통과 (10.41ms, 79.1MB)
테스트 3 〉	통과 (55.66ms, 114MB)
테스트 4 〉	통과 (59.85ms, 111MB)
테스트 5 〉	통과 (68.87ms, 120MB)
테스트 6 〉	통과 (58.57ms, 98.2MB)
테스트 7 〉	통과 (66.50ms, 101MB)
테스트 8 〉	통과 (47.07ms, 91.9MB)
테스트 9 〉	통과 (65.46ms, 92.7MB)
테스트 10 〉	통과 (74.17ms, 90MB)
테스트 11 〉	통과 (76.60ms, 100MB)
테스트 12 〉	통과 (52.55ms, 95.7MB)
테스트 13 〉	통과 (33.27ms, 97.4MB)
테스트 14 〉	통과 (35.45ms, 87.5MB)
테스트 15 〉	통과 (44.84ms, 84.8MB)
테스트 16 〉	통과 (59.93ms, 96.6MB)
테스트 17 〉	통과 (25.06ms, 83.2MB)
테스트 18 〉	통과 (36.45ms, 95.9MB)
테스트 19 〉	통과 (60.25ms, 90.8MB)
테스트 20 〉	통과 (58.96ms, 87.5MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/


/*
정규식을 이용한 풀이법

import java.util.*;
import java.util.regex.*;

class Solution {
    public String[] solution(String[] files) {
        Pattern p = Pattern.compile("([a-z\\s.-]+)([0-9]{1,5})");

        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                Matcher m1 = p.matcher(s1.toLowerCase());
                Matcher m2 = p.matcher(s2.toLowerCase());
                m1.find();
                m2.find();

                if(!m1.group(1).equals(m2.group(1))) {
                    return m1.group(1).compareTo(m2.group(1));
                } else {
                    return Integer.parseInt(m1.group(2)) - Integer.parseInt(m2.group(2));
                }
            }
        });

        return files;
    }
}
*/

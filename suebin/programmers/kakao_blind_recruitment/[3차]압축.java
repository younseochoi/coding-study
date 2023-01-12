import java.util.*;

class Solution {
    public int[] solution(String msg) {        
        List<String> dictionary = new ArrayList<>(); dictionary.add("0"); 
        List<Integer> result = new ArrayList<>();
        
        // 사전을 초기화한다.
        
        for (int i=0; i<26; i++) {
            dictionary.add(1+i, String.valueOf((char)('A'+i)));
        }
      
        int index;
        boolean lastWord = false;
        
        for (int i=0; i<msg.length(); i++) {
            String word = String.valueOf(msg.charAt(i));
            
            while(dictionary.contains(word)) {
                i++;
                if (i == msg.length()) {
                    lastWord = true;
                    break;
                }
                word += msg.charAt(i);
            }
            if (lastWord) {
                index = dictionary.indexOf(word);
                result.add(index);
                break;
            }
            
            // 해당하는 색인 번호를 출력한다.
            
            index = dictionary.indexOf(word.substring(0, word.length()-1));
            result.add(index);   
            
            // 사전에 없는 글자는 등록한다.
            
            dictionary.add(word);
            i--;
        }
        
        int[] answer = new int[result.size()];
        
        for (int i=0; i<result.size(); i++) 
            answer[i] = result.get(i);
        
        return answer;
    }
}


/*
정확성  테스트
테스트 1 〉	통과 (9.11ms, 74.8MB)
테스트 2 〉	통과 (13.00ms, 74.2MB)
테스트 3 〉	통과 (11.01ms, 79.6MB)
테스트 4 〉	통과 (11.37ms, 77.8MB)
테스트 5 〉	통과 (9.19ms, 78.7MB)
테스트 6 〉	통과 (17.27ms, 85.9MB)
테스트 7 〉	통과 (15.22ms, 84.3MB)
테스트 8 〉	통과 (12.21ms, 78.8MB)
테스트 9 〉	통과 (0.06ms, 74.5MB)
테스트 10 〉	통과 (15.67ms, 77.1MB)
테스트 11 〉	통과 (16.55ms, 78.9MB)
테스트 12 〉	통과 (18.45ms, 82.8MB)
테스트 13 〉	통과 (18.74ms, 101MB)
테스트 14 〉	통과 (13.43ms, 80MB)
테스트 15 〉	통과 (13.25ms, 79.4MB)
테스트 16 〉	통과 (12.43ms, 78.3MB)
테스트 17 〉	통과 (17.67ms, 78.5MB)
테스트 18 〉	통과 (13.56ms, 80.9MB)
테스트 19 〉	통과 (13.09ms, 81.8MB)
테스트 20 〉	통과 (14.82ms, 76.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

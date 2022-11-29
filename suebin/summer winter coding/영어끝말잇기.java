import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        // answer[0] : 번호, answer[1] : 차례
        
        int[] answer = new int[2];
        
        // 아래 3의 경우를 확인하기 위한 list
        
        List<String> wordsList = new ArrayList<String>(); 
        int index = 0;
        
        for (int i=0; i<words.length; i++) {
            
            // 1. 한 글자인 단어인지 확인한다.
            
            if(words[i].length()==1) {
                index = i;
                break;
            }
            
            // 2. 앞사람이 말한 단어의 마지막 문자로 시작하는지 확인한다.
            
            if (i>0) {
                if (!words[i-1].substring(words[i-1].length()-1).equals(words[i].substring(0, 1))) {
                    index = i;
                    break;   
                }    
            }
            
            // 3. 이전에 등장했던 단어인지 확인한다.
            
            if(wordsList.contains(words[i])) {
                index = i;
                break;   
            }
            wordsList.add(words[i]);
            
        }
               
        if (index == 0) {
            answer[0] = answer[1] = 0;
        }
        else {
            answer[0] = index%n + 1; 
            answer[1] = index/n + 1; 
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.29ms, 78.3MB)
테스트 2 〉	통과 (0.29ms, 79.4MB)
테스트 3 〉	통과 (0.18ms, 75.8MB)
테스트 4 〉	통과 (0.23ms, 75MB)
테스트 5 〉	통과 (0.35ms, 78.4MB)
테스트 6 〉	통과 (0.26ms, 82MB)
테스트 7 〉	통과 (0.19ms, 74.1MB)
테스트 8 〉	통과 (0.18ms, 72.1MB)
테스트 9 〉	통과 (0.27ms, 72.1MB)
테스트 10 〉	통과 (0.23ms, 73.5MB)
테스트 11 〉	통과 (0.23ms, 86.4MB)
테스트 12 〉	통과 (0.20ms, 77.3MB)
테스트 13 〉	통과 (0.18ms, 78.3MB)
테스트 14 〉	통과 (0.20ms, 75MB)
테스트 15 〉	통과 (0.19ms, 72.9MB)
테스트 16 〉	통과 (0.16ms, 72.5MB)
테스트 17 〉	통과 (0.27ms, 75.9MB)
테스트 18 〉	통과 (0.23ms, 73MB)
테스트 19 〉	통과 (0.18ms, 68.3MB)
테스트 20 〉	통과 (0.38ms, 71.4MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

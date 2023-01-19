import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        int[] answer = {0,0};      
        List<String> wordsList = new ArrayList<String>();       
        int index = 0;
        
        for (int i=0; i<words.length; i++) {       
            String now = words[i]; // 현재 검사하는 단어
            
            // 앞사람이 말한 단어의 마지막 문자로 시작하는지 확인한다.
            
            if (i>0) {
                String prev = words[i-1]; // 앞사람이 말한 단어
                
                if (!prev.substring(prev.length()-1).equals(now.substring(0, 1))) {
                    index = i;
                    break;   
                }  
            }
            
            // 이전에 등장했던 단어인지 확인한다.
            
            if(wordsList.contains(now)) {
                index = i;
                break;   
            }
            wordsList.add(now); 
        }
               
        if (index != 0) {
            answer[0] = index%n + 1; 
            answer[1] = index/n + 1; 
        }

        return answer;
    }
}


/*
테스트 1 〉	통과 (0.06ms, 74MB)
테스트 2 〉	통과 (0.07ms, 76.2MB)
테스트 3 〉	통과 (0.03ms, 81.1MB)
테스트 4 〉	통과 (0.05ms, 75.3MB)
테스트 5 〉	통과 (0.10ms, 72.4MB)
테스트 6 〉	통과 (0.04ms, 76.3MB)
테스트 7 〉	통과 (0.07ms, 79.2MB)
테스트 8 〉	통과 (0.03ms, 75.1MB)
테스트 9 〉	통과 (0.06ms, 71.4MB)
테스트 10 〉	통과 (0.10ms, 74.1MB)
테스트 11 〉	통과 (0.08ms, 76.6MB)
테스트 12 〉	통과 (0.08ms, 79.9MB)
테스트 13 〉	통과 (0.03ms, 70.4MB)
테스트 14 〉	통과 (0.03ms, 67.9MB)
테스트 15 〉	통과 (0.03ms, 83.7MB)
테스트 16 〉	통과 (0.03ms, 79.7MB)
테스트 17 〉	통과 (0.03ms, 72.1MB)
테스트 18 〉	통과 (0.04ms, 77.2MB)
테스트 19 〉	통과 (0.03ms, 76.7MB)
테스트 20 〉	통과 (0.23ms, 77.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

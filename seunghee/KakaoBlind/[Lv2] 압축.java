//혼자 해결하지 못해서 '다른 사람의 풀이'에서 가져왔습니다 ㅠㅠ

import java.util.*;
 
class Solution {
    HashMap<String, Integer> dict = new HashMap<>();
    public int[] solution(String msg) {
        int[] answer;
        ArrayList<Integer> ans = new ArrayList<>();        
        
        int dictIdx = 1;
        for(int i='A'; i<='Z'; i++){
            dict.put( String.valueOf((char)i), dictIdx++) ;
        }
       
        int idx = 0;
        while(idx < msg.length()){
            String w = "";
            while(idx < msg.length()){
                if(!dict.containsKey(w+msg.charAt(idx))){
                    break;
                }else{
                    w += msg.charAt(idx);
                }
                idx++;
            }
            
            ans.add(dict.get(w));
            if(idx < msg.length()){
                dict.put(w+msg.charAt(idx), dictIdx++);
            }            
        }
        
        answer = new int[ans.size()];
        for(int i =0; i<ans.size(); i++){
            answer[i] = ans.get(i);
        }
           
        return answer;
    }
}

/*
정확성  테스트
테스트 1 〉	통과 (22.06ms, 69MB)
테스트 2 〉	통과 (20.72ms, 79.7MB)
테스트 3 〉	통과 (20.15ms, 74MB)
테스트 4 〉	통과 (24.86ms, 82.9MB)
테스트 5 〉	통과 (13.07ms, 84.1MB)
테스트 6 〉	통과 (15.08ms, 75.6MB)
테스트 7 〉	통과 (12.67ms, 83.9MB)
테스트 8 〉	통과 (12.96ms, 79.6MB)
테스트 9 〉	통과 (0.07ms, 77.2MB)
테스트 10 〉	통과 (14.27ms, 86.6MB)
테스트 11 〉	통과 (18.52ms, 78.2MB)
테스트 12 〉	통과 (16.83ms, 79.5MB)
테스트 13 〉	통과 (52.06ms, 93.1MB)
테스트 14 〉	통과 (45.74ms, 95.5MB)
테스트 15 〉	통과 (122.97ms, 102MB)
테스트 16 〉	통과 (33.11ms, 108MB)
테스트 17 〉	통과 (14.64ms, 74.2MB)
테스트 18 〉	통과 (10.02ms, 81.1MB)
테스트 19 〉	통과 (15.00ms, 85.4MB)
테스트 20 〉	통과 (31.60ms, 83.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
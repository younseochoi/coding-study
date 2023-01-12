import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 정렬
        
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 두 배열이 달라지는 순간을 구한다.
        
        int i = 0;
        for(i=0;i<completion.length;i++)
            if(!participant[i].equals(completion[i]))
                break;


        // 완주하지 못한 마지막 주자
        
        answer = participant[i];
        
        return answer;
    }
}

import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        String answer = "";
        
        for (int i=0;i<completion.length;i++)
        {
            //System.out.println(completion[i]+' '+participant[i]);
            if (participant[i].equals(completion[i])){
                if(i==completion.length-1)
                    answer=participant[i+1];
                continue;
            }
            answer=participant[i];
            break;
        }
        return answer;
    }
}
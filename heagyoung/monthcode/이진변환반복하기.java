import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int [2];
        int delzero=0;
        int turn=0;
        String no_ze="";
        int len=-1;
        
        while(true){
            if(s.equals("1"))
                break;
            no_ze=s.replaceAll("0","");
            turn++;
            delzero+=s.length()-no_ze.length();
            
            len=no_ze.length();
            //System.out.println(no_ze+" "+len);
            s="";
            while(true){                
                if(len%2!=0)
                    s="1"+s;
                else
                    s="0"+s;
                len/=2;
                if(len==0)
                    break;
            }
        }
        answer[0]=turn;
        answer[1]=delzero;
        return answer;
    }
}
import java.util.*;
class Solution {
    public String tentotwo(long num) {
        String answer = "";
    
        while(true){
            if(num==0)
                break;
            if(num%2==0)
                answer="0"+answer;
            else
                answer="1"+answer;
            num/=2;
        }
        return answer;
    }
    public String change(int type, String num, int where) {
        StringBuffer n = new StringBuffer(num);
        if (type==0){
            n.delete(where,where+1);
            n.insert(where,"1");
        }
        else if (type==1){
            n.delete(where,where+1);
            n.insert(where,"0");
        }
        return n.toString();
    }
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int where_l=-1,where_f=-1;
        for(int i=0; i<numbers.length;i++){
            if (numbers[i]%2==0){
                answer[i]=numbers[i]+1;
                continue;
            } 
            //짝수의 경우 2진수변환시 가장 마지막자리수가 0이므로 1로 바꿔주면 기존값보다 크되, 가장작은값
            //홀수의 경우 2진수변환시 가장 오른쪽에 있는 0->1, 그 이후에 있는 1->0 이 가장 베스트
            //0을 포함하고 있지 않다면 제일 왼쪽의 1을 지우고 10추가
            //그 이후에 0을 가지고있지않다면 넘어감
            String tentwo = tentotwo(numbers[i]);
            //System.out.print(tentwo+" ");
            
            where_l=tentwo.lastIndexOf("0");
            
            if(-1!=where_l){
                where_f=(tentwo.substring(where_l+1)).indexOf("1");
                tentwo=change(0,tentwo,where_l);
                
                //System.out.println(tentwo.substring(where_l)+", "+where_l+", "+where_f);
                if(-1!=where_f)
                    tentwo=change(1,tentwo,where_l+where_f+1);                
            }
            else
                tentwo="10"+tentwo.substring(1);
            
            answer[i]=Long.valueOf(tentwo,2);
            //System.out.print(answer[i]);
        }
        return answer;
    }
}
//이것도 중간중간 구멍으로 있는 A에서는 구현되지않는 짭코드입니다
//다음에는 좀 더 기초를 쌓아서 해보겠습니다.

import java.util.*;
class Solution {
    public int solution(String name) {
        int answer = 0;
        int first=name.indexOf("A");
        char[] na = name.toCharArray();
        int turn=10;
        
        if(first==1){
            int skip_start=1; //두번째가 A이고 연속되게 있어서 스킵할 수 있는 갯수
            for(int i=2;i<na.length;i++){
                if((int)na[i]==65)
                    skip_start+=1;
                else
                    break;
            }
            
            if((int)na[0]<79)
                answer+=(int)na[0]-65;
            else
                answer+=91-(int)na[0];
            
            for(int b=name.length()-skip_start;b>1;b--){
                answer+=1;
                if((int)na[b]<79)
                    answer+=(int)na[b]-65;
                else
                    answer+=91-(int)na[b];
            }
        }
        else {
            int skip_end=0; //끝에가 A이고 연속되게 있어서 스킵할 수 있는 갯수
            for(int i=na.length-1;i>-1;i--){
                if((int)na[i]==65)
                    skip_end+=1;
                else
                    break;
            }
            for (int a=0;a<na.length-skip_end;a++){
                if((int)na[a]<79)
                    answer+=(int)na[a]-65;
                else
                    answer+=91-(int)na[a];
                if (a!=na.length-1-skip_end) //마지막이 아니라면 이동커서 추가
                    answer+=1;
            }
        }
        return answer;
    }
}
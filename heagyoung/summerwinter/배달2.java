import java.util.*;
class Solution {
    int []time = new int [50];
    public void check(int num, int[][] list, int way_, String visit_) {
        
        for(int i=0;i<list.length;i++){
            if(num==list[i][0]&&!visit_.contains(list[i][1]+"")){
                String visit = visit_;
                int way=way_;
                if(time[list[i][1]-1]==0)
                    time[list[i][1]-1]= way+list[i][2];
                else
                    time[list[i][1]-1]= way+list[i][2]<time[list[i][1]-1]? way+list[i][2]:time[list[i][1]-1];
                way=time[list[i][1]-1];
                visit=visit+" "+list[i][1];

                //System.out.println("1번상황 "+list[i][0]+"에서"+list[i][1]+"으로 소요시간"+way);
                check(list[i][1],list,way,visit);
            }
            if(num==list[i][1]&&!visit_.contains(list[i][0]+"")){
                String visit = visit_;
                int way=way_;
                if(time[list[i][0]-1]==0)
                    time[list[i][0]-1]= way+list[i][2];
                else
                    time[list[i][0]-1]= way+list[i][2]<time[list[i][0]-1]? way+list[i][2]:time[list[i][0]-1];
                way=time[list[i][0]-1];
                
                visit=visit+" "+list[i][0];
                
                //System.out.println("2번상황 "+list[i][1]+"에서"+list[i][0]+"으로 소요시간"+way);
                check(list[i][0],list,way,visit);
            }
        }
    }
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        String visit="1";
        time[0]=1;
        
        check(1,road,0,visit);
        if(K==0)
            return 1;
        for(int t: time){
            if (t<=K&&t!=0)
                answer++;
            //System.out.print(t+" ");
        }
        return answer;
    }
}

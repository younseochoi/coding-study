
//무한의 경로에서 멈 스텍오버플로우
import java.util.*;
class Solution {
    int time[] = new int [50];
    public int check(int num, int[][] other, int way){

        for(int i=0;i<other.length;i++){
            if(other[i][0]==num){ // 도로가 내가 원하는 곳이랑 연결되어있는지 체크
                if(other[i][1]==1)
                    return 0;
                if(i!=0&&time[num-1]!=0){ //한번 최단길이를 체크했던 길이면
                    way=way<time[num-1]?way:time[num-1]; // 최단길이랑 이번에 새로 가는 길 중 더 짧은 거리의 길이를 way로 변경
                    way+=other[i][2]; //거기까지 가는 거리 또 추가
                    check(other[i][0],other,way);
                }
                else { //처음 가보는 길이다
                    time[other[i][1]-1]=way+other[i][2];
                    check(other[i][0],other,way);
                }
            }else if(other[i][1]==num){
                if(i!=0&&time[num-1]!=0){ //한번 최단길이를 체크했던 길이면
                    if(other[i][0]==1)
                        return 0;
                    way=way<time[num-1]?way:time[num-1]; // 최단길이랑 이번에 새로 가는 길 중 더 짧은 거리의 길이를 way로 변경
                    way+=other[i][2]; //거기까지 가는 거리 또 추가
                    check(other[i][1],other,way);
                }
                else { //처음 가보는 길이다
                    time[other[i][0]-1]=way+other[i][2];
                    check(other[i][1],other,way);
                }
            }
            
        }
        return 0;
        
    }
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        Arrays.sort(road, (o1, o2) -> {return o1[0]-o2[0];});
        
        check(1, road, 0);
        
        for(int t=0;t<N;t++){
            System.out.print(time[t]+" ");
        }
        
        for(int t=0;t<N;t++){
            if(time[t]<=K)
                answer++;
        }
        //System.out.println("Hello Java");

        return answer;
    }
}
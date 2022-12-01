/* 생각이 안나서 무식하게 했습니다
*/
import java.util.*;
class Solution {
    List <String> road = new ArrayList<>();
    public int check(int x1, int x2,int y1,int y2) {
        String move=x1+" "+x2+" "+y1+" "+y2;
        if(!road.contains(move)){
            road.add(move);
            return 1;
        }
        //System.out.println(move+" "+road);
        return 0;
    }
    public int solution(String dirs) {
        int answer = 0;
        String move="RLUD";
        
        
        /*for(int a=0;a<11;a++){
            for(int b=0;b<11;b++){
                pan[a][b]=0;
            }
        }*/
        int x=5,y=5;
             
        for(int i = 0; i<dirs.length();i++){
            //System.out.println(road);
            if(dirs.charAt(i)==move.charAt(0)){
                if(x+1<=10){
                    answer+=check(x,x+1,y,y);
                    x++;
                }
            }
            else if(dirs.charAt(i)==move.charAt(1)){
                if(x-1>=0){
                    answer+=check(x-1,x,y,y);
                    x--;
                }
            }
            else if(dirs.charAt(i)==move.charAt(2)){
                if(y+1<=10){
                    answer+=check(x,x,y,y+1);
                    y++;
                }
            }
            else if(dirs.charAt(i)==move.charAt(3)){
                if(y-1>=0){
                    answer+=check(x,x,y-1,y);
                    y--;
                }
            }
        }
        return answer;
    }
}
/*
 * 정확성  테스트
테스트 1 〉	통과 (14.63ms, 76.5MB)
테스트 2 〉	통과 (14.99ms, 75.5MB)
테스트 3 〉	통과 (15.46ms, 72.4MB)
테스트 4 〉	통과 (13.31ms, 85.6MB)
테스트 5 〉	통과 (15.49ms, 81.4MB)
테스트 6 〉	통과 (12.37ms, 67.7MB)
테스트 7 〉	통과 (11.89ms, 74.9MB)
테스트 8 〉	통과 (15.22ms, 80.2MB)
테스트 9 〉	통과 (13.68ms, 73.6MB)
테스트 10 〉	통과 (12.92ms, 91.2MB)
테스트 11 〉	통과 (11.52ms, 83MB)
테스트 12 〉	통과 (12.47ms, 78.1MB)
테스트 13 〉	통과 (15.98ms, 70.4MB)
테스트 14 〉	통과 (14.76ms, 76.8MB)
테스트 15 〉	통과 (16.02ms, 77.6MB)
테스트 16 〉	통과 (12.97ms, 82.3MB)
테스트 17 〉	통과 (17.84ms, 81MB)
테스트 18 〉	통과 (13.58ms, 82.3MB)
테스트 19 〉	통과 (14.03ms, 93.5MB)
테스트 20 〉	통과 (13.99ms, 78.5MB)
 */
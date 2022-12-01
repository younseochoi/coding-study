import java.util.*;
import java.awt.*;
class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int start=1, end=stations[0]-w-1;
        Queue <Point> blank = new LinkedList<Point>(); //빛이 안들어오는곳 시작 끝
        for(int a=0;a<stations.length;a++){
            if(stations.length==1){
                blank.add(new Point(1,stations[0]-w-1));
                blank.add(new Point(stations[0]+w+1,n));
                break;
            }
            if (a==0){
                start=1;
                end=stations[a]-w-1;
            }              
            else{
                start=stations[a-1]+w+1;
                end=stations[a]-w-1;
            }
            blank.add(new Point(start,end));
            if(a==stations.length-1){
                start=stations[a]+w+1;
                end=n;
                blank.add(new Point(start,end));
                break;
            }  
            
        }
        Point check;
        while(blank.size()!=0){
            check=blank.poll();
            //System.out.println(check.x+" "+check.y);
            if(check.x>check.y)
                continue;
            if((check.y-check.x+1)%(w*2+1)==0)
                answer+=(check.y-check.x+1)/(w*2+1);
            else
                answer+=(check.y-check.x+1)/(w*2+1)+1;
            
            //System.out.println((check.y-check.x+1)/(w*2+1)+1);
            
        }
        
        //System.out.println("Hello Java");

        return answer;
    }
}
/*
 * 정확성  테스트
테스트 1 〉	통과 (0.31ms, 66.9MB)
테스트 2 〉	통과 (0.74ms, 79.1MB)
테스트 3 〉	통과 (0.94ms, 73.2MB)
테스트 4 〉	통과 (0.42ms, 77MB)
테스트 5 〉	통과 (0.38ms, 65.3MB)
테스트 6 〉	통과 (0.32ms, 73.8MB)
테스트 7 〉	통과 (1.71ms, 75.9MB)
테스트 8 〉	통과 (0.46ms, 71.2MB)
테스트 9 〉	통과 (0.39ms, 76.8MB)
테스트 10 〉	통과 (0.30ms, 73.7MB)
테스트 11 〉	통과 (0.42ms, 75.6MB)
테스트 12 〉	통과 (0.31ms, 75.7MB)
테스트 13 〉	통과 (0.31ms, 78.6MB)
테스트 14 〉	통과 (0.37ms, 76.6MB)
테스트 15 〉	통과 (0.28ms, 79.5MB)
테스트 16 〉	통과 (0.37ms, 83.6MB)
테스트 17 〉	통과 (0.29ms, 71.5MB)
테스트 18 〉	통과 (0.28ms, 73.1MB)
테스트 19 〉	통과 (0.31ms, 75.5MB)
테스트 20 〉	통과 (0.27ms, 81.4MB)
테스트 21 〉	통과 (0.29ms, 73.8MB)
효율성  테스트
테스트 1 〉	실패 (시간 초과)
테스트 2 〉	실패 (시간 초과)
테스트 3 〉	실패 (시간 초과)
테스트 4 〉	실패 (시간 초과)
채점 결과
정확성: 70.5
효율성: 0.0
합계: 70.5 / 100.0
 */
import java.util.*;
import java.awt.*;
class Solution {
    public int check (int start, int end, int w){
        if(start>end)
            return 0;
        if ((end-start+1)%(w*2+1)==0)
            return (end-start+1)/(w*2+1);
        else
            return (end-start+1)/(w*2+1)+1;
    }
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int start, end;
        
        for(int b=0;b<stations.length;b++){
            if (b==0){
                answer+=check(1,stations[b]-w-1,w);
            }              
            else{
                answer+=check(stations[b-1]+w+1,stations[b]-w-1,w);
            }
            //System.out.println(answer);
            if(b==stations.length-1){
                answer+=check(stations[b]+w+1,n,w);
                break;
            }
            
        }
       
        return answer;
    }
}
/*정확성  테스트
테스트 1 〉	통과 (0.02ms, 75.2MB)
테스트 2 〉	통과 (0.02ms, 74.3MB)
테스트 3 〉	통과 (0.03ms, 80.4MB)
테스트 4 〉	통과 (0.02ms, 88.9MB)
테스트 5 〉	통과 (0.02ms, 77.9MB)
테스트 6 〉	통과 (0.02ms, 77.8MB)
테스트 7 〉	통과 (0.03ms, 68.9MB)
테스트 8 〉	통과 (0.03ms, 72.4MB)
테스트 9 〉	통과 (0.02ms, 72.9MB)
테스트 10 〉	통과 (0.03ms, 78.3MB)
테스트 11 〉	통과 (0.01ms, 76.7MB)
테스트 12 〉	통과 (0.02ms, 74.4MB)
테스트 13 〉	통과 (0.02ms, 78.4MB)
테스트 14 〉	통과 (0.02ms, 77.2MB)
테스트 15 〉	통과 (0.01ms, 75.4MB)
테스트 16 〉	통과 (0.01ms, 70MB)
테스트 17 〉	통과 (0.02ms, 74.2MB)
테스트 18 〉	통과 (0.02ms, 76.6MB)
테스트 19 〉	통과 (0.02ms, 80.6MB)
테스트 20 〉	통과 (0.03ms, 77.3MB)
테스트 21 〉	통과 (0.02ms, 72.9MB)
효율성  테스트
테스트 1 〉	통과 (0.94ms, 52.4MB)
테스트 2 〉	통과 (2.02ms, 53MB)
테스트 3 〉	통과 (1.14ms, 52.6MB)
테스트 4 〉	통과 (1.09ms, 68MB)
채점 결과
정확성: 70.5
효율성: 29.5
합계: 100.0 / 100.04 */
//사각형이 완전하지 않은것은 중간을 지나기때문이어서
//중간을 지나는 즉 x=1일때 지난 y값을 내림하고 
//x=2일때 지난 y값을 올림해서 이 사이에 있는 사각형이 사용불가능하므로 제외
//근데 숫자가 커서 에러 ㅜㅜ
import java.util.*;
class Solution {
    public long solution(int w, int h) {
        long answer = w*h;
        double gi = (double)h/(double)w;
        int x=1;
        
        int by=0, ay=0;

        while(true){
            if (x==w+1){
                break;
            }
            by=(int) Math.floor(gi*(x-1));
            ay=(int) Math.ceil(gi*x);
            
            answer-=(ay-by);
            
            //System.out.println("x값:"+x+", 이전, 이후 y: "+by+", "+Math.ceil(gi*x));
            x++;
        }
            
            
        
        return answer;
    }
}
/*
 * 정확성  테스트
테스트 1 〉	통과 (0.79ms, 73.8MB)
테스트 2 〉	통과 (1.77ms, 75MB)
테스트 3 〉	통과 (0.95ms, 78.6MB)
테스트 4 〉	통과 (1.38ms, 74.5MB)
테스트 5 〉	통과 (1.68ms, 77.6MB)
테스트 6 〉	실패 (5.00ms, 62.9MB)
테스트 7 〉	통과 (2.67ms, 71.9MB)
테스트 8 〉	통과 (0.27ms, 73.7MB)
테스트 9 〉	통과 (0.27ms, 72MB)
테스트 10 〉	통과 (0.45ms, 76.3MB)
테스트 11 〉	통과 (550.61ms, 77.4MB)
테스트 12 〉	실패 (551.51ms, 82.7MB)
테스트 13 〉	실패 (65.81ms, 76.6MB)
테스트 14 〉	실패 (256.92ms, 88.3MB)
테스트 15 〉	실패 (67.27ms, 85.4MB)
테스트 16 〉	실패 (5.40ms, 73.4MB)
테스트 17 〉	실패 (49.73ms, 82.7MB)
테스트 18 〉	통과 (0.34ms, 74.8MB)
채점 결과
정확성: 61.1
합계: 61.1 / 100.0
 */
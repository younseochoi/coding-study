// 테케 6번빼고 다 했었는데 찾아보니
// 나눗셈이 정확하지 않아서 마지막에 나누기를 하는 것으로 코드를 고쳤더니 돌아갑니다

import java.util.*;
import java.math.*;
class Solution {
    public BigInteger solution(int w, int h) {
        int x=1;
        
        long by=0, ay=0;
        long no_sq_1=0;
        long no_sq_2=0;
        
        while(true){
            if (x==w+1){
                break;
            }
            by=(long) Math.floor((double)h*(x-1)/(double)w);
            ay=(long) Math.ceil((double)h*x/(double)w);
            
            if(x<w/2)
                no_sq_1+=(ay-by);
            else
                no_sq_2+=(ay-by);
            
            //System.out.println("x값:"+x+", 이전, 이후 y: "+by+", "+Math.ceil(gi*x));
            x++;
        }
            
        BigInteger w_= new BigInteger(w+"");
        BigInteger h_= new BigInteger(h+"");
        BigInteger no_s1= new BigInteger(no_sq_1+"");
        BigInteger no_s2= new BigInteger(no_sq_2+"");
        BigInteger wh= w_.multiply(h_);
        BigInteger answer_ = wh.subtract(no_s1);
        BigInteger answer = answer_.subtract(no_s2);
        
        return answer;
    }
}

// import java.util.*;
// import java.math.*;
// class Solution {
//     public BigInteger solution(int w, int h) {
//         double gi = (double)h/(double)w;
//         int x=1;
        
//         long by=0, ay=0;
//         long no_sq=0;
//         while(true){
//             if (x==w+1){
//                 break;
//             }
//             by=(long) Math.floor(gi*(x-1));
//             ay=(long) Math.ceil(gi*x);
            
//             no_sq+=(ay-by);
            
//             //System.out.println("x값:"+x+", 이전, 이후 y: "+by+", "+Math.ceil(gi*x));
//             x++;
//         }
            
//         BigInteger w_= new BigInteger(w+"");
//         BigInteger h_= new BigInteger(h+"");
//         BigInteger no_s= new BigInteger(no_sq+"");
//         BigInteger wh= w_.multiply(h_);
//         BigInteger answer = wh.subtract(no_s);
        
//         return answer;
//     }
// }
/*
 * 채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (12.19ms, 81.7MB)
테스트 2 〉	통과 (11.14ms, 76.3MB)
테스트 3 〉	통과 (11.04ms, 77.4MB)
테스트 4 〉	통과 (13.91ms, 77.6MB)
테스트 5 〉	통과 (12.65ms, 80.2MB)
테스트 6 〉	실패 (10.00ms, 82.8MB)
테스트 7 〉	통과 (9.72ms, 82.9MB)
테스트 8 〉	통과 (9.76ms, 77.5MB)
테스트 9 〉	통과 (8.67ms, 75.3MB)
테스트 10 〉	통과 (8.69ms, 75MB)
테스트 11 〉	통과 (487.92ms, 78.4MB)
테스트 12 〉	통과 (488.76ms, 76.7MB)
테스트 13 〉	통과 (60.68ms, 86.5MB)
테스트 14 〉	통과 (266.49ms, 94.8MB)
테스트 15 〉	통과 (79.38ms, 92.9MB)
테스트 16 〉	통과 (13.76ms, 80.1MB)
테스트 17 〉	통과 (49.89ms, 89.7MB)
테스트 18 〉	통과 (8.69ms, 81.8MB)
채점 결과
정확성: 94.4
합계: 94.4 / 100.0
 */
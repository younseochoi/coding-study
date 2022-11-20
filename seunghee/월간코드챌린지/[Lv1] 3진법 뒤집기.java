import java.util.*;

class Solution {
   public int solution(int n) {
       int answer = 0;
       String num="";
       
       // num = (n%3) + num 은 3진법 저장, 밑에는 뒤집어 저장
       while(n>0){
           num+=n%3;
           n=n/3; 
       }
       //10진법으로 바꾸기
       answer=Integer.parseInt(num, 3);
      
       return answer;
   }
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (9.22ms, 79.8MB)
테스트 2 〉	통과 (12.95ms, 79.6MB)
테스트 3 〉	통과 (8.58ms, 70.7MB)
테스트 4 〉	통과 (13.90ms, 78.7MB)
테스트 5 〉	통과 (13.31ms, 78.1MB)
테스트 6 〉	통과 (11.47ms, 72.7MB)
테스트 7 〉	통과 (11.65ms, 84.5MB)
테스트 8 〉	통과 (11.74ms, 73.9MB)
테스트 9 〉	통과 (12.15ms, 77.5MB)
테스트 10 〉	통과 (13.08ms, 83.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
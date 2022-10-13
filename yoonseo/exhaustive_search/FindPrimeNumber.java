package exhaustive_search;

import java.util.ArrayList;

//소수찾기
public class FindPrimeNumber {

    static ArrayList<Integer> n_list = new ArrayList<>();
    static boolean[] visited = new boolean[7];
    
   public int solution(String numbers) {
       n_list.clear();
       int answer = 0;
       String str="";
       //2. 분리한 글자끼리의 모든 경우의 수 조합한 숫자 만들기
       for(int i=0;i<numbers.length();i++) {
           rec(numbers,str,i+1);
       }
       for(int i : n_list) {
           int flag=0;
           if(i==1||i==0) continue;
           for(int j=2;j*j<=i;j++) {
               if(i%j==0) { //소수아님 
                   flag=1;
                   break;
               }
           }
           if(flag==0) {
               answer++;
           }
       }

       //3. 조합한 숫자 중 소수찾아 카운트 증가
       return answer;
   }

   
   // 3. 1~n자리의 정수를 조합하기 위한 재귀 메소드
   public static void rec(String n,String temp,int len){
       // 11. 종료조건은 현재 만들고 있는 자릿수 == temp에 붙인 숫자의 길이 인경우. 
       if(temp.length() == len) {
           // 12. ArrayList에 이미 존재하는 값인지를 확인해 중복값 삽입을 방지.
           if(!n_list.contains(Integer.parseInt(temp)))n_list.add(Integer.parseInt(temp));              
           return;
       }
       
       // 4. n으로 전달 된 numbers를 탐색.
       for(int j =0;j<n.length();j++){
           // 5. 이미 방문한 인덱스면 패스.
           if(visited[j]) continue;
           // 6. 임시 변수 temp에 붙여나가며 숫자를 조합.
           temp += n.charAt(j);
           // 7. temp에 붙였기 때문에 방문처리.
           visited[j] = true;
           // 8. 재귀, 앞서 붙인 temp변수와 현재 몇 자리의 수를 만드는지에 대한 정보인 len 변수를 전달.
           rec(n,temp,len);
           // 9. 조합이 완료되면 직전의 방문처리한 인덱스를 false로 변경.
           visited[j] = false;
           // 10. temp 변수에서 마지막 자리의 숫자를 제외하고 갱신.
           temp = temp.substring(0,temp.length()-1);

       }                      
   }
    
	
}

//테스트 1 〉	통과 (9.38ms, 76.9MB)
//테스트 2 〉	통과 (20.74ms, 74.5MB)
//테스트 3 〉	통과 (10.49ms, 79.5MB)
//테스트 4 〉	통과 (19.53ms, 88.5MB)
//테스트 5 〉	통과 (23.11ms, 86.8MB)
//테스트 6 〉	통과 (11.41ms, 75.6MB)
//테스트 7 〉	통과 (14.36ms, 81.3MB)
//테스트 8 〉	통과 (25.04ms, 89.2MB)
//테스트 9 〉	통과 (14.25ms, 78.7MB)
//테스트 10 〉	통과 (31.29ms, 78.7MB)
//테스트 11 〉	통과 (13.16ms, 72.6MB)
//테스트 12 〉	통과 (14.40ms, 74.5MB)


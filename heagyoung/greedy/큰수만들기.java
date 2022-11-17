/*사실 이 코드는 있는 숫자들을 내림차순으로 정렬해서
그 배열의 i번째 숫자보다 작은 수의 갯수가 지울 수 있는 숫자의 개수보다 작으면
지우고 i++ 
작지 않다면 그냥 i++을 해서
지운 숫자의 개수가 k에 도달하면 종료되는 코드를 짜고싶었습니다
그러나 역량부족으로 실패했습니다
*/
import java.util.*;
class Solution {
    public String solution(String number, int k) {
//         String answer = number;
//         String []num = number.split("");
//         Arrays.sort(num);
//         String str = "";      
//         for(int i=number.length()-1;i>-1;i--){
//             str+=num[i]; 
//         } //숫자 정렬 내림차순
        
//         int del_num=0;
//         int fix_num=-1;
//         //제일 큰 수가 안된다면 그 다음으로 큰 수 가 제일 앞에 와야함
//         for(int i=0;i<str.length()-1;i++){
            
//             if(answer.indexOf(str.charAt(i))<=k-del_num&&fix_num==-1){ //지울수있는숫자가 i번째로 큰 수의 위치보다 작아서 다 지우면 되는 경우
                
//                 //큰숫자가 없어서 처음으로 지정하는경우
//                 del_num+=answer.indexOf(str.charAt(i));
//                 answer=answer.substring(answer.indexOf(str.charAt(i)));
//                 fix_num=0;
//                 System.out.print("0 ");
//                 System.out.println(answer);
//             }
//             else if(answer.indexOf(str.charAt(i))-(fix_num+1)<=k-del_num) {//큰숫자가 있어서 고정해놓은 경우에 앞에를 지우는것
//                 del_num+=answer.indexOf(str.charAt(i))-fix_num-1;
//                 answer=answer.substring(0,fix_num+1)+answer.substring(answer.indexOf(str.charAt(i)));
//                 fix_num++;
//                 System.out.print("1 ");
//                 System.out.println(answer);
//             }
//             else{ //큰숫자의 위치가 고정배열위치를 제외하고 지울수있는 숫자보다 작아서 앞에를 못 지우는 경우
//                 System.out.print("2 ");
//                 System.out.println(answer);
//             }
//             if(k==del_num)
//                 break;
//         }
        
        String answer = number;
        //List<Integer> answer_ = new ArrayList<>();
        List<Integer> bignum = new ArrayList<>();
        for(int i=0;i<number.length();i++){
            bignum.add(number.charAt(i));
        }
        bignum.sort(Comparator.reverseOrder());
        
        int removenum=0;
        int canremove=0;
        for(int j=0;j<k;j++){
            if(j==0){
                answer.indexOf(num.get(0))
            }
            else{
                if(answer.charAt(j)-answer.charAt(j-1)<k-removenum){
                
                }
            }
                
        }
        
        
        return answer;
    }
}
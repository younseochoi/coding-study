import java.util.*;
// 
class Solution {
    public int check(String a) {
        String []word = a.split("");
        String up = "[{(";
        String down = ")}]";
        Stack<String> stack = new Stack<>();
        
        for(int i=0;i<a.length();i++){
            //System.out.println(stack);
            if(up.contains(word[i])){
                stack.push(word[i]);
                continue;
            }
            if(stack.size()==0)
                return -1;
            
            if(word[i].equals(")")){
                if(!stack.peek().equals("("))
                    break;
                else
                    stack.pop();
            }
            else if(word[i].equals("]")){
                if(!stack.peek().equals("["))
                    break;
                else
                    stack.pop();
            }
            else if(word[i].equals("}")){
                if(!stack.peek().equals("{"))
                    break;
                else
                    stack.pop();
            }
        }
        if(stack.size()!=0)
            return -1;
        return 0;
    } 
    //문자열이 완전한지 아닌지 스택으로 체크 
    //스택이 비지않는다면 중간에 멈춘것이므로 완전하지 않음 -1
    public int solution(String s) {
        int answer = s.length();
        for(int i=0;i<s.length();i++){
            answer+=check(s);
            s=s.substring(1)+s.charAt(0);
        }   
        // 문자들을 돌리면서 확인
        return answer;
    }
}
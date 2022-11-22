import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int len=(int)(right-left);
        int[] answer = new int [len+1];
        
        int a=-1, b=-1, how=-1, where=-1;
        long nn=n;
        for(long i=left;i<right+1;i++){
            a=(int)(i/nn); b=(int)(i%nn);
            how = a<b ? b+1 : a+1;
            where=(int)(i-left);
            //System.out.println(a+", "+b+", "+how);
            answer[where] = how;
        }
        return answer;
    }
}
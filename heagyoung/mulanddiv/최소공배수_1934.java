import java.util.*;
import java.io.*;

public class 최소공배수_1934 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int small=45001, big=0, num1,num2;
        int N = Integer.parseInt(br.readLine());
        for(int a=0;a<N;a++){
            st = new StringTokenizer(br.readLine());
            
            num1=Integer.parseInt(st.nextToken());
            num2=Integer.parseInt(st.nextToken());
            small=num1<num2 ? num1:num2;
            big=num1>=num2 ? num1:num2;
            for(int b=small;b>0;b--){
                if(small%b==0 && big%b==0){
                    System.out.println(small*big/b);
                    break;
                }
                else if(b==1)
                    System.out.println(small*big);

            }
        }
    }
    
}

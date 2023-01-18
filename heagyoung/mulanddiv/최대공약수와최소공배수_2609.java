import java.util.*;
import java.io.*;

public class 최대공약수와최소공배수_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
            
        int num1=Integer.parseInt(st.nextToken());
        int num2=Integer.parseInt(st.nextToken());
        int small = num1<num2 ? num1 : num2;
        int big = num1>=num2 ? num1 : num2;
        for(int a=small;a>0;a--){
            if(big%a==0 && small%a==0){
                System.out.println(a);
                break;
            }
        }
        for(int b=small;b<=big*small;b++){
            if(b%big==0 && b%small==0){
                System.out.println(b);
                break;
            }
        }
    }
}

import java.util.*;
import java.io.*;
public class 배수와약수_5086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num1, num2;
        while(true){
            st = new StringTokenizer(br.readLine());
            
            num1=Integer.parseInt(st.nextToken());
            num2=Integer.parseInt(st.nextToken());
            if(num1==0&&num2==0)
                break;
            else if(num2%num1==0)
                System.out.println("factor");
            else if(num1%num2==0)
                System.out.println("multiple");
            else 
                System.out.println("neither");
        }
    }
}
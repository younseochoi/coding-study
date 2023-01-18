import java.util.*;
import java.io.*;

public class 이항계수1_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int []num = new int[2];
        int answer=1;
        st = new StringTokenizer(br.readLine());

        for(int a=0;a<2;a++){
            num[a]=Integer.parseInt(st.nextToken());
        }
        num[1] = num[0]-num[1]<num[1] ? num[1]:num[0]-num[1];
        
        for(int b=num[1]+1;b<num[0]+1;b++){
            answer*=b;
        }
        for(int c=1;c<num[0]-num[1]+1;c++){
            answer/=c;
        }
        System.out.print(answer);
    }
}

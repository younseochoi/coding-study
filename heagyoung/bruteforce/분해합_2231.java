import java.io.*;
import java.util.*;

public class 분해합_2231{
    static final int MAX = 40000;
        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        for(int i=0;i<N;i++){
            if (i+(int)i/1000000+(int)(i%1000000)/100000+(int)(i%100000)/10000+(int)(i%10000)/1000+(int)(i%1000)/100+(int)(i%100)/10+i%10==N){
                System.out.print(i);
                break;
            }
            if(i==N-1)
                System.out.print(0);
        }

    }

}
import java.util.*;
import java.io.*;

public class 링_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); 
        int []num =new int[N];
        int []ber = new int[2];
        st = new StringTokenizer(br.readLine());

        for(int a=0;a<N;a++){
            num[a]=Integer.parseInt(st.nextToken());
        }
        
        for(int b=1;b<N;b++){
            ber[0]=num[0];
            ber[1]=num[b];
            for(int c=num[b];c>0;c--){
                if(ber[0]%c==0&&ber[1]%c==0){
                    ber[0]/=c;
                    ber[1]/=c;
                }
                if(c==1)
                    System.out.println(ber[0]+"/"+ber[1]);
            }
            //System.out.println(b);
        }

        /*
         * 
         */
    }
}

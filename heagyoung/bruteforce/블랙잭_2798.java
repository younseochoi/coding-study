import java.io.*;
import java.util.*;

public class 블랙잭_2798{
    static final int MAX = 40000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int []p = new int [2];
        StringTokenizer st =new StringTokenizer(br.readLine());
        for(int i=0;i<2;i++){
            p[i]=Integer.parseInt(st.nextToken());  
        }
        int N=p[1];
        int []card = new int [N];
        st =new StringTokenizer(br.readLine());
        for(int i=0;i<p[0];i++){
            card[i]=Integer.parseInt(st.nextToken());  
        }

        int answer=-1;

        for(int i=0;i<p[0]-2;i++){
            for(int j=i+1;j<p[0]-1;j++){
                for(int k=j+1;k<p[0];k++){
                    if(N>=card[i]+card[j]+card[k] && (N-(card[i]+card[j]+card[k])<N-answer))
                        answer=card[i]+card[j]+card[k];
                }
            }
        }
        System.out.print(answer);
    }
}
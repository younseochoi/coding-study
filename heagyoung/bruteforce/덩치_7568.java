import java.io.*;
import java.util.*;

public class 덩치_7568{
    static final int MAX = 40000;
        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
       
        int [][]bigger = new int[N][2];
        int []ranker = new int[N];
        int same=1, bigman=0;
        StringTokenizer st;

        for(int j=0;j<N;j++){
            st =new StringTokenizer(br.readLine());
            for(int i=0;i<2;i++){
                bigger[j][i]=Integer.parseInt(st.nextToken());        
            }
        }

        for(int a=0;a<N;a++){
            bigman=0;
            for(int b=0;b<N;b++){
                if (bigger[a][0]<bigger[b][0]&&bigger[a][1]<bigger[b][1])
                    bigman+=1;
            }
            ranker[a]=(bigman+1);
        }
        for(int x=0;x<N;x++){
            System.out.print(ranker[x]+" ");
        }
    }

}
import java.io.*;
import java.util.*;

public class 숫자카드_10815{
    static final int MAX = 40000;
        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N,M;        
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int []ha = new int[N];
        for(int i=0;i<N;i++){
            ha[i]=Integer.parseInt(st.nextToken());
        }
        List<Integer> have = new ArrayList<Integer>();      
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int []answer = new int[M];

        int have_card=0;
        List<Integer> check = new ArrayList<Integer>();
        for(int i=0;i<M;i++){
            check.add(Integer.parseInt(st.nextToken()));
        }
        for(int i=0;i<M;i++){
            if(have.contains(check.get(i))){
                answer[i] = 1;
                have.remove(have.indexOf(check.get(i)));
                have_card++;            }
            else
                answer[i] = 0;
            // for(int a:check)
            //     System.out.print(a+" ");
            // System.out.println(" ");
            if(have_card==N)
                break;
        }
        
        for(int a:answer)
            System.out.print(a+" ");
    }
}
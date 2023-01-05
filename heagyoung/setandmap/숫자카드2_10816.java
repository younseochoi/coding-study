import java.util.*;
import java.io.*;
public class 숫자카드2_10816 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N,M;        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int []card = new int[20000001];
        for(int i=0;i<N;i++){
            card[Integer.parseInt(st.nextToken())+10000000]++;
        }
        
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int j=0;j<M;j++){
            sb.append(card[Integer.parseInt(st.nextToken())+10000000]+" ");
        }
        System.out.print(sb);
    }
}

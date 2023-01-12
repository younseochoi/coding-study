import java.util.*;
import java.io.*;
public class 약수_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N;
        int answer=1;
        N=Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        int[] num = new int[N];

        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        answer=num[0]*num[N-1];
        System.out.print(answer); 
    }
}

//원래코드가 시간이 너무 많이 걸려서 이 코드로 했으나
//세상은 넓고 똑똑한 사람은 많다
import java.util.*;
import java.io.*;

public class 숫자카드_10815_2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N,M;
        int check=0;        
        StringTokenizer st;
        
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<N;i++){
            map.put(Integer.parseInt(st.nextToken()),i);
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int []answer = new int[M];
        
        for(int i=0;i<M;i++){
            if(map.containsKey(Integer.parseInt(st.nextToken()))){
                answer[i]=1;
                check++;
            }
            else
                answer[i]=0;
            if (check==M)
                break;
        }
        for(int a:answer)
            System.out.print(a+" ");

    }
}

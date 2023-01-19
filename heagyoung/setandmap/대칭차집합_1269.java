import java.util.*;
import java.io.*;
public class 대칭차집합_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []number = new int[2];
        int answer=0;
        StringTokenizer st;
        Map<String, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<2;i++){
            number[i]=Integer.parseInt(st.nextToken());
        }
        answer=number[1]+number[0];
        st = new StringTokenizer(br.readLine());
        for(int a=0; a<number[0]; a++){
            map.put(st.nextToken(),a);
        }
        st = new StringTokenizer(br.readLine());
        for(int b=0; b<number[1]; b++){
            if(map.containsKey(st.nextToken())){
                answer-=2;
            }
        }
        System.out.print(answer);
    }
}
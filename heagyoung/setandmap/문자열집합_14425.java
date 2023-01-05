import java.io.*;
import java.util.*;

public class 문자열집합_14425{
    static final int MAX = 40000;
        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int []number = new int[2];  
        int answer=0;      
        StringTokenizer st;
        Map<String, Integer> map = new HashMap<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<2;i++){
            number[i]=Integer.parseInt(st.nextToken());
        }
        for(int a=0;a<number[0];a++){
            map.put(br.readLine(),a);
        }
        for(int b=0;b<number[1];b++){
            if(map.containsKey(br.readLine()))
                answer++;
        }
        System.out.print(answer);
    }
}
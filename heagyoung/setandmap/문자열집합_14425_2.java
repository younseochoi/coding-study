//시간 비교용으로 하나 더 만들어 보았습니다
import java.util.*;
import java.io.*;

public class 문자열집합_14425_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int []number = new int[2];  
        int answer=0;      
        StringTokenizer st;
        List<String> N = new ArrayList<>();
        List<String> M = new ArrayList<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<2;i++){
            number[i]=Integer.parseInt(st.nextToken());
        }
        for(int a=0;a<number[0];a++){
            N.add(br.readLine());
        }
        for(int b=0;b<number[1];b++){
            M.add(br.readLine());
        }
        M.removeAll(N);
        answer=number[1]-M.size();
        System.out.print(answer);
    }
}

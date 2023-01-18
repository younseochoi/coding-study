import java.util.*;
import java.io.*;

public class 검문_2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.setLength(0);

        int N = Integer.parseInt(br.readLine());
        int namoji=0;
        ArrayList<Integer> answer = new ArrayList<>();
        int []num =new int[N];
        for(int a=0;a<N;a++){
            num[a]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);

        /*
         * 
         */
    }
}

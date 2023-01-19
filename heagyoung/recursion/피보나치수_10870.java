import java.io.*;
//import java.util.*;

public class 피보나치수_10870{
    static final int MAX = 40000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        System.out.println(fi(N));
        br.close();
    }

    public static int fi (int num){
        if (num==0)
            return 0;
        if (num==1)
            return 1;
        return fi(num-2)+fi(num-1);
    } 
}

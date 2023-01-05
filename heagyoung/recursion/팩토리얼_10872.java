import java.io.*;
//import java.util.*;

public class 팩토리얼_10872{
    static final int MAX = 40000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        System.out.println((N));
        br.close();
    }

    public static int rere (int num){
        if(num==0)
            return 1;
        
        return rere(num-1)*num;
    } 
}
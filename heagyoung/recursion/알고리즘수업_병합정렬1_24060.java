import java.io.*;
import java.util.*;

public class 알고리즘수업_병합정렬1_24060{
    static final int MAX = 40000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] p = new int[N][N];
        
        p=rere(p,N,N-1,N-1);

    }
    public static int[][] rere(int[][] star, int num, int row, int col) {
        if(num%3==0)
            num/=3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1&&j==1)
                    continue;
                star=rere(star,num);
            }
        }
    }
}
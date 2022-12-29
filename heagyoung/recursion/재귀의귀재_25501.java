import java.io.*;
import java.util.*;
import java.lang.*;

public class 재귀의귀재_25501{
    static final int MAX = 40000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            System.out.print(rere(br.readLine(),0));        
        }
        
        br.close();
    }

    public static String rere (String s, int i){
        i++;
        int len = s.length();
        StringBuffer strBuffer = new StringBuffer(s);
        if(len==1||len==0){
            System.out.println("1 "+i);
            return ""; 
        }
        else if(s.charAt(0)!=s.charAt(len-1)){
            System.out.println("0 "+i);
            return ""; 
        }
        
        strBuffer.delete(len-1,len);
        strBuffer.delete(0,1);
        return rere(strBuffer.toString(),i);
    } 
}

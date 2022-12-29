import java.io.*;
import java.util.*;
public class 영화감독숌_1436{
    static final int MAX = 40000;
        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        int turn=1, name=666, num,succes;
        while(true){
            if(N==turn){
                System.out.print(name);
                break;
            }
            name+=1;
            num=name;
            succes=0;
            while(num>0){
                if (num%10==6){
                    succes++;
                    if(succes==3){
                        succes=0;
                        turn++;
                        break;
                    }
                }
                else if(succes>0)
                    succes=0;
                num=num/10;
            }
        }
    }

}
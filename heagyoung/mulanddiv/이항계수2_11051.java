import java.util.*;
import java.io.*;

public class 이항계수2_11051 {
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int []num = new int[2];
        int answer=1;

        st = new StringTokenizer(br.readLine());

        for(int a=0;a<2;a++){
            num[a]=Integer.parseInt(st.nextToken());
        }
        num[1] = num[0]-num[1]>=num[1] ? num[1]:num[0]-num[1];
        //num 1 은 두 수 중 더 작은 수
        
        int []mul = new int[num[1]];
        int []div = new int[num[1]];

        for(int b=num[0]-num[1]+1;b<num[0]+1;b++){
            mul[b-num[0]+num[1]-1]=b;
            //System.out.print(mul[b-num[0]+num[1]-1]+" ");
        }
        //System.out.println(" ");
        for(int c=0;c<num[1];c++){
            div[c]=c+1;
            //System.out.print(div[c]+" ");
        }
        int big=1;
        for(int d=0;d<num[1];d++){
            for(int e=0;e<num[1];e++){
                if(div[d]==1)
                    continue;
                else if(mul[e]==1)
                    continue;
                else {
                    big=gcd(mul[e],div[d]);
                    mul[e]/=big;
                    div[d]/=big;
                    
                }

            }
        }
        for(int d=0;d<num[1];d++){
            answer*=mul[d];
        }
        for(int e=0;e<num[1];e++){
            answer/=div[e];
        }
        System.out.print(answer%10007);
        //for(int )
        //방법 1 시간초과

        // while(true){
        //     if(b==1&&c==1)
        //         break;
        //     answer*=b;
        //     answer/=c;
        //     if(b==num[1]+1)
        //         b=1;
        //     else
        //         b--;
        //     if(c==num[0]-num[1]||c==1)
        //         c=1;
        //     else
        //         c++;
        //     //System.out.println(b+" "+c);           
        // }

        //System.out.print((int)answer%10007);


    }
}

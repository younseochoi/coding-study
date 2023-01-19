import java.util.*;
import java.io.*;
public class 서로다른부분문자열의개수_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inin = br.readLine();
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        for(int a=0;a<inin.length();a++){
            sb.setLength(0);
            for(int b=a;b<inin.length();b++){
                sb.append(inin.charAt(b));
                map.put(sb.toString(),0);
            }
        }

        // for(int a=0;a<inin.length()+1;a++){ //배열길이
        //     for(int b=0;a+b<inin.length();b++){ //배열시작위치
        //         map.put(inin.substring(b,b+a),0);
        //     }
        // }
        // System.out.print(map.size());


        /*
        for // 시작위치
            for // 끝나는 위치
        sb 변화가능한 String
         a ab abcd abcde
         b bc bcd bcde
         c cd cde
         d de
         e
         메모리 227552	시간 788


         * a b ab ba aba bab 
         * 
         * for // a = 1 2 3   
         *    for //  b = 시작위치
         *       끊어 substring (b, b+a)
         *       put map
         *      
         *    a b c d e
         *    ab bc cd de
         */ 
        
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
		
        int result = factorial(n);
        System.out.println(result);
    }

    public static int factorial (int n) {
        if(n <= 1) return 1;	
        return n * factorial(n - 1);		
    }
}
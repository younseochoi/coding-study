import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
		
        int result = fibonachi(n);
        System.out.println(result);
    }

    public static int fibonachi(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonachi(n-1) + fibonachi(n-2);		
    }
}
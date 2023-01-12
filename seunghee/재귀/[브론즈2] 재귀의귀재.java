import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int cnt = 0;
 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
        	bw.write(isPalindrome(br.readLine()) + " " + cnt + "\n");
        }	
		bw.flush();
		bw.close();
	}
	 public static int recursion(String s, int l, int r){
		cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
    	cnt = 0;
        return recursion(s, 0, s.length()-1);
    }
}
/*
53122786	dnffktmdgml	 25501	맞았습니다!!	20004	272	Java 11 / 수정	954	9초 전
*/
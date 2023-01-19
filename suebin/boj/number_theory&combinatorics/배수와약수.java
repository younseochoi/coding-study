import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
        
public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			
			int num1 = Integer.parseInt(st.nextToken());
			if (num1 == 0) break;
			int num2 = Integer.parseInt(st.nextToken());
			
			
			if (num1 > num2 && num1 % num2 == 0) {
				result.append("multiple\n");
			}
			else if (num1 < num2 && num2 % num1 == 0) {
				result.append("factor\n");
			}
			else {
				result.append("neither\n");
			}
		}
		
		System.out.println(result);
		
	}
}
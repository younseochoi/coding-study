import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int sum; // 분해합
		int num;
		int result = 0; 
		
		for (int i=1; i<N; i++) {
			
			num = i;
			sum = num;
			
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if (sum == N) {
				result = i;
				break;
			}
		}

		System.out.println(result);
		
	}
}
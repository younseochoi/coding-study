import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		/*
		 * 뒷자리가 0이 나오는 경우는 2와 5가 곱해져 있을 때이다.
		 * 즉, 뒷자리 0이 n개  있다는 것은 2와 5가 n개씩 짝지어 존재해야 한다. (2*5 = 10)
		 * 
		 * 자연스레 2가 5보다 작기 때문에 모든 값들의 소인수분해들은 2의 개수가 5의 개수보다 많다.
		 * 따라서 N이 5로 나누어지는 개수가 곧 구하고자 하는 0의 개수이다.
		 */
		
		int count = 0;
		
		while (N >= 5) {
			count = count + (N/5);
			N = N / 5;
			count += N / 5;
			N /= 5;
		}
		System.out.println(count);

	}
}
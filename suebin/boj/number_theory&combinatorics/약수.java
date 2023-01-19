import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
        
public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine()); // N의 진짜 약수의 개수
		
		// 진짜 약수를 배열에 저장하고, 오름차순으로 정렬한다.
		
		int[] factors = new int[count];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<count; i++) {
			factors[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(factors);
		
		// 진짜 약수의 제일 작은 숫자와 제일 큰 숫자를 곱하면 N을 구할 수 있다.
		
		int N = factors[0] * factors[count-1];
		
		System.out.println(N);
		
	}
}
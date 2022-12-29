import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int result = 0;
		int i = 1;

		while (i <= N) {
			String text = String.valueOf(i);
			List<String> number = Arrays.asList(text.split(""));
			int sum = 0;	

			for (int j=0; j < number.size(); j++) {
				sum += Integer.parseInt(number.get(j));
			}
			if (N == (sum + i)) {
				result = i;
				break;
			} else {
				i++;
			}
		}
		System.out.println(result);
	}
}
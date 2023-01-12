package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int first = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());
		
		bw.write(factorial(first) / (factorial(second) * factorial(first - second)) + "");
		
		bw.flush();
		bw.close();
	}
	//이항계수 : nCk : n!/(n-k)!k!
	//밑에는 팩토리얼을 재귀함수로 타나낸 것
	public static int factorial(int N) {
		if (N == 0) {
			return 1;
		}
		return N * factorial(N - 1);
	}
}
/*
53750135	dnffktmdgml	 11050	맞았습니다!!	14308	172	Java 11 / 수정	912	12초 전
*/
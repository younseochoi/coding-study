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

		int length = Integer.parseInt(br.readLine())-1;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int first = Integer.parseInt(st.nextToken());
		for(int i=0; i<length; i++) {
			int circle = Integer.parseInt(st.nextToken());
			int gcd = greatestCommonDivisor(first,circle);
			StringBuilder sb = new StringBuilder();
			sb.append(first/gcd);
			sb.append("/");
			sb.append(circle/gcd);
			bw.write(sb.toString());
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	//최대 공약수 : 유클리드 호제법 알고리즘 (나눈 나머지가 0이 될 때 나눈 수)
	public static int greatestCommonDivisor(int num1, int num2) {
		if(num2 == 0 ) {
			return num1;
		}
		return greatestCommonDivisor(num2, num1%num2);
	}
}
/*
53749754	dnffktmdgml	 3036	맞았습니다!!	14224	128	Java 11 / 수정	1177	
*/
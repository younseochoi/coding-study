package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] nums = br.readLine().split(" ");
		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[1]);
		
		int gcd = greatestCommonDivisor(num1, num2);
		int lcm = leastCommonMultiple(num1, num2, gcd);
		
		bw.write(String.valueOf(gcd));
		bw.newLine();
		bw.write(String.valueOf(lcm));
		
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
	//최소 공배수 : 두 수 a와 b의 최소공배수는 a와 b의 곱을 a와 b의 최대공약수를 나눈 것과 같다
	public static int leastCommonMultiple(int num1, int num2, int gcd) {
		int result = 0;
		result = (num1 * num2) / gcd;
		return result;
	}
}
/*
53656331	dnffktmdgml	 2609	맞았습니다!!	14232	124	Java 11 / 수정	1269	16초 전
*/
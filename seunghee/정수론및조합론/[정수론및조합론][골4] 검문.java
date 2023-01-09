//출처 : https://st-lab.tistory.com/155

package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int length = Integer.parseInt(br.readLine());
		
		int[] nums = new int[length];
		for(int i=0; i<length; i++) {
			nums[i] = Integer.parseInt(br.readLine());	
		}
		Arrays.sort(nums);
		
		//음수가 되지 않도록 큰 수에서 작은 수로 빼준다.
		int gcdVal = nums[1] - nums[0];
		for(int i=2; i<length; i++) {
			//직전의 최대공약수와 다음 수(nums[i] - nums[i-1])의 최대공약수를 갱신
			gcdVal = greatestCommonDivisor(gcdVal, nums[i] - nums[i-1]);
		}
		
		//최대공약수의 약수 찾기
		for(int i=2; i<=gcdVal; i++) {
			if(gcdVal%i==0) {
				//i가 최대공약수의 약수라면 출력
				bw.write(String.valueOf(i) + " ");
			}
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
53749291	dnffktmdgml	 2981	맞았습니다!!	16960	1436	Java 11 / 수정	1205	7초 전
*/
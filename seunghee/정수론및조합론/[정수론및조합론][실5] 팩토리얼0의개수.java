package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
 
		int cnt = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BigInteger N = new BigInteger(br.readLine());
		String result = factorial(N).toString();
		
		for(int i=result.length()-1; i>=0; i--) {
			if(String.valueOf(result.charAt(i)).equals("0")) {
				cnt++;
			} else {
				break;
			}
		}
		System.out.println(String.valueOf(cnt));
	}
	public static BigInteger factorial(BigInteger N) {
		BigInteger bi = new BigInteger("0");
		if(N.equals(bi)) {
			return new BigInteger("1");
		}
		return N.multiply(factorial(N.subtract(new BigInteger("1"))));
		//return N * factorial(N-1);
	}
}
/*
53960025	dnffktmdgml	 1676	맞았습니다!!	15064	140	Java 11 / 수정	987	19초 전
*/

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
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		String[] numStr = br.readLine().split(" ");
		int[] numInt = new int[length];
		for(int i=0; i<length; i++) {
			numInt[i] = Integer.parseInt(numStr[i]);
		}
		Arrays.sort(numInt);

		bw.write(String.valueOf(numInt[0]*numInt[length-1]));
		bw.flush();
		bw.close();
	}
}
/*
53596757	dnffktmdgml	 1037	맞았습니다!!	14328	124	Java 11 / 수정	795	1분 전
*/
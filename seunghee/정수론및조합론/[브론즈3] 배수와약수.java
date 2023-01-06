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
		
		while(true) {			
			String str = br.readLine();
			int num1 = Integer.parseInt(str.split(" ")[0]);
			int num2 = Integer.parseInt(str.split(" ")[1]);
			
			if(num1 == 0) {
				break;
			} else if ( num1 % num2 == 0 ) {
				bw.write("multiple");
			} else if ( num2 % num1 == 0 ) {
				bw.write("factor");
			} else {
				bw.write("neither");
			}
			bw.newLine();			
        }
		bw.flush();
		bw.close();
	}
}
/*
53596359	dnffktmdgml	 5086	맞았습니다!!	14016	116	Java 11 / 수정	816	5초 전
*/
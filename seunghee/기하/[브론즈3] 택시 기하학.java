import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	
	final static double pi = Math.PI;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double num = Integer.parseInt(br.readLine());
		bw.write(String.format("%.6f",Math.pow(num, 2)*pi));
		bw.newLine();
		bw.write(String.format("%.6f",Math.pow(num, 2)*2));
		bw.flush();
		bw.close();
	} 
}
/*
53363040	dnffktmdgml	 3053	맞았습니다!!	14608	136	Java 11 / 수정	673	9초 전
*/
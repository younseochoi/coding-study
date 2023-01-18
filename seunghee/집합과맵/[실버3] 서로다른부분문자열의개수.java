package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashSet;

public class Main {

	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int result = 0;
		
		String str = br.readLine();
		HashSet<String> hs = new HashSet<>();
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length()+1; j++) {
				hs.add(str.substring(i,j));
			}
		}
		result = hs.size();
		
		bw.write(String.valueOf(result)+" ");
		bw.flush();
		bw.close();
	}
}
/*
53539930	dnffktmdgml	 11478	맞았습니다!!	227372	812	Java 11 / 수정	739	42초 전
*/
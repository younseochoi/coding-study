package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<String> hs = new HashSet<>();
		for(int i=0; i<n; i++) {
			hs.add(br.readLine());
		}
		
		ArrayList<String> arr = new ArrayList<>();
		int result = 0;
		for(int j=0; j<m; j++) {
			String name = br.readLine();
			if(hs.contains(name)) {
				result ++;
				arr.add(name);
			}
		}
		
		Collections.sort(arr);

		bw.write(String.valueOf(result));
		bw.newLine();
		for(int k=0; k<result; k++) {
			bw.write(arr.get(k));
			bw.newLine();				
		}
		bw.flush();
		bw.close();
	}
}
/*
53480823	dnffktmdgml	 1764	맞았습니다!!	26300	292	Java 11 / 수정	1183	
*/
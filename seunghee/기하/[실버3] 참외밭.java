//참조 : https://velog.io/@jihun333/%EB%B0%B1%EC%A4%802477-%EC%B0%B8%EC%99%B8%EB%B0%AD-%EC%9E%90%EB%B0%94

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
		
		int per = Integer.parseInt(br.readLine());
		
		ArrayList<int[]> arr = new ArrayList<>();

		for(int j=0; j<6; j++) {
			String str = br.readLine();
			int num1 = Integer.parseInt(str.split(" ")[0]);
			int num2 = Integer.parseInt(str.split(" ")[1]);
			arr.add(new int[] {num1, num2});
		}
		
		int maxX = 0;
		int maxY = 0;
		int outX = 0;
		int outY = 0;

		for(int i=0; i<arr.size(); i++) {
			int num1 = arr.get(i)[0];
			int num2 = arr.get(i)[1];
			int last = 0;
			int next = 0;
			if (i==0) {
				last = arr.size()-1;
				next = i+1;
			} else if (i==arr.size()-1) {
				last = i-1;
				next = 0;
			} else {
				last = i-1;
				next = i+1;
			}
			if(num1 <= 2) {
				if( maxX < num2) {
					maxX = num2;
					outX = Math.max(arr.get(last)[1], arr.get(next)[1]) - Math.min(arr.get(last)[1], arr.get(next)[1]);						
				}
			} else if (num1 >= 3) {
				if(maxY < num2 ) {
					maxY = num2;
					outY = Math.max(arr.get(last)[1], arr.get(next)[1]) - Math.min(arr.get(last)[1], arr.get(next)[1]);				
				}
			}
		}
		bw.write(String.valueOf((maxX*maxY-outX*outY)*per));
		bw.flush();
		bw.close();
	} 
}
/*
53373189	dnffktmdgml	 2477	맞았습니다!!	14260	124	Java 11 / 수정	1581	
*/
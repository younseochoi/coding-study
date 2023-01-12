import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = 0;
		
		String input = br.readLine();
		int N = Integer.parseInt(input);
		
		result = takeApart(N);
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
	
	static int takeApart(int N) {
		int result = 0;
		int start = N - String.valueOf(N).length()*9;
		for (int i=start; i<N; i++) {
			int sum = i;
			for(int j=0; j<String.valueOf(i).length(); j++) {
				sum += Character.getNumericValue(String.valueOf(i).charAt(j));
			}
			if(sum==N) {
				return i;
			}
		}			
		return result;
	}
}
/*
53027432	dnffktmdgml	 2231	맞았습니다!!	14172	120	Java 11 / 수정	929	
*/
//참고: https://velog.io/@tkdeod1234/%EB%B0%B1%EC%A4%80-1436%EB%B2%88-%EC%98%81%ED%99%94%EA%B0%90%EB%8F%85-%EC%88%8C-Java%EC%9E%90%EB%B0%94

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
 
	public static void main(String[] args) throws IOException{
		int result = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		result = search_N(N);

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
	
	public static int search_N(int N) {
		int result = 0;
		int cnt = 0;
		
		for(int i=666; i<Integer.MAX_VALUE; i++) {
			if (Integer.toString(i).contains("666")) {
				cnt++;
			}
			if (cnt == N) {
				result = i;
				break;
			}
		}
		return result;
	}
	
}
/*
53118728	dnffktmdgml	 1436	맞았습니다!!	84684	284	Java 11 / 수정	1040	20초 전
*/
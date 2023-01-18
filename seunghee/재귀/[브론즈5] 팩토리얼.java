import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int result = func(num);

		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
	}
	
	static int func(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * func(num-1);
		}
	}
}

/*
52977208	dnffktmdgml	 10872	맞았습니다!!	14156	120	Java 11 / 수정	654	11초 전
*/
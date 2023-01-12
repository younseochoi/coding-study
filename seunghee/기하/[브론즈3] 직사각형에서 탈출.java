import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] nums = br.readLine().split(" ");
		int x = Integer.parseInt(nums[0]);
		int y = Integer.parseInt(nums[1]);
		int w = Integer.parseInt(nums[2]);
		int h = Integer.parseInt(nums[3]);

		int answer = Math.min(x, Math.min(y, Math.min(w-x, h-y)));
		
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	} 
}

/*
53269011	dnffktmdgml	 1085	맞았습니다!!	14200	120	Java 11 / 수정	728
*/
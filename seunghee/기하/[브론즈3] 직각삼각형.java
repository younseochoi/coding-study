import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] inputs = br.readLine().split(" ");
			int[] nums = new int[3];
			for(int i=0; i<3; i++) {
				nums[i] = Integer.parseInt(inputs[i]);
			}
			if(nums[0] == 0) break;
			
			int max = Math.max(nums[0], Math.max(nums[1], nums[2]));
			int rest = 0;
			for(Integer n : nums) {
				if(n == max) {
					continue;
				} else {
					rest += Math.pow(n, 2);
				}
			}
			
			if(Math.pow(max, 2) == rest) {
				bw.write("right");
			} else {
				bw.write("wrong");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	} 
}
/*
53361341	dnffktmdgml	 4153	맞았습니다!!	14044	116	Java 11 / 수정	974	5초 전
*/
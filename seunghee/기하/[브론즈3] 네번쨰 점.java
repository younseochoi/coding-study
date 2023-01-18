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
		
		ArrayList<String> xList = new ArrayList<>();
		ArrayList<String> yList = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			String[] nums = br.readLine().split(" ");
			String x = nums[0];
			String y = nums[1];
			if(xList.contains(x)) {
				xList.remove(x);
			} else {
				xList.add(x);
			}
			if(yList.contains(y)) {
				yList.remove(y);
			} else {
				yList.add(y);
			}
		}
		
		bw.write(xList.get(0)+ " " + yList.get(0));
		bw.flush();
		bw.close();
	} 
}

/*
53269379	dnffktmdgml	 3009	맞았습니다!!	16088	156	Java 11 / 수정	897
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main{
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		int N = Integer.parseInt(input);
		
		ArrayList<int[]> arr = new ArrayList<>();
		for(int i=0; i<N; i++) {
			String[] person = br.readLine().split(" ");
			int weight = Integer.parseInt(person[0]);
			int height = Integer.parseInt(person[1]);
			int[] per = {weight, height};
			arr.add(per);
		}	
		ArrayList<Integer> result = compareWH(arr, N);
		for(int r : result) {
			bw.write(String.valueOf(r)+" ");			
		}	
		bw.flush();
		bw.close();
	}
	
	static ArrayList<Integer> compareWH(ArrayList<int[]> arr, int N) {
		ArrayList<Integer> result = new ArrayList<>();		
		for(int j=0; j<arr.size(); j++) {
			int cnt = 1;
			int weight = arr.get(j)[0];
			int height = arr.get(j)[1];
			for(int i=0; i<N; i++) {
				int compareW = arr.get(i)[0];
				int compareH = arr.get(i)[1];
				if(compareW > weight && compareH > height) {
					cnt++;
				}
			}
			result.add(cnt);
		}
		return result;
	}
}
/*
53075392	dnffktmdgml	 7568	맞았습니다!!	14400	128	Java 11 / 수정	1363	20초 전
*/
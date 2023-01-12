import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
 
public class Main {

	public static int[] cards1;
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		int num1 = Integer.parseInt(br.readLine());
		cards1 = new int[num1];
		String[] arr = br.readLine().split(" ");
		for(int i=0; i<num1; i++) {
			cards1[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(cards1);

		
		int num2 = Integer.parseInt(br.readLine());
		String[] cards2 = br.readLine().split(" ");
		
		for(int i=0; i<num2; i++) {
			int result = binarySearch1(cards2[i], 0, num1-1);
			bw.write(String.valueOf(result)+" ");
		}
		
		bw.flush();
		bw.close();
	}
	public static int binarySearch1(String key, int low, int high) {
		int mid;
		if(low <= high) {
			mid = (low + high) / 2;
			
			if(Integer.parseInt(key) == cards1[mid]) { // 탐색 성공
				return 1;
			} else if(Integer.parseInt(key) < cards1[mid]) {
				// 왼쪽 부분 arr[0]부터 arr[mid-1]에서의 탐색 
				return binarySearch1(key ,low, mid-1);  
			} else {
				// 오른쪽 부분 - arr[mid+1]부터 arr[high]에서의 탐색 
				return binarySearch1(key, mid+1, high); 
			}
		}
		return 0; // 탐색 실패 
	}
}
/*
53419139	dnffktmdgml	 10815	맞았습니다!!	135920	1692	Java 11 / 수정	1465	26초 전
*/
package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {

	public static int[] nums1;
	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int result = n+m;

		nums1 = new int[n];
		String[] in1 = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			nums1[i] = Integer.parseInt(in1[i]);
		}
		Arrays.sort(nums1);

		String[] in2 = br.readLine().split(" ");
		for(int i=0; i<m; i++) {
			int cnt = binarySearch1(in2[i], 0, n-1);
			result -= cnt;
		}
		
		bw.write(String.valueOf(result)+" ");
		bw.flush();
		bw.close();
	}
	public static int binarySearch1(String key, int low, int high) {
		int mid;
		if(low <= high) {
			mid = (low + high) / 2;
			
			if(Integer.parseInt(key) == nums1[mid]) { // 탐색 성공
				return 2;
			} else if(Integer.parseInt(key) < nums1[mid]) {
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
53481214	dnffktmdgml	 1269	맞았습니다!!	66796	1076	Java 11 / 수정	1562	
*/
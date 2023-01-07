//시간초과도 아니고 아예 틀렸는데... 테스트케이스는 맞아서 틀린 부분을 못찾았습니다...ㅠㅠ

package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int length = Integer.parseInt(br.readLine());
		
		int[] nums = new int[length];
		for(int i=0; i<length; i++) {
			nums[i] = Integer.parseInt(br.readLine());	
		}
		Arrays.sort(nums);
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int j=0; j<nums[0]-1; j++) {
			int div = greatestCommonDivisor(nums[0]-j, nums[1]-j);
			if(div == 1 || arr.contains(div)) {
				continue;
			}
			boolean result = true;
			for(int k=2; k<length; k++) {
				int rest = (nums[k]-j) % div;
				if(rest != 0) {
					result = false;
					break;
				}
			}
			if(result) {
				arr.add(div);				
			}
		}
		Collections.sort(arr);
		
		for(int n : arr) {
			bw.write(String.valueOf(n) + " ");
		}
		bw.flush();
		bw.close();
	}
	//최대 공약수 : 유클리드 호제법 알고리즘 (나눈 나머지가 0이 될 때 나눈 수)
	public static int greatestCommonDivisor(int num1, int num2) {
		if(num2 == 0 ) {
			return num1;
		}
		return greatestCommonDivisor(num2, num1%num2);
	}
}
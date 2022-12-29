import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		String[] size;

		for (int i=0; i < N; i++) {
            size = br.readLine().split(" ");			// 키, 몸무게 문자열 분리
            arr[i][0] = Integer.parseInt(size[0]);	
			arr[i][1] = Integer.parseInt(size[1]);	
        }

        for (int[] i : arr) {
			int rank = 1;
			for (int[] n : arr) {
				if ((i[0]!=n[0]) && (i[1]!=n[1])) {
					if ((i[0]<n[0]) && (i[1]<n[1])) {
						rank++;
					}
				}
			}
			System.out.print(rank + " ");
		}
	}
}
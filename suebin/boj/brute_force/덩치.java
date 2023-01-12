import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// 몸무게와 키 정보를 배열에 저장한다.
		
		int[][] bodySizeInfo = new int[N][2];
		
		for (int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			bodySizeInfo[i][0] = Integer.parseInt(st.nextToken());
			bodySizeInfo[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 덩치 등수를 구한다.
		
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i<N; i++) {	
			int rank = 1;
			
			for (int j=0; j<N; j++) {
				if (j == i) continue;

				if (bodySizeInfo[j][0] > bodySizeInfo[i][0] && bodySizeInfo[j][1] > bodySizeInfo[i][1]) {
					rank++; 
				}		
			}
			
			result.append(rank + " ");
		}

		System.out.println(result);
        
	}
}

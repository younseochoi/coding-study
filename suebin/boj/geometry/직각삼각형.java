import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			int [] triangle = new int[3];
			
			triangle[0] = Integer.parseInt(st.nextToken());
			if (triangle[0] == 0) break; // 종료 조건
			
			triangle[1] = Integer.parseInt(st.nextToken());
			triangle[2] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(triangle);
			
			// 피타고라스 정리
			
			if (triangle[0]*triangle[0] + triangle[1]*triangle[1] == triangle[2]*triangle[2]) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
		
	}
}
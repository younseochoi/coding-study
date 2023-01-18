import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		List<String> S = new ArrayList();
		
		for (int i=0; i<N; i++) {
			S.add(br.readLine());
		}
		
		// 문자열이 집합 S에 포함되어 있다면 result를 하나 증가한다.
		
		int result = 0;
		
		for (int i=0; i<M; i++) {
			if (S.contains(br.readLine())) {
				result++;
			}
		}
		
		System.out.println(result);	
		
	}
}
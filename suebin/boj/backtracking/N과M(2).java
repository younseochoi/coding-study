import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
        
public class Main {
	public static int array[];
	public static StringBuilder result = new StringBuilder();
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		array = new int[M];
		
		backtracking(N, M, 0, 0);
		
		System.out.println(result);
		br.close();
	}
	
	public static void backtracking(int N, int M, int start, int depth) {
		if (depth == M) {
			for (int i : array) {
				result.append(i + " ");
			}
			result.append("\n");
			return;
		}
		
		for (int i = start; i < N; i++) {
			array[depth] = i + 1;
			backtracking(N, M, i + 1, depth + 1);
		}
		
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
        
public class Main {
	static int N;
	static int M;
	static int array[];
	static StringBuilder result = new StringBuilder();
	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		array = new int[M];
		
		backtracking(1, 0);
		
		System.out.println(result);
		br.close();
	}
	
	public static void backtracking(int start, int depth) {
		if (depth == M) {
			for (int i : array) {
				result.append(i + " ");
			}
			result.append("\n");
			return;
		}
		
		for (int i = start; i <= N; i++) {
			array[depth] = i;
			backtracking(i, depth + 1);
		}
	}

}
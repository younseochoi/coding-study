import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
        
public class Main {
	
    public static int array[];
	public static boolean visit[];
	public static StringBuilder result = new StringBuilder();
	
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		array = new int[M];
		visit = new boolean[N];
		
		backtracking(N, M, 0);
		
		System.out.println(result);
		br.close();
	}
	
	public static void backtracking(int N, int M, int depth) {
		
		if (M == depth) {
			for (int i : array) {
				result.append(i + " ");
			}
			result.append("\n");
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				array[depth] = i + 1;
				backtracking(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}
	
}
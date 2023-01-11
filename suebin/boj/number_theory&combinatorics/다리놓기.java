import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
        
public class Main {
	static int[][] combination = new int[30][30];
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder result = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int N; int M;
		
		for (int i=0; i<T; i++) { 
			st = new StringTokenizer(br.readLine());
		  
			N = Integer.parseInt(st.nextToken()); 
			M = Integer.parseInt(st.nextToken());
		  
			result.append(findCombination(M,N) + "\n"); 
		}
			System.out.println(result);
		
	}
	
	public static int findCombination(int M, int N) {
		
		if (combination[M][N] > 0) return combination[M][N];
		if (N == 0 || N == M) return combination[M][N] = 1;
		return combination[M][N] = findCombination(M-1, N-1) + findCombination(M-1, N);
	
	}
}

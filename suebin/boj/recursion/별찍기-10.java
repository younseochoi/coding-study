import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static char[][] stars;
	static int N;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		stars = new char[N][N];
		
		drawStar(0, 0, N, false);
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				result.append(stars[i][j]);
			}
			result.append('\n');
		}
		
		System.out.println(result);
		
	}
	
	public static void drawStar(int x, int y, int N, boolean blank) {
		
		if (blank) { // 공백인 경우
			for (int i = x; i < x+N; i++) {
				for (int j = y; j < y+N; j++) {
					stars[i][j] = ' ';
				}
			}
			return;
		}
		
		if (N == 1) { // 더 이상 쪼갤 수 없는 경우
			stars[x][y] = '*';
			return;
		}
		
		int size = N / 3;
		int count = 0;
		
		for (int i = x; i < x+N; i += size) {
			for (int j = y; j < y+N; j += size) {
				count++;
				if (count == 5) drawStar(i, j, size, true);
				else drawStar(i, j, size, false);
			}
		}
	
	}
}
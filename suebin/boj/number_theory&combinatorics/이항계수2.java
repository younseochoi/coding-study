import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
        
public class Main {
	static int[][] binomialCoefficient;
	
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		binomialCoefficient = new int[N+1][K+1];
		
		System.out.println(pascalTriangle(N, K));
		
		
	}
	
	public static int pascalTriangle(int N, int K) {
		
		if (binomialCoefficient[N][K] > 0) return binomialCoefficient[N][K];
		if (K == 0 || K == N) return binomialCoefficient[N][K] = 1;
		return binomialCoefficient[N][K] = (pascalTriangle(N-1, K-1) + pascalTriangle(N-1, K)) % 10007;
		
	}
}

/*
위 코드에서 궁금한 점이 있습니다.
처음에는 19번 줄에서 출력시 % 10007를 연산해주니 틀렸다고 나와서
28번 줄에만 % 10007을 더해주니 맞다고 뜨는데 
무슨 차이가 있는건지 모르겠네요 ,,


+ 처음에 푼 코드

처음에는 재귀로 풀었는데 계속 시간 초과가 떠서 검색해보고 이차원 배열로 풀었습니다.
아래는 처음 코드입니다.

public class Main {
	
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		System.out.println(pascalTriangle(N, K) % 10007);
		
		
	}
	
	public static int pascalTriangle(int N, int K) {
		
		if (K == 0 || K == N) return 1;
		return pascalTriangle(N-1, K-1) + pascalTriangle(N-1, K);
		
	}
}

*/
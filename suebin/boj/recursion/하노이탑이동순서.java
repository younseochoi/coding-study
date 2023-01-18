import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static StringBuilder result = new StringBuilder(); 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 옮긴 횟수
		
		int movingCount = (int)Math.pow(2, N) - 1;
		result.append(movingCount + "\n");
		
		// 하노이 원반을 옮기는 수행 과정
		
		moveHanoiDisk(N, 1, 2, 3);
		
		System.out.print(result);
		
	}
	
	static void moveHanoiDisk(int N, int startingPoint, int mid, int destination) {
		
		if (N == 1) {
			result.append(startingPoint + " " + destination + "\n");
			return;
		}
		
		moveHanoiDisk(N-1, startingPoint, destination, mid);
		result.append(startingPoint + " " + destination + "\n");
		moveHanoiDisk(N-1, mid, startingPoint, destination);
		
	}
}
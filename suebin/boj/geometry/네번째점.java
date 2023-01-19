import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x3 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		
		int x;
		int y;
		
		if (x1 == x2) {
			x = x3;
		}
		else if (x1 == x3) {
			x = x2;
		}
		else {
			x = x1;
		}
		
		if (y1 == y2) {
			y = y3;
		}
		else if (y1 == y3) {
			y = y2;
		}
		else {
			y = y1;
		}
		
		System.out.println(x + " " + y);
		
	}
}
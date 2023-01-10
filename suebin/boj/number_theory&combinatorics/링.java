import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
        
public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int firstRingRadius = Integer.parseInt(st.nextToken());
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i<N-1; i++) {
			
			int radius = Integer.parseInt(st.nextToken());
			
			if (firstRingRadius % radius == 0) { 
				result.append((firstRingRadius/radius) + "/1\n"); 
			}
			else {
				int gcd = gcd(firstRingRadius, radius);
				result.append((firstRingRadius/gcd) + "/" + (radius/gcd) + "\n");
			}
			
		}
		
		System.out.println(result);
	}
		
	public static int gcd(int a, int b) {
			
		if (b == 0) return a;
		return gcd(b, a%b);
		
	}

}
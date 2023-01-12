import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int R = Integer.parseInt(br.readLine()); 
		
		double euclid = Math.PI * R * R;
		double taxi = 2 * R * R; 
		
		String euclidResult = String.format("%.6f", euclid);
		String taxiResult = String.format("%.6f", taxi);
		
		System.out.println(euclidResult);
		System.out.println(taxiResult);
	}
}
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int card[] = new int[N];
		int sum=0, res=0;
		
		String num[] = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			card[i] = Integer.parseInt(num[i]);
		}
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					sum = card[i] + card[j] + card[k];
					if(sum <= M && res < sum) {
						res = sum;
					}
				}
			}
		}
		System.out.println(res);
	}
}
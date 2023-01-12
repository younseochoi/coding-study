import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.StringTokenizer;
        
public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			
			HashMap<String, Integer> clothes = new HashMap<>(); // key = 의상의 종류, value = 종류별 의상 수
			
			for (int j=0; j<n; j++) {
				st = new StringTokenizer(br.readLine());
				
				String clothName = st.nextToken();
				String clothType = st.nextToken();
				
				clothes.put(clothType, clothes.getOrDefault(clothType, 0) + 1);
			}
			
			// 종류별 의상 수를 서로 곱하면 경우의 수(= count)가 된다.
			
			int count = 1; 
			Collection<Integer> values = clothes.values();
			for (Integer value : values) {
				count *= (value + 1); // 각 종류별 의상 수에는 안 입는 경우 1을 더한다.
			}
			count -= 1; // 알몸이 되는 경우의 수 1을 빼준다.
			
			result.append(count + "\n");
		}
		
		System.out.println(result);
		
	}
	
}
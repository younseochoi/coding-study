import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		// 부분 문자열을 구해 HashSet에 저장한다.
		
		HashSet<String> set = new HashSet<>();
		
		for (int i=1; i<=S.length(); i++) {
			int start = 0;
			int end = start+i;
			
			while (end <= S.length()) {	
				set.add(S.substring(start , end));
				start++;
				end++;
			}
		}
		
		System.out.println(set.size());

	}
}
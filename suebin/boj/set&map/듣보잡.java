import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 듣도 못한 사람의 명단을 HashSet에 저장한다.
		
		HashSet<String> unheardOfNames = new HashSet<String>();
		
		for (int i=0; i<N; i++) {
			unheardOfNames.add(br.readLine());
		}
		
		// 듣보잡 명단인 list를 만든다.

		ArrayList<String> list = new ArrayList<>();
		
		for (int i=0; i<M; i++) {
			String name = br.readLine();
			
			if (unheardOfNames.contains(name)) {
				list.add(name);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		
		for (String name : list) {
			System.out.println(name);
		}
		
		
	}
}
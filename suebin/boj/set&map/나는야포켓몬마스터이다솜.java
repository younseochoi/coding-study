import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 포켓몬 번호와 이름이 담긴 도감을 두 개 만든다.
		
		HashMap<Integer, String> pokemons = new HashMap<>(); // 포켓몬 번호가 key인 도감
		HashMap<String, Integer> pokemons2 = new HashMap<>(); // 포켓몬 이름이 key인 도감
		
		int num = 1;
		String name;
		for (int i=0; i<N; i++) {
			name = br.readLine();
			pokemons.put(num, name);
			pokemons2.put(name , num);
			num++;
		}
		
		// 입력으로 들어오는 문제를 맞춘다.
		
		StringBuilder result = new StringBuilder();
		String search;
		
		for (int i=0; i<M; i++) {
			search = br.readLine();
			if (search.matches("\\d+")) { // 숫자인 경우
				result.append(pokemons.get(Integer.parseInt(search)) + "\n");
			}
			else { // 문자인 경우
				result.append(pokemons2.get(search) + "\n");
			}
		}
		
		System.out.println(result);
		
	}
}
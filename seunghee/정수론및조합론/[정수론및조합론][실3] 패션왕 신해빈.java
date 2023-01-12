package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
 
		int T = Integer.parseInt(br.readLine());	// 테스트 케이스 
 
		while (T -- > 0) {
			
			HashMap<String, Integer> hm = new HashMap<>();	// <종류, 개수>
			int N = Integer.parseInt(br.readLine());	// 입력받는 옷의 개수
			
			while (N-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				st.nextToken();	// 옷 이름은 필요 없음 
				String kind = st.nextToken();	// 옷 종류 
				hm.put(kind, hm.getOrDefault(kind, 0) + 1);
			}
 
			int result = 1;
			for (int val : hm.values()) {
				result *= (val + 1);
			}
			// 알몸인 상태를 제외해주어야 하므로 최종값에 -1이 정답.
			sb.append(result - 1).append('\n');
		}
		System.out.println(sb);
	}
}
/*
 * 53906335	dnffktmdgml	 9375	맞았습니다!!	14128	128	Java 11 / 수정	1679	5초 전
 */

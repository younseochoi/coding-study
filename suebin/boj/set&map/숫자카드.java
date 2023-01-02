import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 상근이가 가지고 있는 숫자 카드의 개수 : N
		
		int N = Integer.parseInt(br.readLine());
		
		// 숫자 카드에 적혀있는 정수를 담은 배열 : numCard
		
		int[] numCard = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<N; i++) {
			numCard[i] = Integer.parseInt(st.nextToken());
		}
		
		// 이분탐색을 위해 오름차순 정렬해준다.
		
		Arrays.sort(numCard);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder result = new StringBuilder();
		
        // binarySearch 함수를 호출하여 이분탐색을 한다.

		for (int i=0; i<M; i++) {			
			result.append(binarySearch(numCard, Integer.parseInt(st.nextToken())) + " ");
		}
		
		System.out.println(result);
		
	}
	
	static int binarySearch(int[] numCard, int num) {
		
		int	first = 0;
		int last = numCard.length - 1;
		int mid = 0;
		
		while (first <= last) {
			mid = (first+last) / 2;
			
			if (numCard[mid] == num) {
				return 1;
			}
			
			if (numCard[mid] < num) {
				first = mid + 1;
			}
			else {
				last = mid - 1;
			}
		}
		
		return 0;
		
	}
}

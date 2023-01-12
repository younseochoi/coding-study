import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int K;
	static int[] tmp;
	static int count = 0;
	static int result = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		tmp = new int[N];
		merge_sort(A, 0, N-1);
		
		System.out.println(result);
	
	}
	
	// A[first .. end]를 오름차순 정렬한다.

	static void merge_sort(int[] A, int first, int end) {
		
		if (first < end) {
			int mid = (first+end) / 2; 
			merge_sort(A, first, mid); // 전반부 정렬
			merge_sort(A, mid+1, end); // 후반부 정렬
			merge(A, first, mid, end); // 병합
		}
	}
	
	// A[first .. mid]와 A[mid+1, end]를 병합하여 A[first .. end]를 오름차순 정렬된 상태로 만든다.
	// A[first .. mid]와 A[mid+1, end]는 이미 오름차순으로 정렬되어 있다.
	
	static void merge(int[] A, int first, int mid, int end) {
		
		int i = first;
		int j = mid+1;
		int t = 0;
		
		while (i <= mid && j <= end) {
			if (A[i] <= A[j]) {
				tmp[t++] = A[i++];
			}
			else {
				tmp[t++] = A[j++];
			}
		}
		
		// 왼쪽 배열 부분이 남은 경우
		
		while (i <= mid) {
			tmp[t++] = A[i++];
		}
		
		// 오른쪽 배열 부분이 남은 경우
		
		while (j <= end) {
			tmp[t++] = A[j++];
		}
		
		i = first;
		t = 0;
		
		// 결과를 A[first .. end]에 저장한다.
		
		while (i <= end) {
			count++;
			if (count == K) {
				result = tmp[t];
				break;
			}
			A[i++] = tmp[t++];
		}

	}
}
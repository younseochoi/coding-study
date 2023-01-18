//출처 : https://travelerfootprint.tistory.com/261
//음... 아직도 잘 이해가 안됩니다...ㅜㅜㅋㅋ...

import java.util.*;

class MergeArray{
	int[] A;
	private int[] tmp;
	private int k;
	private int cnt;
	public void merge_sort(int p, int r) {		//배열 A를 클래스 멤버 변수로
		int q;
	    if (p < r) {
	        q = (p + r) / 2;
	        merge_sort(p, q);
	        merge_sort(q + 1, r);
	        merge(p, q, r);
	    }
	}
	
	private void merge(int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int t = 0;				//배열은 0부터 시작하기에 0으로 초기화
	    while (i <= q && j <= r) {
	        if (A[i] <= A[j])
	        	tmp[t++] = A[i++];
	        else  
	        	tmp[t++] = A[j++];
	    }
	    while (i <= q)
	        tmp[t++] = A[i++];
	    while (j <= r)
	        tmp[t++] = A[j++];
	    i = p; t = 0;				//바로 위 주석과 같은 이유
	    while (i <= r) {
	    	A[i++] = tmp[t++];
	    	cnt++;
	    	if(cnt == k) {
	    		System.out.println(A[i - 1]);
	    		System.exit(0);
	    	}
	    }
	}
	
	MergeArray(int n, int k){
		A = new int[n];
		tmp = new int[n];
		this.k = k;
		cnt = 0;
	}
}

class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	
    	MergeArray m = new MergeArray(n, k);
    	for(int i = 0; i < n; i++)
    		m.A[i] = sc.nextInt();
    	m.merge_sort(0, n - 1);				//배열은 0부터 n-1까지이기 때문에
    	System.out.println(-1);
    	sc.close();
    }
}

/*
53163572	dnffktmdgml	 24060	맞았습니다!!	314508	1764	Java 11 / 수정	1420	
*/
package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
    static int N, M;
    static int[] arr;
    static boolean[] isUsed;
    static BufferedWriter bw;
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M+1];
        isUsed = new boolean[N+1];

        recursion(0);

        bw.flush();
        bw.close();
    }
    
    private static void recursion(int K) throws IOException {
        if (K == M) { // 모든 배열의 원소가 찼을 때,
            for (int i = 0; i < M; i++) {
                bw.write(arr[i] + " ");
                // 만약 여기서 배열의 들어있는 값의 방문여부를 false로 해주는건? -> 그러면 다시 돌아갔을 때, 중복이 나오게 된다.
                // ex) isUsed[arr[i]] = false; ? 어떻게 될까?? X
            }
            bw.newLine();
        } else {
        	for (int i = 1; i <= N; i++) { // [1, ] [2, ] [3, ] 이런식으로 호출하게끔
        		if (!isUsed[i]) { // 사용 안했을 때만, 실행
        			arr[K] = i; // arr[인덱스]에 i값을 넣어주고
        			isUsed[i] = true; // 방문 여부 표시!
        			recursion(K + 1); // 배열의 다음 칸을 채우기 위해서 K를 +1해주고 다시 재귀로 돌린다. K++를 해주면 안되는 이유: for문을 돌렸을때, IndexOutOfBoundExcepiton 발생 간으!
        			isUsed[i] = false; // recursion이 다 수행됐다면, 출력도 끝났다는 의미이니, 이제 해당 i값이 유지될때, 방문여부를 없애준다.(어차피 현재 for문은 이전 i값을 사용 안한다.)
        		}
        	}        	
        }
    }
}
/*
 * 54368930	dnffktmdgml	 15649	맞았습니다!!	31444	324	Java 11 / 수정	1976	
 */
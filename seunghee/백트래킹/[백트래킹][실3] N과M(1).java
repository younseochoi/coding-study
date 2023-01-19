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
        if (K == M) {
            for (int i = 0; i < M; i++) {
                bw.write(arr[i] + " ");
            }
            bw.newLine();
        } else {
        	for (int i = 1; i <= N; i++) {
        		if (!isUsed[i]) {
        			arr[K] = i;
        			isUsed[i] = true;
        			recursion(K + 1);
        			isUsed[i] = false;
        		}
        	}        	
        }
    }
}
/*
 * 54368930	dnffktmdgml	 15649	맞았습니다!!	31444	324	Java 11 / 수정	1976	
 */
package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
    static int N, M;
    static int[] arr;
    //static boolean[] isUsed;
    static BufferedWriter bw;
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M+1];
        //isUsed = new boolean[N+1];

        recursion(0);

        bw.flush();
        bw.close();
    }
    
    private static void recursion(int K) throws IOException {
        if (K == M) { // 모든 배열의 원소가 찼을 때,
            for (int i = 0; i < M; i++) {
                bw.write(arr[i] + " ");
            }
            bw.newLine();
        } else {
        	for (int i = 1; i <= N; i++) {
        		if(K>0 && arr[K-1]>i) {
        			continue;
        		}
        		arr[K] = i;
        		recursion(K + 1);
        	}        	
        }
    }
}
/*
 * 54374701	dnffktmdgml	 15652	맞았습니다!!	20336	224	Java 11 / 수정	1298	
 */
//참고 : https://hyunipad.tistory.com/88

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static String[][] arr;
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		arr = new String[num][num];
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				arr[i][j] = " ";
			}
		}
		
		star(arr, 0, 0, num);
		
		for(int i = 0 ; i < num ; i++) {
			for(int j = 0 ; j < num ; j++) {
				bw.write(arr[i][j]);					
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	} 
	
	public static void star(String[][] arr, int x, int y, int N) {
		if(N == 1) {
			arr[x][y] = "*";
			return;
		}
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				if(!(i == 1 && j == 1)) {
					star(arr, x + i*(N/3), y + j*(N/3), N/3);
				}
			}
		}
    }
}
/*
53266091	dnffktmdgml	 2447	맞았습니다!!	34776	408	Java 11 / 수정	1211	10초 전
*/
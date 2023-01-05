//출처 : https://blog.itcode.dev/posts/2021/05/22/a1004

package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int length = Integer.parseInt(br.readLine());
		
		for(int i=0; i<length; i++) {
			String base = br.readLine();
			
			int x_start = Integer.parseInt(base.split(" ")[0]);
            int y_start = Integer.parseInt(base.split(" ")[1]);
            
            int x_end = Integer.parseInt(base.split(" ")[2]);
            int y_end = Integer.parseInt(base.split(" ")[3]);
            
            int through = 0;
            int count = Integer.parseInt(br.readLine());
            
            for (int j = 0; j < count; j++) {
                String circle = br.readLine();
                
                int x = Integer.parseInt(circle.split(" ")[0]);
                int y = Integer.parseInt(circle.split(" ")[1]);
                int r = Integer.parseInt(circle.split(" ")[2]);
                
                boolean hasStartContain = hasContain(x_start, y_start, x, y, r);
                boolean hasEndContain = hasContain(x_end, y_end, x, y, r);
                
                // 해당 행성이 출발 혹은 도착점 중 하나만을 포함할 경우
                if (!(hasStartContain && hasEndContain) && (hasStartContain || hasEndContain)) {
                    through++;
                }
            }
            bw.write(String.valueOf(through));
            bw.newLine();
        }
		bw.flush();
		bw.close();
	}
	private static boolean hasContain(int xo, int yo, int x, int y, int r) {
		return Math.sqrt(Math.pow(xo - x, 2) + Math.pow(yo - y, 2)) < r;
	}
}
/*
53549744	dnffktmdgml	 1004	맞았습니다!!	18888	196	Java 11 / 수정	1895	4초 전
*/
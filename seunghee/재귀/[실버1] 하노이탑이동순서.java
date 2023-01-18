import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static int answer = 0;
    public static StringBuilder sb = new StringBuilder();
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		moveHanoiTower(num, 1, 2, 3);
	    sb.insert(0, answer + "\n");
	    
    	bw.write(sb.toString());
    	bw.newLine();
		bw.flush();
		bw.close();
	}
	
	public static void moveHanoiTower(int num, int from, int by, int to) {
        ++answer;
        // 이동할 원반의 수가 1개라면?
        if(num == 1) {
            sb.append(from + " " + to + "\n");
        } else {
            // STEP 1 : num-1개를 A에서 B로 이동
            moveHanoiTower(num-1, from, to, by);
            // STEP 2 : 1개를 A에서 C로 이동
            sb.append(from + " " + to + "\n");
            // STEP 3 : num-1개를 B에서 C로 이동
            moveHanoiTower(num-1, by, from, to);
        }	
    }
	
}
/*
53122786	dnffktmdgml	 25501	맞았습니다!!	20004	272	Java 11 / 수정	954	9초 전
*/
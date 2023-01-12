package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        HashMap<Integer, String> hm_str = new HashMap<>();
        HashMap<String, Integer> hm_int = new HashMap<>();
        for(int i=0; i<n; i++) {
        	String pocketmon = br.readLine();
        	hm_str.put(i, pocketmon);
        	hm_int.put(pocketmon, i);
        }
        
        for(int j=0; j<m; j++) {
        	String find = br.readLine();
        	if(Character.isDigit(find.charAt(0))) {
        		bw.write(hm_str.get(Integer.parseInt(find)-1));
        		bw.newLine();
        	} else {
        		bw.write(String.valueOf(hm_int.get(find)+1));
        		bw.newLine();
        	}
        }
        bw.flush();
        bw.close();
    }
}

/*
53476643 dnffktmdgml 1620	맞았습니다!!	48384	524	Java 11 / 수정	1340	13초 전
*/

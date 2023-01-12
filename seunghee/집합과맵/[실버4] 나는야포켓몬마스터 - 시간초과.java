package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0; i<n; i++) {
        	arr.add(br.readLine());
        }
        
        for(int j=0; j<m; j++) {
        	String name = br.readLine();
        	if(Character.isDigit(name.charAt(0))) {
        		bw.write(arr.get(Integer.parseInt(name)-1));
        		bw.newLine();
        	} else {
        		bw.write(String.valueOf(arr.indexOf(name)+1));
        		bw.newLine();
        	}
        }
        bw.flush();
        bw.close();
    }
}

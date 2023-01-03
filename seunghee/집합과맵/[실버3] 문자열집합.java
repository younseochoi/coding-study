//출처 : https://propercoding.tistory.com/90

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), 0);
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (map.containsKey(br.readLine())) count++;
        }
        System.out.print(count);
    }
}
/*
53422827	dnffktmdgml	 14425	맞았습니다!!	31076	412	Java 11 / 수정	676	41초 전
*/
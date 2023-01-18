//출처 : https://propercoding.tistory.com/90

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        HashSet<String> map = new HashSet<>();
        for (int i = 0; i < n; i++) {
            map.add(br.readLine());
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (map.contains(br.readLine())) count++;
        }
        System.out.print(count);
    }
}
/*
53422976	dnffktmdgml	 14425	맞았습니다!!	31008	416	Java 11 / 수정	807	11초 전
*/
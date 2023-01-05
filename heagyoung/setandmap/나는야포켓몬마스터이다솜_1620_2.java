//맵을 썼다가 리스트를 썼다가 다시 맵과 리스트를 같이 썼습니다.

import java.util.*;
import java.io.*;
public class 나는야포켓몬마스터이다솜_1620_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []number = new int[2];
        
        StringTokenizer st;
        Map<String, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<2;i++){
            number[i]=Integer.parseInt(st.nextToken());
        }
        String []mons = new String[number[0]];   
        for(int a=0; a<number[0]; a++){
            String inputt = br.readLine();
            mons[a]=inputt;
            map.put(inputt, a+1);
        }
        for(int b=0; b<number[1]; b++){
            String quest=br.readLine();
            if(quest.charAt(0)<=57)//입력값이 숫자인 경우 인덱스값에서 +1한값을 입력받은것
                System.out.println(mons[Integer.parseInt(quest)-1]);
            else // 실제 위치 +1 한 값이 번호
                System.out.println(map.get(quest));
            
        }

    }
}

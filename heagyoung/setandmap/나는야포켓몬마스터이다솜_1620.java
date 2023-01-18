import java.util.*;
import java.io.*;
public class 나는야포켓몬마스터이다솜_1620 {
    public static boolean isInteger(String strValue) {
        try {
          Integer.parseInt(strValue);
          return true;
        } catch (NumberFormatException ex) {
          return false;
        }
      }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []number = new int[2];  
        StringTokenizer st;
        Map<String, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<2;i++){
            number[i]=Integer.parseInt(st.nextToken());
        }
        for(int a=0; a<number[0]; a++){
            map.put(br.readLine(),a+1);
        }
        for(int b=0; b<number[1]; b++){
            String quest=br.readLine();
            if(isInteger(quest)){ //입력값이 숫자인 경우 value값 비교로 key 값 찾기
                for (String key : map.keySet()) {
                    if(Integer.parseInt(quest)==map.get(key)){
                        System.out.println(key);
                    }
                }
            }
            else{ // 입력값이 문자인 경우 key값 찾기로 value 반환
                System.out.println(map.get(quest));
            }
        }

    }
}

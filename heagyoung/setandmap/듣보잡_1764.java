import java.util.*;
import java.io.*;
public class 듣보잡_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []number = new int[2];
        
        StringTokenizer st;
        Map<String, Integer> map = new HashMap<>();
        
        ArrayList<String> dic = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<2;i++){
            number[i]=Integer.parseInt(st.nextToken());
        }
        for(int a=0; a<number[0]; a++){
            String quest=br.readLine(); 
            map.put(quest,a);
        }
        for(int b=0; b<number[1]; b++){
            String quest=br.readLine();
            if(map.containsKey(quest)){
                dic.add(quest);
            }
        }
        dic.sort(Comparator.naturalOrder());
        System.out.println(dic.size());
        for(String a : dic){
            System.out.println(a);
        }
    }
}

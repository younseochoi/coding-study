import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    static ArrayList<String> list = new ArrayList();
    
    public int solution(String numbers) {
        int answer = 0;
        
        // 순열 함수에 전달할 변수들
        String [] number = numbers.split("");
        int count = number.length;
        String [] output = new String [count];
        boolean[] visited = new boolean[count];
        
        // 순열 함수 호출
        for (int i=1; i<number.length+1; i++) {
            perm(number, output, visited, 0, count, i);
        }
        
        // 순열 담긴 배열 길이만큼 int[] 생성
        int[] num = new int[list.size()];
        
        // 순열 int 형식으로 담기
        for (int i=0; i<list.size(); i++) {
            num[i] = Integer.parseInt(list.get(i));
        }
        
        // 제곱근 이용하여 소수 판별
        for (int j=0; j<num.length; j++) {
            for (int i=2; i<=Math.sqrt(num[j]); i++) {
                if(num[j] % i == 0) num[j] = 0;   
           }
        }

        ArrayList<Integer> decimalList = new ArrayList();
        
        // 소수 판단 담긴 배열에서 0,1 제외한 숫자들 decimalList에 담기
        for (int listNum : num) {
            if(listNum != 0 && listNum != 1) decimalList.add(listNum);
        }
        
        // ArrayList를 HashSet으로 변경하여 중복 제거        
        HashSet<Integer> set = new HashSet(decimalList);  
        
        // 다시 HashSet을 ArrayList로 변경        
        ArrayList <Integer> newList = new ArrayList(set);
        
        answer = newList.size();
        return answer;
    }
    
    // 순열 구하는 함수
    static void perm(String[] arr, String [] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            // 리스트에 담긴 숫자들 조합 합친 뒤 뒤에 붙은 null 제거
            list.add(String.join("",output).replaceAll("null",""));
            return;
        }

        for (int i=0; i<n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);       
                visited[i] = false;
            }
        }
    }
}
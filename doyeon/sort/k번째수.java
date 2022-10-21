import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // ArrayList에 array 값 담기
        List<Integer> list = new ArrayList();
        for (int num : array) {
            list.add(num);
        }
        
        for (int i=0; i<commands.length; i++) {
            // newArray에 인덱스에 따라 자른 리스트 담기
            List<Integer> newArray = new ArrayList(list.subList(commands[i][0]-1, commands[i][1]));
            // 오름차순 정렬
            Collections.sort(newArray);
            // k 번째 값 answer에 담기
            answer[i] = newArray.get(commands[i][2]-1);
        }
            
        return answer;
    }
}
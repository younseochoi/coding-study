import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        // 찍는 방식
        
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        // 맞힌 문제 수 구하기
        
        int one_cnt = 0;
        int two_cnt = 0; 
        int three_cnt = 0;
        
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == one[i%5]) one_cnt++;
            if (answers[i] == two[i%8]) two_cnt++;
            if (answers[i] == three[i%10]) three_cnt++;
        }
        
        // 가장 많이 맞힌 사람 구하기
        
        int max = Math.max(one_cnt, Math.max(two_cnt, three_cnt));
        
        List<Integer> list = new ArrayList<>();
        
        if (max == one_cnt) list.add(1);
        if (max == two_cnt) list.add(2);
        if (max == three_cnt) list.add(3);
        
        int[] answer = new int[list.size()];
        
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

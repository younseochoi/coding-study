import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // max = 총 N마리의 폰켓몬 중 N/2마리
        
        int max = nums.length / 2;

        // 중복 제거 
    
        HashSet<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            numsSet.add(num);
        }

        // numSet의 size가 max보다 크면 answer = max, max보다 작다면 answer = numSet.size()

        if (numsSet.size() > max) {
            answer = max;
        } 
        else {
            answer = numsSet.size();
        }
        
        return answer;
    }
}

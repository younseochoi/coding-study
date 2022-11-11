import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> po = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if(po.contains(nums[i]))
                continue;
            po.add(nums[i]);
        }
        if (po.size()>=nums.length/2)
            answer=nums.length/2;
        else 
            answer=po.size();
        return answer;
    }
}
package hash;

import java.util.HashSet;

public class 폰켓몬 {

	public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>(); 
        int len = nums.length/2; // 가져갈 수 있는 포켓몬 개수
        
        for(int n: nums) {
        	set.add(n); // nums 요소 중복제거, set에 넣기
        }
        
     // 선택할 수 있는 종류 개수 , 가져갈 수 있는 포켓몬 개수  두 값중 최소값이 답
        if(set.size()<len) { 
        	answer = set.size();
        }else {
        	answer = len;
        }
        return answer;
    }
}

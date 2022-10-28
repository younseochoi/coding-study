import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
    
		int answer = 0;
		
		//선택할 수 있는 폰켓몬의 수 = nums/2
		int length = nums.length/2;
		
		//hash에 n번 종류의 포켓몬을 넣는다 (이 과정에서 중복은 저장되지 않는다)
		HashSet<Integer> hs = new HashSet<>();
        for (Integer num : nums) hs.add(num);
        
        //가질 수 있는 폰켓몬의 수 vs 폰켓몬의 종류의 수 중 적은 수 만큼 폰켓몬을 가질 수 있음
        answer = Math.min(length, hs.size());
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.04ms, 70.7MB)
테스트 2 〉	통과 (0.07ms, 77.2MB)
테스트 3 〉	통과 (0.07ms, 72.8MB)
테스트 4 〉	통과 (0.07ms, 72.6MB)
테스트 5 〉	통과 (0.10ms, 74MB)
테스트 6 〉	통과 (0.14ms, 73.1MB)
테스트 7 〉	통과 (0.18ms, 73.5MB)
테스트 8 〉	통과 (0.48ms, 78.5MB)
테스트 9 〉	통과 (0.42ms, 75.8MB)
테스트 10 〉	통과 (0.24ms, 77.4MB)
테스트 11 〉	통과 (0.39ms, 72.9MB)
테스트 12 〉	통과 (0.38ms, 74.8MB)
테스트 13 〉	통과 (0.60ms, 78.4MB)
테스트 14 〉	통과 (0.53ms, 77.5MB)
테스트 15 〉	통과 (0.91ms, 78.1MB)
테스트 16 〉	통과 (3.45ms, 81.6MB)
테스트 17 〉	통과 (3.83ms, 79.6MB)
테스트 18 〉	통과 (3.45ms, 78MB)
테스트 19 〉	통과 (2.51ms, 83.2MB)
테스트 20 〉	통과 (2.04ms, 80.3MB)
*/
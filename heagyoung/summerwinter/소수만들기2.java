import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List <Integer> numbers = new ArrayList<>();
        for(int a=0;a<nums.length-2;a++){
            for(int b=a+1;b<nums.length-1;b++){
                for(int c=b+1; c<nums.length;c++){
                    if((nums[a]+nums[b]+nums[c])%2!=0){
                        numbers.add(nums[a]+nums[b]+nums[c]);
                        //System.out.println(nums[a]+"+"+nums[b]+"+"+nums[c]+"="+(nums[a]+nums[b]+nums[c]));
                    }
                }
            }
        }
        answer=numbers.size();
        for(int i : numbers){
            for(int j=3;j<i;j++){
                if (i%j==0){
                    answer--;
                    //System.out.println(i+" 안됨 "+j+" 가능한수 "+answer);
                    
                    break;
                }
            }
        }
        return answer;
    }
}
/* 중복도 카운트 한 결과
테스트 1 〉	통과 (1.34ms, 66.2MB)
테스트 2 〉	통과 (1.55ms, 79.4MB)
테스트 3 〉	통과 (0.85ms, 78.1MB)
테스트 4 〉	통과 (0.41ms, 76.6MB)
테스트 5 〉	통과 (1.83ms, 82.2MB)
테스트 6 〉	통과 (8.66ms, 77.9MB)
테스트 7 〉	통과 (0.52ms, 77.2MB)
테스트 8 〉	통과 (8.36ms, 76.3MB)
테스트 9 〉	통과 (1.86ms, 74.5MB)
테스트 10 〉	통과 (7.28ms, 78.7MB)
테스트 11 〉	통과 (0.10ms, 71.7MB)
테스트 12 〉	통과 (0.10ms, 74.5MB)
테스트 13 〉	통과 (0.12ms, 71.3MB)
테스트 14 〉	통과 (0.08ms, 76.2MB)
테스트 15 〉	통과 (0.07ms, 78.3MB)
테스트 16 〉	통과 (15.34ms, 85.9MB)
테스트 17 〉	통과 (0.52ms, 75.7MB)
테스트 18 〉	통과 (0.84ms, 80.9MB)
테스트 19 〉	통과 (0.13ms, 76.9MB)
테스트 20 〉	통과 (16.49ms, 82MB)
테스트 21 〉	통과 (14.74ms, 85.3MB)
테스트 22 〉	통과 (0.20ms, 78MB)
테스트 23 〉	통과 (0.02ms, 70.7MB)
테스트 24 〉	통과 (15.91ms, 79.6MB)
테스트 25 〉	통과 (12.53ms, 73.9MB)
테스트 26 〉	통과 (0.03ms, 78.1MB)
 */
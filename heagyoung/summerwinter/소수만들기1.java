public class 소수만들기1 {
    import java.util.*;
//3개의 숫자를 더했을 때 소수가 아닐경우
//홀+홀+짝, 짝+짝+짝, 3~7까지로 나눴을때 나머지가 0인 경우, 제곱수인 경우
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int a=0;a<nums.length-2;a++){
            for(int b=a+1;b<nums.length-1;b++){
                for(int c=b+1; c<nums.length;c++){
                    if((nums[a]+nums[b]+nums[c])%2!=0){
                        set.add(nums[a]+nums[b]+nums[c]);
                        //System.out.println(nums[a]+"+"+nums[b]+"+"+nums[c]+"="+(nums[a]+nums[b]+nums[c]));
                    }
                }
            }
        }
        System.out.println(" ");
        answer=set.size();
        int number=0;
        //System.out.println(answer+ " 총");
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            number=iter.next().intValue();
            
            for(int j=3;j<number;j++){
                if (number%j==0){
                    answer--;
                    break;
                    //System.out.println(number+" 안됨 "+j+" 가능한수 "+answer);
                    
                }
            }
            
            //System.out.println(number+ " 됨");
        }
        //

        return answer;
    }
    
    
}/*
일부러 중복 제거했는데 중복 포함이라고 합니다
테스트 1 〉	실패 (0.64ms, 74.6MB)
테스트 2 〉	실패 (0.79ms, 76.1MB)
테스트 3 〉	실패 (0.67ms, 73.6MB)
테스트 4 〉	실패 (0.35ms, 84.4MB)
테스트 5 〉	실패 (0.79ms, 73.6MB)
테스트 6 〉	실패 (3.86ms, 80.3MB)
테스트 7 〉	실패 (0.72ms, 80.3MB)
테스트 8 〉	실패 (3.56ms, 72.4MB)
테스트 9 〉	실패 (1.22ms, 75MB)
테스트 10 〉	실패 (4.13ms, 72.2MB)
테스트 11 〉	실패 (0.26ms, 73.7MB)
테스트 12 〉	실패 (0.32ms, 80.4MB)
테스트 13 〉	실패 (0.32ms, 83.1MB)
테스트 14 〉	실패 (0.19ms, 75MB)
테스트 15 〉	실패 (0.35ms, 76.4MB)
테스트 16 〉	실패 (11.07ms, 82.7MB)
테스트 17 〉	통과 (1.05ms, 73.2MB)
테스트 18 〉	통과 (0.58ms, 77.6MB)
테스트 19 〉	통과 (0.29ms, 75.2MB)
테스트 20 〉	실패 (8.51ms, 75.9MB)
테스트 21 〉	실패 (11.42ms, 75MB)
테스트 22 〉	통과 (0.36ms, 77.4MB)
테스트 23 〉	통과 (0.14ms, 74MB)
테스트 24 〉	실패 (9.49ms, 76.9MB)
테스트 25 〉	실패 (5.32ms, 77.8MB)
테스트 26 〉	통과 (0.15ms, 75.7MB)
*/
}

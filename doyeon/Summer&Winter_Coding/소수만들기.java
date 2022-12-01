import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList();
        int sum = 0;
        
        // 합할 수 있는 경우의 수 arr에 순서대로 넣기
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                }
            }   
        }

        for (int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
            
            // 3개씩 끊어서 더해진 sum이 소수이면 answer++
            if((i+1) % 3 == 0) {
                answer += isPrime(sum) ? 1 : 0;
                sum = 0;
            }
        }
        return answer;
    }
    
    // 소수 판별
    public static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (4.13ms, 79.5MB)
// 테스트 2 〉	통과 (3.83ms, 75.5MB)
// 테스트 3 〉	통과 (1.03ms, 77.3MB)
// 테스트 4 〉	통과 (1.02ms, 74.1MB)
// 테스트 5 〉	통과 (4.96ms, 72.5MB)
// 테스트 6 〉	통과 (5.14ms, 78.3MB)
// 테스트 7 〉	통과 (0.69ms, 74MB)
// 테스트 8 〉	통과 (8.96ms, 78.9MB)
// 테스트 9 〉	통과 (3.11ms, 78.7MB)
// 테스트 10 〉	통과 (12.14ms, 88.4MB)
// 테스트 11 〉	통과 (0.31ms, 67.6MB)
// 테스트 12 〉	통과 (0.21ms, 78.4MB)
// 테스트 13 〉	통과 (0.51ms, 75.5MB)
// 테스트 14 〉	통과 (2.44ms, 70.1MB)
// 테스트 15 〉	통과 (0.17ms, 73.4MB)
// 테스트 16 〉	통과 (12.38ms, 80.3MB)
// 테스트 17 〉	통과 (14.03ms, 78.7MB)
// 테스트 18 〉	통과 (0.76ms, 80.8MB)
// 테스트 19 〉	통과 (0.03ms, 73.2MB)
// 테스트 20 〉	통과 (15.61ms, 80.9MB)
// 테스트 21 〉	통과 (10.50ms, 68.9MB)
// 테스트 22 〉	통과 (3.34ms, 79.2MB)
// 테스트 23 〉	통과 (0.04ms, 72.8MB)
// 테스트 24 〉	통과 (9.30ms, 78.2MB)
// 테스트 25 〉	통과 (12.87ms, 80.6MB)
// 테스트 26 〉	통과 (0.03ms, 68.5MB)
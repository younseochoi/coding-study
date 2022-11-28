class Solution {
    public int solution(int[] nums) {
      int answer = 0;
		  int sum = 0;
	      
      // 서로 다른 3개의 수 더하기
        
      for (int i=0; i<nums.length-2; i++) {
	      for (int j=i+1; j<nums.length-1; j++) {
	        for (int k=j+1; k<nums.length; k++) {
	          sum = nums[i] + nums[j] + nums[k];
	                
             // 소수이면 answer에 1을 더한댜.
                    
	            if (!isPrime(sum)) {
	              answer++;
	            }
	                    
	          }
	        }
	      }  
      return answer;
    }
    
    // 소수가 아니면 true, 소수면 false
	
	  public static boolean isPrime(int sum) {
		
		  if (sum < 2) return true;
		
		  for (int i=2; i<= Math.sqrt(sum); i++) {
			  if (sum % i == 0) return true;
		   }
		  return false;
	}
}

/*
테스트 1 〉	통과 (0.39ms, 73.8MB)
테스트 2 〉	통과 (0.66ms, 73.9MB)
테스트 3 〉	통과 (0.15ms, 73.7MB)
테스트 4 〉	통과 (0.21ms, 80.2MB)
테스트 5 〉	통과 (0.50ms, 75.2MB)
테스트 6 〉	통과 (1.02ms, 74.8MB)
테스트 7 〉	통과 (0.11ms, 79.6MB)
테스트 8 〉	통과 (2.00ms, 75MB)
테스트 9 〉	통과 (0.30ms, 75.2MB)
테스트 10 〉	통과 (1.29ms, 77.6MB)
테스트 11 〉	통과 (0.04ms, 77.4MB)
테스트 12 〉	통과 (0.06ms, 73.6MB)
테스트 13 〉	통과 (0.06ms, 73.2MB)
테스트 14 〉	통과 (0.05ms, 76.5MB)
테스트 15 〉	통과 (0.03ms, 67.1MB)
테스트 16 〉	통과 (1.55ms, 72MB)
테스트 17 〉	통과 (1.44ms, 81.2MB)
테스트 18 〉	통과 (0.10ms, 77.3MB)
테스트 19 〉	통과 (0.04ms, 77.7MB)
테스트 20 〉	통과 (1.89ms, 72.9MB)
테스트 21 〉	통과 (2.36ms, 76.9MB)
테스트 22 〉	통과 (0.30ms, 65.6MB)
테스트 23 〉	통과 (0.02ms, 74.4MB)
테스트 24 〉	통과 (2.55ms, 77MB)
테스트 25 〉	통과 (2.58ms, 68MB)
테스트 26 〉	통과 (0.05ms, 82.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

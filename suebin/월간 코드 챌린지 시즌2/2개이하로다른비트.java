import java.util.*;

class Solution {
    public long[] solution(long[] numbers) {
        
        // numbers의 값을 복사한다.
        
        long[] answer = numbers.clone();
        
        for(int i = 0; i< answer.length; i++){
            
            // 양의 정수 x보다 커야하는 조건을 위해 1을 더한다.
            
            answer[i]++;
            
            // XOR 연산자(^) : 비트가 같으면 0을, 다르면 1을 리턴
            // 쉬프트 연산자(>>) : 비트를 오른쪽으로 이동시킨다. (x>>n은 x/2^n과 같지만 보다 프로그램 실행 속도가 더 빠르다.)
            
            answer[i] += (answer[i]^numbers[i])>>2;
        }
        return answer;
    }
}


/*
테스트 1 〉	통과 (0.08ms, 80.9MB)
테스트 2 〉	통과 (2.92ms, 117MB)
테스트 3 〉	통과 (0.02ms, 75.5MB)
테스트 4 〉	통과 (0.08ms, 78.1MB)
테스트 5 〉	통과 (0.06ms, 74.5MB)
테스트 6 〉	통과 (0.09ms, 67.4MB)
테스트 7 〉	통과 (3.12ms, 114MB)
테스트 8 〉	통과 (3.06ms, 117MB)
테스트 9 〉	통과 (4.46ms, 96.9MB)
테스트 10 〉	통과 (4.39ms, 108MB)
테스트 11 〉	통과 (4.29ms, 122MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/


/*
위의 코드는 구글링을 통해 완성한 코드입니다.
아래는 초반에 혼자서 푼 코드입니다.
테스트 케이스가 절반만 통과되어서 구글링했습니다.

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
		
		for (int i=0; i<numbers.length; i++) {
            long num = numbers[i];
            
            // 만약 num 이 2로 나누어떨어진다면 무조건 그 다음 수가 답이다.
            
            if (num % 2 == 0) { answer[i] = num + 1; }
            
            // 비트의 자릿수를 담은 배열 list를 가져온다. (2의 n승에서 n)
            
            List<Long> list = getList(num);
            
            int j = 1;
            
            // x에서 1씩 더해가면서 기존 list와 다른 수가 몇 개인지 알아본다.
            
            while(true) {
                int cnt = 0;
                List<Long> list2 = getList(num + j);
                for(Long n : list)  {
                    if (list2.contains(n)) {
                        cnt+=2;
                    }
                }
                
                // 만약 다른 수가 2개 이하라면 break
                
                if (list.size() + list2.size() - cnt <= 2) break;
                j++;
            }
            
            // 기존 num에 j만큼 더한 수가 함수 f(num)의 값이다.
            
             answer[i] = num + j;
		}       
        return answer;
    }
    
    // 비트 자릿수(= 2의 n승에서 n)를 담은 list를 반환하는 함수
	
	public static List<Long> getList(long num) {
		
		List<Long> list = new ArrayList<Long>();
		
		while (num != 0) {		
			int n = 0;
			
			while (Math.pow(2, n) <= num) {	n++; }
            
			num = num - (int)Math.pow(2, n-1);
			list.add((long)(n-1));
		}	
		return list;
	}        
}

테스트 1 〉	통과 (10.44ms, 76.9MB)
테스트 2 〉	통과 (1076.95ms, 142MB)
테스트 3 〉	통과 (2.28ms, 82.8MB)
테스트 4 〉	통과 (10.01ms, 78.8MB)
테스트 5 〉	통과 (20.53ms, 69.3MB)
테스트 6 〉	통과 (22.88ms, 90.5MB)
테스트 7 〉	실패 (시간 초과)
테스트 8 〉	실패 (시간 초과)
테스트 9 〉	실패 (시간 초과)
테스트 10 〉	실패 (시간 초과)
테스트 11 〉	실패 (시간 초과)
채점 결과
정확성: 54.5
합계: 54.5 / 100.0
*/

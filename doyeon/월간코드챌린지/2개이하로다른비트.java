import java.util.*;

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i=0; i<numbers.length; i++) {
            String bit = Long.toString(numbers[i], 2);
            
            // 짝수면 1 더하기
            if (numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
                
            } else {
                // 마지막 0이 01로 끝나는 경우
                if (bit.lastIndexOf("0") != -1) {
                    // 01을 10으로 바꿔주기
                    bit = bit.substring(0, bit.lastIndexOf("0")) + "10" + bit.substring(bit.lastIndexOf("0") + 2, bit.length());
                    answer[i] = Long.parseLong(bit, 2);
                    
                // 1로만 이루어진 경우 맨 앞에 1을 10으로 바꿔주기
                } else {
                    bit = "10" + bit.substring(1, bit.length());
                    
                    // long이 아니라 integer로 변환하면 런타임에러 남
                    answer[i] = Long.parseLong(bit, 2);
                }
            }
        }
        
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (12.38ms, 88.4MB)
// 테스트 2 〉	통과 (73.26ms, 99.9MB)
// 테스트 3 〉	통과 (10.14ms, 78.4MB)
// 테스트 4 〉	통과 (12.96ms, 71.7MB)
// 테스트 5 〉	통과 (14.06ms, 78.2MB)
// 테스트 6 〉	통과 (14.44ms, 75.7MB)
// 테스트 7 〉	통과 (96.73ms, 113MB)
// 테스트 8 〉	통과 (86.22ms, 120MB)
// 테스트 9 〉	통과 (94.27ms, 107MB)
// 테스트 10 〉	통과 (171.62ms, 131MB)
// 테스트 11 〉	통과 (132.65ms, 130MB)


// 테스트 케이스 10, 11 실패
class Solution2 {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i=0; i<numbers.length; i++) {
            String bit = Integer.toBinaryString((int) numbers[i]);
            bit = "0" + bit;
            
            if (numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
                
            } else {
                int pos = bit.length() - bit.lastIndexOf("0") - 1;
                answer[i] = numbers[i] + (long) Math.pow(2, pos) - (long) Math.pow(2, pos -1); 
            }
        }
        
        return answer;
    }
}

// 다른 사람 풀이
class Solution3 {
    public long[] solution(long[] numbers) {
        long[] answer = numbers.clone();
        for(int i = 0; i< answer.length; i++){
            answer[i]++;
            answer[i] += (answer[i]^numbers[i])>>>2;
        }
        return answer;
    }
}
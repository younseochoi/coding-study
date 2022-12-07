// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/17682
import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        StringBuilder strnum = new StringBuilder();
        int order = 0;  // 다트 던진 순서
        
        for(int i=0; i < dartResult.length(); i++) {
            Character c = dartResult.charAt(i);
            
            // c가 점수인 경우
            if (c >= '0' && c <= '9') {
                strnum.append(c);
                
            // c가 보너스인 경우
            } else if (c == 'S' || c == 'D' || c == 'T') {
                double num = Double.parseDouble(strnum.substring(0, strnum.length()));
                strnum.delete(0, strnum.length());
                
                int digit = c == 'S' ? 1 : (c == 'D' ?  2 : 3);

                score[order] = (int) Math.pow(num, digit);
                order++;
            
            // c가 옵션인 경우
            } else if (c == '*' || c == '#') {
                // 앞서 증가시킨 순서 되돌리기
                order--;
                
                if (c == '*') {
                    score[order] *= 2;

                    if (order != 0) {
                        score[order-1] *= 2; 
                    }

                } else if (c == '#') {
                    score[order] *= (-1);
                }
                
                // 다시 순서 증가
                order++;
            }
        }
        answer = score[0] + score[1] + score[2]; 
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.66ms, 78.8MB)
// 테스트 2 〉	통과 (0.43ms, 70.8MB)
// 테스트 3 〉	통과 (0.48ms, 75.4MB)
// 테스트 4 〉	통과 (0.42ms, 72.4MB)
// 테스트 5 〉	통과 (0.49ms, 75MB)
// 테스트 6 〉	통과 (0.78ms, 78.5MB)
// 테스트 7 〉	통과 (0.63ms, 79.9MB)
// 테스트 8 〉	통과 (0.48ms, 80.5MB)
// 테스트 9 〉	통과 (0.43ms, 71.3MB)
// 테스트 10 〉	통과 (0.41ms, 78MB)
// 테스트 11 〉	통과 (0.63ms, 70.5MB)
// 테스트 12 〉	통과 (0.44ms, 84.6MB)
// 테스트 13 〉	통과 (0.49ms, 78.2MB)
// 테스트 14 〉	통과 (0.64ms, 75.8MB)
// 테스트 15 〉	통과 (0.49ms, 74MB)
// 테스트 16 〉	통과 (0.50ms, 77.1MB)
// 테스트 17 〉	통과 (0.52ms, 79.2MB)
// 테스트 18 〉	통과 (0.42ms, 75MB)
// 테스트 19 〉	통과 (0.77ms, 74.8MB)
// 테스트 20 〉	통과 (0.44ms, 92.8MB)
// 테스트 21 〉	통과 (0.46ms, 75.3MB)
// 테스트 22 〉	통과 (0.44ms, 84.7MB)
// 테스트 23 〉	통과 (0.42ms, 76.3MB)
// 테스트 24 〉	통과 (0.47ms, 81.3MB)
// 테스트 25 〉	통과 (0.47ms, 83.4MB)
// 테스트 26 〉	통과 (0.44ms, 73.7MB)
// 테스트 27 〉	통과 (0.45ms, 74.2MB)
// 테스트 28 〉	통과 (0.52ms, 73.4MB)
// 테스트 29 〉	통과 (0.61ms, 80.2MB)
// 테스트 30 〉	통과 (0.60ms, 75MB)
// 테스트 31 〉	통과 (0.42ms, 77MB)
// 테스트 32 〉	통과 (0.46ms, 76.3MB)
import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        // 점수 저장 변수
        
        String score = "";
        
        // 3번의 기회에서 얻은 점수 저장 배열
        
        int arr[] = new int[3];
        int idx = 0;
        
        // 숫자일 때는 score 변수에 점수를 저장하고, 그 외 문자열이 입력되는 경우 알맞게 처리해준다.
        
        for (int i=0; i<dartResult.length(); i++) {
            switch(dartResult.charAt(i)) {
                case 'S' :
                    arr[idx] = Integer.parseInt(score);
                    idx++;
                    score = "";
                    break;
                case 'D' :
                    arr[idx] = (int)Math.pow(Integer.parseInt(score),2);
                    idx++;
                    score = "";
                    break;
                case 'T' :
                    arr[idx] = (int)Math.pow(Integer.parseInt(score),3);
                    idx++;
                    score = "";
                    break;
                case '*' :
                    arr[idx-1] *= 2;
                    if (idx > 1) arr[idx-2] *= 2;
                    break;
                case '#' :
                    arr[idx-1] *= (-1);
                    break;
                default :
                    score += String.valueOf(dartResult.charAt(i));
                    break;
            }
            
        }
        
        answer = arr[0] + arr[1] + arr[2];
        
        return answer;
    }
}

/*
정확성  테스트
테스트 1 〉	통과 (2.31ms, 82.8MB)
테스트 2 〉	통과 (1.16ms, 72.6MB)
테스트 3 〉	통과 (2.81ms, 75MB)
테스트 4 〉	통과 (1.76ms, 76.5MB)
테스트 5 〉	통과 (1.65ms, 90MB)
테스트 6 〉	통과 (1.24ms, 71.1MB)
테스트 7 〉	통과 (1.29ms, 74.2MB)
테스트 8 〉	통과 (1.38ms, 74.5MB)
테스트 9 〉	통과 (1.45ms, 73.6MB)
테스트 10 〉	통과 (1.89ms, 81.3MB)
테스트 11 〉	통과 (1.41ms, 74.1MB)
테스트 12 〉	통과 (1.98ms, 72.9MB)
테스트 13 〉	통과 (1.72ms, 82.7MB)
테스트 14 〉	통과 (1.71ms, 75.6MB)
테스트 15 〉	통과 (1.62ms, 76.5MB)
테스트 16 〉	통과 (1.46ms, 79.4MB)
테스트 17 〉	통과 (2.06ms, 74.4MB)
테스트 18 〉	통과 (1.51ms, 69.6MB)
테스트 19 〉	통과 (2.04ms, 65.9MB)
테스트 20 〉	통과 (1.71ms, 75.3MB)
테스트 21 〉	통과 (1.76ms, 77.7MB)
테스트 22 〉	통과 (2.78ms, 77.6MB)
테스트 23 〉	통과 (3.64ms, 78.1MB)
테스트 24 〉	통과 (1.68ms, 75.5MB)
테스트 25 〉	통과 (1.80ms, 74.1MB)
테스트 26 〉	통과 (1.55ms, 72.8MB)
테스트 27 〉	통과 (1.91ms, 78.3MB)
테스트 28 〉	통과 (1.62ms, 80MB)
테스트 29 〉	통과 (1.47ms, 78.3MB)
테스트 30 〉	통과 (1.58ms, 76.1MB)
테스트 31 〉	통과 (1.58ms, 76.6MB)
테스트 32 〉	통과 (1.93ms, 90.4MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

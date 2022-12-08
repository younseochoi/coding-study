//참고: https://fbtmdwhd33.tistory.com/216
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String temp = ""; // 문자열 내 1번의 점수 저장 변수
        int arr[] = new int[3]; // 3번의 점수를 저장할 배열
        int idx = 0; // 배열을 참조하기 위한 idx
        
        for(int i = 0;i<dartResult.length();i++){
            switch(dartResult.charAt(i)){
                case '*':
                    arr[idx-1]*=2;
                    if(idx >1) arr[idx-2]*=2;
                    break;
                case '#':
                    arr[idx-1]*=-1;
                    break;
                case 'S':
                    arr[idx] = (int)Math.pow(Integer.parseInt(temp),1);
                    idx++;
                    temp ="";
                    break;
                case 'D':
                    arr[idx] = (int)Math.pow(Integer.parseInt(temp),2);
                    idx++;
                    temp ="";
                    break;
                case 'T':
                    arr[idx] = (int)Math.pow(Integer.parseInt(temp),3);
                    idx++;
                    temp ="";
                    break;
                default:
                    temp+=String.valueOf(dartResult.charAt(i));
                    break;                    
            } 
        }
        for(int i =0;i<arr.length;i++){
            answer+=arr[i];
        }        
        return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (2.07ms, 82.2MB)
테스트 2 〉	통과 (1.73ms, 76.4MB)
테스트 3 〉	통과 (1.62ms, 75.9MB)
테스트 4 〉	통과 (1.66ms, 75.1MB)
테스트 5 〉	통과 (1.50ms, 72.7MB)
테스트 6 〉	통과 (2.18ms, 79.8MB)
테스트 7 〉	통과 (1.86ms, 75.8MB)
테스트 8 〉	통과 (5.20ms, 82.7MB)
테스트 9 〉	통과 (2.25ms, 67.1MB)
테스트 10 〉	통과 (2.20ms, 70.2MB)
테스트 11 〉	통과 (1.88ms, 74.6MB)
테스트 12 〉	통과 (1.48ms, 76.6MB)
테스트 13 〉	통과 (1.60ms, 73.4MB)
테스트 14 〉	통과 (1.23ms, 72.7MB)
테스트 15 〉	통과 (1.70ms, 73.1MB)
테스트 16 〉	통과 (2.17ms, 71.8MB)
테스트 17 〉	통과 (1.74ms, 76.4MB)
테스트 18 〉	통과 (1.67ms, 70.1MB)
테스트 19 〉	통과 (1.56ms, 74.8MB)
테스트 20 〉	통과 (1.82ms, 81.4MB)
테스트 21 〉	통과 (1.25ms, 78MB)
테스트 22 〉	통과 (1.76ms, 74.1MB)
테스트 23 〉	통과 (1.78ms, 74.6MB)
테스트 24 〉	통과 (1.35ms, 72.5MB)
테스트 25 〉	통과 (1.59ms, 76.9MB)
테스트 26 〉	통과 (2.22ms, 73.4MB)
테스트 27 〉	통과 (1.63ms, 74.8MB)
테스트 28 〉	통과 (2.01ms, 72MB)
테스트 29 〉	통과 (1.95ms, 70.9MB)
테스트 30 〉	통과 (1.99ms, 79.8MB)
테스트 31 〉	통과 (1.43ms, 76.7MB)
테스트 32 〉	통과 (1.57ms, 72.2MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
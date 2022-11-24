//참고: https://blog.naver.com/sinda72/222856358037
class Solution {
    int[] answer = new int[2];
    public int[] solution(int[][] arr) {
        
        quad(0, 0, arr.length, arr);
        
        return answer;
    }
    public void quad(int y, int x, int len, int[][] arr){
        if(check(y, x, len, arr)){
            answer[arr[y][x]]++;
            return;
        }
        //4개의 균일한 정사각형 영역으로 쪼개기
        quad(y, x, len/2, arr);
        quad(y+len/2, x, len/2, arr);
        quad(y, x+len/2, len/2, arr);
        quad(y+len/2, x+len/2, len/2, arr);
    }
    public boolean check(int y, int x, int len, int[][] arr){
        int val = arr[y][x];
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(arr[y+i][x+j]!=val) {
                	return  false;
                }
            }
        }
        return true;
    }
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.21ms, 74.1MB)
테스트 2 〉	통과 (0.32ms, 83.6MB)
테스트 3 〉	통과 (0.06ms, 77.9MB)
테스트 4 〉	통과 (0.03ms, 74.1MB)
테스트 5 〉	통과 (7.49ms, 98.8MB)
테스트 6 〉	통과 (2.54ms, 85.4MB)
테스트 7 〉	통과 (3.90ms, 93.4MB)
테스트 8 〉	통과 (1.65ms, 86.5MB)
테스트 9 〉	통과 (6.28ms, 88.1MB)
테스트 10 〉	통과 (7.85ms, 118MB)
테스트 11 〉	통과 (0.03ms, 78.3MB)
테스트 12 〉	통과 (0.04ms, 75.4MB)
테스트 13 〉	통과 (6.35ms, 99MB)
테스트 14 〉	통과 (13.67ms, 111MB)
테스트 15 〉	통과 (8.24ms, 127MB)
테스트 16 〉	통과 (4.19ms, 95.9MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
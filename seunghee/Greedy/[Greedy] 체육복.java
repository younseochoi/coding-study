import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //여벌 옷을 가지고 있는 학생이 도난 당하면 빌려줄 수 없도록 만든다.
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){ //도난 당한 학생 == 여벌옷 가져온 학생
                    lost[i] = reserve[j] = -1; //-1로 초기화
                    answer++;
                    break;
                }
            }
        }
        
        //옷을 빌려주고 -1로 만들어 뒤의 학생에게 빌려주지 않게 한다.
        for(int k : lost){
            for(int j=0; j<reserve.length; j++){
                if(k == reserve[j]-1 || k == reserve[j]+1){
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}

/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.32ms, 76.1MB)
테스트 2 〉	통과 (0.33ms, 74.4MB)
테스트 3 〉	통과 (0.40ms, 76.2MB)
테스트 4 〉	통과 (0.48ms, 78.7MB)
테스트 5 〉	통과 (0.37ms, 73.3MB)
테스트 6 〉	통과 (0.46ms, 75.5MB)
테스트 7 〉	통과 (0.53ms, 75.6MB)
테스트 8 〉	통과 (0.42ms, 78.4MB)
테스트 9 〉	통과 (0.46ms, 74.2MB)
테스트 10 〉	통과 (0.34ms, 74.6MB)
테스트 11 〉	통과 (0.50ms, 72.1MB)
테스트 12 〉	통과 (0.33ms, 75.1MB)
테스트 13 〉	통과 (0.43ms, 77.4MB)
테스트 14 〉	통과 (0.33ms, 83.1MB)
테스트 15 〉	통과 (0.36ms, 74.3MB)
테스트 16 〉	통과 (0.54ms, 71MB)
테스트 17 〉	통과 (0.33ms, 74.9MB)
테스트 18 〉	통과 (0.53ms, 72.4MB)
테스트 19 〉	통과 (0.48ms, 74.1MB)
테스트 20 〉	통과 (0.35ms, 75.3MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
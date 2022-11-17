class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();

        int index; // 다음 값들을 확인할 때 사용
        int move = length - 1; // 좌우 움직임 수를 체크

        for(int i = 0; i < name.length(); i++){
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i + 1;
            // 연속되는 A 갯수 확인
            while(index < length && name.charAt(index) == 'A'){
                index++;
            }
            move = Math.min(Math.min(move, (length - index) * 2 + i), i * 2 + length - index);
        }
        return answer + move;
    }
}

/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.04ms, 77.5MB)
테스트 2 〉	통과 (0.03ms, 78.9MB)
테스트 3 〉	통과 (0.04ms, 76.1MB)
테스트 4 〉	통과 (0.03ms, 72.5MB)
테스트 5 〉	통과 (0.03ms, 70MB)
테스트 6 〉	통과 (0.05ms, 75.7MB)
테스트 7 〉	통과 (0.04ms, 75.7MB)
테스트 8 〉	통과 (0.04ms, 77.1MB)
테스트 9 〉	통과 (0.03ms, 71.5MB)
테스트 10 〉	통과 (0.05ms, 73.6MB)
테스트 11 〉	통과 (0.04ms, 77.1MB)
테스트 12 〉	통과 (0.05ms, 77.4MB)
테스트 13 〉	통과 (0.05ms, 72.8MB)
테스트 14 〉	통과 (0.05ms, 66.2MB)
테스트 15 〉	통과 (0.04ms, 76.2MB)
테스트 16 〉	통과 (0.04ms, 85.9MB)
테스트 17 〉	통과 (0.03ms, 69.3MB)
테스트 18 〉	통과 (0.06ms, 75.6MB)
테스트 19 〉	통과 (0.05ms, 76.3MB)
테스트 20 〉	통과 (0.06ms, 78.2MB)
테스트 21 〉	통과 (0.05ms, 66.9MB)
테스트 22 〉	통과 (0.05ms, 78MB)
테스트 23 〉	통과 (0.04ms, 76.2MB)
테스트 24 〉	통과 (0.04ms, 75.1MB)
테스트 25 〉	통과 (0.06ms, 75.7MB)
테스트 26 〉	통과 (0.04ms, 67.6MB)
테스트 27 〉	통과 (0.07ms, 73MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
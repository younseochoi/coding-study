import java.util.*;

class Solution {
    public int[] solution(String s) {
        ArrayList arr = new ArrayList();
        int cnt = 0;
        int zeroCnt = 0;
        
        // s에 0이 포함되거나 길이가 1이 아닌 경우
        while (s.contains("0") || s.length() != 1) {
            for (int i=0; i<s.length(); i++) {
                char c = s.charAt(i);

                // 1이면 arr에 추가
                if (c == '1') {
                    arr.add(c);  
                
                // 아니면 0 카운트 추가
                } else {
                    zeroCnt++;
                }
            }
            
            // arr 길이 (1의 개수) 만큼 이진 변환하여 s에 재할당
            s = String.valueOf(Integer.toBinaryString(arr.size()));
            cnt++;
            arr = new ArrayList();
        }
        
        int[] answer = {cnt, zeroCnt};
        return answer;
    }
}


// 정확성  테스트
// 테스트 1 〉	통과 (0.16ms, 81.7MB)
// 테스트 2 〉	통과 (6.06ms, 78.3MB)
// 테스트 3 〉	통과 (0.17ms, 72.3MB)
// 테스트 4 〉	통과 (0.13ms, 73.4MB)
// 테스트 5 〉	통과 (0.14ms, 80.2MB)
// 테스트 6 〉	통과 (0.44ms, 76.9MB)
// 테스트 7 〉	통과 (0.37ms, 78.7MB)
// 테스트 8 〉	통과 (0.24ms, 73.4MB)
// 테스트 9 〉	통과 (9.53ms, 95.5MB)
// 테스트 10 〉	통과 (7.15ms, 74.9MB)
// 테스트 11 〉	통과 (6.07ms, 76.9MB)
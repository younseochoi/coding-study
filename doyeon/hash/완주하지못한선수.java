import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<participant.length-1; i++) {
            // 정렬 후 이름이 서로 일치하지 않으면
            if(!participant[i].equals(completion[i])) {
                // 일치하지 않은 이름이 완주하지 못한 선수
                answer = participant[i];
                break;
            } else {
                // 완주하지 못한 선수 이름 순서가 제일 뒤에 있는 경우
                answer = participant[i+1];
            }
        }
        
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.29ms, 76MB)
// 테스트 2 〉	통과 (0.30ms, 76.9MB)
// 테스트 3 〉	통과 (2.91ms, 82.4MB)
// 테스트 4 〉	통과 (4.87ms, 82.9MB)
// 테스트 5 〉	통과 (3.93ms, 73.5MB)
// 효율성  테스트
// 테스트 1 〉	통과 (134.13ms, 81.5MB)
// 테스트 2 〉	통과 (232.27ms, 89.3MB)
// 테스트 3 〉	통과 (301.33ms, 94.4MB)
// 테스트 4 〉	통과 (271.69ms, 95.2MB)
// 테스트 5 〉	통과 (364.76ms, 95.2MB)



// 효율성 테스트 미통과
//         int[] keyVal = new int[participant.length];
        
//         Map<Integer,String> map = new HashMap();
        
//         for(int i=0; i<participant.length; i++) {
//             map.put(i, participant[i]);
//         }
        
//         Set<Integer> keys = map.keySet();
        
//         for(int k : keys) {
//             for(int j=0; j<completion.length; j++) {
//                 if(map.get(k).equals(completion[j])) {
//                     keyVal[k] = k;
//                     completion[j] = "";
//                     break;
//                 } else {
//                     keyVal[k] = -1;
//                 }
//             }
//         }

//         for(int i=0; i<keyVal.length; i++) {
//             if(keyVal[i] == -1) {
//                 answer = map.get(i);
//             }
//         }
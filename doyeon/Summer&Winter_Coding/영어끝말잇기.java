import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        String prevWord = "";
        int rotation = 1;
        List<String> arr = new ArrayList();
        
        for (int i=0; i < words.length; i++) {
            if (i > 0) {
                prevWord = words[i-1];

                // 끝말잇기 실패, 중복 단어, 길이 1인 단어인 경우
                if (prevWord.charAt(prevWord.length() -1) != words[i].charAt(0) 
                    || arr.contains(words[i]) || words[i].length() == 1) {

                    answer[0] = (i+1) % n == 0 ? n : (i+1) % n;
                    answer[1] = rotation;
                    break;
                } 
            }
            arr.add(words[i]);
            
            // 모든 사람이 한 번씩 말하고 난 후
            if ((i+1) % n == 0) rotation++;
        }
        
        return answer;
    }
}


// 정확성  테스트
// 테스트 1 〉	통과 (0.04ms, 71.3MB)
// 테스트 2 〉	통과 (0.06ms, 77.9MB)
// 테스트 3 〉	통과 (0.02ms, 75.6MB)
// 테스트 4 〉	통과 (0.05ms, 84.1MB)
// 테스트 5 〉	통과 (0.09ms, 75.5MB)
// 테스트 6 〉	통과 (0.03ms, 72.9MB)
// 테스트 7 〉	통과 (0.04ms, 75.9MB)
// 테스트 8 〉	통과 (0.02ms, 74.7MB)
// 테스트 9 〉	통과 (0.04ms, 75.7MB)
// 테스트 10 〉	통과 (0.09ms, 73.9MB)
// 테스트 11 〉	통과 (0.13ms, 75.1MB)
// 테스트 12 〉	통과 (0.05ms, 78.9MB)
// 테스트 13 〉	통과 (0.05ms, 76MB)
// 테스트 14 〉	통과 (0.03ms, 73.9MB)
// 테스트 15 〉	통과 (0.03ms, 77.3MB)
// 테스트 16 〉	통과 (0.04ms, 78.4MB)
// 테스트 17 〉	통과 (0.02ms, 73.8MB)
// 테스트 18 〉	통과 (0.04ms, 75MB)
// 테스트 19 〉	통과 (0.03ms, 72.1MB)
// 테스트 20 〉	통과 (0.23ms, 78MB)
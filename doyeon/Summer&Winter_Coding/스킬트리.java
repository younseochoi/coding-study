import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList();
        int unpass = 0;
        
        // 스킬 arr에 모두 담기
        for (int i=0; i<skill.length(); i++) {
            arr.add(String.valueOf(skill.charAt(i)));    
        }
        
        for (String s : skill_trees) {
            // 맨 처음 스킬이 포함된 경우만
            if (s.contains(arr.get(0))) {
                for (int i=1; i<arr.size(); i++) {
                    // 이후에 있는 스킬 포함 시
                    if (s.contains(arr.get(i))) {
                        // 이전 스킬이 포함되어 있지 않고, 이전 스킬이 현재 스킬 앞에 있을 경우
                        if (!s.contains(arr.get(i-1)) || s.indexOf(arr.get(i-1)) > s.indexOf(arr.get(i))) {
                            // 미패스 처리
                            unpass++;                            
                            break;
                        }
                    }
                }
                
            } else {
                // 첫 글자가 포함되지 않는 경우 모든 스킬이 포함되어 있으면 안 됨
                for (String a : arr) {
                    // 스킬 중 하나라도 포함 시
                    if (s.contains(a)) {
                        // 미패스 처리
                        unpass++;                            
                        break;
                    }
                }
            }
            // 모두 통과되면 answer 카운트 증가, unpass는 초기화
            answer += (unpass == 0 ? 1 : 0);
            unpass = 0;
        }
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.07ms, 90.8MB)
// 테스트 2 〉	통과 (0.09ms, 71.3MB)
// 테스트 3 〉	통과 (0.11ms, 78.5MB)
// 테스트 4 〉	통과 (0.13ms, 67.4MB)
// 테스트 5 〉	통과 (0.13ms, 81.8MB)
// 테스트 6 〉	통과 (0.12ms, 78.2MB)
// 테스트 7 〉	통과 (0.14ms, 70.4MB)
// 테스트 8 〉	통과 (0.10ms, 76.7MB)
// 테스트 9 〉	통과 (0.11ms, 75.9MB)
// 테스트 10 〉	통과 (0.14ms, 80.1MB)
// 테스트 11 〉	통과 (0.24ms, 77.3MB)
// 테스트 12 〉	통과 (0.15ms, 73.4MB)
// 테스트 13 〉	통과 (0.14ms, 73.6MB)
// 테스트 14 〉	통과 (0.06ms, 75.5MB)
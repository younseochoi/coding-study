import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //벨류값은 필요 없지만 containsKey 메소드 이용을 위해 해시맵 사용
        HashMap<String, String> hashMap = new HashMap<String, String>();

        for (int i = 0; i < phone_book.length; i++) {
            hashMap.put(phone_book[i], " ");
        }

        for (String p : phone_book) {
            for (int i = 0; i < p.length(); i++) {
                if (hashMap.containsKey(p.substring(0, i))) {
                    answer = false;
                }
            }
        }
        return answer;
    }
}

//앞에서 한개 틀린 녀석이랑 속도는 비슷
/*
정확성  테스트
테스트 1 〉	통과 (0.07ms, 79.3MB)
테스트 2 〉	통과 (0.06ms, 65MB)
테스트 3 〉	통과 (0.05ms, 77.9MB)
테스트 4 〉	통과 (0.10ms, 77.7MB)
테스트 5 〉	통과 (0.07ms, 65.6MB)
테스트 6 〉	통과 (0.06ms, 77.6MB)
테스트 7 〉	통과 (0.06ms, 74.6MB)
테스트 8 〉	통과 (0.07ms, 73.7MB)
테스트 9 〉	통과 (0.08ms, 71.4MB)
테스트 10 〉	통과 (0.07ms, 77.4MB)
테스트 11 〉	통과 (0.07ms, 75.5MB)
테스트 12 〉	통과 (0.08ms, 75.2MB)
테스트 13 〉	통과 (0.06ms, 74.2MB)
테스트 14 〉	통과 (1.99ms, 74.3MB)
테스트 15 〉	통과 (2.55ms, 80.8MB)
테스트 16 〉	통과 (6.34ms, 85.2MB)
테스트 17 〉	통과 (7.72ms, 78.8MB)
테스트 18 〉	통과 (10.21ms, 89.1MB)
테스트 19 〉	통과 (7.59ms, 71.1MB)
테스트 20 〉	통과 (7.87ms, 80.4MB)
효율성  테스트
테스트 1 〉	통과 (24.02ms, 63.2MB)
테스트 2 〉	통과 (23.66ms, 63MB)
테스트 3 〉	통과 (300.85ms, 226MB)
테스트 4 〉	통과 (360.61ms, 171MB)
*/
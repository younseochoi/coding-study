// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/42888
import java.util.*;
class Solution {
    public List<String> solution(String[] record) {
        List<String> answer = new ArrayList();
        HashMap<String, String> userId = new HashMap();

        // userID 중복 없이 저장
        for (int i=0; i<record.length; i++) {
            String[] order = record[i].split(" ");

            if (!order[0].equals("Leave")) {
                userId.put(order[1], order[2]);
            } 
        }

        // record에 따라 출력
        for (String o : record) {
            if (o.split(" ")[0].equals("Enter")) {
                answer.add(userId.get(o.split(" ")[1]) + "님이 들어왔습니다.");

            } else if (o.split(" ")[0].equals("Leave")) {
                answer.add(userId.get(o.split(" ")[1]) + "님이 나갔습니다.");
            } 
        }
        return answer;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (2.57ms, 74.7MB)
// 테스트 2 〉	통과 (3.46ms, 80.1MB)
// 테스트 3 〉	통과 (3.51ms, 83.3MB)
// 테스트 4 〉	통과 (3.22ms, 88.3MB)
// 테스트 5 〉	통과 (8.26ms, 70.8MB)
// 테스트 6 〉	통과 (11.99ms, 88.7MB)
// 테스트 7 〉	통과 (7.30ms, 81.5MB)
// 테스트 8 〉	통과 (6.16ms, 80.7MB)
// 테스트 9 〉	통과 (11.61ms, 86.6MB)
// 테스트 10 〉	통과 (9.00ms, 77.4MB)
// 테스트 11 〉	통과 (12.27ms, 91.5MB)
// 테스트 12 〉	통과 (7.25ms, 83.3MB)
// 테스트 13 〉	통과 (11.69ms, 72.4MB)
// 테스트 14 〉	통과 (7.35ms, 84.2MB)
// 테스트 15 〉	통과 (3.31ms, 76.2MB)
// 테스트 16 〉	통과 (3.07ms, 70.2MB)
// 테스트 17 〉	통과 (3.67ms, 79.8MB)
// 테스트 18 〉	통과 (4.10ms, 75.7MB)
// 테스트 19 〉	통과 (7.12ms, 86.2MB)
// 테스트 20 〉	통과 (6.67ms, 81.6MB)
// 테스트 21 〉	통과 (5.98ms, 83.3MB)
// 테스트 22 〉	통과 (10.99ms, 79.8MB)
// 테스트 23 〉	통과 (7.69ms, 85.2MB)
// 테스트 24 〉	통과 (7.97ms, 86MB)
// 테스트 25 〉	통과 (123.81ms, 158MB)
// 테스트 26 〉	통과 (171.16ms, 184MB)
// 테스트 27 〉	통과 (127.17ms, 182MB)
// 테스트 28 〉	통과 (126.04ms, 185MB)
// 테스트 29 〉	통과 (248.39ms, 167MB)
// 테스트 30 〉	통과 (221.70ms, 186MB)
// 테스트 31 〉	통과 (121.01ms, 174MB)
// 테스트 32 〉	통과 (109.97ms, 176MB)
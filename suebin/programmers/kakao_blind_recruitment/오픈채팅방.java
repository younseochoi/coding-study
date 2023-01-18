import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        // 1. 유저 아이디와 닉네임을 HashMap에 저장한다. (key: 유저 아이디, value: 닉네임)
    
        Map<String, String> map = new HashMap<String, String>();
        int count = 0; 
        
        for (int i=0; i<record.length; i++) {
            String[] info = record[i].split(" ");
            
            if (info[0].equals("Enter") || info[0].equals("Change")) {
                map.put(info[1], info[2]);
            }
            
            // answer 배열의 크기를 선언하기 위해 들어오고 나가는 경우의 수(=count)를 센다.
            
            if (info[0].equals("Enter") || info[0].equals("Leave")) {
                count++;
            }
        }
        
        // 2. 오픈 채팅방을 개설한 사람이 보는 메시지를 문자열 배열 answer에 저장한다.
        
        String[] answer = new String[count];
        int idx = 0;
        
        for (int i=0; i<record.length; i++) {
            String[] info = record[i].split(" ");
            String nickname = map.get(info[1]);
            
            if (info[0].equals("Enter")) {
            	answer[idx++] = nickname + "님이 들어왔습니다.";
            }
            
			 if (info[0].equals("Leave")) { 
				 answer[idx++] = nickname + "님이 나갔습니다.";
			}		 
        }
        
        return answer;
    }
}

/*
정확성  테스트
테스트 1 〉	통과 (2.17ms, 77.4MB)
테스트 2 〉	통과 (2.72ms, 73.6MB)
테스트 3 〉	통과 (2.24ms, 82.1MB)
테스트 4 〉	통과 (2.83ms, 68.4MB)
테스트 5 〉	통과 (6.72ms, 80.3MB)
테스트 6 〉	통과 (9.51ms, 82.3MB)
테스트 7 〉	통과 (5.91ms, 84.3MB)
테스트 8 〉	통과 (5.94ms, 81.1MB)
테스트 9 〉	통과 (8.21ms, 72.2MB)
테스트 10 〉	통과 (5.95ms, 73.6MB)
테스트 11 〉	통과 (5.83ms, 79.7MB)
테스트 12 〉	통과 (4.62ms, 85.2MB)
테스트 13 〉	통과 (8.39ms, 72.3MB)
테스트 14 〉	통과 (7.20ms, 77.5MB)
테스트 15 〉	통과 (2.46ms, 77.9MB)
테스트 16 〉	통과 (2.26ms, 78.8MB)
테스트 17 〉	통과 (2.58ms, 78.9MB)
테스트 18 〉	통과 (2.84ms, 75.7MB)
테스트 19 〉	통과 (7.07ms, 87.3MB)
테스트 20 〉	통과 (7.25ms, 83MB)
테스트 21 〉	통과 (6.36ms, 84.2MB)
테스트 22 〉	통과 (6.55ms, 81.2MB)
테스트 23 〉	통과 (6.77ms, 85.3MB)
테스트 24 〉	통과 (10.07ms, 89.8MB)
테스트 25 〉	통과 (144.45ms, 188MB)
테스트 26 〉	통과 (114.54ms, 142MB)
테스트 27 〉	통과 (124.82ms, 173MB)
테스트 28 〉	통과 (146.08ms, 170MB)
테스트 29 〉	통과 (167.36ms, 166MB)
테스트 30 〉	통과 (105.00ms, 141MB)
테스트 31 〉	통과 (122.85ms, 151MB)
테스트 32 〉	통과 (86.12ms, 144MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

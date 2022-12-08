package kakao_blind_recruitment;

import java.util.HashMap;

public class 오픈채팅방 {

	public static void main(String[] args) {
		오픈채팅방 s= new 오픈채팅방();
		s.solution(new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"});
	}

    public String[] solution(String[] record) {
        String[] answer = {};
        HashMap<String, String> hm = new HashMap<>();
        int len = record.length;
        int index = 0;
        
        for(String r : record){
        	
        	String[] temp = r.split(" ");
        	
        	if(r.charAt(0) =='L') continue;
        	
        	else if(r.charAt(0)=='C') len--;
        	
        	hm.put(temp[1], temp[2]);
        }
        
        answer = new String[len];
        
        for(int i =0;i<record.length;i++) {
        	
        	String[] temp = record[i].split(" ");
        	
        	if(record[i].charAt(0) == 'E') {
        		answer[index++] = hm.get(temp[1])+"님이 들어왔습니다.";
        	}
        	else if(record[i].charAt(0) =='L') {
        		answer[index++] = hm.get(temp[1])+"님이 나갔습니다.";
        	}
        }
        
        
        return answer;
    }
}

/*
 정확성  테스트
테스트 1 〉	통과 (2.03ms, 72.6MB)
테스트 2 〉	통과 (1.99ms, 66.2MB)
테스트 3 〉	통과 (2.98ms, 78.7MB)
테스트 4 〉	통과 (3.14ms, 72.8MB)
테스트 5 〉	통과 (5.69ms, 73MB)
테스트 6 〉	통과 (7.91ms, 85MB)
테스트 7 〉	통과 (7.88ms, 76.7MB)
테스트 8 〉	통과 (7.88ms, 80.6MB)
테스트 9 〉	통과 (6.47ms, 84.6MB)
테스트 10 〉	통과 (6.74ms, 82.3MB)
테스트 11 〉	통과 (5.32ms, 79.1MB)
테스트 12 〉	통과 (5.67ms, 83MB)
테스트 13 〉	통과 (5.95ms, 78.7MB)
테스트 14 〉	통과 (5.69ms, 76.5MB)
테스트 15 〉	통과 (2.17ms, 74.1MB)
테스트 16 〉	통과 (2.04ms, 76.7MB)
테스트 17 〉	통과 (4.62ms, 70.7MB)
테스트 18 〉	통과 (4.65ms, 76.9MB)
테스트 19 〉	통과 (7.45ms, 80MB)
테스트 20 〉	통과 (8.98ms, 88.6MB)
테스트 21 〉	통과 (7.11ms, 79.1MB)
테스트 22 〉	통과 (8.49ms, 79.8MB)
테스트 23 〉	통과 (7.81ms, 79.3MB)
테스트 24 〉	통과 (7.89ms, 70.8MB)
테스트 25 〉	통과 (129.86ms, 171MB)
테스트 26 〉	통과 (161.87ms, 145MB)
테스트 27 〉	통과 (158.78ms, 165MB)
테스트 28 〉	통과 (179.77ms, 166MB)
테스트 29 〉	통과 (220.74ms, 158MB)
테스트 30 〉	통과 (158.15ms, 156MB)
테스트 31 〉	통과 (113.86ms, 168MB)
테스트 32 〉	통과 (126.13ms, 166MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */

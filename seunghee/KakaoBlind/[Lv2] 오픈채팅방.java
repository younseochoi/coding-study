import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String[] solution(String[] record) {
        String[] answer;
        List<String> arr = new ArrayList<String>();
        HashMap<String, String> hm = new HashMap<>();
        
        int cnt = record.length;
        for(int i=0; i<record.length; i++) {
        	String[] each = record[i].split(" ");
        	if(each[0].equals("Leave")) {
        		cnt--;
        	} else {
        		hm.put(each[1], each[2]);        		
        	}
        }
        
        for(int i=0; i<record.length; i++) {
        	String[] each = record[i].split(" ");
        	if(each[0].equals("Enter")) {
        		arr.add(hm.get(each[1])+"님이 들어왔습니다.");
        	} else if(each[0].equals("Leave")) {
        		arr.add(hm.get(each[1])+"님이 나갔습니다.");
        	}
        }
        answer = new String[arr.size()];
        arr.toArray(answer);
        return answer;
    }
}
/*
처음에 List 안쓰고 배열로만 풀었다가, 런타임 오류나서
String[] -> ArrayList 부분은 다른 분의 설명 보고 고쳤습니다 ㅠㅠ
정확성  테스트
테스트 1 〉	통과 (4.00ms, 82.2MB)
테스트 2 〉	통과 (20.03ms, 88.3MB)
테스트 3 〉	통과 (5.30ms, 86.5MB)
테스트 4 〉	통과 (4.49ms, 79.4MB)
테스트 5 〉	통과 (12.48ms, 82.1MB)
테스트 6 〉	통과 (7.78ms, 79.3MB)
테스트 7 〉	통과 (7.75ms, 86.1MB)
테스트 8 〉	통과 (5.87ms, 73.1MB)
테스트 9 〉	통과 (6.41ms, 82.4MB)
테스트 10 〉	통과 (9.30ms, 83.2MB)
테스트 11 〉	통과 (6.55ms, 81.6MB)
테스트 12 〉	통과 (4.47ms, 82MB)
테스트 13 〉	통과 (5.23ms, 77.8MB)
테스트 14 〉	통과 (5.85ms, 73.9MB)
테스트 15 〉	통과 (2.16ms, 74.2MB)
테스트 16 〉	통과 (2.17ms, 78.8MB)
테스트 17 〉	통과 (3.49ms, 76.1MB)
테스트 18 〉	통과 (2.68ms, 74.1MB)
테스트 19 〉	통과 (8.14ms, 83.8MB)
테스트 20 〉	통과 (5.58ms, 71.6MB)
테스트 21 〉	통과 (5.69ms, 82.9MB)
테스트 22 〉	통과 (5.71ms, 70.4MB)
테스트 23 〉	통과 (7.42ms, 75.5MB)
테스트 24 〉	통과 (5.62ms, 81.2MB)
테스트 25 〉	통과 (171.56ms, 161MB)
테스트 26 〉	통과 (244.19ms, 187MB)
테스트 27 〉	통과 (191.26ms, 167MB)
테스트 28 〉	통과 (115.64ms, 167MB)
테스트 29 〉	통과 (123.29ms, 181MB)
테스트 30 〉	통과 (115.05ms, 169MB)
테스트 31 〉	통과 (87.86ms, 178MB)
테스트 32 〉	통과 (85.69ms, 144MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
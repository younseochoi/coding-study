import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //접두사를 찾는 것이므로 정렬하면 쉽게 비교 가능
        Arrays.sort(phone_book);
        
        HashSet<String> hs = new HashSet<>();
        //첫번째 수는 무조건 넣어주고
        hs.add(phone_book[0]);
        //뒤에 오는 숫자를 앞에오는 숫자 길이만큼 잘라서 해시에 저장
        //뒤에오는 숫자 길이가 더 짧을 경우 그대로 저장
        for (int i=1; i<phone_book.length; i++) {
        	if(phone_book[i].length() <= phone_book[i-1].length()) {
        		hs.add(phone_book[i]);
        	} else {
        		hs.add(phone_book[i].substring(0,phone_book[i-1].length()));        		
        	}
        }
        //해시에 저장된 수의 갯수가 phone_book보다 적다면 중복이 있단 말이므로 false 리턴
        if(phone_book.length > hs.size()) answer = false;
        return answer;
    }
}

//테스트 15 한개만 틀린 풀이법 ㅠㅠ
/*
정확성 테스트
테스트 1 〉	통과 (0.30ms, 79MB)
테스트 2 〉	통과 (0.31ms, 72.4MB)
테스트 3 〉	통과 (0.21ms, 73.7MB)
테스트 4 〉	통과 (0.21ms, 73.6MB)
테스트 5 〉	통과 (0.23ms, 82.6MB)
테스트 6 〉	통과 (0.30ms, 79.9MB)
테스트 7 〉	통과 (0.26ms, 81.2MB)
테스트 8 〉	통과 (0.20ms, 76.8MB)
테스트 9 〉	통과 (0.28ms, 76.5MB)
테스트 10 〉	통과 (0.19ms, 73.7MB)
테스트 11 〉	통과 (0.61ms, 76.2MB)
테스트 12 〉	통과 (0.39ms, 88.5MB)
테스트 13 〉	통과 (0.19ms, 76MB)
테스트 14 〉	통과 (5.21ms, 92.1MB)
테스트 15 〉	실패 (4.91ms, 80.4MB)
테스트 16 〉	통과 (4.19ms, 79.8MB)
테스트 17 〉	통과 (4.10ms, 80.8MB)
테스트 18 〉	통과 (7.00ms, 75.1MB)
테스트 19 〉	통과 (7.29ms, 76.6MB)
테스트 20 〉	통과 (7.14ms, 80.8MB)
효율성  테스트
테스트 1 〉	통과 (20.48ms, 57.1MB)
테스트 2 〉	통과 (20.90ms, 59.3MB)
테스트 3 〉	통과 (356.56ms, 101MB)
테스트 4 〉	통과 (363.68ms, 98.2MB)
*/
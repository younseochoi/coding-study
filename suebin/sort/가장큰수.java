import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String answer = "";
     
        // int -> string 배열로 변경한다.
        
        String[] stringNumbers = new String[numbers.length];
        
        for (int i=0; i<numbers.length; i++) {
        
            stringNumbers[i] = Integer.toString(numbers[i]);
        }
        
        // ★ Comparator 인터페이스 : 객체를 정렬해준다.
        // 두 수를 번갈아가며 합친 수 중 큰 값을 앞으로 정렬한다. (내림차순 정렬)
        
        Arrays.sort(stringNumbers, new Comparator<String>() {
		@Override
		public int compare(String one, String two) {
			return (two+one).compareTo(one+two);
		}
	});
        
        // 모두 0인 경우
        
        if(stringNumbers[0].equals("0")) return "0";

        // 문자열 합치기
        
        answer =  String.join("", stringNumbers);
        
        return answer;
    }
}

/*
테스트 1 〉	통과 (149.45ms, 119MB)
테스트 2 〉	통과 (91.53ms, 117MB)
테스트 3 〉	통과 (164.59ms, 133MB)
테스트 4 〉	통과 (16.22ms, 81.5MB)
테스트 5 〉	통과 (133.66ms, 121MB)
테스트 6 〉	통과 (132.32ms, 112MB)
테스트 7 〉	통과 (2.14ms, 75.6MB)
테스트 8 〉	통과 (1.84ms, 85.4MB)
테스트 9 〉	통과 (2.01ms, 76.2MB)
테스트 10 〉	통과 (1.86ms, 74.1MB)
테스트 11 〉	통과 (1.75ms, 75.1MB)
테스트 12 〉	통과 (1.52ms, 75.1MB)
테스트 13 〉	통과 (1.61ms, 83.3MB)
테스트 14 〉	통과 (1.83ms, 73.4MB)
테스트 15 〉	통과 (1.81ms, 72.5MB)
*/

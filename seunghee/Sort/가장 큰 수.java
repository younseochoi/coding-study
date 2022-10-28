import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] stringNumbers = new String[numbers.length];
        
        // int -> String 형 변환해서 배열에 다시 저장
        for(int i=0; i<numbers.length; i++)
            stringNumbers[i] = Integer.toString(numbers[i]);
        
        /*
        // 두 수를 붙였을 때 더 큰 수가 앞에오도록 정렬((퍼옴))
        Arrays.sort(stringNumbers, new Comparator<String>(){
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });
        */
        //람다식으로 한줄로 표현가능 ((퍼옴))
        Arrays.sort(stringNumbers, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        // 정렬된 배열형식의 답을 answer에 모두 합치기
        for(String stringNumber: stringNumbers)
            answer += stringNumber;
            
        // 가장 큰 수가 0일 경우엔 배열 값이 모두 0이라는 말이기에 0000..이 되는 걸 방지 
        if(stringNumbers[0].equals("0"))
            answer = "0";
        
        return answer;
    } 
}

/*
테스트 1 〉	통과 (1741.31ms, 392MB)
테스트 2 〉	통과 (671.91ms, 385MB)
테스트 3 〉	통과 (2852.64ms, 404MB)
테스트 4 〉	통과 (12.97ms, 83MB)
테스트 5 〉	통과 (1418.65ms, 386MB)
테스트 6 〉	통과 (1139.91ms, 391MB)
테스트 7 〉	통과 (2.02ms, 72.4MB)
테스트 8 〉	통과 (1.83ms, 66.1MB)
테스트 9 〉	통과 (2.12ms, 78.8MB)
테스트 10 〉	통과 (1.92ms, 83.3MB)
테스트 11 〉	통과 (2.79ms, 79.1MB)
테스트 12 〉	통과 (1.71ms, 70.8MB)
테스트 13 〉	통과 (1.89ms, 77.6MB)
테스트 14 〉	통과 (1.62ms, 72.9MB)
테스트 15 〉	통과 (1.88ms, 71.7MB)
*/
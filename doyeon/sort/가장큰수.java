import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        // 스트링 넣을 배열 생성
        String[] arr = new String[numbers.length];
        
        // numbers 값 string으로 변환하여 배열에 넣기
        for (int i=0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        // sort 함수로 원하는 조건대로 정렬 
        // comparator 인터페이스의 compare 함수를 람다식으로 구현 > compareTo로 대소 비교
        Arrays.sort(arr,(String o1,String o2) -> (o2+o1).compareTo(o1+o2));
        
        // 나온 결과값 String으로 합쳐주기
        for (String a : arr) {
            answer += a;
        }
        
        // 모든 값이 0이면 answer = "0"
        if (arr[0].equals("0")) {
            answer = "0";
        }
        
        return answer;
    }
}
/*
테스트 1 〉	통과 (1763.00ms, 396MB)
테스트 2 〉	통과 (667.67ms, 382MB)
테스트 3 〉	통과 (2856.82ms, 394MB)
테스트 4 〉	통과 (15.32ms, 86.3MB)
테스트 5 〉	통과 (1429.96ms, 400MB)
테스트 6 〉	통과 (1157.95ms, 379MB)
테스트 7 〉	통과 (2.28ms, 74.4MB)
테스트 8 〉	통과 (2.05ms, 73.6MB)
테스트 9 〉	통과 (1.67ms, 85.3MB)
테스트 10 〉통과 (1.78ms, 76MB)
테스트 11 〉통과 (2.12ms, 83.8MB)
테스트 12 〉통과 (1.70ms, 70.9MB)
테스트 13 〉통과 (2.03ms, 75.6MB)
테스트 14 〉통과 (2.19ms, 73.3MB)
테스트 15 〉통과 (1.66ms, 75.2MB) */


// 런타임 에러
/*
import java.util.*;

class Solution {
    public static String[] arr;          
    public static boolean[] visited; 
    public int max = 0;
    
    public String solution(int[] numbers) {
        String answer = "";
        arr = new String[numbers.length];
        visited = new boolean[numbers.length];
        
        permutation(0, numbers);
        answer = String.valueOf(max);
        
        return answer;
    }
    
    // 순열
    private void permutation(int cnt, int[] numbers) {
        ArrayList<String> strArr = new ArrayList();
        
        if (cnt == numbers.length) {
            for (String s : arr) {
                strArr.add(s);
            }
            int result = Integer.parseInt(String.join("", arr));
            max = Math.max(result, max);
            return;
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[cnt] = (String.valueOf(numbers[i]));
                permutation(cnt + 1, numbers);
                visited[i] = false;
            }
        }
    }
} */
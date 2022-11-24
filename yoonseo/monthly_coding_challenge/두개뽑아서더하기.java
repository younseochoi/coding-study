package monthly_coding_challenge;

import java.util.Arrays;
import java.util.HashSet;
//import java.util.TreeSet;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {

		두개뽑아서더하기 s = new 두개뽑아서더하기();
		s.solution(new int[] {2,1,3,4,1}); //{2,3,4,5,6,7}
		s.solution(new int[]{5,0,2,7}); //{2,5,7,9,12}
		
	}

	
	public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i =0;i<numbers.length;i++) {
        	
        	for(int j =i+1;j<numbers.length;j++) {
        		hs.add(numbers[i]+numbers[j]);
        	}
        }
        
        // hashset -> Integer [] -> int []
        // new Integer[0] : 배열의 크기를 0으로 지정하면 자동으로 배열의 크기가 지정됩니다.
        answer = Arrays.stream(hs.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);

        
       
        return answer;
    }
	
//	public int[] solution(int[] numbers) { // TreeSet
//        int[] answer = {};
//        TreeSet<Integer> ts = new TreeSet<>();
//        
//        for(int i =0;i<numbers.length;i++) {
//        	
//        	for(int j =i+1;j<numbers.length;j++) {
//        		ts.add(numbers[i]+numbers[j]);
//        	}
//        }
//        
//        answer = Arrays.stream(ts.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
//
//        return answer;
//    }
}

/*
 정확성  테스트 hashSet
테스트 1 〉	통과 (3.59ms, 76.1MB)
테스트 2 〉	통과 (2.25ms, 77.7MB)
테스트 3 〉	통과 (2.57ms, 73.3MB)
테스트 4 〉	통과 (2.91ms, 75.7MB)
테스트 5 〉	통과 (2.65ms, 75.2MB)
테스트 6 〉	통과 (3.60ms, 67.4MB)
테스트 7 〉	통과 (4.07ms, 74.5MB)
테스트 8 〉	통과 (4.03ms, 92.4MB)
테스트 9 〉	통과 (4.02ms, 81.3MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0

 TreeSet 사용시
테스트 1 〉	통과 (2.43ms, 83.5MB)
테스트 2 〉	통과 (3.43ms, 75.5MB)
테스트 3 〉	통과 (10.68ms, 72.1MB)
테스트 4 〉	통과 (2.48ms, 78.4MB)
테스트 5 〉	통과 (3.71ms, 74.6MB)
테스트 6 〉	통과 (3.26ms, 68.1MB)
테스트 7 〉	통과 (5.55ms, 80.7MB)
테스트 8 〉	통과 (5.30ms, 72.7MB)
테스트 9 〉	통과 (5.00ms, 78.7MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */

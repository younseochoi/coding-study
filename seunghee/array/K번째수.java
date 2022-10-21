import java.util.Arrays;

class Solution {
	
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0; i<commands.length; i++) {
        	
        	//commands에 들어가있는 시작점, 끝점, n번쨰 숫자 가져오기
        	int start = commands[i][0] -1 ;
        	int last = commands[i][1] -1 ;
        	int cnt = commands[i][2] -1 ;
        	
        	//시작점부터 끝까지 잘라오기
        	int[] arr = new int[last-start+1];
        	for (int j=start; j<=last; j++) {
        		arr[j-start] = array[j];
        	}
        	/*
        	 * 다른사람 코드 참고 : 이중for문 안쓰고 내장 함수 사용하기
        	 * int[] arr = Arrays.copyOfRange(array, start, last);
        	 */
        	
        	//오름차순 정렬
        	Arrays.sort(arr);
        	answer[i] = arr[cnt];
        }
        return answer;
    }
}
/*
테스트 1 〉	통과 (0.34ms, 76.8MB)
테스트 2 〉	통과 (0.43ms, 77MB)
테스트 3 〉	통과 (7.32ms, 80.2MB)
테스트 4 〉	통과 (0.48ms, 78.8MB)
테스트 5 〉	통과 (0.34ms, 75.6MB)
테스트 6 〉	통과 (0.31ms, 75MB)
테스트 7 〉	통과 (0.38ms, 73MB)
*/
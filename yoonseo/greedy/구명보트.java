package greedy;

import java.util.Arrays;

public class 구명보트 {

	public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people); // 몸무게 오름차순으로 정렬 
        int i =0, j = people.length-1;
        
        while(i<=j) {
        	
        	//가벼운 사람 + 무거운 사람 태울 수 있으면 둘다 태우기
        	if(people[i]+people[j] <=limit) {
        		i++;
        		j--;
        	}
        	else { //아니라면 무거운 사람 태우기
        		j--;
        	}
        	answer++;
        	
        }
        System.out.println(answer);
        return answer;
    }

}


//정확성  테스트
//테스트 1 〉	통과 (1.75ms, 78.5MB)
//테스트 2 〉	통과 (1.01ms, 80.5MB)
//테스트 3 〉	통과 (1.71ms, 81MB)
//테스트 4 〉	통과 (1.78ms, 84.9MB)
//테스트 5 〉	통과 (1.25ms, 78.1MB)
//테스트 6 〉	통과 (0.90ms, 84MB)
//테스트 7 〉	통과 (1.06ms, 73.5MB)
//테스트 8 〉	통과 (0.34ms, 74.6MB)
//테스트 9 〉	통과 (0.57ms, 71.6MB)
//테스트 10 〉	통과 (1.67ms, 87.3MB)
//테스트 11 〉	통과 (1.48ms, 71.1MB)
//테스트 12 〉	통과 (1.02ms, 67MB)
//테스트 13 〉	통과 (1.45ms, 79MB)
//테스트 14 〉	통과 (1.27ms, 71.9MB)
//테스트 15 〉	통과 (0.53ms, 88.7MB)
//효율성  테스트
//테스트 1 〉	통과 (13.63ms, 56.9MB)
//테스트 2 〉	통과 (8.78ms, 53.6MB)
//테스트 3 〉	통과 (11.63ms, 53.5MB)
//테스트 4 〉	통과 (6.65ms, 54.1MB)
//테스트 5 〉	통과 (8.20ms, 54MB)
//채점 결과
//정확성: 75.0
//효율성: 25.0
//합계: 100.0 / 100.0

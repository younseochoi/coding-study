import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
    	
        int[] answer = {0,0};
        List<String> arr = new ArrayList<String>();
        arr.add(words[0]);
        
        for(int i=1; i<words.length; i++) {
        	String word1 = words[i-1].substring(words[i-1].length()-1);
        	String word2 = words[i].substring(0,1);
        	if(arr.contains(words[i])) {
        		answer[0] = (i%n)+1;
        		answer[1] = (i/n)+1;
        		break;
        	} else if(!word1.equals(word2)) {
            	answer[0] = (i%n)+1;
            	answer[1] = (i/n)+1;
            	break;
        	} else {
        		arr.add(words[i]);
        	}
        }
        return answer;
    }
}

/*
정확성  테스트
테스트 1 〉	통과 (0.40ms, 68.9MB)
테스트 2 〉	통과 (0.53ms, 76.2MB)
테스트 3 〉	통과 (0.04ms, 86.3MB)
테스트 4 〉	통과 (0.53ms, 78MB)
테스트 5 〉	통과 (0.86ms, 71.5MB)
테스트 6 〉	통과 (0.57ms, 74.4MB)
테스트 7 〉	통과 (0.39ms, 76.2MB)
테스트 8 〉	통과 (0.30ms, 71.5MB)
테스트 9 〉	통과 (0.30ms, 76.8MB)
테스트 10 〉	통과 (1.86ms, 77.8MB)
테스트 11 〉	통과 (0.73ms, 79.1MB)
테스트 12 〉	통과 (0.49ms, 74.8MB)
테스트 13 〉	통과 (0.18ms, 74.7MB)
테스트 14 〉	통과 (0.27ms, 75MB)
테스트 15 〉	통과 (0.23ms, 78.2MB)
테스트 16 〉	통과 (0.37ms, 73.9MB)
테스트 17 〉	통과 (0.23ms, 84.1MB)
테스트 18 〉	통과 (0.50ms, 73.4MB)
테스트 19 〉	통과 (0.27ms, 80.3MB)
테스트 20 〉	통과 (2.33ms, 75.4MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
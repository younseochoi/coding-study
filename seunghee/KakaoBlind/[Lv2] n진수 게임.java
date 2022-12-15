class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
              
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (sb.length()<t*m) {
        	sb.append(Integer.toString(i,n).toUpperCase());
        	i++;
        }
        
        StringBuilder ans = new StringBuilder();
        for(int j=p-1; j<sb.length(); j+=m) {
        	if(ans.length()>=t) {
        		break;
        	} else {
        		ans.append(sb.substring(j, j+1));        	
        	}
        }
        
        answer = ans.toString();
        return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (0.06ms, 74.1MB)
테스트 2 〉	통과 (0.09ms, 70.9MB)
테스트 3 〉	통과 (0.08ms, 79.8MB)
테스트 4 〉	통과 (0.14ms, 78.2MB)
테스트 5 〉	통과 (0.39ms, 79.6MB)
테스트 6 〉	통과 (0.22ms, 74MB)
테스트 7 〉	통과 (0.23ms, 74.3MB)
테스트 8 〉	통과 (0.57ms, 78.9MB)
테스트 9 〉	통과 (0.46ms, 88.8MB)
테스트 10 〉	통과 (0.36ms, 78.2MB)
테스트 11 〉	통과 (0.58ms, 69.3MB)
테스트 12 〉	통과 (0.55ms, 75MB)
테스트 13 〉	통과 (0.63ms, 66.5MB)
테스트 14 〉	통과 (15.73ms, 78MB)
테스트 15 〉	통과 (10.06ms, 76MB)
테스트 16 〉	통과 (8.62ms, 80.2MB)
테스트 17 〉	통과 (1.35ms, 67.6MB)
테스트 18 〉	통과 (2.10ms, 76.3MB)
테스트 19 〉	통과 (0.90ms, 74.8MB)
테스트 20 〉	통과 (1.40ms, 70MB)
테스트 21 〉	통과 (3.48ms, 73.1MB)
테스트 22 〉	통과 (2.67ms, 80.7MB)
테스트 23 〉	통과 (3.95ms, 78.8MB)
테스트 24 〉	통과 (3.73ms, 74.3MB)
테스트 25 〉	통과 (3.05ms, 84.9MB)
테스트 26 〉	통과 (2.73ms, 76.3MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
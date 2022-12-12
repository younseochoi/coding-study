import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize == 0) {
        	return (cities.length*5);
        }
        //빈 리스트에 초반 cacheSize만큼 채워주기
        ArrayList<String> arr = new ArrayList<>(cacheSize); 
        for(int n=0; n<cacheSize; n++) {
        	arr.add(cities[n].toUpperCase());
        	answer += 5;
        }
        //cacheSize만큼 채워준 그 이후의 인덱스부터 검사
        for(int n=0; n<cities.length; n++) {
        	String city = cities[n].toUpperCase();
        	if(arr.contains(city)) {
        		for(int i=arr.indexOf(city); i<cacheSize-1; i++) {
        			arr.set(i, arr.get(i+1));
        		}
        		arr.set(cacheSize-1, city);
        		answer += 1;
        	} else {
        		for(int j=0; j<cacheSize-1; j++) {
        			arr.set(j, arr.get(j+1));
        		}
        		arr.set(cacheSize-1, city);
        		answer += 5;
        	}
        }
        return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (0.08ms, 67.4MB)
테스트 2 〉	통과 (0.08ms, 74.1MB)
테스트 3 〉	통과 (0.10ms, 86.4MB)
테스트 4 〉	통과 (0.09ms, 73.5MB)
테스트 5 〉	통과 (0.08ms, 71.2MB)
테스트 6 〉	통과 (0.03ms, 67.5MB)
테스트 7 〉	통과 (0.03ms, 75.8MB)
테스트 8 〉	통과 (0.07ms, 76.6MB)
테스트 9 〉	통과 (0.08ms, 85.6MB)
테스트 10 〉	통과 (0.88ms, 73MB)
테스트 11 〉	실패 (53.76ms, 114MB)
테스트 12 〉	통과 (0.22ms, 72.8MB)
테스트 13 〉	통과 (1.36ms, 73.3MB)
테스트 14 〉	통과 (1.05ms, 66MB)
테스트 15 〉	통과 (1.06ms, 78.2MB)
테스트 16 〉	실패 (1.37ms, 80.7MB)
테스트 17 〉	통과 (0.03ms, 82.3MB)
테스트 18 〉	통과 (2.08ms, 76.4MB)
테스트 19 〉	실패 (3.75ms, 83.1MB)
테스트 20 〉	실패 (3.34ms, 77MB)
채점 결과
정확성: 80.0
합계: 80.0 / 100.0
*/
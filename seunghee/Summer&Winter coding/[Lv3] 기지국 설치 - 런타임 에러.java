import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        boolean[] check = new boolean[n]; //기본값은 false
        //설치된 Station 전후로 true로 바꿔줌
        for(int j=0; j<stations.length; j++) {
        	int last = 0;
        	if(stations[j]+w>n) {
        		last = n;
        	} else {
        		last = stations[j]+w;
        	}
        	for(int k=stations[j]-w-1; k<last; k++) {
        		check[k] = true;
        	}
        }
        //전파가 전달되지 않는 연속되는 아파트 갯수를 세서 arr에 저장한다
        List<Integer> arr = new ArrayList<Integer>();
        int cnt = 0;
        for(int i=0; i<n; i++) {
        	if(check[i]==false) {
        		cnt++;
        		if ( i == n-1) {
        			arr.add(cnt);
        		}
        	} else if (check[i]==true) {
        		if(cnt!=0) {
        			arr.add(cnt);
        			cnt=0;
        		}
        	}
        }
        //arr에 저장된 길이를 기지국 하나가 도달하는 길이만큼 나누어 갯수를 더해준다
        for(int z=0; z<arr.size(); z++) {
        	if ( arr.get(z)%(w*2+1) ==0 ) {
        		answer += (arr.get(z)/(w*2+1));
        	} else {
        		answer += (arr.get(z)/(w*2+1))+1;        		
        	}
        }
        return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	실패 (런타임 에러)
테스트 2 〉	통과 (0.03ms, 70MB)
테스트 3 〉	실패 (런타임 에러)
테스트 4 〉	통과 (0.04ms, 71.7MB)
테스트 5 〉	통과 (0.03ms, 80MB)
테스트 6 〉	통과 (0.04ms, 72.4MB)
테스트 7 〉	통과 (0.03ms, 79.8MB)
테스트 8 〉	실패 (런타임 에러)
테스트 9 〉	실패 (런타임 에러)
테스트 10 〉	통과 (0.03ms, 77.5MB)
테스트 11 〉	통과 (0.03ms, 76.2MB)
테스트 12 〉	통과 (0.03ms, 71.5MB)
테스트 13 〉	실패 (런타임 에러)
테스트 14 〉	통과 (0.02ms, 75.9MB)
테스트 15 〉	통과 (0.03ms, 75.1MB)
테스트 16 〉	통과 (0.04ms, 74.7MB)
테스트 17 〉	통과 (0.04ms, 70.6MB)
테스트 18 〉	통과 (0.05ms, 79.6MB)
테스트 19 〉	통과 (0.03ms, 77.7MB)
테스트 20 〉	통과 (0.04ms, 79.9MB)
테스트 21 〉	통과 (0.03ms, 74.4MB)
효율성  테스트
테스트 1 〉	실패 (런타임 에러)
테스트 2 〉	실패 (시간 초과)
테스트 3 〉	실패 (런타임 에러)
테스트 4 〉	실패 (시간 초과)
채점 결과
정확성: 53.7
효율성: 0.0
합계: 53.7 / 100.0
*/
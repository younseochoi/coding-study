class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int idx = 0;
        
        for(long num : numbers) {
            String binarynum = Integer.toBinaryString((int)num);
            for(int i=(int)num+1; i<Math.pow(10, 15); i++) {
            	int cnt = 0;
            	String binarytest = Integer.toBinaryString(i);
            	if(binarynum.length()<binarytest.length()) {
            		binarynum="0"+binarynum;
            	}
            	for(int j=0; j<binarytest.length(); j++) {
            		if(!String.valueOf(binarynum.charAt(j)).equals(String.valueOf((binarytest.charAt(j))))) {
            			cnt++;
            		}
            	}
            	if (cnt<=2) {
            		answer[idx] = i;
            		idx++;
            		break;
            	}
            }
        }
        return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (8.71ms, 77.7MB)
테스트 2 〉	통과 (316.96ms, 389MB)
테스트 3 〉	통과 (4.83ms, 79.1MB)
테스트 4 〉	통과 (6.79ms, 81.4MB)
테스트 5 〉	통과 (19.25ms, 93.7MB)
테스트 6 〉	통과 (14.32ms, 80.3MB)
테스트 7 〉	실패 (439.68ms, 392MB)
테스트 8 〉	실패 (360.45ms, 397MB)
테스트 9 〉	실패 (424.80ms, 390MB)
테스트 10 〉	실패 (57.63ms, 113MB)
테스트 11 〉	실패 (34.11ms, 101MB)
채점 결과
정확성: 54.5
합계: 54.5 / 100.0
*/
import java.util.ArrayList;
import java.util.List;

class Solution {
    public  List<Long> solution(int n, long left, long right) {
        
        List<Long> list = new ArrayList<>();
        
        for(long i=left;i<right+1;i++){
             list.add(Math.max(i/n,i%n) + 1);
        }
        
        return list;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (15.07ms, 92.2MB)
테스트 2 〉	통과 (9.64ms, 107MB)
테스트 3 〉	통과 (11.17ms, 109MB)
테스트 4 〉	통과 (0.15ms, 81.9MB)
테스트 5 〉	통과 (0.09ms, 75MB)
테스트 6 〉	통과 (11.00ms, 104MB)
테스트 7 〉	통과 (10.06ms, 94.1MB)
테스트 8 〉	통과 (13.64ms, 104MB)
테스트 9 〉	통과 (15.58ms, 119MB)
테스트 10 〉	통과 (9.35ms, 105MB)
테스트 11 〉	통과 (10.48ms, 95.2MB)
테스트 12 〉	통과 (10.18ms, 95.3MB)
테스트 13 〉	통과 (10.99ms, 97.4MB)
테스트 14 〉	통과 (14.18ms, 93.2MB)
테스트 15 〉	통과 (13.83ms, 109MB)
테스트 16 〉	통과 (10.24ms, 112MB)
테스트 17 〉	통과 (10.03ms, 93.3MB)
테스트 18 〉	통과 (10.02ms, 111MB)
테스트 19 〉	통과 (10.81ms, 95.2MB)
테스트 20 〉	통과 (10.08ms, 113MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
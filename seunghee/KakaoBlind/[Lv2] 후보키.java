//출처: 다른 사람의 풀이

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    private boolean possi(List<Integer> list, int now){
        for(int i = 0; i < list.size(); i++){
            if ( (list.get(i) & now) == list.get(i)) return false;
        }
        return true;
    }
    public int solution(String[][] relation) {
        int n = relation.length;        // 가로
        int m = relation[0].length;     // 세로

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i < (1<<m); i++){
            Set<String> s = new HashSet<String>();
            for(int j = 0; j < n; j++){
                String now = "";
                for(int k = 0; k < m; k++){
                    if( (i & (1<<k)) > 0 ){
                        // System.out.print((i & (i<<k)) + " ");
                        now += relation[j][k];
                        // System.out.println(relation[j][k]);
                    }
                }
                s.add(now);
            }
            if(s.size() == n && possi(list, i) ){
                list.add(i);
            }
        }
        return list.size();
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (1.85ms, 74.3MB)
테스트 2 〉	통과 (1.57ms, 68.1MB)
테스트 3 〉	통과 (1.94ms, 86.1MB)
테스트 4 〉	통과 (2.14ms, 72.6MB)
테스트 5 〉	통과 (1.89ms, 75.9MB)
테스트 6 〉	통과 (1.55ms, 73.6MB)
테스트 7 〉	통과 (1.83ms, 79.3MB)
테스트 8 〉	통과 (1.85ms, 77.5MB)
테스트 9 〉	통과 (1.86ms, 75.5MB)
테스트 10 〉	통과 (2.08ms, 76.5MB)
테스트 11 〉	통과 (2.64ms, 73.3MB)
테스트 12 〉	통과 (6.56ms, 63.5MB)
테스트 13 〉	통과 (2.39ms, 75.2MB)
테스트 14 〉	통과 (1.82ms, 75.7MB)
테스트 15 〉	통과 (2.17ms, 81.1MB)
테스트 16 〉	통과 (2.14ms, 80.3MB)
테스트 17 〉	통과 (2.14ms, 69.2MB)
테스트 18 〉	통과 (13.37ms, 83.4MB)
테스트 19 〉	통과 (4.98ms, 74.1MB)
테스트 20 〉	통과 (9.47ms, 74.9MB)
테스트 21 〉	통과 (6.58ms, 68.3MB)
테스트 22 〉	통과 (6.21ms, 70.4MB)
테스트 23 〉	통과 (1.91ms, 73.2MB)
테스트 24 〉	통과 (3.78ms, 74.6MB)
테스트 25 〉	통과 (10.75ms, 82.4MB)
테스트 26 〉	통과 (6.39ms, 76.5MB)
테스트 27 〉	통과 (2.68ms, 77MB)
테스트 28 〉	통과 (3.73ms, 79.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
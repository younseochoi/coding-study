//출처: 다른 사람의 풀이
//풀다가... 2시간 넘어가서 답안 봤습니다...^^...

import java.util.*;

class Solution {
    static Set<List<Long>> intersection;
    static long xMin, xMax, yMin, yMax;
    public String[] solution(int[][] line) {
        intersection = new HashSet<>();
        xMin = Long.MAX_VALUE; yMin = Long.MAX_VALUE;
        xMax = Long.MIN_VALUE; yMax = Long.MIN_VALUE;

        for(int i=0; i<line.length-1; i++){
            for(int j=i+1; j<line.length; j++){
                getIntersection(line[i], line[j]);
            }
        }

        String[] answer = new String[(int) (yMax - yMin) + 1];
        for(int i=0; i<answer.length; i++){
            answer[i] = ".".repeat((int)(xMax - xMin) + 1);
        }

        for(List<Long> star : intersection){
            long x = star.get(0), y = star.get(1);
            answer[(int)(yMax-y)] = answer[(int)(yMax-y)].substring(0, (int)(x-xMin)) + "*" + answer[(int)(yMax-y)].substring((int)(x-xMin)+1);
        }

        return answer;
    }

    public void getIntersection(int[] line1, int[] line2){
        double A, B, C, D, E, F;
        A = line1[0]; B = line1[1]; E = line1[2];
        C = line2[0]; D = line2[1]; F = line2[2];

        double slope  = A*D - B*C;
        if(slope == 0)  return;    

        double x = (B*F - E*D) / slope, y = (E*C - A*F) / slope;
        long ix = (long) x, iy = (long) y;
        if(x == ix && y == iy){
            intersection.add((List<Long>)Arrays.asList(new Long[] {ix, iy}));
            xMin = Math.min(xMin, ix); xMax = Math.max(xMax, ix);
            yMin = Math.min(yMin, iy); yMax = Math.max(yMax, iy);
        }
        return;
    }
}

/*
정확성  테스트
테스트 1 〉	통과 (10.72ms, 75.3MB)
테스트 2 〉	통과 (15.28ms, 76.1MB)
테스트 3 〉	통과 (11.27ms, 82.5MB)
테스트 4 〉	통과 (19.38ms, 88.9MB)
테스트 5 〉	통과 (11.50ms, 77MB)
테스트 6 〉	통과 (13.08ms, 81MB)
테스트 7 〉	통과 (11.05ms, 86.2MB)
테스트 8 〉	통과 (13.08ms, 73.7MB)
테스트 9 〉	통과 (25.29ms, 86.9MB)
테스트 10 〉	통과 (27.11ms, 87.3MB)
테스트 11 〉	통과 (30.02ms, 86.2MB)
테스트 12 〉	통과 (30.44ms, 84.1MB)
테스트 13 〉	통과 (22.52ms, 89MB)
테스트 14 〉	통과 (28.16ms, 90.4MB)
테스트 15 〉	통과 (29.80ms, 85.7MB)
테스트 16 〉	통과 (23.06ms, 84.7MB)
테스트 17 〉	통과 (31.51ms, 73.4MB)
테스트 18 〉	통과 (28.94ms, 91.6MB)
테스트 19 〉	통과 (25.43ms, 86MB)
테스트 20 〉	통과 (21.80ms, 77.6MB)
테스트 21 〉	통과 (31.21ms, 97.5MB)
테스트 22 〉	통과 (11.09ms, 71.6MB)
테스트 23 〉	통과 (8.83ms, 81.8MB)
테스트 24 〉	통과 (10.32ms, 75.4MB)
테스트 25 〉	통과 (8.37ms, 76.4MB)
테스트 26 〉	통과 (8.75ms, 74.1MB)
테스트 27 〉	통과 (11.67ms, 73.5MB)
테스트 28 〉	통과 (9.83ms, 85.4MB)
테스트 29 〉	통과 (9.62ms, 74MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
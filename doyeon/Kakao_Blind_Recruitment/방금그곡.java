// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/17683
import java.util.*;
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int maxtime = 0;
        m = changeMelody(m);

        for(int i = 0; i< musicinfos.length;i++) {
            String[] info = musicinfos[i].split(",");

            info[3] = changeMelody(info[3]);

            String[] startTime = info[0].split(":");
            String[] endTime = info[1].split(":");

            int hour = Integer.parseInt(endTime[0]) - Integer.parseInt(startTime[0]);
            // 총 재생 시간(분)
            int min = Integer.parseInt(endTime[1]) - Integer.parseInt(startTime[1]) + (hour * 60);

            StringBuilder melody = new StringBuilder();
            
            while (melody.length() < min) {
                melody.append(info[3]);
            }
            // 총 재생된 멜로디
            String newMelody = melody.substring(0, min);
            
            if(newMelody.indexOf(m) != -1){
                // 재생된 시간이 더 길 때
                if(maxtime < newMelody.length()){
                    maxtime = newMelody.length();
                    answer = info[2];
                }
            }
        }
        return answer;
    }
    
    // 문자 치환
    public String changeMelody(String melody) {
        melody = melody.replaceAll("C#", "H");
        melody = melody.replaceAll("D#", "I");
        melody = melody.replaceAll("F#", "J");
        melody = melody.replaceAll("G#", "K");
        melody = melody.replaceAll("A#", "L");
        
        return melody;
    }
}

// 정확성  테스트
// 테스트 1 〉	통과 (0.52ms, 75.3MB)
// 테스트 2 〉	통과 (0.49ms, 72.6MB)
// 테스트 3 〉	통과 (0.73ms, 76.7MB)
// 테스트 4 〉	통과 (0.41ms, 76.6MB)
// 테스트 5 〉	통과 (0.76ms, 80.3MB)
// 테스트 6 〉	통과 (0.80ms, 70.7MB)
// 테스트 7 〉	통과 (2.54ms, 73.4MB)
// 테스트 8 〉	통과 (1.79ms, 76.9MB)
// 테스트 9 〉	통과 (2.22ms, 68.9MB)
// 테스트 10 〉	통과 (2.03ms, 78.1MB)
// 테스트 11 〉	통과 (2.04ms, 73.5MB)
// 테스트 12 〉	통과 (1.75ms, 76.4MB)
// 테스트 13 〉	통과 (2.32ms, 71.9MB)
// 테스트 14 〉	통과 (2.87ms, 73.7MB)
// 테스트 15 〉	통과 (2.48ms, 77.5MB)
// 테스트 16 〉	통과 (2.27ms, 79.2MB)
// 테스트 17 〉	통과 (1.86ms, 70.1MB)
// 테스트 18 〉	통과 (2.58ms, 73.8MB)
// 테스트 19 〉	통과 (3.70ms, 72.8MB)
// 테스트 20 〉	통과 (2.15ms, 74.3MB)
// 테스트 21 〉	통과 (2.42ms, 75.3MB)
// 테스트 22 〉	통과 (2.49ms, 83MB)
// 테스트 23 〉	통과 (1.87ms, 69.4MB)
// 테스트 24 〉	통과 (2.44ms, 71.9MB)
// 테스트 25 〉	통과 (1.01ms, 71.7MB)
// 테스트 26 〉	통과 (0.53ms, 69.6MB)
// 테스트 27 〉	통과 (0.49ms, 76.1MB)
// 테스트 28 〉	통과 (0.58ms, 75.1MB)
// 테스트 29 〉	통과 (11.53ms, 83.6MB)
// 테스트 30 〉	통과 (14.63ms, 83.2MB)
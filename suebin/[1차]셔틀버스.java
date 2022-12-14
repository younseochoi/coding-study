import java.util.*;

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        
        // 오름차순 정렬 후, 시간을 분으로 변환하여 Queue에 넣어준다.
      
        Arrays.sort(timetable);
        Queue<Integer> timetableQueue = new LinkedList<>();
        
        for (String time : timetable) {
            timetableQueue.add(convertTimeToMinutes(time));
        }
        
        int busTime = convertTimeToMinutes("09:00");
        int lastCrewBoardingTime = 0;
        int conBoardingTime = 0;
        int boardingCount = 0;
        
        for (int i=0; i<n; i++) {
           boardingCount = 0;
            
            while (!timetableQueue.isEmpty() && timetableQueue.peek() <= busTime) {
                boardingCount++;
                lastCrewBoardingTime = timetableQueue.poll();
                if (boardingCount == m) break;
            }
            busTime += t;
        }
        
        // 기다린 크루들이 전부 타는 경우
        
        if (boardingCount == m) {
            conBoardingTime = lastCrewBoardingTime - 1;
        }
      
        // 마지막으로 오는 버스를 탈 수 있는 경우
      
        else {
            conBoardingTime = busTime - t;
        }
        
        String answer = convertMinutesToTime(conBoardingTime);
        
        return answer;
    }
    
       
    // 시간(문자열)을 분(정수)으로 변환해주는 함수
  
    static int convertTimeToMinutes(String time) {
        String[] times = time.split(":");
        int hour = Integer.parseInt(times[0]);
        int min = Integer.parseInt(times[1]);
        
        return hour*60 + min;
    }
    
    // 분(정수)을 시간(문자열)으로 변환해주는 함수
  
    static String convertMinutesToTime(int minutes) {
        String hour = String.valueOf(minutes/60);
        String min = String.valueOf(minutes%60);
        
        if (hour.length() == 1) {
            hour = "0" + hour;
        }
        if (min.length() == 1) {
            min = "0" + min;
        }
        
        return hour + ":" + min;
    }   
}


/*
정확성  테스트
테스트 1 〉	통과 (11.82ms, 87.4MB)
테스트 2 〉	통과 (15.01ms, 81MB)
테스트 3 〉	통과 (8.79ms, 81.5MB)
테스트 4 〉	통과 (13.20ms, 77.2MB)
테스트 5 〉	통과 (10.51ms, 76.5MB)
테스트 6 〉	통과 (9.74ms, 84.1MB)
테스트 7 〉	통과 (11.44ms, 84.1MB)
테스트 8 〉	통과 (10.71ms, 76.8MB)
테스트 9 〉	통과 (11.34ms, 77.4MB)
테스트 10 〉	통과 (11.57ms, 78.6MB)
테스트 11 〉	통과 (10.07ms, 68.1MB)
테스트 12 〉	통과 (12.63ms, 84.8MB)
테스트 13 〉	통과 (11.01ms, 80.2MB)
테스트 14 〉	통과 (12.84ms, 80MB)
테스트 15 〉	통과 (12.65ms, 80.8MB)
테스트 16 〉	통과 (9.08ms, 81.8MB)
테스트 17 〉	통과 (13.37ms, 68.8MB)
테스트 18 〉	통과 (14.59ms, 74.1MB)
테스트 19 〉	통과 (11.28ms, 84.1MB)
테스트 20 〉	통과 (10.76ms, 89.1MB)
테스트 21 〉	통과 (25.09ms, 89.1MB)
테스트 22 〉	통과 (14.94ms, 76.1MB)
테스트 23 〉	통과 (12.88ms, 76.9MB)
테스트 24 〉	통과 (15.06ms, 76.7MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

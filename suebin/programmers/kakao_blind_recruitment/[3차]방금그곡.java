import java.util.*;

class Solution {
    public String solution(String m, String[] musicinfos) {
        int maxPlayingTime = 0;
        String answer = "";
        
        // 네오가 기억한 멜로디를 치환한다.
        
        m = changeCode(m);
        
        for (String musicInfo : musicinfos) { 
        	String[] info = musicInfo.split(",");

        	// 재생된 시간 구하기
            
        	int playingTime = (Integer.parseInt(info[1].substring(0, 2)) - Integer.parseInt(info[0].substring(0, 2)))*60  
        			+ Integer.parseInt(info[1].substring(3)) - Integer.parseInt(info[0].substring(3));
        	
        	// 악보 정보(=info[3]) #이 붙은 음 치환하기
        	
        	info[3] = changeCode(info[3]);
        	
        	// 음악 길이 구하기
        	
        	int musicLength = info[3].length();
        	
        	// 실제 재생된 음악 악보 구하기
        	
        	String musicCode = "";
        	
        	// 재생 시간 > 음악 길이 : 처음부터 음악 반복 재생
        	
        	if (playingTime > musicLength) {
        		for (int j=0; j<playingTime/musicLength; j++) {
        			musicCode += info[3];
        		}
        		musicCode += info[3].substring(0, playingTime%musicLength);
        	}
        	
        	// 재생 시간 <= 음악 길이 : 처음부터 재생된 시간만큼 재생
        	
        	else {
        		musicCode += info[3].substring(0, playingTime);
        	}
        	
            // answer = 네오가 기억하는 멜로디를 포함하면서 제일 재생 시간이 긴 음악 제목(=info[2])
            
        	if (musicCode.contains(m) && playingTime > maxPlayingTime) {
        		answer = info[2];
        		maxPlayingTime = playingTime;
        	}
        	
        }	
        
        // 조건이 일치하는 음악이 없는 경우 answer = (None)
        
        if (maxPlayingTime == 0) { answer = "(None)"; }
        
        return answer;
    }
    
    // #이 붙은 음을 치환하는 함수
    
    public static String changeCode(String code) {
		code = code.replaceAll("C#", "c");
		code = code.replaceAll("D#", "d");
		code = code.replaceAll("F#", "f");
		code = code.replaceAll("G#", "g");
		code = code.replaceAll("A#", "a");
		
		return code;
	}
}


/*
정확성  테스트
테스트 1 〉	통과 (1.58ms, 73.7MB)
테스트 2 〉	통과 (2.45ms, 79.2MB)
테스트 3 〉	통과 (2.11ms, 74.3MB)
테스트 4 〉	통과 (2.05ms, 73.8MB)
테스트 5 〉	통과 (2.41ms, 82.2MB)
테스트 6 〉	통과 (2.18ms, 77.8MB)
테스트 7 〉	통과 (4.55ms, 79MB)
테스트 8 〉	통과 (4.89ms, 74.4MB)
테스트 9 〉	통과 (4.56ms, 74.3MB)
테스트 10 〉	통과 (3.68ms, 76.7MB)
테스트 11 〉	통과 (4.89ms, 80.7MB)
테스트 12 〉	통과 (4.14ms, 73.9MB)
테스트 13 〉	통과 (3.66ms, 74.9MB)
테스트 14 〉	통과 (4.56ms, 83.3MB)
테스트 15 〉	통과 (4.01ms, 83.3MB)
테스트 16 〉	통과 (3.74ms, 79.8MB)
테스트 17 〉	통과 (3.43ms, 73.2MB)
테스트 18 〉	통과 (3.45ms, 76MB)
테스트 19 〉	통과 (4.91ms, 74.3MB)
테스트 20 〉	통과 (3.39ms, 78.1MB)
테스트 21 〉	통과 (3.45ms, 76.4MB)
테스트 22 〉	통과 (4.80ms, 76.2MB)
테스트 23 〉	통과 (3.94ms, 73MB)
테스트 24 〉	통과 (3.32ms, 79.2MB)
테스트 25 〉	통과 (2.00ms, 77.1MB)
테스트 26 〉	통과 (2.13ms, 70.7MB)
테스트 27 〉	통과 (2.21ms, 77.1MB)
테스트 28 〉	통과 (1.62ms, 79.4MB)
테스트 29 〉	통과 (11.54ms, 70.7MB)
테스트 30 〉	통과 (12.22ms, 84.6MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

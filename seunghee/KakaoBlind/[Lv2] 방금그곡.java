import java.util.HashMap;

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";

        HashMap<Integer, String> hm = new HashMap<>();
        for(int i=0; i<musicinfos.length; i++) {
        	String[] music = musicinfos[i].split(",");
        	
        	String[] start = music[0].split(":");
        	String[] fin = music[1].split(":");
        	int len = 0;
        	if( start[0].equals(fin[0])) {
        		len = Integer.parseInt(fin[1]) - Integer.parseInt(start[1]);
        	} else {
        		len += (Integer.parseInt(fin[0]) - Integer.parseInt(start[0])) * 60;
        		len += Integer.parseInt(fin[1]) - Integer.parseInt(start[1]);
        	}

        	String newMusic = changeMelody(music[3]);
        	StringBuilder sb = new StringBuilder();
        	int idx = 0;
        	for(int j=0; j<len; j++) {
        		if(idx == newMusic.length()) {
        			idx = 0;
        		}
        		sb.append(newMusic.charAt(idx));
        		idx++;
        	}
        	
        	String newM = changeMelody(m);
        	if(sb.toString().contains(newM)) {
        		if(hm.containsKey(len)) {
        			
        		} else {
        			hm.put(len, music[2]);        			
        		}
        	}
        }
        
        Object[] lens = hm.keySet().toArray();
        int max = 0;
        if(hm.size()>0) {
        	for(int k=0; k<lens.length; k++) {
        		if(max<Integer.parseInt(String.valueOf(lens[k]))) {
        			max = Integer.parseInt(String.valueOf(lens[k]));
        		}
        	}
        	return hm.get(max);
        } else {
        	return answer;
        }     
    }
    String changeMelody(String oldMelody) {
        oldMelody = oldMelody.replaceAll("C#", "H");
        oldMelody = oldMelody.replaceAll("D#", "I");
        oldMelody = oldMelody.replaceAll("F#", "J");
        oldMelody = oldMelody.replaceAll("G#", "K");
        String newMelody = oldMelody.replaceAll("A#", "L");      
        return newMelody;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (1.06ms, 71.2MB)
테스트 2 〉	통과 (1.12ms, 77.2MB)
테스트 3 〉	통과 (1.24ms, 78.9MB)
테스트 4 〉	통과 (0.77ms, 77.4MB)
테스트 5 〉	통과 (1.13ms, 92.4MB)
테스트 6 〉	통과 (1.04ms, 73.7MB)
테스트 7 〉	통과 (5.46ms, 80.8MB)
테스트 8 〉	통과 (3.84ms, 91.3MB)
테스트 9 〉	통과 (6.08ms, 75.2MB)
테스트 10 〉	통과 (8.95ms, 71.8MB)
테스트 11 〉	통과 (5.01ms, 78MB)
테스트 12 〉	통과 (5.26ms, 75.7MB)
테스트 13 〉	통과 (3.83ms, 88.6MB)
테스트 14 〉	통과 (3.80ms, 77.7MB)
테스트 15 〉	통과 (4.47ms, 79.5MB)
테스트 16 〉	통과 (4.17ms, 84.1MB)
테스트 17 〉	통과 (10.29ms, 66.9MB)
테스트 18 〉	통과 (4.05ms, 77.1MB)
테스트 19 〉	통과 (12.74ms, 74.5MB)
테스트 20 〉	통과 (6.36ms, 87.9MB)
테스트 21 〉	통과 (3.40ms, 78MB)
테스트 22 〉	통과 (3.50ms, 69.1MB)
테스트 23 〉	통과 (3.36ms, 72.2MB)
테스트 24 〉	통과 (4.67ms, 80.5MB)
테스트 25 〉	통과 (0.80ms, 71.6MB)
테스트 26 〉	통과 (1.48ms, 78MB)
테스트 27 〉	통과 (1.53ms, 74.5MB)
테스트 28 〉	통과 (1.34ms, 77.7MB)
테스트 29 〉	통과 (25.96ms, 89.2MB)
테스트 30 〉	통과 (20.81ms, 81.8MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
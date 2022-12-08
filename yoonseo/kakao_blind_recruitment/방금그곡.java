package kakao_blind_recruitment;

public class 방금그곡 {

	public static void main(String[] args) {
		방금그곡 s = new 방금그곡();
		//"HELLO"
		s.solution("ABCDEFG", new String[] {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"});
		//	"FOO"
		s.solution("CC#BCC#BCC#BCC#B", new String[] {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"});
		//"WORLD"
		s.solution("ABC", new String[] {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"});
		
	}
	
	// testcase 20, 21, 30 통과 x
	// ** Update : 36 line break; 없애니 모든 테스트케이스 통과 완료
	public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        String str = lower(m);
        int max = 0;
//        System.out.println(str);
        for(int i=0;i<musicinfos.length;i++) {
        	String[] temp = musicinfos[i].split(",");
        	temp[3] = lower(temp[3]);
        	int time = getMinutes(temp[0], temp[1]);
        	
        	String repeat_melody = "";
        	int len = temp[3].length();
        	for(int j =0;j<time;j++) {
        		repeat_melody +=  temp[3].charAt(j%len);
        	}
        	
        	if(repeat_melody.contains(str) && max < time) {
        		answer = temp[2];
        		max = time;
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
	
	public String lower(String s){
		StringBuilder sb = new StringBuilder();
		for(int i= s.length()-1;i>=0;i--) {
			char c =  s.charAt(i);
			if(s.charAt(i) =='#') {
				c = (char) (s.charAt(i-1)+32);
				i--;
			}
			sb.append(c);
		}
		return sb.reverse().toString();
	}
	
	public int getMinutes(String s1, String s2) {
		String[] arr1 = s1.split(":");
		String[] arr2 = s2.split(":");
		
		int h = Integer.parseInt(arr2[0])-Integer.parseInt(arr1[0]);
		int m = Integer.parseInt(arr2[1])-Integer.parseInt(arr1[1]);
		
		
		return h*60+m;
	}

}

/*
 정확성  테스트
테스트 1 〉	통과 (12.19ms, 73.9MB)
테스트 2 〉	통과 (10.14ms, 74.9MB)
테스트 3 〉	통과 (10.92ms, 79.7MB)
테스트 4 〉	통과 (11.25ms, 75.5MB)
테스트 5 〉	통과 (14.31ms, 80.1MB)
테스트 6 〉	통과 (9.40ms, 73.1MB)
테스트 7 〉	통과 (14.17ms, 89MB)
테스트 8 〉	통과 (12.58ms, 82.4MB)
테스트 9 〉	통과 (15.35ms, 85.1MB)
테스트 10 〉	통과 (17.87ms, 91.3MB)
테스트 11 〉	통과 (15.68ms, 82.8MB)
테스트 12 〉	통과 (13.36ms, 80.3MB)
테스트 13 〉	통과 (15.04ms, 72.4MB)
테스트 14 〉	통과 (17.83ms, 75MB)
테스트 15 〉	통과 (12.65ms, 75.4MB)
테스트 16 〉	통과 (14.81ms, 86.1MB)
테스트 17 〉	통과 (16.95ms, 79.9MB)
테스트 18 〉	통과 (15.73ms, 77.2MB)
테스트 19 〉	통과 (14.65ms, 84MB)
테스트 20 〉	통과 (15.32ms, 70.1MB)
테스트 21 〉	통과 (17.64ms, 78.2MB)
테스트 22 〉	통과 (16.35ms, 77.8MB)
테스트 23 〉	통과 (19.13ms, 74.7MB)
테스트 24 〉	통과 (13.19ms, 74.2MB)
테스트 25 〉	통과 (14.07ms, 82.1MB)
테스트 26 〉	통과 (11.49ms, 80.7MB)
테스트 27 〉	통과 (9.18ms, 74.9MB)
테스트 28 〉	통과 (10.04ms, 79.9MB)
테스트 29 〉	통과 (26.48ms, 98.7MB)
테스트 30 〉	통과 (24.79ms, 89.5MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */

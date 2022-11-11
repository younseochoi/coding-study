package hash;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수 {

	
// 내가 푼 코드 
//	public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        for(int i=0;i< completion.length;i++) {
//        	if(!completion[i].equals(participant[i])) {
//        		answer= participant[i];
//        		break;
//        	}
//        }
//        if(answer.equals("")) {
//        	answer = participant[participant.length-1];
//        }
//        System.out.println(answer);
//        return answer;
//    }
	
	// 해시맵 사용 코드
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap< String, Integer> map = new HashMap<>();
        
        for(int i=0;i<participant.length;i++) {
        	map.put(participant[i], map.getOrDefault(participant[i], 0)+1); // 참가자 value = 1
        	//getOrDefault('key',0) => 'key'에 해당하는 value있으면 가지고 오고, 없으면 default 0을 사용하겠다.
        }
        for(int j=0;j<completion.length;j++) {
        	map.put(completion[j], map.get(completion[j])-1); // 완주한 사람 value 0으로 만들어줌
        }
        for(String key : map.keySet()) {
        	if(map.get(key)!=0) {
        		answer = key;
        		break;
        	}
        }
        return answer;
    }
}

package greedy;

public class 조이스틱 {

	public int solution(String name) {
        int answer = 0;
        // 좌우와 상하를 나누어서 계산하자.
        

        int len = name.length(); 
        int move = name.length()-1;// 오른쪽으로만 이동했을 때의 최대 이동횟수
        
        for(int i=0;i< name.length();i++) { // i가 오른쪽으로 이동횟수 
        		int dist= name.charAt(i) - 'A';
        		
        		if(dist<13) { //B~M
        			answer+=dist;
        		}else { // N~Z
        			//System.out.println("z와 더가깝");
        			answer+=('Z'-name.charAt(i)+1);
        		}
        		
        		int index = i+1;
        		while(index<len && name.charAt(index) == 'A') {
        			index ++; // 마지막 A 인덱스 저장
        		}
        		System.out.println("i="+i+", "+index+", "+(2*i+(len - index))+" move" +move);
        		
        		move = Math.min(move, 2*i+(len - index)); // 오른쪽으로 이동하는 것 보다 앞으로 갔다가 다시 처음으로 갔다가A전까지 뒤로 가는게 더빠른지? 
        		move = Math.min(move, (len - index) * 2 + i); // 처음부터 뒤로 가는 것이 나은지
        		
        		System.out.println("move after = "+move);
        		
        }
        answer += move; 
         return answer;
    }
}

// https://born2bedeveloper.tistory.com/26
//for(int i=0;i<name.length();i++) {
//	int count = 0;
//	int c = name.charAt(i);
//	System.out.print((char)c+" ");
//	
//	if(c != 'A') {
//		
//		int dist = c-'A';
//		if(dist<13) { // B~M
//			
//			for(int j=0;j<dist;j++) {
//				answer++; // 다음알파벳 (위쪽 조이스틱 움직임 +1)
//				count++;
//			}
//			
//			System.out.println("B~M , 위쪽 컨트롤러 현재 "+count+"만큼 증가함");
//		}else { // L~Z
//			int c2 = 'Z';
//			answer++; // 아래쪽 컨트롤러
//			count++;
//			while(c < c2) {
//				System.out.println("와일문 돈다");
//				c2--;
//				answer++;
//				count++;
//			}
//			System.out.println("L~Z, 아래쪽 컨트롤러 현재"+ count+"만큼 증가함");
//			//System.out.println((char)c2);
//		}
//		
//			if(i != name.length()-1) {
//        		answer++;
//        		System.out.println("왼쪽 커서 +1 ");
//    		}
//	}
//	System.out.println("답 : "+answer);
//}
//
//System.out.println(answer);
//System.out.println();
//return answer;

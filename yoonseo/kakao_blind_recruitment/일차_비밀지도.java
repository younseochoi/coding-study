package kakao_blind_recruitment;

public class 일차_비밀지도 {

	public static void main(String[] args) {
		일차_비밀지도 s = new 일차_비밀지도();
		
		//출력	["#####","# # #", "### #", "# ##", "#####"]
		s.solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28});
//		출력	["######", "### #", "## ##", " #### ", " #####", "### # "]
		s.solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10});
		

	}

	 public String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = new String[n];
	        
	        for(int i=0;i<n;i++) {
	        	
	        	String s = String.format("%"+n+"s", Long.parseLong(Long.toBinaryString(arr1[i]|arr2[i]))).replace("1", "#").replace("0", " ");
	        	answer[i] = s;
	        	
	        }
	        
	        return answer;
	    }
}


//테스트 케이스 2, 6번은 대입하는 값이 큰 거 같습니다. Integer형으로 표현할 수 있는 최대 값을 초과해서 런타임 에러가 발생하는 것 같은데 저는 Long형으로 바꿨더니 해결됐습니다.
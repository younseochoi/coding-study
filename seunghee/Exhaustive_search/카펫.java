class Solution {
	public int[] solution(int brown, int yellow) {
      
        int[] answer = new int[2];
        
        //전체 넓이
        int area = brown + yellow;
        
        //가로는 최대값에서 감소, 높이는 최소값에서 증가
        for(int i=1; i<=area; i++) {
        	int width = i;
        	int height = area/width;
        	
        	//가로가 세로보다 더 길다
        	if (width > height)
        		continue;
        	
        	//가로 양 옆 2줄 제외, 높이 맨위아래 제외 2줄을 곱하면 노란색의 넓이
        	if ((width-2)*(height-2)==yellow) {
        		answer[0] = width;
        		answer[1] = height;
        		return answer;
        	}
        }
        return answer;
    }
}
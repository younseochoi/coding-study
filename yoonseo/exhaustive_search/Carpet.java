package exhaustive_search;

//카펫
public class Carpet {

	public int[] solution(int brown, int yellow) {
        int[] answer = {};
        //노란색부터 직사각형을 만들고 그 테두리를 brown으로 감쌀 수 있는지 확인
        //가로가 세로보다 더 길어야함
        int w=yellow;
        int h=1;
        int i=1;
        while(i<=yellow) {
        	i++;
        	if(w<h)	break;
  
        	if((2*(w+h)+4)==brown) {
        		answer = new int[]{w+2,h+2};
        		break;
        	}
        	
        	if(yellow%i==0) {
        		h = i;
        		w = yellow / h;
        	}
        	
        }
        return answer;
    }
}


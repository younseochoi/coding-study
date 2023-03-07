package pccp;

public class 실습용로봇 {

	int [] dx = {0,1,0,-1};
    int [] dy = {1,0,-1,0};
    
    public int[] solution(String command) {
        int[] answer = new int[2];
        int x=0 , y=0;
        int dir = 0; // 0 1 2 3 (시계 방향)
        for(int i=0;i<command.length();i++)
        {
            char c = command.charAt(i);
            
            if(c == 'G'){
              x += dx[dir];  
              y += dy[dir];  
            } 
            else if( c == 'B'){
              x += dx[(dir+2)%4];  
              y += dy[(dir+2)%4];  
            } 
            else if(c == 'R'){
                dir = (dir+1)%4;
            }
            else {
                dir = (dir+3)%4;
            }
        }
        
        answer[0] = x;
        answer[1] = y;
            
        return answer;
    }
	
}

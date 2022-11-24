package monthly_coding_challenge;

import java.util.ArrayList;

public class 빛의사이클 {

	public static void main(String[] args) {
		빛의사이클 s = new 빛의사이클();
		s.solution(new String[] {"SL","SR"}); //[16]
		//s.solution(new String[] {"S"}); //[1,1,1,1]
		//s.solution(new String[] {"R","R"}); //[4,4]
		
	}
	
	int[] dx = {-1,0,1,0}; // 위 , 좌, 아래, 오
	int [] dy = {0,-1,0,1};
	
	public int[] solution(String[] grid) {
        int[] answer = {};
        boolean visited[][][] = new boolean [grid.length][grid[0].length()][4];
        ArrayList<Integer> arrlist = new ArrayList<>();
       
        
        for(int i =0;i<grid.length;i++) {
        	for(int j =0;j<grid[0].length();j++) {
        		for(int d=0;d<4;d++) {
        			if(!visited[i][j][d]) {
        				System.out.println("solution "+d);
        				int result = getCycle(grid,i,j, d,visited); // 위, 좌, 아래, 우 방향으로 쏨
        				arrlist.add(result);
        			}
        			
        		}
        		
        	}
        }
        
        answer = arrlist.stream().sorted().mapToInt(i->i).toArray();
        
        for(int i =0;i<answer.length;i++) System.out.println(answer[i]);
        return answer;
    }
	
	public int getCycle(String[] grid, int x, int y , int d, boolean [][][] visited) {
		
		int count=0;
		int X = grid.length;
		int Y = grid[0].length();
		
		while(true) {
			
			if(visited[x][y][d]) break;
			System.out.println(x+","+y+":"+d+" 도착");
			count++;
			visited[x][y][d] = true;
			
			if(grid[x].charAt(y) == 'L') {
				
				d = d==0? 3 : d-1;
				System.out.println("L "+d);
			}
			else if(grid[x].charAt(y)=='R') {
				d = d==3 ? 0 : d+1;
				System.out.println("R "+d);
			}
			
			
			System.out.println(x+"+"+dx[d]+"+"+X);
			System.out.println(y+"+"+dy[d]+"+"+Y);
			x = (x+dx[d]+X)%X;
			y = (y+dy[d]+Y)%Y;
			
			System.out.println("x,y "+x+","+y);
		}
		System.out.println("while문 빠져나옴");
		return count;
	}

}
//https://jisunshine.tistory.com/175
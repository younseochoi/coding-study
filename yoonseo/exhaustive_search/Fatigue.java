package exhaustive_search;

import java.util.ArrayList;

//피로도
public class Fatigue {

	ArrayList<int[]> n_list = new ArrayList<>();
	boolean [] visited = new boolean[8];
	int max_count=0;
	
	public int solution(int k, int[][] dungeons) {
        //던전 들어갈 순서 조합 구함 
        rec(dungeons, k, 0);  
        return max_count;
    }
	
	public void rec(int[][] dungeons, int k,int len) {
		int answer = 0;
  
		if(dungeons.length ==len) {
			for(int [] i :n_list) {
				if(k<i[0]) {
					break;
				}
				answer++;
				k-=i[1];
			} 
			if(max_count<answer) {
				max_count = answer;
			}
			return ;
		}
		
		for(int j =0;j<dungeons.length;j++) {
			if(visited[j]) continue;
			visited[j]= true;
			
			n_list.add(dungeons[j]);
			
			rec(dungeons,k,len+1);
			visited[j]=false;
			n_list.remove(n_list.size()-1);

		}
		
	}
}

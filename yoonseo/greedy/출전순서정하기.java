package greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class 출전순서정하기 {

	public static void main(String[] args) {
		int[] russian = {3000, 2700, 2800, 2200, 2500, 1900};
		int [] korean = {2800, 2750, 2995, 1800, 2600,2000};
		출전순서정하기 s = new 출전순서정하기();
		int answer = s.order(russian, korean);
		System.out.print(answer);
	}
	
	public int order(int[] russian, int[] korean) {
		int n = russian.length, wins = 0;
		Arrays.sort(korean);
		
		ArrayList<Integer> koreanlist= new ArrayList<>();
		
		for(int i =0;i<korean.length;i++) {
			koreanlist.add(korean[i]);
		}
		
//		Iterator iterator = maxHeap.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		// 아직 남아 있는 선수들의 레이팅
		
		for(int i=0;i<n;i++) {
			
			//가장 레이팅이 높은 한국 선수가 이길 수 없는 경우
			//가장 레이팅이 낮은 선수와 경기시킨다.
			if(russian[i] > koreanlist.get(koreanlist.size()-1)) {
				koreanlist.remove(0);
			}
			// 이 외의 경우, 이길 수 있는 선수 중 가장 낮은 레이팅을 가진 선수와 경기시킨다.
			else {
				for(int j =0;j < koreanlist.size();j++) {
					if(russian[i] <= koreanlist.get(j)) {
						wins++;
						koreanlist.remove(j);
						break;
					}
				}
			}
			
		}
		
		return wins;
	}

}

package greedy;

import java.util.Arrays;
import java.util.Comparator;

//nlog(n) 시간이 걸리는 정렬 후에 선형 시간만이 걸리는 선택과정을 통해 최적해를 찾아냄 
public class 회의실예약 {

	public static void main(String[] args) {
		//각 회의는 [begin, end] 구간 동안 회의실을 사용한다.
		int n=5;
		int[] begin = new int[100], end = new int[100];
		int[][] pair = new int[n][2];
		
		begin[0] =10 ; 
		begin[1] =2;
		begin[2] = 1;
		begin[3] = 5;
		begin[4] = 8;
		
		end[0] = 15;
		end[1] =10;
		end[2] = 5;
		end[3] = 7;
		end[4] = 9;
		
		for(int i=0;i<n;i++) {
			pair[i][0] = begin[i];
			pair[i][1] = end[i];	
		}
		회의실예약 s = new 회의실예약();
		
		int answer = s.schedule(n,pair);
		System.out.println(answer);
		s.print(pair,n);
			
	}
	
	public int schedule(int n, int[][] pair) {
		
		// 일찍 끝나는 순서대로 정렬한다.
		Arrays.sort(pair, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int o2[]) { // index [1] 을 기준으로 오름차순 정렬 
				return o1[1] - o2[1];
			}
			
		});

		// earliest: 다음 회의가 시작할 수 있는 가장 빠른 시간
		// selected: 지금까지 선택한 회의의 수
		int earliest = 0, selected = 0; 
		for(int i=0;i<n;i++) {
			
			int meetingBegin = pair[i][0]; int meetingEnd = pair[i][1];
			
			if(earliest <= meetingBegin) {
				// earliest 를 마지막 회의가 끝난 시간 이후로 갱신한다.
				earliest = meetingEnd;
				selected++;
			}
		}
		
		return selected;
	}
	
	void print(int[][] pair , int n) {
		for(int i=0;i<n;i++) {
			System.out.println(i+"번째 회의 목록 start="+pair[i][0]+" end="+pair[i][1]);
		}
		System.out.println();
	}

}

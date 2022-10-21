package sort;

import java.util.Arrays;

public class K번째수 {


    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++) {
        	int start = commands[i][0]-1;
        	int end = commands[i][1];
        	int[] tmp = Arrays.copyOfRange(array,start,end);
   
//        	// 정렬 1
//        	for(int j=0;j<tmp.length;j++) {
//        		for(int k=j+1;k<tmp.length;k++) {
//        			if(tmp[j]>tmp[k]) {
//        				int ntmp = tmp[j];
//        				tmp[j] = tmp[k];
//        				tmp[k] = ntmp;
//        			}
//        		}
//        	}// sort end
        	
        	// 정렬 2 - 버블 정렬 
        	for(int j=0;j<tmp.length-1;j++) {
        		for(int k=0;k<tmp.length-j-1;k++) { //0~j번 반복 
        			if(tmp[k]>tmp[k+1]) {
        				int ntmp = tmp[k];
        				tmp[k] = tmp[k+1];
        				tmp[k+1] = ntmp;
        			}
        		}
        	}// bubble sort end
        	answer[i]= tmp[commands[i][2]-1];
        	
        }
        
        return answer;
    }
}

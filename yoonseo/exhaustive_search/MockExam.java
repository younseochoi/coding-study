package exhaustive_search;

import java.util.ArrayList;

//모의고사
public class MockExam {

        public int[] solution(int[] answers) {
                int[] answer = {};
        
        int[] grading = {};
        grading = new int[3];
        int[] p1= { 1, 2, 3, 4, 5};
        int[] p2 = { 2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int p1_len = p1.length;
        int p2_len = p2.length;
        int p3_len = p3.length;
        
        //완전 탐색 answer길이만큼 1번,2번,3번의 맞은 개수 확인 
        for(int i =0;i<answers.length;i++) {
        	
        	if(p1[i1%p1_len] == answers[i])	grading[0]+= 1;
        	if(p2[i2%p2_len] == answers[i]) grading[1]+= 1;
        	if(p3[i3%p3_len] == answers[i]) grading[2]+= 1;

        	i1++; i2++; i3++;
        }

        
        ArrayList<Integer> answerlist = new ArrayList<>();
        
        // 많이 맞춘 사람 순서대로 정렬 
        int max = 0;
        for(int i = 0 ; i < grading.length;i++) {
        	if(max<grading[i]) max=grading[i];
        }
        
       for(int i =0;i<grading.length;i++) {
       	if(max == grading[i]) {
       		answerlist.add(i+1);
       	}
       }
        
        //arraylist answer 배열에 옮겨주기 
        int j=0;
        answer = new int[answerlist.size()];
        for(int a:answerlist) {
        	answer[j++] = a;
        }

        return answer;
    }

//	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5,    1, 2, 3, 4, 5, ...
//	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5,     2, 1, 2, 3, 2, 4, 2, 5, ...
//	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,     3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
}

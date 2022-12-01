package summer_winter_coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class 숫자게임 {

    public static void main(String args[]) {
        숫자게임 s = new 숫자게임();
        s.solution(new int[] { 5, 1, 3, 7 }, new int[] { 8, 2, 6, 2 });
    }

    public int solution2(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int j = B.length - 1;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] < B[j]) {
                answer++;
                j--;
            }
        }

        return answer;
    }

    // 효율성 통과 x
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        Arrays.sort(B);
        ArrayList<Integer> arrlist = new  ArrayList<>();

        for(int i = 0;i<B.length;i++){
          
            arrlist.add(B[i]);
          
        }
            
        for(int i =0;i< A.length;i++){
           
            //B 팀의 가장 큰 숫자가 A팀의 현재 숫자 작다면 무조건 이길 수 없음.
            // 이 경우엔 가장 작은 사람 내보냄
            if(A[i] >arrlist.get(arrlist.size()-1)){
               arrlist.remove(0);
            }
            //그렇지 않다면 이길수 있는 선수중 제일 작은 숫자 내보냄
            else{
               
                for(int j=0;j<arrlist.size();j++){
                	
                    if(A[i] < arrlist.get(j)) {
                    	//System.out.println(h);
                        answer++;
                        arrlist.remove(j);
                        break;
                    }
                }

              
            }
        }
         
       
        return answer;
    }

}

/*
 * 정확성 테스트
 * 테스트 1 〉 통과 (0.34ms, 75.8MB)
 * 테스트 2 〉 통과 (0.34ms, 70.8MB)
 * 테스트 3 〉 통과 (0.34ms, 73.7MB)
 * 테스트 4 〉 통과 (0.47ms, 75MB)
 * 테스트 5 〉 통과 (0.38ms, 73.7MB)
 * 테스트 6 〉 통과 (0.40ms, 75.3MB)
 * 테스트 7 〉 통과 (0.41ms, 74.4MB)
 * 테스트 8 〉 통과 (0.56ms, 75.7MB)
 * 테스트 9 〉 통과 (1.29ms, 78.1MB)
 * 테스트 10 〉 통과 (0.88ms, 78.4MB)
 * 테스트 11 〉 통과 (0.89ms, 73.9MB)
 * 테스트 12 〉 통과 (0.88ms, 79.2MB)
 * 테스트 13 〉 통과 (3.54ms, 84.8MB)
 * 테스트 14 〉 통과 (6.95ms, 75.5MB)
 * 테스트 15 〉 통과 (5.87ms, 88.8MB)
 * 테스트 16 〉 통과 (4.24ms, 81.9MB)
 * 테스트 17 〉 통과 (0.62ms, 70.5MB)
 * 테스트 18 〉 통과 (0.78ms, 90.6MB)
 * 효율성 테스트
 * 테스트 1 〉 통과 (62.14ms, 81.1MB)
 * 테스트 2 〉 통과 (110.33ms, 64MB)
 * 테스트 3 〉 통과 (55.96ms, 65.6MB)
 * 채점 결과
 * 정확성: 85.7
 * 효율성: 14.3
 * 합계: 100.0 / 100.0
 */

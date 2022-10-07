import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[][] person = {{1, 2, 3, 4, 5}, 
                          {2, 1, 2, 3, 2, 4, 2, 5}, 
                          {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        ArrayList<Integer> answerArr = new ArrayList();     // 각각 정답 맞춘 수 담을 리스트
        ArrayList<Integer> resultArr = new ArrayList();     // 최대 정답자 담을 리스트

        int pass1 = 0;
        int pass2 = 0;
        int pass3 = 0;
        
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == person[0][i%person[0].length]) pass1++; // 입력된 answer 길이에 맞게 답변 반복하여 비교
            if (answers[i] == person[1][i%person[1].length]) pass2++; 
            if (answers[i] == person[2][i%person[2].length]) pass3++; 
        }
        
        // 맞춘 답변 개수 저장
        answerArr.add(pass1);
        answerArr.add(pass2);
        answerArr.add(pass3);
        
        for (int i=0; i<answerArr.size(); i++) {
            if (Collections.max(answerArr).equals(answerArr.get(i))) {  // 최대 맞춘 수와 같으면 
                resultArr.add(i+1);                                     // resultArr에 저장
            } 
        }
        
        answer = new int[resultArr.size()];         // 최대 정답자 수만큼 answer 길이 생성
        for (int i=0; i<resultArr.size(); i++) {    
            answer[i] = resultArr.get(i);           // answer에 최대 정답자 넣기
        }
        return answer;
    }
}
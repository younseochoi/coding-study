import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        List <String> word = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            if(word.contains(words[i])){
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                break;
            }
            else if(i!=0){
                if(word.get(i-1).charAt(word.get(i-1).length()-1)!=words[i].charAt(0)){
                    answer[0]=i%n+1;
                    answer[1]=i/n+1;
                    break;
                }
            }
            word.add(words[i]);
        }
        return answer;
    }
}
/*
여기서 hash 쓴 사람 봤는데 그거도 나쁘지 않은듯!
 테스트 1 〉	통과 (0.04ms, 75.5MB)
테스트 2 〉	통과 (0.06ms, 76.6MB)
테스트 3 〉	통과 (0.03ms, 74.4MB)
테스트 4 〉	통과 (0.06ms, 72.6MB)
테스트 5 〉	통과 (0.14ms, 77.4MB)
테스트 6 〉	통과 (0.04ms, 73.3MB)
테스트 7 〉	통과 (0.07ms, 75.4MB)
테스트 8 〉	통과 (0.05ms, 78.1MB)
테스트 9 〉	통과 (0.04ms, 76.7MB)
테스트 10 〉	통과 (0.11ms, 77.1MB)
테스트 11 〉	통과 (0.09ms, 66.3MB)
테스트 12 〉	통과 (0.07ms, 78.6MB)
테스트 13 〉	통과 (0.05ms, 74.5MB)
테스트 14 〉	통과 (0.04ms, 77.1MB)
테스트 15 〉	통과 (0.66ms, 76.9MB)
테스트 16 〉	통과 (0.05ms, 90.2MB)
테스트 17 〉	통과 (0.04ms, 78.4MB)
테스트 18 〉	통과 (0.04ms, 79.5MB)
테스트 19 〉	통과 (0.03ms, 65.1MB)
테스트 20 〉	통과 (0.36ms, 83.5MB)
 */
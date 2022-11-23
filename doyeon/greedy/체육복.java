// 출처 : https://taehoung0102.tistory.com/11

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;
 
        // people 배열에 잃어버린 사람은 -1, 여분 가진 사람은 +1로 표시
        for (int l : lost) {
            people[l-1]--;
        }
        for (int r : reserve) {
            people[r-1]++;
        }
 
        // 
        for (int i = 0; i < people.length; i++) {
            // 잃어버린 사람이 있다면
            if(people[i] == -1) {
                // 양 옆에 여분있는 사람이 있는 경우 잃어버린 사람은 +1, 여분 있는 사람은 -1
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                    
                } else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                    
                // 없으면 answer 수 감소
                }else 
                    answer--;
            }
        }
        return answer;
    }
}
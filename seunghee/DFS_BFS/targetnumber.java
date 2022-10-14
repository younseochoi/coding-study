class Solution {
    static int answer;
    
    public int solution(int[] numbers, int target) {

        answer = 0;
        dfs(numbers,target,0,0);
        return answer;
    }
    
    public void dfs(int[] numbers,int target,int index,int sum){
        
        // sum 값이 target 값과 같으면 answer 값 증가
        if(index == numbers.length){   
            if(sum == target) answer++;
            return;
        }

        //재귀함수 호출 부분
        sum+=numbers[index];
        dfs(numbers,target,index+1,sum);
        sum-=numbers[index];
        sum+=(-1 * numbers[index]);
        dfs(numbers,target,index+1,sum);
    }
    
}
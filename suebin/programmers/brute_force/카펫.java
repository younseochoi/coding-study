class Solution {
    public int[] solution(int brown, int yellow) {
       
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        
        // 노란색 격자가 가운데 위치할 수 있는지 구하기
        for (int i = 3; i < sum; i++) {
            int j = sum / i;
            
            if (sum % i == 0 && j >= 3) {
                int col = Math.max(i, j);
                int row = Math.min(i, j);
                int center = (col - 2) * (row - 2);
                
                if (center == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        return answer;
    }
}

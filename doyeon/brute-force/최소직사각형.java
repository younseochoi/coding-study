class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp;
        int h_max = 0;      // 최대 세로 크기
        int w_max = 0;      // 최대 가로 크기
        
        for (int i=0; i<sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {    // 입력된 원소에서 큰 수를 뒤로 보냄 ex.[작은수,큰수]
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            
            if (h_max < sizes[i][1]) h_max = sizes[i][1];   // 원소들 중 가장 큰 세로 길이
            if (w_max < sizes[i][0]) w_max = sizes[i][0];   // 원소들 중 가장 큰 가로 길이
        }
        
        answer = h_max * w_max;
        return answer;
    }
}
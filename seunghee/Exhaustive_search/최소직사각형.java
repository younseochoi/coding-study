class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int width = 0;
        int height = 0;
        
        // 가장 긴 길이를 x, 짧은 길이를 y 순서로 정렬
        for (int i=0; i<sizes.length; i++){
            if( sizes[i][0] < sizes[i][1] ){
                int x = sizes[i][1];
                int y = sizes[i][0];
                sizes[i][0] = x;
                sizes[i][1] = y;
            }
        }
        
        // 가장 긴 가로값을 저장, 가장 긴 세로값을 저장
        for (int j=0; j<sizes.length; j++){
            if(sizes[j][0] > width){
                width = sizes[j][0];
            }
            if (sizes[j][1] > height){
                height = sizes[j][1];
            }
        }
        answer = width * height;
        return answer;
    }
}
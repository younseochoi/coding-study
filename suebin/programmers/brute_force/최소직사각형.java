import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
       
        int answer = 0;
        int width = 0;  // 모든 명함을 수납할 수 있는 지갑의 가로 길이
        int height = 0; // 모든 명함을 수납할 수 있는 지갑의 세로 길이
        
        for (int i=0; i<sizes.length; i++) { 
            
            int now_width = Math.max(sizes[i][0], sizes[i][1]); // 가로 = 두 길이 중 더 긴 길이 
            int now_height = Math.min(sizes[i][0], sizes[i][1]);  // 세로 = 두 길이 중 더 짧은 길이
            
            width = Math.max(now_width, width); // 가로의 최댓값
            height = Math.max(now_height, height); // 세로의 최댓값
        }
        
        answer = width * height;
            
        return answer;
    }
}
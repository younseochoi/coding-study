class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int w = 0;      // 가로 길이
        int h = 0;      // 세로 길이
        
        int block = (brown - 4)/2;      // (총 갈색 블록 개수 - 모서리 블록 4개) / 2
        
        for (int i=0; i <= block; i++) {
            if (i * (block-i) == yellow) {  // block 개수에서 yellow 개수가 나올 수 있는 조합으로 곱하기
                h = block - i + 2;      // 그 중 짧은 길이에서 모서리 블록 2개 더하기
                w = i + 2;              // 그 중 긴 길이에서 모서리 블록 2개 더하기
            } 
        }
        
        answer[0] = w;
        answer[1] = h;
        
        return answer;
    }
}
// https://drcode-devblog.tistory.com/189

class Solution {
    int[] answer;
	
    public int[] solution(int[][] arr) {
        answer = new int[2];
		quad(arr.length, 0, 0, arr);
		return answer;
    }
    
	public void quad(int n, int y, int x, int[][] arr) {
        // 크기가 1이면 해당 영역 값의 개수 증가
		if(n == 1) {
			answer[arr[y][x]]++;
			return;
		}
		
		if(isBlock(n, y, x, arr)) return;
		
        // 재귀호출로 분할하며 계속 확인
		quad(n/2, y, x, arr);
		quad(n/2, y + n/2, x, arr);
		quad(n/2, y, x + n/2, arr);
		quad(n/2, y + n/2, x + n/2, arr);
	}
	
	public boolean isBlock(int n, int y, int x, int[][] arr) {
		for (int i = y; i < y + n; i++) {
			for (int j = x; j < x + n; j++) {
                // 모든 값이 같지 않으면 반복문 중단
				if(arr[y][x] != arr[i][j]) return false;
			}
		}
        
        // 해당 영역 값의 개수 증가
		answer[arr[y][x]]++;
		return true;
	}
}
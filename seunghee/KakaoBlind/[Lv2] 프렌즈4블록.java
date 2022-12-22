//출처: https://velog.io/@hyeon930/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%94%84%EB%A0%8C%EC%A6%884%EB%B8%94%EB%A1%9D-Java

import java.util.*;

class Solution {
	public int solution(int m, int n, String[] board) {
		int answer = 0;
		char[][] map = new char[m][n];
		
		for(int i = 0 ; i < m ; ++i) {
			map[i] = board[i].toCharArray();
		}
		
		while(true) {
			int cnt = checkBlock(m, n, map);
			if(cnt == 0) break;
			answer += cnt;
			
			dropBlock(m, n, map);
		}
		
		return answer;
	}
	
	private void dropBlock(int m, int n, char[][] map) {
		for(int c = 0 ; c < n ; ++c) {
			for(int r = m - 1 ; r >= 0 ; --r) {
				if(map[r][c] == '.') {
					for(int nr = r - 1 ; nr >= 0 ; --nr) {
						if(map[nr][c] != '.') {
							map[r][c] = map[nr][c];
							map[nr][c] = '.';
							break;
						}
					}
				}
			}
		}
	}

	private int checkBlock(int m, int n, char[][] map) {
		int cnt = 0;
		boolean[][] isChecked = new boolean[m][n];
		
		for(int i = 0 ; i < m - 1 ; ++i) {
			for(int j = 0 ; j < n - 1 ; ++j) {
				if(map[i][j] == '.') continue;
				checkFour(map, isChecked, i, j);
			}
		}
		
		for(int i = 0 ; i < m ; ++i) {
			for(int j = 0 ; j < n ; ++j) {
				if(isChecked[i][j]) {
					cnt++;
					map[i][j] = '.';
				}
			}
		}
		
		return cnt;
	}

	private void checkFour(char[][] map, boolean[][] isChecked, int i, int j) {
		char block = map[i][j];
		
		for(int r = i ; r < i + 2 ; ++r) {
			for(int c = j ; c < j + 2 ; ++c) {
				if(map[r][c] != block) return;
			}
		}
		
		for(int r = i ; r < i + 2 ; ++r) {
			for(int c = j ; c < j + 2 ; ++c) {
				isChecked[r][c] = true;
			}
		}
	}
}
/*
정확성  테스트
테스트 1 〉	통과 (0.06ms, 74.3MB)
테스트 2 〉	통과 (0.05ms, 65.6MB)
테스트 3 〉	통과 (0.04ms, 80.4MB)
테스트 4 〉	통과 (0.59ms, 80MB)
테스트 5 〉	통과 (21.85ms, 81.3MB)
테스트 6 〉	통과 (3.82ms, 73.2MB)
테스트 7 〉	통과 (0.43ms, 75.6MB)
테스트 8 〉	통과 (0.58ms, 74.2MB)
테스트 9 〉	통과 (0.06ms, 81MB)
테스트 10 〉	통과 (0.29ms, 75.4MB)
테스트 11 〉	통과 (1.14ms, 79.7MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
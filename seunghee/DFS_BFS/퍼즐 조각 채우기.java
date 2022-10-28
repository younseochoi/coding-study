import java.util.*;

//이건 도저히 혼자 못풀겠네요... ㅠㅠ
public class Solution {
	static int[] dy = {0, 0, 1, -1};
	static int[] dx = {1, -1, 0, 0};
	static int[][] marking_table;
	static boolean[][] table_visit;
	static int block_count = 1;
	static int[] block;
	static boolean[] block_check;
	static Map<String, Integer> map;
	static int solution(int[][] game_board, int[][] table) {
		int answer = 0;
		init(table);
		boolean[][] visit = new boolean[game_board.length][game_board.length];
		for(int i=0; i<game_board.length; i++) {
			for(int j=0; j<game_board.length; j++) {
				if(game_board[i][j]==0 && !visit[i][j]) {
					String dir = getDir(i, j, game_board, visit, 0, "-");
					for(int number=1; number<block_count; number++) {
						if(!block_check[number] && map.get(number+dir)!=null) {
							block_check[number] = true;
							answer += block[number];
							break;
						}
					}
				}
			}
		}
		return answer;
	}
	static void init(int[][] table) {
		// 1. 블록에 번호 부여
		marking_table = new int[table.length][table.length];
		table_visit = new boolean[table.length][table.length];
		for(int i=0; i<table.length; i++) {
			for(int j=0; j<table.length; j++) {
				if(table[i][j]==1 && !table_visit[i][j]) {
					markingTable(i, j, table);
					block_count++;
				}
			}
		}	
		// 2. 각 블록의 길이 구하기
		block = new int[block_count];
		for(int i=0; i<table.length; i++) {
			for(int j=0; j<table.length; j++) {
				if(marking_table[i][j]>=1) {
					block[marking_table[i][j]]++;
				}
			}
		}
		// 3. 블록 4방향 회전
		block_check = new boolean[block_count];
		int[][][] rotate_table = new int[4][table.length][table.length];
		rotate_table[0] = marking_table;
		for(int d=1; d<4; d++) {
			for(int i=0; i<table.length; i++) {
				for(int j=0; j<table.length; j++) {
					rotate_table[d][table.length-1-j][i] = rotate_table[d-1][i][j];
				}
			}
		}
		// 4. 각 블록 진행방향 맵에 추가, game_board에서 검사
		map = new HashMap<>();
		for(int d=0; d<4; d++) {
			table_visit = new boolean[table.length][table.length];
			for(int i=0; i<table.length; i++) {
				for(int j=0; j<table.length; j++) {
					if(rotate_table[d][i][j]>=1 && !table_visit[i][j]) {
						String dir = getDir(i, j, rotate_table[d], table_visit, rotate_table[d][i][j], rotate_table[d][i][j]+"-");
						map.put(dir, rotate_table[d][i][j]);
					}
				}
			}
		}
	}
	// y좌표, x좌표, 검사대상, 검사대상방문체크, 블록번호, 결과방향변수
	static String getDir(int y, int x, int[][] map, boolean[][] visit, int target, String result) {
		visit[y][x] = true;
		for(int d=0; d<4; d++) {
			int ny = y + dy[d];
			int nx = x + dx[d];
			if(isRange(ny, nx) && map[ny][nx]==target && !visit[ny][nx]) {
				result += d;
				result = getDir(ny, nx, map, visit, target, result);
				result += d;
			}
		}
		return result;
	}
	static void markingTable(int y, int x, int[][] table) {
		table_visit[y][x] = true;
		marking_table[y][x] = block_count;
		for(int d=0; d<4; d++) {
			int ny = y + dy[d];
			int nx = x + dx[d];
			if(isRange(ny, nx) && table[ny][nx]==1 && !table_visit[ny][nx]) {
				markingTable(ny, nx, table);
			}
		}
	}
	static boolean isRange(int y, int x) {
		if(y<0 || x<0 || y>=marking_table.length || x>=marking_table.length)
			return false;
		return true;
	}
}
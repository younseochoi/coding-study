import java.util.LinkedList;
import java.util.Scanner;

public class DFS와BFS {

	static int [][] arr;
	static boolean [] visited;
	
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt(); //정점 개수 
		int m = sc.nextInt(); //에지 개수
		int v = sc.nextInt(); //탐색 시작 정점 번호
		
		arr = new int[n+1][n+1];
		for(int i=0;i<m;i++) {
			int x= sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
			arr[y][x] = 1;
            // 자기 자신 에지도 1로 표시 
			arr[x][x] = 1;
            arr[y][y] = 1;
		} // 인접행렬 표시 
		
		visited = new boolean[n+1];
		dfs(v);
		System.out.println();
		visited = new boolean[n+1];
		bfs(v);
	}
	
	public static void dfs(int v) {
		if(v == arr.length) return ;
		visited[v] = true;
		visit_print(v); // 출력 
		
		for( int i =0;i<arr.length;i++) {
			if(v!=i && arr[v][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int v) {
		//Queue<Integer> queue = new Queue<Integer>();
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited[v] = true;
		while(!queue.isEmpty()) {
			int n = queue.poll();
			for(int i=1;i<arr.length;i++) {
				if(v!=i && arr[n][i] == 1 && !visited[i]){
					queue.add(i);
					visited[i] = true;
					
				}
			}
			visit_print(n);
		}
	}
	
	public static void visit_print(int n) {
		System.out.print(n+" ");
	}


}

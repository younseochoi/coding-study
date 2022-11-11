import java.util.*;

public class Main {
    static boolean [] visited_dfs;
    static boolean [] visited_bfs;
    static int [][] matrix;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();  
        int m = scan.nextInt();  
        int v = scan.nextInt(); 

        visited_dfs = new boolean [n+1];
        visited_bfs = new boolean [n+1];
        matrix = new int [n+1][n+1];

        // 인접행렬 생성
        for (int i=0; i <m; i++) {
            int a = scan.nextInt();  
            int b = scan.nextInt();  
            matrix[a][b] = matrix[b][a] = 1;
        }

        dfs(v, n);
        System.out.println();
        bfs(v, n);
    }


    public static void dfs(int v, int n) {
        visited_dfs[v] = true;
        System.out.print(v + " ");

        for (int i=1; i <n+1; i++) {
            // 방문하지 않았고 이어져 있을 때 재귀함수 호출
            if (visited_dfs[i] == false && matrix[v][i] == 1) {
                dfs(i, n);
            }
        }
    } 

    public static void bfs(int v, int n) {
        visited_bfs[v] = true;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);

        while (!queue.isEmpty()) {
            // 첫번째 큐 원소 반환
            v = queue.poll();
            System.out.print(v + " ");

            for (int i=1; i <n+1; i++) {
                // 방문하지 않았고 이어져 있을 때 큐에 원소 담기
                if (visited_bfs[i] == false && matrix[v][i] == 1) {
                    queue.add(i);
                    visited_bfs[i] = true;
                }
            }
        }
    }
}
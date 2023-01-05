//더 좋은 방법이 있을것같아 풀다가 말았습니다

// import java.io.*;
// import java.util.*;

// public class 체스판다시칠하기_1018{
//     static final int MAX = 40000;
//         public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//         int N,M;
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         N=Integer.parseInt(st.nextToken());        
//         M=Integer.parseInt(st.nextToken());
//         char [][]board = new char[N][M];       

//         for(int j=0;j<N;j++){
//             String s = br.readLine();
//             for(int i=0;i<M;i++){
//                 board[j]=s.toCharArray();   
//             }
//         }
//         int change_w=0, change_b=0;
//         int small=10000;
//         int small_change_w=0, small_change_b=0;

//         for(int a=0;a<N-8;a++){
//             for(int b=0;b<M-8;b++){
//                 char color = 'W';
//                 for(int y=0;y<8;y++){
//                     for(int x=0;x<8;x++){
//                         if(board[y+a][x+b]!=color)
//                             change_w++;
//                         if(color=='W')
//                             color='B';
//                         else
//                             color='W';
//                     }
//                 }
//                 color = 'B';
//                 for(int y=0;y<8;y++){
//                     for(int x=0;x<8;x++){
//                         if(board[y+a][x+b]!=color)
//                             change_b++;
//                         if(color=='W')
//                             color='B';
//                         else
//                             color='W';
//                     }
//                 }

//                 small = small<change_w ? small:change_w;
//                 small = small<change_b ? small:change_b;
//             }
//         }
//         System.out.print(small);

//     }
// }
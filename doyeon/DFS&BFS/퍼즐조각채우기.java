// 출처: https://eno1993.tistory.com/131 [Develop Lab:티스토리]

import java.util.*;

class Solution {
    
    class Block{ // 빈칸과 블록을 담을 Block 개체 정의
        public int[][] arr; // 배열을 담음 
        public Integer n; // 빈칸 혹은 블록의 갯수
        Block(int[][] a, int n, int x, int y){
            arr = new int[6][6]; // 빈칸과 블록의 최대 갯수는 6개 이므로 6x6의 배열로 정의
            for(int i=0; i<6; i++){ 
                for(int j=0; j<6; j++){
                    if(x+i<len&&y+j<len){
                        arr[i][j] = a[x+i][y+j]; 
                    }
                }
            }
            this.n = n;
        }
    }
    //다른 메서드 에서도 사용가능하도록 외부에서 정의
    int[][] g, t, temp; // g : game_board, t : table
    int len, count; //len : game_board.length, count : 최대 6개가 넘는지 확인하기 위한 수
    
    int[] _x = {-1, 1, 0, 0}, _y = {0, 0, -1, 1}; // 빈칸과 블록을 뽑아내기 위해 상하좌우를 정의할 배열
    int[] p = new int[2]; // 빈칸과 블록의 가장 작은 x 값과 y값 -> x,y 값 부터 6x6행렬로 오려내기 위함
    
    List<Block> b_list = new ArrayList<Block>(); //빈칸을 담음
    List<Block> t_list = new ArrayList<Block>(); //블록을 담음

    public int solution(int[][] game_board, int[][] table) {
        
        int answer = 0;
        len = game_board.length;
        g = new int[len][len];
        t = new int[len][len];

        for(int i=0; i<len; i++){ for(int j=0; j<len; j++){ 
            g[i][j] = game_board[i][j]; t[i][j] = table[i][j];
        }}
        
        for(int i=0; i<len; i++){for(int j=0; j<len; j++){
            if(g[i][j]==0){ //빈 공간 발생
                temp = new int[len][len]; //빈 공간을 복사할 배열
                p[0] = i; p[1] = j; count = 0;
                findBlock(i,j,0);
                b_list.add(new Block(temp,count,p[0],p[1])); //찾은 빈 공간 리스트 추가
            }
            if(t[i][j]==1){ //블록 발생
                temp = new int[len][len]; //블록을 복사할 배열
                p[0] = i; p[1] = j; count = 0;
                findBlock(i,j,1);
                if(count<=6){ t_list.add(new Block(temp,count,p[0],p[1])); }//찾은 블록 리스트 추가
            }
        }}
        
        Collections.sort(b_list, (o1, o2) -> (o2.n).compareTo(o1.n)); // 공간 수가 많은 것 부터 오름차순
        Collections.sort(t_list, (o1, o2) -> (o2.n).compareTo(o1.n)); // 블록 수가 많은 것 부터 오름차순
        
        for(int i=0; i<b_list.size(); i++){
            Block o1 = b_list.get(i);
            for(int j=0; j<t_list.size(); j++){
                Block o2 = t_list.get(j);
                if(o1.n<o2.n){ continue; } // 빈 공간보다 블록이 더 많다면 다음 블록 확인
                else if(o1.n==o2.n){ // 빈 공간 수와 블록 수가 동일하다면 모양이 맞는지 확인
                    if(fitBlock(o1.arr, o2.arr, o1.n)){ // 블록이 빈 공간에 딱 들어갈 경우
                        answer += o1.n; 
                        t_list.remove(j);
                        break;
                    }
                }
                else{ break; } // 빈 공간의 수가 더 많을 경우 다음 빈 공간 확인
            }
        }
        return answer;
    }
    
    //빈 공간 혹은 블록의 모양을 탐색
    public void findBlock(int i, int j, int choice){//choice 0:빈 공간 찾기 1:블록 찾기 
        count++;
        if(choice==0) { g[i][j] = 1;}
        else{ t[i][j] =0; }
        
        if(i<p[0]){ p[0] = i; }
        if(j<p[1]){ p[1] = j; }
        
        temp[i][j] = 1;
        for(int z=0; z<4; z++){// dfs를 이용해서 모양을 탐색
            int x = i+_x[z], y = j+_y[z];
            if(0<=x&&x<len&&0<=y&&y<len){
                if(choice==0&&g[x][y]==0){ findBlock(x, y, choice); }
                if(choice==1&&t[x][y]==1){ findBlock(x, y, choice); }
            }
        }
    }
    //빈 공간과 블록의 모양이 일치하는지를 탐색
    public boolean fitBlock(int[][] o1, int[][] o2, int n){
        
        int count; // 빈공간에 블록이 위치하면 count++
        int[] degree = {0, 90, 180, 270}; // 회전 각
        for(int r=0; r<4; r++){
            int[][] rotate = rotateArr(o2, degree[r]); // 회전 된 배열 반환
            for(int x=0; x<6; x++){ //rotate 배열의 시작점을 지정
                for(int y=0; y<6; y++){ 
                    count = 0;
                    for(int i =0; i<6; i++){// 처음 부터 끝까지 겹치는 모든 부분을 탐색
                        for(int j=0; j<6; j++){
                            if(0<=x+i&&x+i<6&&0<=y+j&&y+j<6){
                                if(o1[i][j]==1&&rotate[x+i][y+j]==1){ count++; }
                                if((o1[i][j]==1&&rotate[x+i][y+j]==0)||(o1[i][j]==0&&rotate[x+i][y+j]==1)){ // 맞지 않는 모양
                                    i  =7; j=7; // 강제 break;
                                }
                            }
                        } 
                    }
                    if(count==n){ return true; }// 딱 맞는 모양일 경우 true 반환
                }
            }
        }
        return false;
    }
    
    public int[][] rotateArr(int[][] arr, int degree){ // 각에 따른 회전 배열을 반환
        int[][] rotate = new int[6][6];
        for (int i=0; i<6; i++){for (int j=0; j<6; j++){
            switch (degree) {
                case 0 : rotate[i][j] = arr[i][j]; break;
                case 90: rotate[i][j] = arr[5-j][i]; break;
                case 180: rotate[i][j] = arr[5-i][5-j]; break;
                case 270: rotate[i][j] = arr[j][5-i]; break;
            }
        }}
        return rotate;
    }
}
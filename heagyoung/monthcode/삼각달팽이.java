class Solution {
    public int[] solution(int n) {
        int[] answer = new int [(n*n+n)/2];
        int[][] ing = new int[n][n];
        
        int check = 0; //몇번째 삼각형을 돌고있는지
        int move=0; //몇번 움직였을때까지
        int type=0; //타입 1:아래로가기 2:옆으로가기 3:대각선
        int num=1; //숫자가 삼각형을 다 채우면 종료
        
        while(true){
            if(num==(n*n+n)/2+1)
                break;
            if(type==0){
                ing[check*2+move++][check]=num++;
                if(check*2+move==n-check){
                    move=check+1;
                    type=1;
                }
            }
            else if(type==1){
                ing[n-check-1][move++]=num++;
                if(move==n-check*2){
                    move=1;
                    type=2;
                }
            }
            else{
                ing[n-check-move-1][n-check*2-1-move++]=num++;

                if(n-check*2-1-move==check){
                    type=0;
                    check++;
                    move=0;
                }
            }
        }
        move=0;
        for(int i=0;i<n;i++){
            for(int j=0; j<i+1;j++){
                if(ing[i][j]!=0)
                    answer[move++]=ing[i][j];
                //System.out.print(ing[i][j]+" ");
            }
            //System.out.println(" ");
        }
        
        return answer;
    }
}
class Solution {
    int zero=0;
    int one=0;

    //전체를 재귀함수를 사용해서 2x2 배열이 될때까지 잘라서
    //배열의 내용이 같으면 배열 수 리턴
    //다르면 -1을 리턴하고 zero와 one의 수를 더해줌

    //리턴받은 값들로 다시 배열을 이뤄서 내부값을 비교
    //배열의 내용이 같으면 배열 수 리턴
    //다르면 -1을 리턴하고 zero와 one의 수를 더해줌
    
    public int check(int[][] arr){
        if(arr.length==2){
            int n1=0, n0=0;
            
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    if(arr[i][j]==0)
                        n0++;
                    else if(arr[i][j]==1)
                        n1++;
                }
            }
        
            if(n0==4)
                return 0;
            else if(n1==4)
                return 1;
            else{
                zero+=n0;
                one+=n1;
                return -1;
            }
        }
            
        
        int[][] aa = new int [arr.length/2][arr.length/2];
        int[][] bb = new int [arr.length/2][arr.length/2];
        int[][] cc = new int [arr.length/2][arr.length/2];
        int[][] dd = new int [arr.length/2][arr.length/2];
        
        for(int a=0; a<arr.length; a++){
            for(int b=0; b<arr.length; b++){
                if(a<arr.length/2&&b<arr.length/2)
                    aa[a][b]=arr[a][b];
                else if(a>=arr.length/2&&b<arr.length/2)
                    bb[a-arr.length/2][b]=arr[a][b];
                else if(a<arr.length/2&&b>=arr.length/2)
                    cc[a][b-arr.length/2]=arr[a][b];
                else
                    dd[a-arr.length/2][b-arr.length/2]=arr[a][b];
            }
        }
        
        int[][] abcd = new int [2][2];
        
        abcd[0][0]=check(aa);
        abcd[1][0]=check(bb);
        abcd[0][1]=check(cc);
        abcd[1][1]=check(dd);
        
        return check(abcd);
        
    }
    public int[] solution(int[][] arr) {
        int[] answer = new int [2];
        int result = check(arr);
        answer[0] = result == 0 ? result : zero;
        answer[1] = result == 1 ? result : one;
        return answer;
    }
}
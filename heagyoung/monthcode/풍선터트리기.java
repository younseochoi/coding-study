class Solution {
    public int solution(int[] a) {
        if(a.length<=3)
            return a.length;
        int answer = 2;
        int lr[] = new int[a.length]; //left->right 가장 작은 수
        int rl[] = new int[a.length]; //right->left 가장 작은 수
        
        lr[0] = a[0]; //
        rl[a.length-1] = a[a.length-1];
        
        for(int i=1;i<a.length-1;i++){
            lr[i] = a[i] < lr[i-1] ? a[i] : lr[i-1]; //0~i-1번째위치에서 가장 작은 수
        }
        for(int j=a.length-2;j>0;j--){
            rl[j] = a[j] < rl[j+1] ? a[j] : rl[j+1]; //i+1~마지막에서 가장 작은 수
        }

        for(int balloon=1;balloon<a.length-1;balloon++){
            if(a[balloon]>lr[balloon] && a[balloon]>rl[balloon])
                continue;
            answer++;
        }
        
        return answer;
    }
}
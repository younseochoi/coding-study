// import java.util.*;
// class Solution {
//     public int[] solution(String[] genres, int[] plays) {
//         int[] answer = {};
//         int[100] gen_o = new int[];
//         int gen_num=0;
//         int[plays.lenght][4] al = new int[][];
        
//         for (int i=0;i<plays.length;i++){
//             for (int j=0;j<i;j++){
//                 if (genres[i].equals(genres[j])){
//                     gen_o[i]+=plays[j];
//                     al[j][0]=al[i][0];
//                     al[j][1]=plays[j];
//                     al[j][2]=j;
//                     al[j][3]=0;
//                     break;
//                 }
//                 if (j==i-1)
//                     gen_o[gen_num]+=plays[j];
//                     al[j][0]=gen_num;
//                     al[j][1]=plays[j];
//                     al[j][2]=j;
//                     al[j][3]=0;
//                     gen_num++;
//                 }
                    
//             }
//         }
//         al.sort();
//         int check=0; //같은 장르 곡 갯수 체크
//         for (int k=0;k<plays.lenght-1;k++){
//             if(al[k][0]!=al[k+1][0]){
//                 check=k-check;
//                 for(int l=0;l<check+1;l++) //같은 장르 곡 총 플레이 횟수 입력
//                     al[k-l][3]=gen_o[al[k][0]];
//             }
//         }
//         Arrays.sort(al.Comparator.comparingInt(i->i[3])); //플레이수가 많은 수대로 재정렬
        
//         int check_=0; //같은 장르 곡 갯수 체크
//         int add_a=0;
//         for(int m=0; m<plays.lenght-1; m++){
//             if(al[m][0]!=al[m+1][0]){
//                 check_=m-check_;
//                 int max=-1;
//                 int max_=-1;
//                 int maxx=-2;
//                 int maxx_=-2;
//                 for(int n=0;n<check_+1;n++){ //같은 장르 곡 총 플레이 횟수 입력
//                     if (al[m-l][1]>=max){
//                         maxx=max;
//                         maxx_=max_;
//                         max=al[m-l][1];
//                         max_=al[m-l][2];          
//                     }
//                     else if (al[m-l][1]>=maxx){
//                         maxx=al[m-l][1];
//                         maxx_=al[m-l][2]; 
//                     }
//                 }
                
//             }          
            
//         }
        
        
//         return answer;
//     }
// }
import java.util.*;
//import java.lon
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        int gen=0;
        String [][] gen_s = new String[plays.length][2];
        for (int i=0;i<plays.length;i++){
            gen_s[i][0]=genres[i];
            gen_s[i][1]=String.valueOf(i);
        }
        Arrays.sort(gen_s);
                
        return answer;
    }
}
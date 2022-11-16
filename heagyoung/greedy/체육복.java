import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer=n;
        Arrays.sort(lost);
        
        List<Integer> _reserve = new ArrayList<>();
        for(int i:reserve){
            _reserve.add(i);
        }
        _reserve.sort(Comparator.naturalOrder());
        
        for(int i=0;i<lost.length;i++){
            if(_reserve.contains(lost[i])){
                _reserve.remove(_reserve.indexOf(lost[i]));
                lost[i]=-1;
            }
        }
        for(int i=0;i<lost.length;i++){
            if(_reserve.contains(lost[i]-1)){
                _reserve.remove(_reserve.indexOf(lost[i]-1));
                lost[i]=-1;
            }
            else if(_reserve.contains(lost[i]+1)){
                _reserve.remove(_reserve.indexOf(lost[i]+1));
                lost[i]=-1;
            }
        } 
        for(int j:lost){
            if( j!=-1)
                answer--;
        }
        return answer;
    }
}
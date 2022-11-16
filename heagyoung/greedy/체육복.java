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
        } //본인것은 무조건 본인이 입으므로

        for(int i=0;i<lost.length;i++){
            if(_reserve.contains(lost[i]-1)){
                _reserve.remove(_reserve.indexOf(lost[i]-1));
                lost[i]=-1;
            }
            else if(_reserve.contains(lost[i]+1)){
                _reserve.remove(_reserve.indexOf(lost[i]+1));
                lost[i]=-1;
            }
        } //작은애가 큰거를 입을 수 있는 경우를 먼저 계산

        for(int j:lost){
            if( j!=-1)
                answer--;
        }//전체 학생 중 빌리지 못한 학생 수 체크

        return answer;
    }
}
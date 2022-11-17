import java.util.*;

class Solution {
    public ArrayList<Integer> heap = new ArrayList<>();
    
    // public void insert(int val) {
            
    //         heap.add(val);

    //         int p = heap.size()-1; 
        
    //         while(p>1 && heap.get(p)> heap.get(p/2)) {
    //             int tmp = heap.get(p/2);
    //             heap.set(p/2, heap.get(p));
    //             heap.set(p, tmp);

    //             p /= 2;
    //         }
    //     }
    public int solution(int[] scoville, int K) {        
        int answer = 0;
        
        Arrays.sort(scoville);
        List<Integer> list = new ArrayList<>();
        for (int element : scoville) {
            list.add(element);
        }
        while(true){
            if(list.get(0)>=K)
                break;
            else if(list.size()==1){
                answer=-1;
                break;
            }
            answer++;
            Integer temp = list.get(0)+list.get(1)*2;
            list.remove(0);
            list.remove(0);
            
            for(int i=0;i<list.size()+1;i++){
                if(list.size()==0){
                    list.add(i, temp);
                    break;
                }
                else if (list.get(i)>=temp){
                    list.add(i, temp);
                    break;
                }
                else if(i==list.size()-1){
                    list.add(i+1, temp);
                    break;
                }
            }
        }
        
        // Arrays.sort(scoville);
        // heap.add(-1);
        // //heap.add(0);
        // for (int element : scoville) {
        //     heap.add(1,element);
        // }
        // //System.out.println(heap.size());
        // int temp=-1;
        // while(true){
        //     if(heap.get(heap.size()-1)>=K)
        //         break;
        //     if(heap.size()<=2){
        //         answer=-1;
        //         break;
        //     }
        //     answer++;
        //     temp=heap.get(heap.size()-1)+heap.get(heap.size()-2)*2;
        //     heap.remove(heap.size()-1);
        //     heap.remove(heap.size()-1);
            
        //     insert(temp);
        //     //System.out.print(temp);
            
        // }
        return answer;
    }
// 정확성  테스트
// 테스트 1 〉	통과 (0.44ms, 71.1MB)
// 테스트 2 〉	통과 (0.39ms, 72.4MB)
// 테스트 3 〉	통과 (0.52ms, 83.8MB)
// 테스트 4 〉	통과 (0.37ms, 75.4MB)
// 테스트 5 〉	통과 (0.58ms, 70.3MB)
// 테스트 6 〉	통과 (16.59ms, 71.3MB)
// 테스트 7 〉	통과 (19.83ms, 67.1MB)
// 테스트 8 〉	통과 (1.00ms, 74.6MB)
// 테스트 9 〉	통과 (1.12ms, 79.3MB)
// 테스트 10 〉	통과 (20.10ms, 83.4MB)
// 테스트 11 〉	통과 (5.63ms, 80.5MB)
// 테스트 12 〉	통과 (27.08ms, 81.3MB)
// 테스트 13 〉	통과 (16.36ms, 76.1MB)
// 테스트 14 〉	통과 (0.57ms, 76.8MB)
// 테스트 15 〉	통과 (16.66ms, 80.2MB)
// 테스트 16 〉	통과 (0.44ms, 72.6MB)
// 효율성  테스트
// 테스트 1 〉	실패 (시간 초과)
// 테스트 2 〉	실패 (시간 초과)
// 테스트 3 〉	실패 (시간 초과)
// 테스트 4 〉	실패 (시간 초과)
// 테스트 5 〉	실패 (시간 초과)
}

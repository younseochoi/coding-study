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
}
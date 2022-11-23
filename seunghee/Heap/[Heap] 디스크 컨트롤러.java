import java.util.*;

class Solution {
	
    public int solution(int[][] jobs) { //[작업이 요청되는 시점, 작업의 소요시간]
        Arrays.sort(jobs,new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }else {
                    return o1[0] - o2[0];
                }
            }
        }); // 작업이 요청되는 시점을 기준으로 오름차순
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                    return o1[1] - o2[1];
            }
        }); // 작업의 소요시간을 기준으로 오름차순 할 queue
        int idx = 0;
        int sum = 0; //요청부터 종료까지 걸린 시간의 합
        int count = 0;
        int end = 0; //종료시간
        while(count < jobs.length){
            while(idx < jobs.length && jobs[idx][0] <= end){ // 작업이 요청되는 시점이 종료시점보다 작을 때
                pq.offer(jobs[idx++]); // 우선순위 큐에 배열 형태로 저장한다.
            }
            if(pq.isEmpty()){ //큐가 비어있다면(작업이 이어지지 않고 시간이 빌 수 있다)
                end = jobs[idx][0]; //다음 작업으로 넘어감
            }else{
                int[] temp = pq.poll(); // 소요시간이 가장 적은 작업
                sum += temp[1] + end - temp[0]; // 작업의 소요시간 + 이전 작업의 종료 시점 - 작업이 요청된 시점
                count++; // 우선순위 큐에는 jobs의 길이만큼의 크기가 들어간다
                end += temp[1]; // 종료 시간 = 이전 작업의 종료 시점 + 작업의 소요시간
            }
        }
        return Math.round(sum / jobs.length); // 소수점 아래 버림
    }
}
//출처 : https://blog.naver.com/ajy7424/222540861666
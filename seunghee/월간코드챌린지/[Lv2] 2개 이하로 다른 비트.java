//참고: https://roomconerdeveloper.tistory.com/81
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i=0;i<numbers.length;i++){
            answer[i]=check(numbers[i]);
        }
        return answer;
    }

    public Long check(long number){
        long result=number;
        if(number%2==0){//짝수 
            result+=1;
        }else{//홀수
            int count=0;
            while(number!=0){
                count++;
                if(number%2==0) break;
                number=number/2;
            }
            if(number!=0)
            result+=(Math.pow(2,count-1)-Math.pow(2,count-2));
            else result+=(Math.pow(2,count)-Math.pow(2,count-1));
        }
        return result;
    }
}
/*
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.40ms, 77.6MB)
테스트 2 〉	통과 (13.60ms, 119MB)
테스트 3 〉	통과 (0.14ms, 73.3MB)
테스트 4 〉	통과 (0.37ms, 78MB)
테스트 5 〉	통과 (0.29ms, 72.3MB)
테스트 6 〉	통과 (0.39ms, 87.4MB)
테스트 7 〉	통과 (8.77ms, 113MB)
테스트 8 〉	통과 (7.84ms, 106MB)
테스트 9 〉	통과 (10.85ms, 120MB)
테스트 10 〉	통과 (20.51ms, 115MB)
테스트 11 〉	통과 (18.61ms, 128MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/
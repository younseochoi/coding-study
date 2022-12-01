// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/12971
// 출처 : https://iron-jin.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%8A%A4%ED%8B%B0%EC%BB%A4-%EB%AA%A8%EC%9C%BC%EA%B8%B02
class Solution {
    public int solution(int sticker[]) {
        int answer = 0;
        int len = sticker.length;

        if (len == 1) return sticker[0];

        int[] dp1 = new int[len];
        int[] dp2 = new int[len];

        //첫번째 스티커를 떼는 방법
        dp1[0] = sticker[0];
        dp1[1] = sticker[0];
        for (int i = 2; i < len-1;i++) dp1[i] = Math.max(dp1[i-1],dp1[i-2] + sticker[i]);


        //첫번째 스티커를 뗴지 않는 방법
        dp2[0] = 0;
        dp2[1] = sticker[1];
        for (int i = 2; i < len; i++) dp2[i] = Math.max(dp2[i-1],dp2[i-2] + sticker[i]);

        answer = Math.max(dp1[len-2],dp2[len-1]);

        return answer;
    }
}
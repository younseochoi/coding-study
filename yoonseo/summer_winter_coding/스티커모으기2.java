package summer_winter_coding;

public class 스티커모으기2 {

    public int solution(int sticker[]) {
        int answer = 0;
        int dp1[] = new int[sticker.length]; // 첫번째 스티커부터 떼기
        int dp2[] = new int[sticker.length]; // 두번째 스티커부터 떼기

        if (sticker.length == 1)
            return sticker[0];

        dp1[0] = sticker[0]; // 첫번째 값
        dp1[1] = sticker[0]; // 첫번째 값 선택

        dp2[0] = 0;
        dp2[1] = sticker[1]; // 두번째 값 선택

        for (int i = 2; i < sticker.length - 1; i++) { // 첫번째 것을 떼면 마지막거 선택 못함
            // dp[i-1] vs dp[i] + dp[i-2]
            // dp[]에는 스티커 값을 저장하는 액션이 담겨야함
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + sticker[i]);
        }

        for (int i = 2; i < sticker.length; i++) { // 두번째꺼부터 떼면 마지막까지 순회
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + sticker[i]);
        }

        answer = Math.max(dp1[dp1.length - 2], dp2[dp2.length - 1]);
        return answer;
    }

}

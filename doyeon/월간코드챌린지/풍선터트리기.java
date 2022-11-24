// https://velog.io/@delay/programmers68646

class Solution {
    public int solution(int[] a) {
        int answer = 0;

        int l = 1000000000, r = 1000000000;

        // 맨 끝의 2개의 수 중 더 작은 수는 마지막까지 남을 수 있다
        for (int i = 0; i < a.length; i++) {
            if (a[i] < l) {
                answer++;
                l = a[i];
            }

            if (a[a.length - 1 - i] < r) {
                answer++;
                r = a[a.length - 1 - i];
            }

            // 두 수가 같아지면 반복문 종료
            if (l == r)
                break;
        }

        // 두 수가 같아 생긴 중복 카운트 제외
        return answer + (l == r ? -1 : 0);
    }
}
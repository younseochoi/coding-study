package weekly_challenge;

public class 부족한금액계산하기 {

    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        answer = sum - money;

        answer = answer > 0 ? answer : 0;

        return answer;
    }
}

/*
 * 정확성 테스트
 * 테스트 1 〉 통과 (0.12ms, 82.2MB)
 * 테스트 2 〉 통과 (0.13ms, 67.2MB)
 * 테스트 3 〉 통과 (0.05ms, 67.6MB)
 * 테스트 4 〉 통과 (0.09ms, 66.2MB)
 * 테스트 5 〉 통과 (0.06ms, 67.4MB)
 * 테스트 6 〉 통과 (0.07ms, 76.9MB)
 * 테스트 7 〉 통과 (0.06ms, 76.8MB)
 * 테스트 8 〉 통과 (0.05ms, 78.7MB)
 * 테스트 9 〉 통과 (0.05ms, 67.8MB)
 * 테스트 10 〉 통과 (0.07ms, 81.4MB)
 * 테스트 11 〉 통과 (0.06ms, 74.5MB)
 * 테스트 12 〉 통과 (0.06ms, 71.1MB)
 * 테스트 13 〉 통과 (0.07ms, 69.5MB)
 * 테스트 14 〉 통과 (0.08ms, 74.2MB)
 * 테스트 15 〉 통과 (0.11ms, 77.2MB)
 * 테스트 16 〉 통과 (0.05ms, 73.2MB)
 * 테스트 17 〉 통과 (0.07ms, 75.5MB)
 * 테스트 18 〉 통과 (0.15ms, 70.9MB)
 * 테스트 19 〉 통과 (0.12ms, 73.1MB)
 * 테스트 20 〉 통과 (0.12ms, 75.8MB)
 * 테스트 21 〉 통과 (0.14ms, 81.7MB)
 * 테스트 22 〉 통과 (0.11ms, 75.4MB)
 * 테스트 23 〉 통과 (0.19ms, 73.9MB)
 * 채점 결과
 * 정확성: 100.0
 * 합계: 100.0 / 100.0
 */
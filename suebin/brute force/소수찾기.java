public static int solution(String numbers){
    int len = numbers.length();
    // String 배열로 숫자 하나씩 담아주기
    String[] str = new String[len];
    for(int i=0;i<len;i++){
        str[i] = Character.toString(numbers.charAt(i));
    }
    boolean[] visited = new boolean[len];
    Arrays.fill(visited, false);

    // 배열의 개수만큼 순열 만들기
    for(int i=0;i<len;i++) {
        permutation_dfs(str, visited, "", i+1, 0);
    }
    return set == null ? 0 : set.size();
}

/**
 *  dfs를 이용하여 순열 만들기 (다른 사람 풀이 참조)
 *
 *  @param arr : 숫자가 담긴 String 배열
 *  @param visited : 방문여부 판단
 *  @param str : 소수 판단할 수
 *  @param r : 순열을 만들 갯수
 *  @param depth : 순열 개수 체크
 * */

public static void permutation_dfs(String[] arr, boolean[] visited, String str, int r, int depth){
    //
    if(depth == r){
        int n = Integer.parseInt(str);
        // 소수이면서, set에 없는 숫자만 담는다.
        if(isPrime(n) && !set.contains(n)){
            set.add(n);
        }
        return;
    }

    for(int i=0;i<arr.length;i++){
        // 방문하지 않은 경우
        if(!visited[i]){
            visited[i] = true;
            str += arr[i];
            permutation_dfs(arr, visited, str, r, depth+1);
            // 현재 숫자말고 다른 숫자를 선택하는 경우 str에서 위에서 방문한 숫자 지워주기
            str = str.substring(0, str.length() - 1);
            visited[i] = false;

        }
    }
}

// 소수 체크 (에라토스테네스의 체)
public static boolean isPrime(int n) {
    if(n <= 1) {
        return false;
    }

    if( n == 2 || n == 3){
        return true;
    }

    for(int i=2; i<=(int)Math.sqrt(n); i++) {
        if(n % i == 0) {
            return false;
        }
    }
    return true;
}

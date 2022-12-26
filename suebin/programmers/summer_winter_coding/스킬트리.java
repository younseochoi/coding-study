class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i=0; i<skill_trees.length; i++){
            
            String skill_tree = skill_trees[i];
            StringBuilder sb = new StringBuilder();

            // skill만 append한다.
            
            for(int j=0; j<skill_tree.length(); j++){
                if(skill.contains(String.valueOf(skill_tree.charAt(j)))){
                    sb.append(skill_tree.charAt(j));
                }
            }
            
            // skill과 sb를 비교한다.
            
            for(int j=skill.length(); j>=0; j--){
                String s = skill.substring(0, j);
                
                if(s.equals(sb.toString())){
                    answer++;
                    break;
                }
            }

        }
        return answer;
    }
}


/*
테스트 1 〉	통과 (0.06ms, 78.4MB)
테스트 2 〉	통과 (0.08ms, 71.1MB)
테스트 3 〉	통과 (0.08ms, 77.1MB)
테스트 4 〉	통과 (0.08ms, 81.8MB)
테스트 5 〉	통과 (0.17ms, 73MB)
테스트 6 〉	통과 (0.09ms, 79.6MB)
테스트 7 〉	통과 (0.14ms, 75MB)
테스트 8 〉	통과 (0.11ms, 73.5MB)
테스트 9 〉	통과 (0.12ms, 65.9MB)
테스트 10 〉	통과 (0.15ms, 77.4MB)
테스트 11 〉	통과 (0.13ms, 77.5MB)
테스트 12 〉	통과 (0.36ms, 75.2MB)
테스트 13 〉	통과 (0.19ms, 73.1MB)
테스트 14 〉	통과 (0.17ms, 73.4MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
*/

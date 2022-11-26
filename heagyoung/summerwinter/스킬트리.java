/*스킬트리 내 스킬에서 순서대로 위치를 비교하는데 있는 경우는
 where의 수를 증가시킴 
 이때 where이랑 스킬위치가 다르면 중간에 것이 스킵된 것이므로
 break
  */

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        
        for(String tree : skill_trees){
            int where=-1;
            System.out.println(tree);
            for(int i=0;i<tree.length();i++){
                if(skill.indexOf(tree.charAt(i))!=-1){
                    if(skill.indexOf(tree.charAt(i))!=where+1){
                        //System.out.println("얘 여기서 안됨"+skill.indexOf(tree.charAt(i)));
                        answer--;
                        break;
                    }
                            
                    
                    if(skill.indexOf(tree.charAt(i))<where){
                        //System.out.println("얘 여기서 안됨"+skill.indexOf(tree.charAt(i)));
                        answer--;
                        break;
                    }
                    where=skill.indexOf(tree.charAt(i));
                }
                
                System.out.println(where);
            }
        }
        return answer;
    }
}
/*
 * 정확성  테스트
테스트 1 〉	통과 (0.51ms, 69.7MB)
테스트 2 〉	통과 (1.07ms, 76.4MB)
테스트 3 〉	통과 (0.60ms, 76.3MB)
테스트 4 〉	통과 (0.66ms, 74.6MB)
테스트 5 〉	통과 (0.94ms, 75.9MB)
테스트 6 〉	통과 (0.93ms, 73.2MB)
테스트 7 〉	통과 (1.50ms, 81.8MB)
테스트 8 〉	통과 (0.67ms, 73.8MB)
테스트 9 〉	통과 (0.82ms, 73.8MB)
테스트 10 〉	통과 (0.72ms, 76MB)
테스트 11 〉	통과 (1.07ms, 74.4MB)
테스트 12 〉	통과 (0.41ms, 76.8MB)
테스트 13 〉	통과 (1.12ms, 73.9MB)
테스트 14 〉	통과 (1.77ms, 71MB)
 */
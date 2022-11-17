// 풀던 도중입니다 ,,

import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int indexA = 0; // A의 위치를 저장하기 위한 변수
        
        for (int i=0; i<name.length(); i++) {
            
            // now의 알파벳을 하나씩 확인한다.
            
            char now = name.charAt(i);
            
            // now가 A인 경우
            
            if (name.charAt(i) == 'A') {
                
                // 만약 이전 알파벳도 A 였다면 continue
                
                if (flag == true) {
                    continue;
                }
                
                // A가 처음 나온 경우
                
                else {
                    
                    // A의 위치를 저장한다.
                    
                    indexA = i;
                }
                
            }
            
            // now가 A가 아닌 경우
            
            else {
                
                // 이전에 A가 나왔다면 커서의 이동방향을 정해야한다.
                
                if (indexA != 0) {
                    
                }
                
                // 1. ▲ 로 조작하는 경우 (A의 아스키코드 = 60)
                
                int ascLen = now - 65;
                
                // 2. ▼ 로 조작하는 경우 (Z의 아스키코드 = 90)
               
                int descLen = 90 - now + 1;
                
                // 위의 1과 2의 경우 중 최소로 조작하는 경우의 값을 구해 answer에 더한다.
                
                int minLen = Math.min(ascLen, descLen);
                answer = answer + minLen;
            
            }
            
        }
        
        return answer;
    }
}

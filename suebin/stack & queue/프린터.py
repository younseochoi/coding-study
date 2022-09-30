def solution(priorities, location):
    answer = 0

    while True:
        max = max(priorities) # 가장 높은 중요도
        
        for i in range(len(priorities)):
            
            if max == priorities[i]: # 가장 높은 중요도는 인쇄된다.  
                answer += 1  
                priorities[i] = 0 # 인쇄 후 중요도는 0으로 표시하고,
                max = max(priorities) # 다시 가장 높은 중요도를 구한다.  
                       
                if i == location: 
                    return answer
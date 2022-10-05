def solution(priorities, location):
    answer = 0
    start = True
    
    while start :
        try:
            for i in priorities :
                start = priorities[0]
                
                if start < i :
                    priorities.append(start)
                    priorities.pop(0)
                    
                    if location > 0 :
                        location -= 1
                    else :
                        location = len(priorities) -1
                    continue
                    
                elif start == max(priorities) :
                    priorities.pop(0)
                    if location > 0 :
                        location -= 1
                        answer += 1
                        
                    elif location == 0 :
                        answer += 1
                        start = False
                        break
                        
        except:
            break
    return answer
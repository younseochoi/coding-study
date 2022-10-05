def solution(priorities, location):
    answer = 0
    
    while len(priorities) :
        job = priorities.pop(0)
        
        if priorities and job < max(priorities) :
            priorities.append(job)
        else :
            answer += 1
            if location == 0:
                break
                
        location -= 1
        if location <0:
           location = len(priorities) -1
    
    return answer

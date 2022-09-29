import math

def solution(progresses, speeds):
    
    # 각 기능개발이 배포까지 걸리는 일 수
    days = [math.ceil((100 - a) / b) for a, b in zip(progresses, speeds)] 
            
    answer = []
    index = 0
    
    for i in range(len(days)):
        if days[index] < days[i]:
            answer.append(i-index)
            index = i
        
    answer.append(len(days) - index)
    
    return answer
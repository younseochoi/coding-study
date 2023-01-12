import math

def solution(progresses, speeds):
    
    days = [math.ceil((100 - a) / b) for a, b in zip(progresses, speeds)] # 각 기능개발이 배포까지 걸리는 일 수          
    answer = [] 
    index = 0 # 맨 앞 기능
    
    for i in range(len(days)): 
        if days[index] < days[i]: # 앞 기능보다 개발이 더 오래 걸리는 기능이 있다면
            answer.append(i-index) # 함께 배포 가능한 기능의 수를 append
            index = i # 기준점 변경
        
    answer.append(len(days) - index) # 마지막으로 남은 기능의 수 append
    
    return answer
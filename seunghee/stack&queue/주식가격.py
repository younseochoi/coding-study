def solution(prices):
    answer = []
    for i in range(len(prices)):
        time = 0
        j = i
        while True :
            j += 1
            
            if j >= len(prices):
                break
            
            time += 1
            
            if prices[i] > prices[j]:
                break
                
        answer.append(time)
        
    return answer

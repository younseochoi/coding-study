def solution(bridge_length, weight, truck_weights):
    
    answer = 0
    cross = [0] * bridge_length # 다리를 건너는 트럭 리스트
    
    while cross:
        answer += 1 
        cross.pop(0)
        
        if truck_weights:
            if sum(cross) + truck_weights[0] <= weight: # 다리 위를 건너는 트럭과 대기 트럭(truck_weights[0])의 합이 weight 보다 가볍다면
                cross.append(truck_weights.pop(0)) # 대기 트럭은 다리를 건넌다.
            else: 
                cross.append(0) # 대기 트럭은 대기하고, 0만 append 한다.
    
    return answer

from collections import deque

def solution(bridge_length, weight, truck_weights):
    time = 0
    truck_weights.reverse()
    queue = deque()
    
    while truck_weights:
        if len(queue) >= bridge_length:
            queue.popleft()
        if sum(queue) + truck_weights[-1] <= weight:
            queue.append(truck_weights.pop())
            time += 1
        else :
            while len(queue) < bridge_length:
                queue.append(0)
                time += 1
    time += bridge_length
    return time

``` 채점 결과 1개가 성능 문제로 틀렸다고 나오는데 개선을 못했습니다 ㅠㅠ

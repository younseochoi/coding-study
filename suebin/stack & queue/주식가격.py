# Queue (다른 사람 풀이)

from collections import deque

def solution(prices):
    
    queue = deque(prices)
    answer = []
    while queue:
        price = queue.popleft()
        sec = 0
        for i in queue:
            sec += 1
            if price > i:
                break
        answer.append(sec)
    return answer
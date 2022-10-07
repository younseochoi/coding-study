def solution(s):
    queue = []
    temp = list(s)
    for i in range(len(temp)):
        if temp[i] == '(':
            queue.append(temp[i])
        elif temp[i] == ')' and len(queue) != 0 :
            queue.pop()
        else : return False
    if len(queue) != 0: return False
    else : return True

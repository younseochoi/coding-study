def solution(arr):
    answer = []

    num = -1
    for n in arr :
        if (num != n) :
            answer.append(n)
            num = n
    return answer

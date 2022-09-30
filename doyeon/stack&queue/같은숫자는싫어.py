def solution(arr):
    answer = []

    for i in range(len(arr)) :
        if i == 0 :
            answer.append(arr[0])
        else :
            if(arr[i] != arr[i-1]) :
                answer.append(arr[i])
    return answer

solution([1,1,3,3,0,1,1])
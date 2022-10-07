import math

def solution(progresses, speeds):
    # 일 진행율이 100%가 될때까지 걸리는 시간 
    progresses = [math.ceil((100 - a) / b) for a, b in zip(progresses, speeds)] 
    print(progresses)
    answer = []
    max_time = 0 # 가장 오래걸린 일의 인덱스
    count=1

    for i in range(len(progresses)):
        if progresses[i] > progresses[max_time]:  # 현재(i번째)의 일이 더 오래 걸림
            answer.append(i-max_time)
            max_time=i #max_time 현재 인덱스 i로 업데이트

    answer.append(len(progresses)-max_time) # 남은 일 개수 push 
    return answer

solution([93, 30, 55],[1, 30, 5])
solution([95, 90, 99, 99, 80, 99],[1, 1, 1, 1, 1, 1])
# print(solution([93, 30, 55],[1, 30, 5])) # [2, 1]
#print(solution([95, 90, 99, 99, 80, 99],[1, 1, 1, 1, 1, 1])) # [1, 3, 2]

# def solution(progresses, speeds):
#     print(progresses)
#     print(speeds)
#     answer = []
#     time = 0
#     count = 0
#     while len(progresses)> 0:
#         if (progresses[0] + time*speeds[0]) >= 100:
#             progresses.pop(0)
#             speeds.pop(0)
#             count += 1
#         else:
#             if count > 0:
#                 answer.append(count)
#                 count = 0
#             time += 1
#     answer.append(count)
#     return answer

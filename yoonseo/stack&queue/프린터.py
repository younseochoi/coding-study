from re import T


def solution(priorities, location):
    answer=0
    indexlist = [i for i in range(len(priorities))] # 기존 인덱스 번호 저장
    sorted_priorities = sorted(priorities,reverse=True)
    i = 0
    while True:
        if sorted_priorities == priorities:
            # 우선순위로 정렬 완료 시 break 
            break
        if max(priorities[i+1:]) > priorities[i]: #우선 순위 더 큰게 있다
            priorities.append(priorities.pop(i))
            indexlist.append(indexlist.pop(i))
        else:
            i+=1    # 현재 요소에 대한 정렬완료(내림차순)시 검사할 인덱스 1 증가 -> 다음 요소 검사
    print(indexlist)
    print(sorted_priorities)
    answer = indexlist.index(location)+1
    print(answer)
    return answer

solution([2, 1, 3, 2],2)	#1
solution([1, 1, 9, 1, 1, 1],0)	#5   


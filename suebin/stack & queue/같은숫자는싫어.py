def solution(arr):
    
    answer = []
    
    for i in arr:
        if not answer or answer[-1] != i: # 리스트 answer이 비었거나, 리스트 answer의 마지막 요소(answer[-1])가 리스트 arr의 요소(i)와 다른 경우 
            answer.append(i) # 리스트 answer에 i를 추가한다.
                
    return answer
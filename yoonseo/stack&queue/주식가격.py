def solution(prices):
    answer = []
    flag = 0 # 뒤에 있는 요소들 중 가격하락 체크 (있으면 1, 없으면 0) 
    for i in range(len(prices)-1):
        flag = 0
        for j in range(i+1,len(prices)):
            if prices[i]>prices[j]: #가격 하락이 있을 경우 
                answer.append(j-i) # 가격 하락이 일어난 인덱스 (j) - 현재 요소 인덱스 (i)
                flag=1
                break
        if flag != 1:   #뒤 요소들 비교 후 가격 하락이 없을 경우 
            answer.append(len(prices)-(i+1)) # 유지시간= 전체 prices 길이 - (현재 검사 요소 인덱스+1)     
                    

    answer.append(0) # 마지막 요소의 경과시간은 무조건 0이다.
    print(answer)
    return answer

solution([1, 2, 3, 2, 3]) #	[4, 3, 1, 1, 0]    
#30분
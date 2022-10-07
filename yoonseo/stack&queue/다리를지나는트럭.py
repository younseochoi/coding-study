def solution(bridge_length, weight, truck_weights):
    answer = 0
    inglist=[] # 다리를 건너는 차량 리스트
    ingtimer=[] # 다리를 건너는 차량의 시간 리스트
    arrivelist=[] # 도착 차량 리스트
    truck_count = len(truck_weights) # 출발할 차량 수
    i=0 #현재 판단할 차량 인덱스

    while True:
        answer+=1
        if len(arrivelist) == truck_count: # 도착리스트에 출발한 차량이 모두 도착하면 break
            break

        if len(inglist) == 0 or i < len(truck_weights):
            if  (len(inglist) < bridge_length) and (sum(inglist)+truck_weights[i] <= weight) :
                # print("건너는 차량 검사 ")
                inglist.append(truck_weights[i])
                ingtimer.append(1)
                i+=1
                
        if len(inglist) != 0:
            # print("나가는 차량 검사 ")
            for j in range(len(ingtimer)): # ingtimer 리스트 모든 요소 +1 (시간 증가)
                ingtimer[j]+=1
            if ingtimer[0] > bridge_length: # 맨 앞 차량이 다리 길이를 넘으면 도착리스트에 push
                arrivelist.append(inglist.pop(0)) 
                ingtimer.pop(0)
    print(answer)    
    return answer


solution(2,10,[7,4,5,6]) # 8
solution(100,100,[10])	#101
solution(100,100,[10,10,10,10,10,10,10,10,10,10])	#110

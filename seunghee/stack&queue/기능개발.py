import math
from collections import Counter

def solution(progresses, speeds):
    release = []
    for p,s in zip(progresses, speeds):
        release.append(math.ceil((100-p)/s))
        
    for i in range (1, len(release)):
        if release[i] <= release[i-1]:
            release[i] = release[i-1]
            
    return list(Counter(release).values())

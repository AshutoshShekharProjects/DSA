from typing import List

def merge(intervals: List[List[int]]) -> List[List[int]]:
    intervals.sort()
    counter = []
    first = intervals[0][0]
    second = intervals[0][1]
    for i in range(1, len(intervals)):
        if second > intervals[i][0]:
            second = intervals[i][1]
        else:
            counter.append([first, second])
            first=intervals[i][0]
            second=intervals[i][1]
    counter.append([first,second])
    return counter

intervals =[[1,3],[2,6],[8,10],[15,18]]
print(merge(intervals))
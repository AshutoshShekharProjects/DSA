import sys
sys.setrecursionlimit(10**6)

def equalPartition( N, arr):
    sm1=sum(arr)
    sm2 = sm1 // 2
    if sm1 % 2 != 0:
        return False
    dp = {}
    def subsetsum(n, sm2):
        if sm2 == 0:
            return True
        elif n == 0:
            return False
        elif (n, sm2) in dp:
            return dp[(n, sm2)]
        else:
            item = arr[n - 1]
            if sm2 >= item:
                c1 = subsetsum(n - 1, sm2 - item)
                if c1:
                    return True
                c2 = subsetsum(n - 1, sm2)
                c = c1 or c2
            else:
                c = subsetsum(n - 1, sm2)
            dp[(n, sm2)] = c
        return c
    return subsetsum(N, sm2)


arr=[1,5,11,5]
N=4
print(equalPartition(N,arr))
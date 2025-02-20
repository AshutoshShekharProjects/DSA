import sys
sys.setrecursionlimit(10**6)

def equalPartition( N, arr):
    p1 = sum(arr) // 2
    sm = sum(arr)
    if sm % 2 != 0:
        return "No"
    dp={}
    def solve(n, p1):
        if p1 == 0:
            return "Yes"
        elif n == 0:
            return "No"
        elif (n,p1) in dp:
            return dp[(n,p1)]
        else:
            item = arr[n - 1]
            if item <= p1:
                c1 = solve(n - 1, p1 - item)

                c2 = solve(n - 1, p1)
                c= c1 or c2
            else:
                c= solve(n - 1, p1)
            dp[(n,p1)]=c
            return c

    return solve(N, p1)


arr=[1,5,11,5]
N=4
print(equalPartition(N,arr))
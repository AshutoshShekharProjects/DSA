N = 4
arr = [1, 6, 11, 5]
sm=sum(arr)
dp={}


def solve(n,p1,sm):
    p2=sm-p1
    if n==0:
        return p1-p2
    elif (n,p1) in dp:
        return dp[(n,p1)]
    else:
        item=arr[n-1]
        if p1-item>=p2+item:
            c1=solve(n-1,p1-item,sm)
            c2=solve(n-1,p1,sm)
            c=min(c1,c2)
        else:
            c=solve(n-1,p1,sm)
        dp[(n,p1)]=c
        return c

print(solve(N,sm,sm))
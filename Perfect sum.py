N = 7
arr = [28, 4, 3, 27, 0, 24, 26]
sum = 24
dp={}
arr.sort(reverse=True)

def solve(n,sm):
    if n==0:
        if sm==0:
            return 1
        else:
            return 0
    elif (n,sm) in dp:
        return dp[(n,sm)]
    else:
        item=arr[n-1]
        if item<=sm:
            c1=solve(n-1,sm-item)
            c2=solve(n-1,sm)
            c=c1 + c2
        else:
            if sm==0:
                c=1
            else:
                c=0
        dp[(n,sm)]=c
        print(dp)
        return c


print(solve(N,sum))
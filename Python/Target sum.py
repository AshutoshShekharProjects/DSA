N = 5

arr = [1, 1, 1, 1, 1]
t = 3


def target(arr,N,target):
    sm=sum(arr)
    p1=sm+target
    dp={}
    arr.sort(reverse=True)
    if p1%2!=0:
        return 0
    else:
        p1=p1//2
    def solve(n,p1):
        if n==0:
            if p1==0:
                return 1
            else:
                return 0
        elif (n,p1) in dp:
            return dp[(n,p1)]
        else:
            item=arr[n-1]
            if item<=p1:
                c1=solve(n-1,p1-item)
                c2=solve(n-1,p1)
                c=c1+c2
            else:
                if p1==0:
                    c=1
                else:
                    c=0
            dp[(n,p1)]=c
            return c
    print(solve(N,p1))


target(arr,N,t)

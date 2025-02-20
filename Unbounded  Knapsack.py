N=2
W=3
val=[1,1]
wt=[2,1]


def knapsack(N,W,val,wt):
    dp={}
    def solve(n,cap):
        if n==0 or cap==0:
            return 0
        elif (n,cap) in dp:
            return dp[(n,cap)]
        else:
            cwt=wt[n-1]
            cv=val[n-1]
            if cwt<=cap:
                c1=cv+solve(n,cap-cwt)
                c2=solve(n-1,cap)
                c=max(c1,c2)
            else:
                c=solve(n-1,cap)
            dp[(n,cap)]=c
            return c
    print(solve(N,W))


knapsack(N,W,val,wt)
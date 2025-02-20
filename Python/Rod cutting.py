#N=8
#price=[1,5,8,9,10,17,17,20]
N=8
price=[3,5,8,9,10,17,7,20]


def cutRod(price,N):
    dp={}
    def solve(n,rl):
        if n==0 or rl==0:
            return 0
        elif (n,rl) in dp:
            return dp[(n,rl)]
        else:
            val=price[n-1]
            if n<=rl:
                c1=val+solve(n,rl-n)
                c2=solve(n-1,rl)
                c=max(c1,c2)
            else:
                c=solve(n-1,rl)
            dp[(n,rl)]=c
            return c
    print(solve(N,N))


cutRod(price,N)

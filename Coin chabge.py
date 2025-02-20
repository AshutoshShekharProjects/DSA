import sys
sys.setrecursionlimit(10**6)

def coinChange(coins,N,sum):
    dp={}
    def solve(n,sm):
        if sm==0:
            return 1
        elif n==0:
            return 0
        elif (n,sm) in dp:
            return dp[(n,sm)]
        else:
            coin=coins[n-1]
            if coin<=sm:
                c1=solve(n,sm-coin)
                c2=solve(n-1,sm)
                c=c1+c2
            else:
                c=solve(n-1,sm)
            dp[(n,sm)]=c
            #print(dp)
            return c
    print(solve(N,sum))


sum=4
N=3
coins=[1,2,3]
coinChange(coins,N,sum)
def cutRod( price, N):
    dp = []
    def solve(rl):
        if rl == 0:
            return 0
        elif rl in dp:
            return dp[rl]
        else:
            ans = 0
            for cl in range(1, rl + 1):
                ans = max(ans, price[cl - 1] + solve(rl - cl))
            dp[rl] = ans
            return ans

    print(solve(N))


N=8
#price=[3,5,8,9,10,17,7,20]
price=[1,5,8,9,10,17,17,20]
cutRod(price,N)
N=8
#price=[3,5,8,9,10,17,7,20]
price=[1,5,8,9,10,17,17,20]


def cutRod( price, N):
    dp = {}
    def solve(rl):
        if rl == 0:
            return 0
        elif rl in dp:
            return dp[rl]
        else:
            ans = 0
            i = 0
            cl: int
            for cl in range(1, rl + 1):
                i+=1
                print("Interation: ",i)
                print("ans:",ans)
                print("rl:", rl)
                print("cl:", cl)
                print("price[cl - 1]:", price[cl - 1])
                print("solve(rl - cl):", solve(rl - cl))
                print("price[cl - 1]+solve(rl - cl):", price[cl - 1]+solve(rl - cl))
                ans = max(ans, price[cl - 1] + solve(rl - cl))
                print("max of both:", ans)
            dp[rl] = ans
            print("ans to store in dp:", ans)
            return ans
    print(solve(N))


cutRod(price,N)
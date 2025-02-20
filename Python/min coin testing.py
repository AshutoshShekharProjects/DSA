def minCoin(arr,amount):
    dp=[0]*(amount+1)
    for amt in range(1,amount+1):
        print("Amt:", amt)
        ans=float('INF')
        for coin in arr:
            print("Coin:", coin)
            if coin<=amt:
                print("amt-coin:", amt - coin)
                print("dp[amt-coin]:", dp[amt-coin])
                print("min(ans,1+dp[amt-coin]):", "min(",ans,",1+",dp[amt - coin],":", min(ans, 1 + dp[amt - coin]))
                ans=min(ans,1+dp[amt-coin])
                print("ans:", ans)
            else:
                break
        dp[amt]=ans
        print("dp[amt]=ans:", ans)
    print(dp)
    if dp[amount]>=10**9+7:
        return -1
    else:
        return dp[amount]

arr = [1, 2, 5]
amount = 11
print(minCoin(arr, amount))
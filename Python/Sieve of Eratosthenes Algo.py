dp=[1]*(101)
dp[0],dp[1]=0,0
i=2
while i*i<=100:
    if dp[i]==1:
        for j in range(i*i,101,i):
            dp[j]=0
    i+=1

print(dp[11])

def lis(a,n):
    dp=[0]*n
    dp[0]=1
    for i in range(1,n):
        j=i-1
        mx=0
        while j>=0:
            if a[j]<a[i]:
                mx=max(mx,dp[j])
            j-=1
        dp[i]=1+mx
    print(dp)
    return max(dp)



a=[0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15]
n=16
print(lis(a,n))
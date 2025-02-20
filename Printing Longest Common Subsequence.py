def lcs(a,b):
    n=len(a)
    m=len(b)
    dp=[[0]*(m+1) for _ in range(n+1)]
    for i in range(n+1):
        for j in range(m+1):
            if i==0 or j==0:
                dp[i][j]=0
            else:
                if a[i-1]==b[j-1]:
                    dp[i][j]=1+dp[i-1][j-1]
                else:
                    dp[i][j]=max(dp[i-1][j],dp[i][j-1])
    ans=[]
    i=n
    j=m
    while i>0 and j>0:
        if a[i-1]==b[j-1]:
            ans.append(a[i-1])
            i-=1
            j-=1
        else:
            if dp[i-1][j]>=dp[i][j-1]:
                i-=1
            else:
                j-=1
    return ans[::-1]


a=[1,2,3,4,1]
b=[3,4,1,2,1,3]
print(lcs(a,b))

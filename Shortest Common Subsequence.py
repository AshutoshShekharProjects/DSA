def shortestCommonSubsequence(X,Y,m,n):
    dp = {}
    
    dp=[[0]*(n+1) for _ in range(m+1)]
    for i in range(m+1):
        for j in range(n+1):
            if i==0 or j==0:
                pass
            else:
                if X[i-1]==Y[j-1]:
                    dp[i][j]=1+dp[i-1][j-1]
                else:
                    dp[i][j]=max(dp[i-1][j],dp[i][j-1])
    lcs=dp[m][n]
    #print(lcs)
    ans=m+n-lcs
    return ans



#X='a'
#Y='aaaaaa'

X='fghijkl'
Y='abcdef'
m = len(X)
n = len(Y)
print(shortestCommonSubsequence(X,Y,m,n))


def longestRepeatingSubsequence(str):
    dp={}
    def solve(s1,s2,n,m):
        if n==0 or m==0:
            return 0
        elif (n,m) in dp:
            return dp[(n,m)]
        else:
            if s1[n-1]==s1[m-1] and n!=m:
                c=1+solve(s1,s2,n-1,m-1)
            else:
                c=max(solve(s1,s2,n-1,m),solve(s1,s2,n,m-1))
            dp[(n,m)]=c
            return c
    return solve(str,str,len(str),len(str))

def longestRepeatingSubsequenceIteration(str):
    s1,s2=str,str
    n,m=len(s1),len(s2)
    dp=[[0]*(m+1) for _ in range(n+1)]
    for i in range(1,n+1):
        for j in range(1,m+1):
            if s1[i-1]==s2[j-1] and i!=j:
                dp[i][j]=1+dp[i-1][j-1]
            else:
                dp[i][j]=max(dp[i-1][j],dp[i][j-1])
    return dp[n][m]

str='axxzxy'
print(longestRepeatingSubsequence(str))
#print(longestRepeatingSubsequenceIteration(str))
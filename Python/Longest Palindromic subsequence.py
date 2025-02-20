def longestPalindromicSubsequence(S):
    dp={}
    #S2=S[::-1]
    n = len(S)
    #m = len(S2)
    def solve(S1,S2,n,m):
        if n==0 or m==0:
            return 0
        elif (n,m) in dp:
            return dp[(n,m)]
        else:
            if S1[n-1]==S2[m-1]:
                c=1+solve(S1,S2,n-1,m-1)
            else:
                c=max(solve(S1,S2,n-1,m),solve(S1,S2,n,m-1))
        dp[(n,m)]=c
        return c
    return solve(S,S[::-1],n,n)

def longestPalindromicSubsequenceIteration(S):
    s1=S
    s2=s1[::-1]
    n=len(s1)
    m=len(s2)
    dp=[[0]*(m+1) for _ in range(n+1)]
    for i in range(1,n+1):
        for j in range(1,m+1):
            if s1[i-1]==s2[j-1]:
                dp[i][j]=1+dp[i-1][j-1]
            else:
                dp[i][j]=max(dp[i-1][j],dp[i][j-1])
    return dp[n][m]



S='bbabcbcab'
#print(longestPalindromicSubsequence(S))
print(longestPalindromicSubsequenceIteration(S))
def longestCommonSubstring(S1,S2,n,m):
    dp=[[0]*(m+1) for _ in range(n+1)]
    ans=0
    for i in range(1,n+1):
        for j in range(1,m+1):
            if S1[i-1]==S2[j-1]:
                dp[i][j]=1+dp[i-1][j-1]
                ans=max(ans,dp[i][j])
    return ans


def longestCommonSubstring2(S1,S2,n,m):
    dp=[[0]*(m+1) for _ in range(n+1)]
    ans=0
    for i in range(1,n+1):
        for j in range(1,m+1):
            if i==0 or j==0:
                dp[i][j]=0
            else:
                if S1[i-1]==S2[j-1]:
                    dp[i][j]=1+dp[i-1][j-1]
                    ans=max(ans,dp[i][j])
                else:
                    dp[i][j]=0


S1='ABCDGH'
S2='ACDGHR'
n,m=6,6
print(longestCommonSubstring(S1,S2,n,m))

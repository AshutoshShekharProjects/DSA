def longestCommonSubstring(S1, S2, n, m):
    dp = {}
    def solve(S1, S2, n, m):
        if n == 0 or m == 0:
            return 0
        elif (n, m) in dp:
            return dp[(n, m)]
        else:
            if S1[n - 1] == S2[m - 1]:
                dp[(n,m)] = 1 + solve(S1, S2, n - 1, m - 1)
        return max(dp)
    return solve(S1, S2, n, m)


S1='ABCDGH'
S2='ACDGHR'
n,m=6,6
print(longestCommonSubstring(S1,S2,n,m))
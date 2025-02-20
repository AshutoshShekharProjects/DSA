def isSubsequence(s: str, t: str) -> bool:

    S=len(s)
    T=len(t)
    if s=='':
        return True
    if S>T:
        return False
    i=0
    for j in range(T):
        if s[i]==t[j]:
            if i==S-1:
                return True
            i+=1
    return False

'''
    dp={}
    # c=0
    def solve(s, t, n, m, c):
        if n == 0 or m==0:
            #print(c)
            #print(len(s))
            if c == len(s):
                #print("Yes")
                return True
            else:
                return False
        elif (n,m) in dp:
            return dp[(n,m)]
        else:
            if s[n - 1] == t[m - 1]:
                c=solve(s, t, n - 1, m - 1, c + 1)
            else:
                c=solve(s, t, n, m-1, c)
        dp[(n,m)]=c
        return c

    return solve(s, t, len(s), len(t), 0)
'''

print(isSubsequence("abc","ahbgdc"))
def scs(X, Y, m, n):
    dp=[0]*(m+n)
    c=0
    for i in range(1,m+1):
        for j in range(1,n+1):
            if X[i-1]==Y[j-1]:
                dp[i-1]=dp[i-1]+1
                break
            else:
                pass
    print(dp)
    for i in dp:
        #print(i)
        if i==1:
            c+=1
    return m+n-c


X='aaaaa'
Y='aa'
print(scs(X,Y,5,2))

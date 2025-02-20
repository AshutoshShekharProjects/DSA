def longestIncreasingSub(a,n):
    dp={}
    def solve(arr,n,le):
        '''
        print("c1=",s1,"c2=",s2,"c3=",s3)
        print("le=",le)
        print("n=",n)
        print("arr[n-1]=",arr[n-1])
        print("arr[le]=",arr[le])
        '''
        if n==0:
            return 0
        elif (n,le) in dp:
            return dp[(n,le)]
        else:
            if le==-1 or arr[n-1]<arr[le]:
                c1=1+solve(arr,n-1,n-1)
                c2=solve(arr,n-1,le)
                c=max(c1,c2)
                #print("c=",c)
            else:
                c=solve(arr,n-1,le)
            dp[(n,le)]=c
            return c
    return solve(a,n,-1)


a=[0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15]
n=16
print(longestIncreasingSub(a,n))
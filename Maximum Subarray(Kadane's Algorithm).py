def maxSubArray(arr):
    n=len(arr)
    dp=[0]*n
    dp[0]=arr[0]
    for i in range(1,n):
        c1=arr[i]
        c2=dp[i-1]+arr[i]
        dp[i]=max(c1,c2)
    print(dp)
    return max(dp)

def maxSubArray2(arr):
    n=len(arr)
    mx=arr[0]
    temp=arr[0]
    for i in range(1,n):
        temp=max(arr[i],temp+arr[i])
        mx=max(mx,temp)
    return mx


num=[-1,1,-3,4,-1,2,1,-5,4]
print(maxSubArray(num))
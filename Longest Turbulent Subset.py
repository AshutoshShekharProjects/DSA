from typing import List

def longestTurbulent(arr):
    n=len(arr)
    if n==1:
        return 1
    dp=[0]*n
    dp[0]=1
    if arr[1]!=arr[0]:
        dp[1]=2
    else:
        dp[1]=1
    for i in range(2,n):
        if (arr[i]>arr[i-1] and arr[i-1]<arr[i-2]) or (arr[i]<arr[i-1] and arr[i-1]>arr[i-2]):
            dp[i]=1+dp[i-1]
        else:
            if arr[i] != arr[i-1]:
                dp[i] = 2
            else:
                dp[i] = 1
    return max(dp)

def longestTurbulent2(arr):
    n=len(arr)
    dp=1
    ans=dp
    for i in range(1,n):
        if i==1:
            if arr[i] != arr[i-1]:
                dp = 2
            else:
                dp = 1
        else:
            if (arr[i]>arr[i-1] and arr[i-1]<arr[i-2]) or (arr[i]<arr[i-1] and arr[i-1]>arr[i-2]):
                dp=1+dp
            else:
                if arr[i] != arr[i-1]:
                    dp = 2
                else:
                    dp = 1
        ans=max(ans,dp)
    return ans

def maxTurbulenceSize(self, arr: List[int]) -> int:
    n = len(arr)
    if n == 1:
        return 1
    # dp=[0]*n
    # dp[0]=1
    mx = 0
    c = 0
    if arr[0] != arr[1]:
        # dp[1]=2
        mx, c = 2, 2
    else:
        # dp[1]=1
        mx, c = 1, 1
    for i in range(2, n):
        if (arr[i] < arr[i - 1] and arr[i - 1] > arr[i - 2]) or (arr[i] > arr[i - 1] and arr[i - 1] < arr[i - 2]):
            # dp[i]=1+dp[i-1]
            mx = 1 + mx
            # c=max(c,mx)
        else:
            if arr[i] != arr[i - 1]:
                # dp[i]=2
                mx = 2
            else:
                # dp[i]=1
                mx = 1
        c = max(c, mx)
    return c

arr=[9,4,2,10,7,8,8,1,9]
print(longestTurbulent2(arr))
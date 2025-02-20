def solve(nums,target):
    dp={}
    for i in range(len(nums)):
        dp[nums[i]]=i
    for i in range(len(nums)):
        comp=target-nums[i]
        if comp in dp and dp[comp]!=i:
            return [i,dp[comp]]

nums=[3,2,3]
tgt=6
print(solve(nums,tgt))
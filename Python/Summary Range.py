from typing import List

def summaryRanges(nums: List[int]) -> List[str]:
    ans=[]
    i=0
    while i < len(nums):
        start=nums[i]

        while i<len(nums)-1 and nums[i]+1==nums[i+1]:
            i+=1

        if start!=nums[i]:
            ans.append(str(start)+'->'+str(nums[i]))
        else:
            ans.append(start)
        i+=1

    return ans

nums=[0,2,3,4,6,8,9]
print(summaryRanges(nums))

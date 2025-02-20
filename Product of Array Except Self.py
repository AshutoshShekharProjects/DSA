from typing import List

def productExceptSelf(nums: List[int]) -> List[int]:
    ans = [1] * len(nums)
    for i in range(len(nums)):
        for j in range(len(nums)):
            if j != i:
                ans[i] = ans[i] * nums[j]
                print(ans[i])
    return ans

def productExceptSelf2(nums: List[int]) -> List[int]:
    ans = [1] * len(nums)
    i,j = 0,0
    while j<len(nums):
        if i==len(nums):
            break
        if j != i:
            ans[i] = ans[i] * nums[j]
        if j == len(nums) - 1:
            i += 1
            j=0
            continue
        j+=1

    return ans

nums=[-1,1,0,-3,3]
print(productExceptSelf2(nums))
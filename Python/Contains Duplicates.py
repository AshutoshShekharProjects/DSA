from typing import List

def containsDuplicate(nums: List[int]) -> bool:
    h = set()
    for num in nums:
        if num in h:
            return True
        else:
            h.add(num)
    return False

nums =[1,2,3,1]
print(containsDuplicate(nums))
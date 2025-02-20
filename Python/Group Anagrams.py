from collections import defaultdict
from typing import List


def groupAnagrams(strs: List[str]) -> List[List[str]]:
    a_dict=defaultdict(list)

    for s in strs:
        count=[0]*26
        for c in s:
            count[ord(c)-ord('a')] +=1
        key=tuple(count)
        a_dict[key].append(s)
    print(a_dict.values())
    print(list(a_dict.values()))

def groupAnagrams1(strs: List[str]) -> List[List[str]]:
    counter = defaultdict(list)
    for s in strs:
        key = tuple(sorted(s))
        counter[key].append(s)
    print(counter)
    print(list(counter.values()))

strs =["eat","tea","tan","ate","nat","bat"]
groupAnagrams1(strs)



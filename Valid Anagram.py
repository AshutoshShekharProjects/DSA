from collections import defaultdict,Counter


def isAnagram(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False
    i = defaultdict(int)
    j = defaultdict(int)
    for a in s:
        i[a] += 1
    for a in t:
        j[a] += 1

    return i == j

def isAnagram1(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False
    i = Counter(s)
    j = Counter(t)

    return i == j


s ="anagram"
t ="nagaram"
print(isAnagram1(s,t))
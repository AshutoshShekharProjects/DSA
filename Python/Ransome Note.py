from collections import defaultdict,Counter

def canConstruct(ransomNote: str, magazine: str) -> bool:
    counter = {}
    for c in magazine:
        if c in counter:
            counter[c] += 1
        else:
            counter[c] = 1

    for c in ransomNote:
        if c not in counter:
            return False
        elif counter[c] == 1:
            del counter[c]
        else:
            counter[c] -= 1

    return True

def canConstruct1(ransomNote: str, magazine: str) -> bool:
    counter = defaultdict(int)
    for c in magazine:
        counter[c]+=1

    for c in ransomNote:
        if c not in counter:
            return False
        elif counter[c] == 1:
            del counter[c]
        else:
            counter[c] -= 1

    return True

def canConstruct2(ransomNote: str, magazine: str) -> bool:
    counter = Counter(magazine)

    for c in ransomNote:
        if c not in counter:
            return False
        elif counter[c] == 1:
            del counter[c]
        else:
            counter[c] -= 1

    return True

ransomNote ="aa"
magazine ="aab"
print(canConstruct2(ransomNote,magazine))
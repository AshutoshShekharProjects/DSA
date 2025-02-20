from typing import List

def longestCommonPrefix(strs: List[str]) -> str:
    min_len = float('inf')
    for s in strs:
        if len(s) < min_len:
            min_len = len(s)
    i = 0
    while i < min_len:
        for s in strs:
            if s[i] != strs[0][i]:
                return s[:i]
        i += 1

    return s[:i]

def longestCommonPrefix2(strs: List[str]) -> str:
    if not strs:
        return ""
    res=""
    '''
    zip groups each letter of the words in tuple
    The zip(*strs) function groups the characters of each string by their positions 
    (i.e., the first characters of each string, the second characters, etc.).
    For example, if strs = ["flower", "flow", "flight"], then zip(*strs) will produce:
    First iteration: ('f', 'f', 'f')
    Second iteration: ('l', 'l', 'l')
    Third iteration: ('o', 'o', 'i'), and so on.
    '''
    for s in zip(*strs):
        if len(set(s))==1:
            res+=s[0]
        else:
            return res
    return res

strs=["flower","flow","flight"]
print(longestCommonPrefix2(strs))
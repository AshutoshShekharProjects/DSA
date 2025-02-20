from collections import defaultdict,Counter

'''
def count(s):
    dp=defaultdict(int)
    for c in s:
        dp[c]+=1
    return dp
'''

def count(s):
    dp=Counter(s)
    return dp

print(count('aba'))
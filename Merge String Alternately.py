def mergeAlternately(word1: str, word2: str) -> str:
    ap = ''

    def solve(s1, s2, n, m, dp):
        if n >= len(s1) and m >= len(s2):
            return dp
        else:
            if n >= len(s1):
                dp = dp + s2[m]
                #print(dp)
            elif m >= len(s2):
                dp = dp + s1[n]
                #print(dp)
            else:
                dp = dp + s1[n] + s2[m]
                #print(dp)
            return solve(s1, s2, n + 1, m + 1, dp)
        #return dp

    print(solve(word1, word2, 0, 0, ap))
    '''
    def solve2(s1, s2, n, m, dp):
        if n >= len(s1) and m >= len(s2):
            return ''.join(dp)
        else:
            if n >= len(s1):
                dp.append(s2[m:])
                m = len(s2)
            elif m >= len(s2):
                dp.append(s1[n:])
                n = len(s1)
            else:
                dp.append(s1[n])
                dp.append(s2[m])
            return solve(s1, s2, n + 1, m + 1, dp)

    print(solve2(word1, word2, 0, 0, []))
    '''

mergeAlternately('abc','pqr')
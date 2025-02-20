from typing import List

def generateParenthesis(n: int) -> List[str]:
    curr = []
    ans = []

    def solve(open, close):
        if open == close == n:
            ans.append(''.join(curr))
            return
        if open < n:
            curr.append('(')
            solve(open + 1, close)
            curr.pop()
        if close < open:
            curr.append(')')
            solve(open, close + 1)
            curr.pop()

    solve(0, 0)
    return ans

def generateParenthesis2(n: int) -> List[str]:
    ans = []

    def solve(open, close, ans, curr):
        if open == close == n:
            ans.append(curr)
            return
        if open < n:
            solve(open + 1, close, ans, curr + '(')
        if close < open:
            solve(open, close + 1, ans, curr + ')')

    solve(0, 0, ans, '')
    return ans

n =3
print(generateParenthesis2(2))
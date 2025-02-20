from typing import List


def gridGame(grid: List[List[int]]) -> int:
    n = len(grid)
    m = len(grid[0])
    dp = [0] * (n + m)
    dp[0] = grid[0][0]
    j = 0
    i = 0
    print('n:',n)
    print('m:',m)
    for k in range(1, (n * m) - 1):
        print('i:',i)
        print('j:',j)
        if i >n-2 or j > m-2:
            break
        c1 = grid[i + 1][j]
        c2 = grid[i][j + 1]
        if c1 > c2:
            grid[i + 1][j] = 0
            i += 1
        else:
            grid[i][j + 1] = 0
            j += 1
        dp[k] = dp[k - 1] + max(c1, c2)

    print('grid',grid)
    print('dp',dp)
    dp[0] = grid[0][0]
    j = 0
    i = 0
    for k in range(1, n + m):
        print('i:', i)
        print('j:', j)
        if i > n-2 or j > m-2:
            break
        c1 = grid[i + 1][j]
        c2 = grid[i][j + 1]
        if c1 > c2:
            grid[i + 1][j] = 0
            i += 1
        else:
            grid[i][j + 1] = 0
            j += 1
        dp[k] = dp[k - 1] + max(c1, c2)
    print('grid',grid)
    print('dp',dp)

    return max(dp)

grid =[[2,5,4],[1,5,1]]
print(gridGame(grid))


''' Main code
def gridGame(self, grid: List[List[int]]) -> int:
        n=len(grid[0])
        topSum=sum(grid[0])
        bottomSum=0
        minSum=float('INF')
        for i in  range(n):
            topSum-=grid[0][i]
            minSum=min(minSum,max(topSum,bottomSum))
            bottomSum+=grid[1][i]
        return minSum
'''
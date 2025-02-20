#search operation('in' operation) for string has time complexity of O(n)
def numJewelsInStones(jewels: str, stones: str) -> int:
    c = 0
    for stone in stones:
        if stone in jewels:
            c += 1
    return c

#better time complexity as search operation('in' operation) for set has time complexity of O(1)
def numJewelsInStones1(jewels: str, stones: str) -> int:
    s=set(jewels)
    c = 0
    for stone in stones:
        if stone in s:
            c += 1
    return c

jewels ="aA"
stones ="aAAbbbb"
print(numJewelsInStones1(jewels,stones))

arr = [3,4,5,34,2]
sum = 9
i = 0


def solve(n, sm):
    dp={}
    arr.sort(reverse=True)
    if sm == 0:
        return 1
    elif n == 0:
        return 0
    elif (n,sm) in dp:
        return dp[(n,sm)]
    else:
        item = arr[n - 1]
        if item <= sm:
            c1 = solve(n - 1, sm - item)
            c2 = solve(n - 1, sm)
            c= c1 or c2
        else:
            c= solve(n - 1, sm)
        dp[(n,sm)] = c
        return c


print("Ans: ", solve(5,sum))


''' 
arr=[3,4,5,34,2]
sum=9
i=0
def solve(n, sm):
    global i

    if sm == 0:
        return 1
    elif n == 0:
        return 0
    else:
        item = arr[n - 1]
        print("Item: ", item)
        if item <= sm:

            i+=1
            print("In if:", i)
            print("Sum:", sm)
            c1 = solve(n - 1, sm - item)
            print("C1: ",c1)
            c2 = solve(n - 1, sm)
            print("C2: ", c2)
            print("C1 or C2: ", c1 or c2)
            return c1 or c2
        else:
            i+=1
            print("In Else:", i)
            print("Sum: ", sm)
            #print("Else return: ", )
            return solve(n - 1, sm)

print("Ans: ", solve(5,sum))
'''

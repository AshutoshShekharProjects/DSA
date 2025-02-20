"""
def binary(lst,ele):
    n=len(lst)
    s,e=0,n-1
    while s<=e:
        m=(s+e)//2
        if ele==lst[m]:
            return m
        elif ele<lst[m]:
            e=m-1
        else:
            s=m+1
    return 0

lst=[3,4,5,6,778,564,34,877,4,23,9]
lst.sort()
ele=4
print(binary(lst,ele))
"""

def fibo(n,a=0,b=1,i=3):
    if i==n:
        return a+b
    else:
        i+=1
        f=a+b
        return fibo(n,b,f,i)

def fib(n):
    if n==1:
        return 0
    elif n==2:
        return 1
    return fib(n-1)+fib(n-2)

print(fib(40))
        
    

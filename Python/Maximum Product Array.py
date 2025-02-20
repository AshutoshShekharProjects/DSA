def maxProd(arr):
    n=len(arr)
    mx=[0]*n
    mn=[0]*n
    mx[0]=arr[0]
    mn[0]=arr[0]
    for i in range(1,n):
        c1=arr[i]
        c2=arr[i]*mx[i-1]
        c3=arr[i]*mn[i-1]
        mx[i]=max(c1,c2,c3)
        mn[i]=min(c1,c2,c3)
    return max(mx)

def maxProd2(arr):
    n=len(arr)
    mx=arr[0]
    mn=arr[0]
    ans=arr[0]
    for i in range(1,n):
        c1=arr[i]
        c2=arr[i]*mn
        c3=arr[i]*mx
        #mx=max(arr[i],arr[i]*mx,ar-r[i]*mn)
        #mn=min(arr[i],arr[i]*mx,arr[i]*mn)
        mx=max(c1,c2,c3)
        mn=min(c1,c2,c3)
        ans=max(ans,mx)
    return ans


arr=[-4,-3,-2]
print(maxProd(arr))
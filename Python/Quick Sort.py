def quickSort(arr):
    if(len(arr)<=1):
        return arr
    pivot=arr[-1]
    left=[x for x in arr[:-1] if x<=pivot]
    right=[x for x in arr[:-1] if x>pivot]
    return quickSort(left)+[pivot]+quickSort(right)

arr=[5,4,2,1,3]
print(quickSort(arr))
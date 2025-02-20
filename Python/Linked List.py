class Node:
    def __init__(self,val,fwd=None):
        self.val=val
        self.fwd=fwd

lst=[4,7,2,1,9]
root=Node(lst[0])

ptr=root
for i in lst[1:]:
    temp=Node(i)
    ptr.fwd=temp
    ptr=ptr.fwd

temp=Node(12)
temp.fwd=root
root=temp

ptr=root
while ptr.fwd!=None:
    ptr=ptr.fwd
temp=Node(20)
ptr.fwd=temp

ptr=root
while ptr.val!=2:
    ptr=ptr.fwd
temp=Node(17)
temp.fwd=ptr.fwd
ptr.fwd=temp

root=root.fwd

ptr=root
while ptr.fwd.fwd!=None:
    ptr=ptr.fwd
ptr.fwd=None

ptr=root
while ptr.fwd.val!=17:
    ptr=ptr.fwd
ptr.fwd=ptr.fwd.fwd

ptr=root
while ptr!=None:
    print(ptr.val,end=' ')
    ptr=ptr.fwd



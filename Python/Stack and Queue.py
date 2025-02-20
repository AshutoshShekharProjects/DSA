'''
s=input("Enter a string ")
stack=[]
for i in s:
    stack.append(i)
ns=''
while stack:
    ns=ns+stack.pop()

print(ns)
'''

def enqueue(queue,item):
    queue.append(item)

def dequeue(queue):
    return queue.pop(0)

def spush(stack,item):
    stack.append(item)

lst=[1,2,3,4,5,6]
stack1=[]
stack2=[]
queue=[]
for i in lst:
    spush(stack1,i)
print(stack1)
while stack1:
    spush(stack2,stack1.pop())
print(stack1)
print(stack2)
while stack2:
    enqueue(queue,stack2.pop())
print(queue)
while queue:
    print(dequeue(queue), end=" ")


    



    

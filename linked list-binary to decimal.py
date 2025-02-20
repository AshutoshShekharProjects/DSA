class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


head = ListNode(1)
head.next = ListNode(0)
head.next.next = ListNode(1)
head.next.next.next = ListNode(1)


class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        if head is None:
            return None
        else:
            a = None
            b = head
            while b is not None:
                temp = b.next
                b.next = a
                a = b
                b = temp
            temp = a
            c = 0
            sum = 0
            while temp is not None:
                sum = sum + (2 ** c) * temp.val
                c += 1
                temp = temp.next
            return sum


solution = Solution()
value = solution.getDecimalValue(head)
print("value =", value)

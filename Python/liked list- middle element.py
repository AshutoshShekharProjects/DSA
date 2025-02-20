class ListNode:

    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
head.next.next.next.next = ListNode(5)
head.next.next.next.next.next = ListNode(6)


class Solution:

    def middleNode(self, head):
        if head is None:
            return head
        elif head.next is None:
            return head
        else:
            slow = head
            fast = head
            while fast is not None and fast.next is not None:
                slow = slow.next
                fast = fast.next.next
            return slow


solution = Solution()
value = solution.middleNode(head)
while value is not None:
    print(value.val, end=" ")
    value = value.next

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:      

            
    def reverseList(self, head: ListNode) -> ListNode:
        # first     ListNode(head.val, head.next)
        length = get_length(head)
        curr = head      
        num_passes = length-1          
        while num_passes >0:
            swap = get_swap(curr, num_passes)         
            temp_val = curr.val
            curr.val = swap.val
            swap.val = temp_val
            num_passes-=2
            curr=curr.next
        return head
    
def get_length(head) -> int:
      if head != None:
          length = 1
          while head.next != None:
              head=head.next
              length+=1
          return length        
      else: return 0
def get_swap(curr, num_passes):
    while num_passes >= 1:       
        curr=curr.next 
        num_passes-=1
    return curr

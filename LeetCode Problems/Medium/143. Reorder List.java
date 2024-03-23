//https://leetcode.com/problems/reorder-list/
public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            // save the next node
            next = curr.next;
            // reverse the pointer
            curr.next = prev;
            // move the pointers
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public void reorderList(ListNode head) {
        // find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the second half of the linked list
        ListNode reversed = reverseList(slow);
        // merge the first half and the second half
        ListNode first = head;
        ListNode second = reversed;
        while(second.next != null) {
            ListNode temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
    }

//234. Palindrome Linked List
//https://leetcode.com/problems/palindrome-linked-list/description/
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
    
    public boolean isPalindrome(ListNode head) {
        //find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the second half of the linked list
        ListNode reversed = reverseList(slow);
        // compare the first half and the second half
        while(reversed != null){
            if(head.val != reversed.val){
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }
        return true;
    }

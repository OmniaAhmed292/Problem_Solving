//https://leetcode.com/problems/double-a-number-represented-as-a-linked-list

 public ListNode reveseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
   public ListNode doubleIt(ListNode head) {
        head = reveseList(head);
        ListNode current = head;
        int carry = 0;
        while(current.next !=null){
            int dummy = current.val*2+carry;
            current.val = dummy%10;
            carry = dummy/10;
            current = current.next;
        }
        current.val = current.val*2+carry;
        carry = current.val/10;
        current.val = current.val%10;
        
        if(carry!=0) {
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }

        return reveseList(head);
    }

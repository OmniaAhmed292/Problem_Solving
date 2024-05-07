//https://leetcode.com/problems/remove-nodes-from-linked-list
 //O(n) time and O(n) space complexity with a stack
public ListNode removeNodes(ListNode head) {
        Stack <ListNode> stack = new Stack<>();
        ListNode current = head;
        while(current!=null) {
             while(stack.size()>0 && stack.peek().val<current.val) {
                 stack.pop(); }

             stack.push(current);
            current = current.next;
        }
        ListNode newHead = null;
        while(stack.size()>0) {
            ListNode temp = stack.pop();
            temp.next = newHead;
            newHead = temp;
        }
        return newHead;

    }

// O(n) time, O(1) space recursion
public ListNode removeNodes(ListNode head) {
        if (head != null) {
            head.next = removeNodes(head.next);
            if (head.next != null && head.val < head.next.val) {
                return head.next;
            }
        }
        return head;
    }


// O(n) time, O(1) space reverse
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

    public ListNode removeNodes(ListNode head) {
        head = reveseList(head);
        ListNode current = head;
        int max = current.val;
        while(current.next !=null) {
            if(current.next.val<max) {
                current.next = current.next.next;
            } else {
                current = current.next;
                max = current.val;
            }
        }
        return reveseList(head);
    }

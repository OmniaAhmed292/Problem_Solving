//https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list
public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur != null) {
            ListNode next = cur.next;
            int sum = 0;
            while (next != null) {
                sum += next.val;
                if (sum == 0) {
                    cur.next = next.next;
                    break;
                }
                next = next.next;
            }
            if (next == null) {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

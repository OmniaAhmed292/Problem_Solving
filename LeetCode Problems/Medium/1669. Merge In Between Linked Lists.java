//https://leetcode.com/problems/merge-in-between-linked-lists
public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        ListNode tail = list1;
        ListNode temp = list1;
        ListNode temp2 = list2;
        int count = 0;
        while (temp != null) {
            if (count == a - 1) {
                head = temp;
            }
            if (count == b + 1) {
                tail = temp;
            }
            temp = temp.next;
            count++;
        }
        head.next = list2;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = tail;
        return list1;
        
    }

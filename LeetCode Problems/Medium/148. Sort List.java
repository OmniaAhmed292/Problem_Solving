//leetcode.com/problems/sort-list/description
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        // find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // split the linked list into two halves
        ListNode right = slow.next;
        slow.next = null;
        // sort the two halves
        ListNode left = sortList(head);
        right = sortList(right);
        // merge the two sorted halves
        return merge(left, right);
    }
    public ListNode merge (ListNode first, ListNode second){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(first != null && second != null){
            if(first.val < second.val){
                current.next = first;
                first = first.next;
            }else{
                current.next = second;
                second = second.next;
            }
            current = current.next;
        }
        if(first != null){
            current.next = first;
        }
        if(second != null){
            current.next = second;
        }
        return dummy.next;
    }
}

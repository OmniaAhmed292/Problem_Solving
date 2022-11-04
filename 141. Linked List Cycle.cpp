/* problem link
https://leetcode.com/problems/linked-list-cycle/submissions/
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
 
class Solution {
public:
    bool hasCycle(ListNode *head) {
        //Create a fast and a slow pointers
        ListNode * fast=head;
        ListNode * slow=head;
        
        //If list is Empty or hae only one element it's not cycled
        if(head==NULL || head->next==NULL) return false;
        
        while(true){
            //Break if fast reached the last element
            if(fast->next==NULL) break;
            //If not move fast by two and slow by one
            fast=fast->next->next;
            slow=slow->next;
            //if fast is null after the move break too.
            if(fast==NULL) break;
            //if slow and fast reached the same element then return true(It's impossible if not cycled)
            if(slow==fast){
                return true;
            
            }
        }
        return false;
    }
};

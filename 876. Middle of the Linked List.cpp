/*
https://leetcode.com/problems/middle-of-the-linked-list/
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
  
    ListNode* middleNode(ListNode* head) {
      //Fast and slow pointers which moves half the steps.
       ListNode* fast=head;
        ListNode* slow=head;
      
        while(fast!=NULL){
            //In case of odd nodes
            if(fast->next==NULL) return slow; 
            //in case of even nodes
            if(fast->next->next==NULL) return slow->next;
            //fast moves two steps while slow moves one.
            fast=fast->next->next;
            slow=slow->next;
            
        }
      //When fast reaches the end slow reaches the middle
        return slow;
        
        
        
    }
};

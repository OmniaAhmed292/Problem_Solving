//https://leetcode.com/problems/reverse-linked-list/description/

//Iterative approach
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

//C++
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
    if(head==NULL) return head;
    if(head->next==NULL) return head; 
     
    ListNode* previous=nullptr;
    ListNode* current=head;
    ListNode* nextp=head->next;
    while(nextp != nullptr){
        current->next = previous;
        cout<<nextp->val<<endl;
        previous =current;
        current=nextp;
        nextp=nextp->next;

        
    }
    current->next = previous;
    previous =current;
    

    return current;     
    }
};
*/
//**********************************************************************

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* removal=head;
        ListNode* currentNode =head;
        ListNode* preremoval =head;
        int i=0;
        //if the linked list has only one element then delete it
        if(head->next==nullptr){
            delete head;
            return nullptr;
        }
        
       while(currentNode->next!=nullptr){
           //Go to next node
          currentNode =currentNode->next; 
           //Calculate how many steps
           i++;
           // Start moving the second pointer to have  distance equal to n
           if(i>=n){
               removal=removal->next;
           }
           
           if(i>=n+1 ){
               preremoval=preremoval->next;
           }
           
           
       }
        //if there's only two elements so there is no preremoval node
      if( preremoval->next == removal->next)
          
      {   //delete the first element by making the head next
          head=removal->next;
      }
      //General delete process
       preremoval-> next=removal->next;
       removal->next=nullptr;
       delete removal;
        
       
        
      return head;  
        
    } 
};

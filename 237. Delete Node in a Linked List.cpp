/* Problem link
https://leetcode.com/problems/delete-node-in-a-linked-list/
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
    void deleteNode(ListNode* node) {
        //we can Start from the wanted node and make rest of node shift to it
        ListNode* nextNode = node->next;
        ListNode* currentNode=node;
    
        while(nextNode->next !=NULL){
            //make the value of the next node overwrite the current node
             currentNode->val = nextNode->val;
            //Go one node further
             nextNode = nextNode->next;
            currentNode = currentNode->next;
            
        }
        //Copy the last element into the current node
        currentNode->val = nextNode->val;
        //Make it the tail
        currentNode->next=NULL;
        //prevent garabage memory
        delete nextNode;
    }
};

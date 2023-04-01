/*
https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
*/

/*
 * Complete the 'insertNodeAtPosition' function below.
 *
 * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
 * The function accepts following parameters:
 *  1. INTEGER_SINGLY_LINKED_LIST llist
 *  2. INTEGER data
 *  3. INTEGER position
 */

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */


SinglyLinkedListNode* insertNodeAtPosition(SinglyLinkedListNode* llist, int data, int position) {
    int i=1;
    //Create a linked list with the node we want to insert.
    SinglyLinkedList list;
    list.insert_node(data);
    //Create a pointer that points to the head
    SinglyLinkedListNode* inserted = list.head;
    //Two pointers for current node and next node.
    SinglyLinkedListNode* current = llist;
    SinglyLinkedListNode* nextP = llist->next;
    //Iterate till we find the position
    while(i<=position){
        //If we reached the position we want to insert after
        if(i==position){
            //change current's next to the insersted node
            current->next=inserted;
            //change the inserted's next to the next node in the list
            inserted->next=nextP;
            
        }
        //If we haven't reach the wanted position advance the position variable as well as the pointers
        i++;
        current=current->next;
        nextP=nextP->next;
    }
    //return the head of the list
    return llist;

}

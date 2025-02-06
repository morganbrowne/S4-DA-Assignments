/**
 * Assignment #3:
 * Deleting a Node from a linked List
 *
 * 0: If the linked doesn't have a node
 * 1: Delete Node at the beginning
 * 2: Delete Node at the end
 * 3: Delete Node Anywhere
 */

package Assignments.LinkedLists;

import LinkedList.Node;

public class LLDeletingNode {
    public Node head;
    public Node tail;
    public int size;


    public void deleteLinkedlist(int location){
        if (head == null ) {
            return;
        } else if (location == 0){
            head = head.next;
            head = null;
        } else if (location >= size - 1) {
            Node temp = head; // This temp is made to traverse the list without losing head.
            while (temp.next != tail) { // moves temp to the second last node.
                temp = temp.next;
            }
            temp.next = null; // removes last node
            tail = temp; // updates the last node.
        } else if((location > 0) && (location < size -1)) {
            Node temp = head;
            int index = 0; // index is 0 to track position.
            while (index < location -1) { // the loop moves temp forward until it hits the node one,
                temp = temp.next;         // place before the node that's to be deleted.
                index++;
            }
            temp.next = temp.next.next; // this skips over the node that is to be deleted.
        }
        size--;

    }
}


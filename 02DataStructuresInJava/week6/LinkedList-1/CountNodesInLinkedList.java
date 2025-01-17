/*
Problem statement
Given the head of a singly linked list of integers, find and return its length.

Example:
Sample Linked List

The length of the list is 4. Hence we return 4.
Note:
Exercise caution when dealing with edge cases, such as when the head is NULL. Failing to handle these edge cases appropriately may result in a runtime error in your code.

Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first and only line contains elements of the singly linked list separated by a single space, -1 indicates the end of the singly linked list and hence, would never be a list element.


Output format :
Return a single integer denoting the length of the linked list.
Sample Input 1 :
3 4 5 2 6 1 9 -1


Sample Output 1 :
7


Explanation of sample input 1 :
The number of nodes in the given linked list is 7.
Hence we return 7.


Sample Input 2 :
10 76 39 -3 2 9 -23 9 -1


Sample Output 2 :
8


Expected Time Complexity:
Try to do this in O(n).


 Constraints :
0 <= N <= 10^5
Time Limit: 1 sec
*/

class Node {
    public int data;
    public Node next;
   
    Node()
    {
        this.data = 0;
        this.next = null;
    }
   
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
   
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

public class CountNodesInLinkedList {
    public static int length(Node head){
        //Your code goes here
        Node thead = head;
        int length = 0;
        while(thead!=null){
            length++;
            thead = thead.next;
        }

        return length;
    }
}

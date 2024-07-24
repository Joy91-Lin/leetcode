/**206. Reverse Linked List
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * T: O(n)
 * S: O(1)
 * **/


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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
      	ListNode pre = null;
      	while(current != null){
          ListNode tmp = current.next;
          current.next = pre;
          pre = current;
          current = tmp;
        }

      return pre;
    }
}

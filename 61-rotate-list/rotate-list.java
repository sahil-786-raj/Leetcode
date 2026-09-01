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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null  || head.next == null || k == 0){
            return head;
        }

        ListNode temp = head;
        int s = 1;
        while(temp.next != null){
            temp = temp.next;
            s++;
        }

        int f = k % s;
        if(f == 0){
            return head;
        }

        temp.next = head;

        int p = s - f;
        ListNode dummy = head;
        int j = 1;
        while(j < p){
            dummy = dummy.next;
            j++;
        }

        head = dummy.next;
        dummy.next = null;

        return head;
    }
}
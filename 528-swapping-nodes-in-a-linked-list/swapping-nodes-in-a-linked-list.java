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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        int i = 0;
        ListNode tempnode = head;
        while(i<k-1){
            tempnode = tempnode.next;
            i++;
        }

        int idx = size - k + 1;
        int j = 0;
        ListNode dummy = head;
        while(j<idx-1){
            dummy = dummy.next;
            j++;
        }

        int z = tempnode.val;
        tempnode.val = dummy.val;
        dummy.val = z;

        return head;
    }
}
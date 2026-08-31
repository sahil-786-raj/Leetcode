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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        while(left < right){
            ListNode temp1 = head;
            ListNode temp2 = head;
            int i=1;
            int j=1;
            while(i<left){
                temp1 = temp1.next;
                i++;
            }
            while(j<right){
                temp2 = temp2.next;
                j++;
            } 

            int temp = temp1.val;
            temp1.val = temp2.val;
            temp2.val = temp;

            left++;
            right--;
        }

        return head;
    }
}
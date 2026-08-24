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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode dummynode = new ListNode(-1);
        ListNode curr = dummynode;
        int carry = 0;

        while(head1 != null || head2 != null){
            int sum = carry;

            if(head1 != null){
                sum += head1.val;
            }

            if(head2 != null){
                sum += head2.val;
            }

            ListNode newnode = new ListNode(sum % 10);

            carry = sum/10;

            curr.next = newnode;
            curr = curr.next;

            if(head1 != null){
                head1 = head1.next;
            }

            if(head2 != null){
                head2 = head2.next;
            }
        }

        if(carry != 0){
            ListNode newnode = new ListNode(carry);
            curr.next = newnode;
            curr = curr.next;
        }

        return dummynode.next;
    }
}
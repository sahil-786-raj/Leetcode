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
    public ListNode mergeTwoLists(ListNode leftsort, ListNode rightsort) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);

        ListNode temp = dummy;

        while(leftsort != null && rightsort != null){
            if(leftsort.val < rightsort.val){
                temp.next = leftsort;
                leftsort = leftsort.next;
                temp = temp.next;
            }else{
                temp.next = rightsort;
                rightsort = rightsort.next;
                temp = temp.next;
            }
        }

        while(leftsort != null ){
            temp.next = leftsort;
            leftsort = leftsort.next;
            temp = temp.next;
        }

        while(rightsort != null){
            temp.next = rightsort;
            rightsort = rightsort.next;
            temp = temp.next;
        }

        return dummy.next;

    }
}
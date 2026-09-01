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
    public ListNode findmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        fast = fast.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode mergesort(ListNode leftsort, ListNode rightsort){
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

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode mid = findmid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        ListNode leftsort = sortList(left); 
        ListNode rightsort = sortList(right); 

        return mergesort(leftsort, rightsort);
    }
}
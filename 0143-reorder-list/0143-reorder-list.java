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
    private ListNode findMid (ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
return slow;
    }


    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode next;
        ListNode prev = null;

        while(curr!= null ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            

        }
        return prev;

    }



    public void reorderList(ListNode head) {

        ListNode mid = findMid(head);
        //split
        ListNode second = mid.next;
        mid.next = null;


         second  = reverse(second);
         ListNode first = head;
         while (second != null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;


         }
        // ListNode lefthead = reorderList(head);

        // ListNode righthead =reorderList(righthead); 
    
        // return merge(lefthead, righthead);
        
    }
}
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
    //reverse fun
//     

//calculating mid
    private ListNode findmid(ListNode head){
        ListNode fast = head;

        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;

    }

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode next;
        ListNode curr = head;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }


        ListNode midnode = findmid(head);
        // ListNode reverse = reverse(head);


ListNode right = reverse(midnode);
ListNode left = head;



while(right!=null){
    if(left.val!= right.val){
        return false;
    }
    left = left.next;
    right = right.next;
}
return true;
        
    }
}
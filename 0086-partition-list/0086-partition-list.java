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
    public ListNode partition(ListNode head, int x) {
        if(head==null)return null;
        ListNode curr = head;
        ListNode dummysmall = new ListNode(0);
        ListNode dummylarge = new ListNode(0);
        ListNode small  = dummysmall;
        ListNode large =dummylarge; 



        while(curr!=null){
            if(curr.val<x){
                small.next = curr;
                small = small.next;
            }else{
                large.next = curr;
                large = large.next;
            }
            curr = curr.next;
        }
        small.next = dummylarge.next;
        large.next = null;
        return dummysmall.next;
    }
}
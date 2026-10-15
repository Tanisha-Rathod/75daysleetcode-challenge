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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr = head;
        int l = 0;
        while(curr!=null){
            l++;
            curr = curr.next;
        }
        int eachbucketnode = l/k;
        int extranode = l%k;
        ListNode result[] = new ListNode[k];
        ListNode prev = null;
        curr = head;
        for(int i=0;   curr!=null && i<k; i++){
            result[i] = curr;
for(int count = 1; count<=eachbucketnode+(extranode>0?1:0); count++){
    prev = curr ;
    curr = curr.next;
}
if(prev!=null){
prev.next = null;
}

extranode--;

        }
return result;
    }
}
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
    private ListNode reverse(ListNode head){
        ListNode curr= head;
        ListNode next ;
        ListNode prev = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
return prev;
    }


    private ListNode findk(ListNode temp, int k){
        k-=1;

        while(temp!=null && k>0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prevnode = null;
        ListNode nextnode;
        ListNode temp = head;
        while(temp!=null){
            ListNode kthnode = findk(temp, k);
            if(kthnode==null){
                if(prevnode!=null){
                    prevnode.next=temp;
                }
                break;
            }

            nextnode = kthnode.next;
            kthnode.next = null;
            reverse(temp);
            if(temp==head){
                head=kthnode;
            }else{
                prevnode.next = kthnode;
            }
                
            prevnode = temp;
            temp = nextnode;

        }
        return head;
    }
}
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        
        Map<Node,Node>map = new HashMap<>();
        Node newNode = new Node(head.val);
        Node oldTemp = head.next;
        Node newTemp = newNode;
        map.put(head, newNode);
      //create a copy node;
        while(oldTemp!=null){
            Node copyNode = new Node(oldTemp.val);
             map.put(oldTemp,copyNode);
            newTemp.next = copyNode;
            //updation 
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }
        // random pointer
        oldTemp = head;
        newTemp = newNode;

        
        while(oldTemp!=null){
         newTemp.random =  map.get(oldTemp.random);
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;

        }
        return newNode;
    }
}
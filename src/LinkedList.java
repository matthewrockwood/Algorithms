public class LinkedList {
    public class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node reverseList(Node head){
        Node prev = null;
        Node next;
        Node curr = head;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;


        }
        return prev;
    }
}

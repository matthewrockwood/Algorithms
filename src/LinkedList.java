public class LinkedList {
    public Node head;
    public class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
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
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int binaryToDecimal(Node head){
        int ans = 0;
        int[] arr = new int[35];
        Node curr = head;
        int i = 0;
        while(curr!= null){
            arr[i++] = curr.data;
            curr=curr.next;
        }
        int x =0;
        for(int j=i;j>=0;j--){
            if(arr[j]==1) {
                ans += Math.pow(2, x);
            }
            x++;
        }
    return ans;
    }
}

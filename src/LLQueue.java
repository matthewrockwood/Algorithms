public class LLQueue {
    private Node front=null;
    private Node back = null;
    public class Node{
         int data;
         Node next;
        Node(int data){
            this.data =data;
            this.next = null;

        }
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front = newNode;
            back = newNode;
        }
        else{
            back.next = newNode;
            back = newNode;
        }

    }
    public int dequeue(){
        if(isEmpty()) return -1;
        else {
            int x = front.data;
            front = front.next;
            if(front == null){

                back =null;

            }
            return x;
        }
    }
}

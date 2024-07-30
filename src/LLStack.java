public class LLStack {
    private Node top;
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public LLStack(){
    this.top = null;

    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public int pop(){
        if(isEmpty()) System.out.println("Empty");
        int x = top.data;
        top = top.next;
        return x;

    }
    public void print(){
        Node current = top;
        while(current != null){
            System.out.println(current.data+ " ");
            current=current.next;
        }
    }
}

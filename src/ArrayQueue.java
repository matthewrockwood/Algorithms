public class ArrayQueue {
    private int[] arr =  new int[3];
    private int front;
    private int back;
    ArrayQueue(){
        this.front = 0;
        this.back = 0;
    }

    public boolean isEmpty(){
        return front==back;
    }
    public void enqueue(int data) {
        if ((back + 1) % arr.length == front) {
            System.out.println("que is full;");
        } else {
            back = (back + 1) % arr.length;//first is always empty when starting
            arr[back] = data;
        }
    }
        public int dequeue(){
            if(front==back) {
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                int x = arr[front];
                front=(front+1)%arr.length;
                return x;
            }
        }

}

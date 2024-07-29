import java.util.Arrays;

public class ArrayStack {
    private int counter = 0;
    private int[] stack;
    ArrayStack(int size){
        stack = new int[size];
        Arrays.fill(stack, -1);
    }
    public boolean isEmpty(){
        if(stack[0]==0) return false;
        return true;
    }
    public void push(int x){

        if (counter+1==stack.length) stack = resize(stack);

        stack[counter] = x;
        counter++;
    }

    private int[] resize(int[] stack) {
        int[] array2 = new int[stack.length * 2];
        Arrays.fill(array2, -1);
        for(int i = 0; i<stack.length; i++){
            array2[i] = stack[i];
        }
        return array2;
    }
    public void print(){
        for (int i = 0; i < counter; i++) {
            System.out.println(stack[i] + " " + counter);
        }
    }
    public int pop(){
        counter--;
        int x = stack[counter];
        stack[counter] = -1;

        return x;
    }
}

public class Main {
    public static void main(String[] args) {
       ArrayQueue que = new ArrayQueue();
       que.enqueue(1);
        que.enqueue(1);
        que.dequeue();
        que.enqueue(1);
        que.enqueue(1);
        que.enqueue(1);



       // int array[] = new int[]{12,4,67,43,55,3,2,28,13};
       // bubbbleSort(array);
       // for (int i = 0; i < array.length; i++) {
           // System.out.println(array[i]);

       // }
    }
    public static int[] swap(int[] arr, int indx1, int indx2){
        int temp = arr[indx1];
        arr[indx1]= arr[indx2];
        arr[indx2] = temp;
        return arr;

    }
    public static int[] bubbbleSort(int[] array){
        for(int i =0; i<array.length-1; i++){
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
return array;
    }
}
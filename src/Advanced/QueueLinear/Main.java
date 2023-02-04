package Advanced.QueueLinear;

public class Main {
    public static void main(String[] args) {
        int size = 5;
        Queue<Integer> queue = new Queue<>(size);

        for(int i = 0 ; i<size; i++){
            queue.enqueue(i+1);
        }

        for(int i = 0 ; i<size; i++){
            System.out.println(queue.dequeue());
        }
    }
}

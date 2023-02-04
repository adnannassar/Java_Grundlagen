package Advanced.Queue.Circular;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(5);
        queue.enqueue(1);
        System.out.println("enqueued: 1" );
        queue.enqueue(2);
        System.out.println("enqueued: 2" );
        queue.enqueue(3);
        System.out.println("enqueued: 3" );
        queue.enqueue(4);
        System.out.println("enqueued: 4" );
        queue.enqueue(5);
        System.out.println("enqueued: 5" );

        System.out.println("\ndequeued: " + queue.dequeue());
        System.out.println("dequeued: " + queue.dequeue());

        queue.enqueue(6);
        System.out.println("\nenqueued: 6" );
        queue.enqueue(7);
        System.out.println("enqueued: 7" );

        System.out.println("\ndequeued: " + queue.dequeue());
        System.out.println("dequeued: " + queue.dequeue());
        System.out.println("dequeued: " + queue.dequeue());
        System.out.println("dequeued: " + queue.dequeue());
        System.out.println("dequeued: " + queue.dequeue());

        queue.enqueue(10);
        System.out.println("\nenqueued: 10" );
        queue.enqueue(20);
        System.out.println("enqueued: 20" );
        queue.enqueue(30);
        System.out.println("enqueued: 30" );
        queue.enqueue(40);
        System.out.println("enqueued: 40" );
        queue.enqueue(50);
        System.out.println("enqueued: 50" );
        queue.enqueue(60);
    }
}

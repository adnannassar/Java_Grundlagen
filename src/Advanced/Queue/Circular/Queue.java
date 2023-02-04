package Advanced.Queue.Circular;

public class Queue<T> {
    private T[] array;
    private int first, last;

    public Queue(int size) {
        this.array = (T[]) new Object[size];
        this.last = this.first = -1;
    }

    public boolean isEmpty() {
        if (last == -1 && first == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if ((last == array.length - 1 && first == -1) || (first == last && last != -1)) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(T value) {
        if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            last = (last + 1) % array.length;
            array[last] = value;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            first = (first + 1) % array.length;
            T erg = array[first];
            if (first == last) {
                first = last = -1;
            }
            return erg;
        }
    }
}

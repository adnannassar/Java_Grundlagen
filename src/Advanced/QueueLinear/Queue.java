package Advanced.QueueLinear;

public class Queue<T> {
    T[] array;
    int first, last;

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
        if (last == array.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(T value) {
        if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            array[++last] = value;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            return array[++first];
        }
    }
}

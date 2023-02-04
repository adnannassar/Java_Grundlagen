package Advanced.Stack;

import java.lang.reflect.Array;

public class Stack<T> {
    private int last;
    private T[] array;

    public Stack(int size) {
        this.array = (T[]) new Object[size];
        this.last = -1;
    }

    public boolean isEmpty() {
        if (last == -1) {
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

    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            array[++last] = value;
        }
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            return array[last--];
        }
    }
}

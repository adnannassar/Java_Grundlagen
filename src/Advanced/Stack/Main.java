package Advanced.Stack;

public class Main {
    public static void main(String[] args) {
        int size = 5;
        Stack<Integer> stack = new Stack<>(size);
        for (int i = 0; i < size; i++) {
            stack.push(i + 1);
        }

        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }

        System.out.println();

        Stack<String> stackString = new Stack<>(size);
        for (int i = 0; i < size; i++) {
            stackString.push("Student " + (i + 1));
        }

        for (int i = 0; i < size; i++) {
            System.out.println(stackString.pop());
        }


    }
}

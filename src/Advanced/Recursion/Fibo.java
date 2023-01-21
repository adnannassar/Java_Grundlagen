package Advanced.Recursion;

public class Fibo {
    public static void main(String[] args) {
        fiboIterative(9);
        System.out.println();
        fiboRecursive(9, 0, 1, 0);
    }

    public static void fiboIterative(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }


    public static void fiboRecursive(int n, int n1, int n2, int n3) {
        if (n > 2) {
            if (n1 == 0) {
                System.out.print(n1 + " " + n2);
            }
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fiboRecursive(n - 1, n1, n2, n3);
        }
    }
}

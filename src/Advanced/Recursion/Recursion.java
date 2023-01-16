package Advanced.Recursion;

public class Recursion {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Fakultät Iterative von " + n + "=  " + fakIterative(n));
        System.out.println("Fakultät Recursive von " + n + "=  " + fakRecursive(n));
        rev1Recursive(1234);
        System.out.println();
        rev1Iterative(1234);
        System.out.println();
        System.out.println(rev2Recursive(1234));
        System.out.println(rev2Iterative(1234));
    }

    public static int fakIterative(int n) {
        int erg = 1;
        for (int i = 1; i <= n; i++) {
            erg *= i;
        }
        return erg;
    }

    public static int fakRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fakRecursive(n - 1);
        }
    }

    public static void rev1Recursive(int n) {
        System.out.print(n % 10);
        if (n > 9)
            rev1Recursive(n / 10);
    }

    public static void rev1Iterative(int n) {
        do {
            System.out.print(n % 10);
            n = n / 10;
        } while (n > 0);
    }

    public static int rev2Recursive(int n) {
        if (n <= 9) {
            return n;
        }
        int logn = (int) Math.log10(n);
        int zehnHochLogn = (int) Math.pow(10, logn);
        return (n % 10) * zehnHochLogn + rev2Recursive(n / 10);
    }

    public static int rev2Iterative(int n) {
        int erg = 0;
        while (n > 0) {
            erg = 10 * erg + n % 10;
            n = n / 10;
        }
        return erg;
    }
}






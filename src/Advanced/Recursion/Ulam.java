package Advanced.Recursion;

public class Ulam {
    public static void main(String[] args) {
        berechneUlamFolgeIterative(3);
        System.out.println();
        System.out.println(berechneUlamFolgeRecursive(3));
    }

    public static void berechneUlamFolgeIterative(int n) {
        System.out.print(n + " --> ");
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            if (n == 1) {
                System.out.print(n);
            } else {
                System.out.print(n + " --> ");
            }
        }
    }

    public static int berechneUlamFolgeRecursive(int n) {
        if (n >= 1) {
            return 1;
        } else {
            if (n % 2 == 0) {
                return berechneUlamFolgeRecursive(n / 2);
            } else {
                return berechneUlamFolgeRecursive(n * 3 + 1);
            }
        }
    }

}

package Advanced.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("a: ");
        int a = 0;
        try {
            a = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Eingabe ist falsch!");
        }


        System.out.print("b: ");
        int b = 0;
        try {
            b = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Eingabe ist falsch!");
        }

        System.out.println("Result = " + add(a, b));

        System.out.println("This is our Calculator");
        System.out.println("Follow us on Twitter");

    }

    private static int add(int a, int b) {
        return a + b;
    }
}

package Arrays.Algorithmen;

import java.util.Scanner;

public class CollatzFolge {
    static Scanner scanner = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        System.out.print("Bitte n eingeben: ");
        n = scanner.nextInt();
        showMenu(n);
    }

    // 4
    public static void berechneCollatzFolge(int n) {
        System.out.print(n + " --> ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 2 != 0 && n % 3 == 0) {
                n = n / 3;
            } else {
                n = 3 * n + 1;
            }
            if (n == 1) {
                System.out.print(n);
            } else {
                System.out.print(n + " --> ");
            }
        }
    }

    public static int längeCollatzFolge(int n) {
        int länge = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 2 != 0 && n % 3 == 0) {
                n = n / 3;
            } else {
                n = 3 * n + 1;
            }
            länge++;
        }
        return länge;
    }

    public static void showMenu(int n) {
        int auswahl;
        do {
            System.out.println("\n--------------------------------");
            System.out.println("1\tCollatz-Folge für n");
            System.out.println("2\tLänge Collatz-Folge für n");
            System.out.println("3\tn erneut eingeben");
            System.out.println("4\tFertig");
            System.out.println("--------------------------------");
            System.out.print("Bitte auswählen: ");
            auswahl = scanner.nextInt();
            switch (auswahl) {
                case 1:
                    System.out.print("Collatz Folge für (" + n + "): ");
                    berechneCollatzFolge(n);
                    break;
                case 2:
                    System.out.println("\nLänge der Collatz Folge für (" + n + "): " + längeCollatzFolge(n));
                    break;
                case 3:
                    System.out.print("Bitte neue (n) eingeben: ");
                    n = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Ciao");
                    break;
                default:
                    System.out.println("Bitte nur 1-4 auswählen!");
            }
        } while (auswahl != 4);
    }
}

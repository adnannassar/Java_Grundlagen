package Methoden;

import java.util.Scanner;

public class Verzinsung {
    static Scanner scanner = new Scanner(System.in);
    static double anlageBetrag;
    static int jahr;

    public static void main(String[] args) {
        anlageBetragUndJahrLesen();
        readInput();
    }

    public static void anlageBetragUndJahrLesen() {
        System.out.print("Bitte geben Sie den Anlagebetrag ein: ");
        anlageBetrag = scanner.nextDouble();
        System.out.print("Bitte geben Sie das Jahr ein: ");
        jahr = scanner.nextInt();
    }

    public static void showMenu() {
        System.out.println("\n--------------------------------------------");
        System.out.println("1\t1,5% Verzinsung ohne Bonuszahlung");
        System.out.println("2\t0,7% Verzinsung mit 15 Euro Bonuszahlung");
        System.out.println("3\t0,4% Verzinsung mit 20 Euro Bonuszahlung");
        System.out.println("4\t0,1% Verzinsung mit 50 Euro Bonuszahlung");
        System.out.println("5\tFertig");
        System.out.println("--------------------------------------------");
    }

    public static void readInput() {
        int auswahl;
        do {
            showMenu();
            System.out.print("Bitte auswählen: ");
            auswahl = scanner.nextInt();
            switch (auswahl) {
                case 1:
                    System.out.println("Kapital= " + berechneKapital(1.5f, 0, anlageBetrag, jahr));
                    break;
                case 2:
                    System.out.println("Kapital= " + berechneKapital(0.7f, 15, anlageBetrag, jahr));
                    break;
                case 3:
                    System.out.println("Kapital= " + berechneKapital(0.4f, 20, anlageBetrag, jahr));
                    break;
                case 4:
                    System.out.println("Kapital= " + berechneKapital(0.1f, 50, anlageBetrag, jahr));
                    break;
                case 5:
                    System.out.println("Danke, ciao!");
                    break;
                default:
                    System.out.println("Bitte wählen Sie eine der Möglichkeiten 1-5 aus");
            }
        } while (auswahl != 5);

    }

    public static double berechneKapital(float verzinsung, int bonus, double anlageBetrag, int laufzeit) {
        return anlageBetrag + (((1 + verzinsung / 100) + bonus) * laufzeit);
    }
}

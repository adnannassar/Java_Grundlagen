package Methoden;

import java.util.Scanner;

public class DosenRechner {
    static Scanner scanner = new Scanner(System.in);
    static double pi = Math.PI;
    static double radius;
    static double höhe;


    public static void main(String[] args) {
        readRadiusAndHöhe();
        showMenu();
    }

    public static void showMenu() {
        int auswahl;
        do {
            System.out.println("\n1.Umfang\n" +
                    "2.Deckelfläche\n" +
                    "3.mantelfläche\n" +
                    "4.Oberfläche\n" +
                    "5.Volumen\n" +
                    "6.Alle Dosen Infos\n" +
                    "7.Exit");
            System.out.print("Bitte auswählen: ");
            auswahl = scanner.nextInt();
            switch (auswahl) {
                case 1:
                    System.out.println("Umfang: " + umfang(radius));
                    break;
                case 2:
                    System.out.println("Deckelfläche: " + deckelfläche(radius));
                    break;
                case 3:
                    System.out.println("Mantelfläche: " + mantelfläche(radius, höhe));
                    break;
                case 4:
                    System.out.println("Oberfläche: " + oberfläche(radius, höhe));
                    break;
                case 5:
                    System.out.println("Volumen: " + volumen(radius, höhe));
                    break;
                case 6:
                    printAllDosenInfo(radius, höhe);
                    break;
                case 7:
                    System.out.println("Auf wiedersehen!");
                    break;
                default:
                    System.out.println("Bitte etwas gültiges auswählen");
            }
        } while (auswahl != 7);
    }

    public static void readRadiusAndHöhe() {
        System.out.println("Welcome in Dosen Rechner");
        System.out.print("Bitte geben Sie Radius ein: ");
        radius = scanner.nextDouble();
        System.out.print("Bitte geben Sie Höhe ein: ");
        höhe = scanner.nextDouble();
    }

    public static double umfang(double radius) {
        return 2 * pi * radius;
    }

    public static double deckelfläche(double radius) {
        return pi * (radius * radius);
    }

    public static double mantelfläche(double radius, double höhe) {
        return umfang(radius) * höhe;
    }

    public static double oberfläche(double radius, double höhe) {
        return 2 * deckelfläche(radius) + mantelfläche(radius, höhe);
    }

    public static double volumen(double radius, double höhe) {
        return deckelfläche(radius) * höhe;
    }

    public static void printAllDosenInfo(double radius, double höhe) {
        System.out.println("Umfang: " + umfang(radius));
        System.out.println("Deckelfläche: " + deckelfläche(radius));
        System.out.println("Mantelfläche: " + mantelfläche(radius, höhe));
        System.out.println("Oberfläche: " + oberfläche(radius, höhe));
        System.out.println("Volumen: " + volumen(radius, höhe));
    }
}

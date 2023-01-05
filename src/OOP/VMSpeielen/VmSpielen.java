package OOP.VMSpeielen;

import java.util.Scanner;

public class VmSpielen {
    static Mannschaft italian = new Mannschaft("Italian");
    static Mannschaft niederland = new Mannschaft("Niederland");
    static Mannschaft deutschland = new Mannschaft("Deutschland");


    public static void main(String[] args) {
        simulationVM();
        showTable();
        showWinner();
    }

    public static void simulationVM() {
        boolean okay = false;
        do {
            System.out.println("Welcome in Worldcup");
            simulationMatch(deutschland, italian);
            simulationMatch(deutschland, niederland);
            simulationMatch(italian, niederland);
            if (deutschland.getPoints() != italian.getPoints()
                    && deutschland.getPoints() != niederland.getPoints()
                    && italian.getPoints() != niederland.getPoints()) {
                okay = true;
            }
        } while (!okay);
    }

    public static void showTable() {
        System.out.println(deutschland.getName() + ": " + deutschland.getPoints());
        System.out.println(italian.getName() + ": " + italian.getPoints());
        System.out.println(niederland.getName() + ": " + niederland.getPoints());
    }

    public static void simulationMatch(Mannschaft mn1, Mannschaft mn2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mn1.getName() + " vs " + mn2.getName());
        int mn1Points = scanner.nextInt();
        int mn2Points = scanner.nextInt();

        if (mn1Points > mn2Points) {
            mn1.setPoints(3);
        } else if (mn1Points < mn2Points) {
            mn2.setPoints(3);
        } else {
            mn1.setPoints(1);
            mn2.setPoints(1);
        }
        System.out.println();
    }

    public static void showWinner() {
        if (deutschland.getPoints() > niederland.getPoints() && deutschland.getPoints() > italian.getPoints()) {
            System.out.println("The winner is " + deutschland.getName());
        }

        if (niederland.getPoints() > deutschland.getPoints() && niederland.getPoints() > italian.getPoints()) {
            System.out.println("The winner is " + niederland.getName());
        }

        if (italian.getPoints() > deutschland.getPoints() && italian.getPoints() > niederland.getPoints()) {
            System.out.println("The winner is " + italian.getName());
        }

    }

}

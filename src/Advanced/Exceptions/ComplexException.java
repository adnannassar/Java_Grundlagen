package Advanced.Exceptions;

import jdk.jfr.StackTrace;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ComplexException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eingabe = 0;
        do {
            System.out.println("\n1.Age Calculator\n2.Love Calculator\n3.Exit");
            System.out.print("Ihre Eingabe: ");
            try {
                eingabe = scanner.nextInt();
                switch (eingabe) {
                    case 1:
                        System.out.println("Your Age is: " + AgeCalculator.calculateAge());
                        break;
                    case 2:
                        LoveCalculator.loveCalculate();
                        break;
                    case 3:
                        System.out.println("Ciao!!");
                        break;
                    default:
                        System.out.println("Please check your inputs");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please only number as input");
                scanner.nextLine();
            }


        } while (eingabe != 3);

    }
}

class AgeCalculator {
    public static int calculateAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate: ");
        int birthDate = scanner.nextInt();
        return LocalDate.now().getYear() - birthDate;
    }
}

class LoveCalculator {
    public static void loveCalculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name 1: ");
        String name1 = scanner.next();
        System.out.print("Name 2: ");
        String name2 = scanner.next();
        Random random = new Random();

        System.out.println("Love percent between " + name1 + " and " + name2 + " is " + (random.nextInt(100) + 1) + "%");
    }
}

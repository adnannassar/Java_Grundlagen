package Methoden;

import OOP.Student;

public class Main {
    public static void main(String[] args) {
        int newBonus = berechneBonusFunktion(100, 50) + 10;
        System.out.println("Result = " + newBonus);

        berechneBonusProzedur(90, 40);
        berechneBonusProzedur(80, 60);
    }

    public static void berechneBonusProzedur(int a, int b) {
        int x = a;
        int y = b;
        int z = x + y;
        z -= 5;
        System.out.println("Result = " + z);
    }

    public static int berechneBonusFunktion(int a, int b) {
        int x = a;
        int y = b;
        int z = x + y;
        z -= 5;
        return z;
    }


}

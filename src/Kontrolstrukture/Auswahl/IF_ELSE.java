package Kontrolstrukture.Auswahl;

public class IF_ELSE {
    public static void main(String[] args) {
        // Beispiel 1

        int x = 0;

        if (x > 0) {
            System.out.println("X is positive");
        } else if (x < 0) {
            System.out.println("X is negative");
        } else {
            System.out.println("X is neutral ");
        }

        // Beispiel 2

        int n = 11;
        if (n > 10) {
            if (n % 2 == 0) {
                n = 2 * n;
            } else {
                n = -n;
            }
        }
        System.out.println(n);

        // Beispiel 3 Gerade oder Ungerade
        int y =10;
        if (y % 2 == 0) {
            System.out.println("y ist gerade");
        }else{
            System.out.println("y ist ungerade");
        }


    }
}

package Kontrolstrukture.Schleifen;

public class For {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++) {
            System.out.print(x + "\t");
        }
        System.out.println();
        for (int x = 5; x >= 1; x--) {
            System.out.print(x + "\t");
        }

        // Beispiel 2:
        System.out.print("\nFor:      ");
        int n = 11;
        for (int i = n; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.print("\nWhile:    ");
        int m = 11;
        while (m >= 0) {
            System.out.print(m + " ");
            m -= 2;
        }

        System.out.print("\nDo While: ");
        int z = 11;
        do{
            System.out.print(z + " ");
            z-= 2;
        }
        while (z >= 0);

    }
}

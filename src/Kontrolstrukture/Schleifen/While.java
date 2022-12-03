package Kontrolstrukture.Schleifen;

public class While {
    public static void main(String[] args) {
        System.out.print("For:   ");
        for (int x = 1; x <= 5; x++) {
            System.out.print(x + "\t");
        }
        System.out.println(); // new line

        System.out.print("While: ");
        int x = 1;
        while (x <= 5) {
            System.out.print(x + "\t");
            x++;
        }
    }
}

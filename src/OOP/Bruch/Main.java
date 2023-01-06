package OOP.Bruch;

public class Main {
    public static void main(String[] args) {
        Bruch a = new Bruch(2, 3);
        Bruch b = new Bruch(1, 2);

        System.out.println("Bruch a: " + a);
        System.out.println("Bruch b: " + b);

        System.out.println("a + b = " + a.addieren(b));
        System.out.println("a * b = " + a.multi(b));
        System.out.println("Kehrwert von " + a + " --> " + a.kehrwert());
    }
}

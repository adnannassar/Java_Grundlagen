package OOP.BVB09;

public class Main {
    public static void main(String[] args) {
        Spieler mario = new Spieler("Mario", "Götze", "Mittelfeld", 5);
        Spieler pierre = new Spieler("Pierre-Emerik", "Aubameyang", "Sturm", 18);
        mario.berechneJahreGehalt();
        Trainer thomas = new Trainer("Thomas", "Tuchel");
        thomas.setLieblingsSpieler(pierre);

        Arzt markus = new Arzt("Markus", "Braun", "Orthopädie");
        System.out.printf("%-15s %-25s %-25s %-25s %-40s\n", "Type", "Name", "Vorname", "Jahresgehalt", "Sonstiges");
        for (int i = 0; i < 150; i++) {
            System.out.print("-");
        }
        System.out.printf("\n%-15s %-25s %-25s %-25s %-40s\n", 'S', mario.getName(), mario.getVorname(), mario.berechneJahreGehalt(), "Position: Mittelfeld / Spieleinsätze: 5 ");
        System.out.printf("%-15s %-25s %-25s %-25s %-40s\n", 'S', pierre.getName(), pierre.getVorname(), pierre.berechneJahreGehalt(), "Position: Mittelfeld / Spieleinsätze: 5 ");
        System.out.printf("%-15s %-25s %-25s %-25s %-40s\n", 'S', thomas.getName(), thomas.getVorname(), thomas.berechneJahreGehalt(), "Position: Mittelfeld / Spieleinsätze: 5 ");
        System.out.printf("%-15s %-25s %-25s %-25s %-40s\n", 'S', markus.getName(), markus.getVorname(), markus.berechneJahreGehalt(), "Position: Mittelfeld / Spieleinsätze: 5 ");


    }
}

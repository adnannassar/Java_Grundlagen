package OOP.BVB09;

public class Main {
    public static void main(String[] args) {

        Spieler pierre = new Spieler("Pierre-Emerik", "Aubameyang", "Sturm", 18);
        Trainer thomas = new Trainer("Thomas", "Tuchel");
        thomas.setLieblingsSpieler(pierre);

        // create instance of Mannschaftsverwaltung
        Mannschaftsverwaltung manschaftverwaltung = new Mannschaftsverwaltung("BVB 09");

        // adding mitglieder to Mannschaftsverwaltung
        manschaftverwaltung.addMitglied(new Spieler("Mario", "Götze", "Mittelfeld", 5));
        manschaftverwaltung.addMitglied(pierre);
        manschaftverwaltung.addMitglied(thomas);
        manschaftverwaltung.addMitglied(new Arzt("Markus", "Braun", "Orthopädie"));

        // display the infos
        manschaftverwaltung.showMitgliederInfo();


    }
}

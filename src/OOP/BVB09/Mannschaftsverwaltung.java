package OOP.BVB09;

import java.util.LinkedList;
import java.util.Scanner;

public class Mannschaftsverwaltung {

    Scanner scanner = new Scanner(System.in);
    private String name;
    private Mitglied[] mitglieder;
    private LinkedList<Spieler> spielers;

    public Mannschaftsverwaltung(String name) {
        this.name = name;
        this.mitglieder = new Mitglied[30];
        spielers = new LinkedList<>();
    }


    public void addMitglied(Mitglied mitglied) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] == null) {
                mitglieder[i] = mitglied;
                if (mitglied.getType() == MitgliedType.S) {
                    spielers.add((Spieler) mitglied);
                }
                break;
            }
        }
    }

    public void setMitglied(int pos, Mitglied mitglied) {
        if (pos >= 0 && pos < mitglieder.length) {
            mitglieder[pos] = mitglied;
        }
    }

    public void showMitgliederInfo() {
        char eingabe;
        do {
            System.out.printf("%-15s %-25s %-25s %-25s %-40s\n", "Type", "Name", "Vorname", "Jahresgehalt", "Sonstiges");
            for (int i = 0; i < 137; i++) {
                System.out.print("-");
            }

            double summe = 0;
            System.out.println();
            for (int i = 0; i < mitglieder.length; i++) {
                if (mitglieder[i] != null) {
                    summe += mitglieder[i].berechneJahreGehalt();
                    System.out.printf("%-15s %-25s %-25s %-25s %-40s\n", mitglieder[i].getType(), mitglieder[i].getName(), mitglieder[i].getVorname(), mitglieder[i].berechneJahreGehalt(), mitglieder[i].sonstiges());
                }
            }

            System.out.printf("\nSumme der Jahresgehälter:%53.2f\n\n", summe);
            System.out.println("Weiter Aktionen:");
            System.out.println("\t(A)rzt hinzufügen");
            System.out.println("\t(S)pieler hinzufügen");
            System.out.println("\t(T)rainer hinzufügen");
            System.out.println("\t(B)eenden hinzufügen");
            System.out.print("Ihre Eingabe: ");
            eingabe = scanner.next().charAt(0);

            switch (eingabe) {
                case 'A':
                    arztHinfügen();
                    break;
                case 'S':
                    spielerHinfügen();
                    break;
                case 'T':
                    trainerHinfügen();
                    break;
                case 'B':
                    System.out.println("Danke für die Nutzung von Mannschaftsverwaltung!");
                    break;
                default:
                    System.out.println("Bitte prüfen Sie Ihre Eingabe!");
            }
        } while (eingabe != 'B');

    }

    private void arztHinfügen() {
        System.out.println("Arzt Informationen Eingeben:");

        System.out.print("Vorname: ");
        String vorname = scanner.next();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Fachrichtung: ");
        String fachrichtung = scanner.next();

        Arzt arzt = new Arzt(vorname, name, fachrichtung);
        addMitglied(arzt);
        System.out.println("Arzt wurde erfolgreich hinzugefügt!");
    }

    private void spielerHinfügen() {
        System.out.println("Spieler Informationen Eingeben:");

        System.out.print("Vorname: ");
        String vorname = scanner.next();
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("SpielPosition: ");
        String spielPosition = scanner.next();
        System.out.print("Anzahl Spieleinsätzen: ");
        int anzahlSpielEinsätzen = scanner.nextInt();

        Spieler spieler = new Spieler(vorname, name, spielPosition, anzahlSpielEinsätzen);
        addMitglied(spieler);
        System.out.println("Spieler wurde erfolgreich hinzugefügt!");
    }

    private void trainerHinfügen() {
        System.out.println("Trainer Informationen Eingeben:");

        System.out.print("Vorname: ");
        String vorname = scanner.next();
        System.out.print("Name: ");
        String name = scanner.next();
        Trainer trainer = new Trainer(vorname, name);


        System.out.print("Hat der Trainer einen lieblings Spieler? (J)a / (N)ein: ");
        char liebSpielerEingabe = scanner.next().charAt(0);
        if (liebSpielerEingabe == 'J') {
            getALlSpieler();
            System.out.print("Bitte wählen Sie einen Spieler ein: ");
            int spielerIdEingabe = scanner.nextInt();
            trainer.setLieblingsSpieler(getSpieler(spielerIdEingabe));
        }

        addMitglied(trainer);
        System.out.println("Trainer wurde erfolgreich hinzugefügt!");
    }


    private Spieler getSpieler(int id) {
        for (int i = 0; i < spielers.size(); i++) {
            if (id - 1 == i) {
                return spielers.get(i);
            }
        }
        return null;
    }

    private void getALlSpieler() {
        int id = 1;
        for (int i = 0; i < spielers.size(); i++) {
            System.out.println(id++ + ". " + spielers.get(i).getVorname() + " " + spielers.get(i).getName());
        }
    }
}


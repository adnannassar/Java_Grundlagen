package OOP.Vererbung.MitarbeiterExample;

public abstract class Mitarbeiter {
    private String name;
    private int personalnummer;

    private static int anzahlMitarbeiter;

    public Mitarbeiter(String name) {
        this.name = name;
        anzahlMitarbeiter++;
        personalnummer = anzahlMitarbeiter;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    public abstract double berechneGehalt();

    @Override
    public String toString() {
        return "Name: " + name + ", Personalnummer: " + personalnummer;
    }

}

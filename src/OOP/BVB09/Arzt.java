package OOP.BVB09;

public class Arzt extends Mitglied {
    private String fachrichtung;

    public Arzt(String vorname, String name, String fachrichtung) {
        super(vorname, name, MitgliedType.A);
        this.fachrichtung = fachrichtung;
    }

    public String getFachrichtung() {
        return fachrichtung;
    }

    public void setFachrichtung(String fachrichtung) {
        this.fachrichtung = fachrichtung;
    }

    @Override
    public double berechneJahreGehalt() {
        return 10000 * 12;
    }

    @Override
    public String sonstiges() {
        return "Fachrichtung: " + fachrichtung;
    }
}

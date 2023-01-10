package OOP.BVB09;

public class Spieler extends Mitglied{
    private String spielPosition;
    private int anzahlSpielEinsätzen;

    public Spieler(String vorname, String name, String spielPosition, int anzahlSpielEinsätzen){
        super(vorname, name, MitgliedType.S);
        this.spielPosition = spielPosition;
        this.anzahlSpielEinsätzen = anzahlSpielEinsätzen;
    }

    public String getSpielPosition() {
        return spielPosition;
    }

    public int getAnzahlSpielEinsätzen() {
        return anzahlSpielEinsätzen;
    }

    public void setSpielPosition(String spielPosition) {
        this.spielPosition = spielPosition;
    }

    public void setAnzahlSpielEinsätzen(int anzahlSpielEinsätzen) {
        this.anzahlSpielEinsätzen = anzahlSpielEinsätzen;
    }

    @Override
    public double berechneJahreGehalt() {
        return (180000 * 12 ) + (5000 * anzahlSpielEinsätzen) ;
    }

    @Override
    public String sonstiges() {
        return "Position: " + spielPosition + " / Spieleinsätze: " + anzahlSpielEinsätzen;
    }
}

package OOP.Vererbung.MitarbeiterExample;

public class Arbeiter extends Mitarbeiter {
    private double stundenlohn, anzahlStunden, überstundenzuschlag, anzahlÜberstunden;

    public Arbeiter(String name, double stundenlohn, double anzahlStunden, double überstundenzuschlag) {
        super(name);
        this.stundenlohn = stundenlohn;
        this.anzahlStunden = anzahlStunden;
        this.überstundenzuschlag = überstundenzuschlag;
    }

    public void setAnzahlÜberstunden(double anzahlÜberstunden) {
        this.anzahlÜberstunden = anzahlÜberstunden;
    }

    @Override
    public double berechneGehalt() {
        double grundGehalt = stundenlohn * anzahlStunden * 12;
        double überStundenGehalt = anzahlÜberstunden * überstundenzuschlag;
        return grundGehalt + überStundenGehalt;
    }

    @Override
    public String toString(){
        return super.toString() + ", Stundenlohn: " + stundenlohn + ", Überstundenzuschlag: " + überstundenzuschlag + ", Jahresgehalt: "+ berechneGehalt();
    }
}

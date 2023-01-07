package OOP.Vererbung.MitarbeiterExample;

public class Manager extends Mitarbeiter {
    private double festgehalt, provision, umsatz;

    public Manager(String name, double festgehalt, double provision) {
        super(name);
        this.festgehalt = festgehalt;
        this.provision = provision;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    @Override
    public double berechneGehalt() {
        return festgehalt + provision + umsatz;
    }

    @Override
    public String toString() {
        return super.toString() + ", Festgehalt: " + festgehalt + ", Provision: " + provision + ", Umsatz: " + umsatz + " Jahresgehalt: " + berechneGehalt();
    }
}

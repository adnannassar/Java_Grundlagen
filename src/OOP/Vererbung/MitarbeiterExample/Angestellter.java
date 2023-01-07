package OOP.Vererbung.MitarbeiterExample;

public class Angestellter extends Mitarbeiter {
    private double grundgehalt, ortszuschlag, zulage;

    public Angestellter(String name, double grundgehalt, double ortszuschlag, double zulage) {
        super(name);
        this.grundgehalt = grundgehalt;
        this.ortszuschlag = ortszuschlag;
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
        return grundgehalt + ortszuschlag + zulage;
    }

    @Override
    public String toString() {
      return super.toString() + ", grundgehalt: "+ grundgehalt+ ", Ortszuschlag: " + ortszuschlag+ ", Zulage: " + zulage + " Jahresgehalt: " + berechneGehalt();
    }
}

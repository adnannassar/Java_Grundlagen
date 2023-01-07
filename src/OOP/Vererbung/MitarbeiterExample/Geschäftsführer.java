package OOP.Vererbung.MitarbeiterExample;

public class Geschäftsführer extends Manager {
    private double zulage;

    public Geschäftsführer(String name, double festgehalt, double provision, double zulage) {
        super(name, festgehalt, provision);
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
        return super.berechneGehalt() + zulage;
    }
}

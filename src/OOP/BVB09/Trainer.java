package OOP.BVB09;

public class Trainer extends Mitglied {
    private Spieler lieblingsSpieler;

    public Trainer(String vorname, String name) {
        super(vorname, name, MitgliedType.T);
    }

    public void setLieblingsSpieler(Spieler lieblingsSpieler) {
        this.lieblingsSpieler = lieblingsSpieler;
    }

    @Override
    public double berechneJahreGehalt() {
        return 165000 * 12;
    }

    @Override
    public String sonstiges() {
        if (lieblingsSpieler != null) {
            return "Lieblingsspieler: " + lieblingsSpieler.getVorname() + " " + lieblingsSpieler.getName();
        } else {
            return "-";
        }
    }
}

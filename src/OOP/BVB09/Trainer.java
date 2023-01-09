package OOP.BVB09;

public class Trainer extends Mitglied {
    private Spieler lieblingsSpieler;
    public Trainer(String vorname, String name) {
        super(vorname, name);
    }

    public void setLieblingsSpieler(Spieler lieblingsSpieler) {
        this.lieblingsSpieler = lieblingsSpieler;
    }

    @Override
    public double berechneJahreGehalt() {
        return 165000 * 12 ;
    }
}

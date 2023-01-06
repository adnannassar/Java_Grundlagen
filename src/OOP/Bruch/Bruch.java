package OOP.Bruch;

public class Bruch {
    private int zähler;
    private int nenner;

    public Bruch() {
    }

    public Bruch(int zähler, int nenner) {
        this.zähler = zähler;
        this.nenner = nenner;
    }

    public int getZähler() {
        return this.zähler;
    }

    public int getNenner() {
        return this.nenner;
    }

    public Bruch kehrwert() {
        return new Bruch(nenner, zähler);
    }

    public Bruch addieren(Bruch b) {
        if (this.nenner == b.nenner) {
            int newZähler = this.zähler + b.zähler;
            return new Bruch(newZähler, this.nenner);
        } else {
            int gesamtNenner = this.nenner * b.nenner;
            int neueThisZähler = this.zähler * b.nenner;
            int neueBZähler = this.nenner * b.zähler;
            return new Bruch(neueThisZähler + neueBZähler, gesamtNenner);
        }
    }

    public Bruch multi(Bruch b) {
        return new Bruch(this.zähler * b.zähler, this.nenner * b.nenner);
    }

    @Override
    public String toString() {
        return zähler + "/" + nenner;
    }
}

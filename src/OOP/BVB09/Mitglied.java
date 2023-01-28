package OOP.BVB09;

public abstract class Mitglied {

    private String vorname;
    private String name;

    private MitgliedType type;

    public Mitglied(String vorname, String name, MitgliedType type) {
        this.vorname = vorname;
        this.name = name;
        this.type = type;
    }

    public MitgliedType getType() {
        return type;
    }

    public final String getVorname() {
        return vorname;
    }

    public final void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double berechneJahreGehalt();
    public abstract String sonstiges();
}

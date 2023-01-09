package OOP.BVB09;

public abstract class Mitglied {

    private String vorname;
    private String name;

    public Mitglied(String vorname, String name) {
        this.vorname = vorname;
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double berechneJahreGehalt();
}

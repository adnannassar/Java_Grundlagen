package OOP.Vererbung.Example1;

public class Mitarbeiter extends Person {
    private String fachrichtung;
    public Mitarbeiter(String name, int age ,String fachrichtung ){
        super(name, age);
        this.fachrichtung = fachrichtung;
    }

    public void setFachrichtung(String fachrichtung) {
        this.fachrichtung = fachrichtung;
    }

    public String getFachrichtung() {
        return fachrichtung;
    }

    @Override
    public void printInfo(){
        System.out.println("\nMitarbeiter Info:" );
        System.out.println("Name: " + getName()+ ", Age: " + getAge()+ ", Fachrichtung: "+ fachrichtung);
    }
}

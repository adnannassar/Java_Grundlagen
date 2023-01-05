package OOP.Vererbung.Example1;

public class Vorstand extends Person {
    private int erfahrungJahren;
    private String abteilung;

    public Vorstand(String name, int age, int erfahrungJahren, String  abteilung) {
        super(name, age);
        this.erfahrungJahren = erfahrungJahren;
        this.abteilung = abteilung;
    }

    public int getErfahrungJahren() {
        return erfahrungJahren;
    }

    public void setErfahrungJahren(int erfahrungJahren) {
        this.erfahrungJahren = erfahrungJahren;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    @Override
    public void printInfo(){
        System.out.println("\nVorstand Info:" );
        System.out.println("Name: " + getName()+ ", Age: " + getAge()+ ", Abteilung: " + abteilung+ ", Erfahrungjahren: " + erfahrungJahren);
    }

}

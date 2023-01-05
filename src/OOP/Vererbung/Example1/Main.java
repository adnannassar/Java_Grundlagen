package OOP.Vererbung.Example1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Person", 20);
        Mitarbeiter mitarbeiter = new Mitarbeiter("Mitarbeiter", 25, "Frontend");
        Vorstand vorstand = new Vorstand("Vorstand", 30, 15, "Finanz");

        person.printInfo();
        mitarbeiter.printInfo();
        vorstand.printInfo();

    }
}

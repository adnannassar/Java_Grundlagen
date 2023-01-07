package OOP.Vererbung.MitarbeiterExample;

public class Büro {
    public static void main(String[] args) {
        Arbeiter arbeiter = new Arbeiter("Arbeiter", 20, 17, 25);
        arbeiter.setAnzahlÜberstunden(30);
        Angestellter angestellter = new Angestellter("Angestellter", 50000, 3500, 1500);
        Manager manager = new Manager("Manager", 70000, 10000);
        Geschäftsführer geschäftsführer = new Geschäftsführer("Geschäftsführer", 200000, 80000, 50000);


        Mitarbeiter[] mitarbeiters = new Mitarbeiter[4];
        mitarbeiters[0] = arbeiter;
        mitarbeiters[1] = angestellter;
        mitarbeiters[2] = manager;
        mitarbeiters[3] = geschäftsführer;

        for (int i = 0; i < mitarbeiters.length; i++) {
            System.out.println(mitarbeiters[i]);
        }

    }
}

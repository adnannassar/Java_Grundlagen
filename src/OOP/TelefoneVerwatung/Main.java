package OOP.TelefoneVerwatung;


public class Main {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone(1, "0123456", 6);

        Smartphone smartphone2 = new Smartphone(2, "6543210", 5);

        smartphone1.addSMS(101, "Hallo how r u?");
        smartphone1.addSMS(102, "Hi, fine thanks. and u?");
        smartphone1.addSMS(101, "Good. thanks. how is your family");
        smartphone1.addSMS(102, "They are well, thanks god!");

        System.out.println("Anzahl SMS in smart Phone = " + smartphone1.getAnzahlSMS());

        smartphone1.ausgebenSMS();

        System.out.println(smartphone1);
        System.out.println(smartphone2);

    }
}

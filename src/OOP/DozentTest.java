package OOP;

public class DozentTest {
    public static void main(String[] args) {
        Dozent dieDozentin = new Dozent("Frau Müller", "Informatik", 'W');
        dieDozentin.setLehrgebiet("Mathe");

        Dozent derDekan = new Dozent("Herr Vollmer", "Informatik", 'M');
        derDekan.setDekan(true);
        derDekan.setLehrgebiet("Mathe");

        System.out.println("Dekan Attribute:");
        System.out.println("Name: " +  derDekan.getName());
        System.out.println("Lehrgebiet: " +  derDekan.getLehrgebiet());
        System.out.println("Geschlecht: " +  derDekan.getGeschlecht());
        System.out.println("Ist Dekan: " +  derDekan.isDekan());
    }
}

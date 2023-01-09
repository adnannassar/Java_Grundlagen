package OOP.TelefoneVerwatung;


import java.time.LocalTime;

public class Smartphone extends Telefon implements Uhr {
    private double displayGröße;
    private SMS[] messages;

    public Smartphone(int id, String rufnummer, double displayGröße) {
        super(id, rufnummer);
        this.displayGröße = displayGröße;
        messages = new SMS[1000];
    }

    public double getDisplayGröße() {
        return displayGröße;
    }

    public int getAnzahlSMS() {
        int counter = 0;
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] != null) {
                counter++;
            }

        }
        return counter;
    }

    public int addSMS(int empfängerID, String text) {
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                messages[i] = new SMS(empfängerID, text);
                return i;
            }
        }
        return -1;
    }

    public void ausgebenSMS() {
        for (int i = 0; i < messages.length; i++) {
            if(messages[i] != null){
                System.out.println(messages[i]);
            }

        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Display Größe: " + displayGröße;
    }

    @Override
    public LocalTime getUhrzeit() {
        return LocalTime.now();
    }

}

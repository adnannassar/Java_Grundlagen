package Kontrolstrukture.Auswahl;

import java.util.Locale;

public class Switch {
    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 1:
                System.out.println("X = 1");
                break;
            case 2:
                System.out.println("X = 2");
                break;
            case 3:
                System.out.println("X = 3");
                break;
            case 5:
                System.out.println("X = 5");
                break;
            case 10:
                System.out.println("X = 10");
                break;
            default:
                System.out.println("X is not 1 or 2 or 3 or 5 or 10");
        }

        // Beispiel 2
        String m = "März";
        switch (m) {
            case "Januar":
                System.out.println("31");
                break;
            case "Februar":
                System.out.println("28");
                break;
            case "März":
                System.out.println("31");
                break;
            case "April":
                System.out.println("30");
                break;
            case "Mai":
                System.out.println("31");
                break;
            case "June":
                System.out.println("30");
                break;
            case "July":
                System.out.println("31");
                break;
            case "August":
                System.out.println("31");
                break;
            case "September":
                System.out.println("30");
                break;
            case "Oktober":
                System.out.println("31");
                break;
            case "November":
                System.out.println("30");
                break;
            case "Dezember":
                System.out.println("31");
                break;
            default:
                System.out.println("Falsche Eingabe");

        }

        // Beispiel 3 optimal
        String monthName = "June";
        switch (monthName) {
            case "Januar":
            case "März":
            case "Mai":
            case "July":
            case "August":
            case "Oktober":
            case "Dezember":
                System.out.println("31");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30");
                break;
            case "Februar":
                System.out.println("28");
                break;
            default:
                System.out.println("Falsche Eingabe");

        }

        int auswahl = 30;
        switch (auswahl) {
            case 31:
                System.out.println("Januar, März, Mai, July, August, Oktober, Dezember haben 31 Tagen");
                break;
            case 30:
                System.out.println("April, June, September, November haben 30 Tagen");
                break;
            case 28:
                System.out.println("Februar hat  28 Tagen");
                break;
            default:
                System.out.println("Falsche Eingabe");
        }
    }
}

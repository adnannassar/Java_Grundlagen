package Kontrolstrukture.Schleifen;

public class DoWhile {
    public static void main(String[] args) {
        System.out.print("While:    ");
        int x = 10;
        while (x <= 5) {
            System.out.print(x + "\t");
            x++;
        }
        System.out.println(); // new Line

        System.out.print("Do While: ");
        int y = 10;
        do{
            System.out.print(y + "\t");
            y++;
        }while(y <= 5);

    }
}

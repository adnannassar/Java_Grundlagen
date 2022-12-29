package OOP;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student amani = new Student("Amani", 20, 1.0f);
        amani.setNote(1.7f);

        Student ayat = new Student("Ayat", 0, 1.3f);
        ayat.setAge(25);

        Student adnan = new Student("Adnan", 30, 4.3f);


        Student[] students = {amani, ayat, adnan};

        for (int i = 0; i < students.length; i++) {
            students[i].showInfo();
        }
    }


}




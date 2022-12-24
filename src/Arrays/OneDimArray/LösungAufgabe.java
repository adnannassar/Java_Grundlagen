package Arrays.OneDimArray;

public class LösungAufgabe {
    // 1. ohne schleife
    static int[] array1a = {2, 6, -1, 4};
    static int[] array1b = new int[10];
    static int[] arrayRandom = new int[8];
    static String[] lehrerArray = {"Mrs.Luis", "Mr.Kanon", "Mrs.Müller", "Mr.Vollmer"};

    public static void main(String[] args) {

        // 1. mit schleife
        aufgabe1();

        // 2
       aufgabe2();

        // 3
       aufgabe3();

        // 3.1
        aufgabe3b();

        // 4
        aufgabe4();


        // 4.1
        aufgabe4b();

        // 4.2
        aufgabe4c();


        // 5
        aufgabe5();


        // 6
        aufgabe6();

        // 7
        aufgabe7();

        // 8
        aufgabe8();

        // 9
        aufgabe9();

    }

    private static void aufgabe9() {
        String[] umlautArray = {"Plätzchen", "Brötchen", "Büchlein", "Ändern", "Übertreiben", "Ähnlich", "Servus", "Hallo", "Hi"};
        printAufgabe("Aufgabe 9: ", umlautArray);
        System.out.print("Anzahl umlaute in umlautArray =  " + anzahlUmlaut(umlautArray));
        System.out.println();

    }
    private static void aufgabe8() {
        int[] array = {2, 4, 6, 8, 10};
        printAufgabe("Aufgabe 8: ", array);
        boolean erg = sindAlleGerade(array);
        System.out.println("Sind alle zahlen in array gerade? --> " + erg);
    }
    private static void aufgabe7() {
        removeMrsAndMr(lehrerArray);
        printAufgabe("Aufgabe 7: ", lehrerArray);
    }
    private static void aufgabe6() {
        swap(lehrerArray, 1, 2);
        printAufgabe("Aufgabe 6: ", lehrerArray);
    }
    private static void aufgabe5() {
        printAufgabe("Aufgabe 5: ", lehrerArray);
    }
    private static void aufgabe4c() {
        System.out.print("Aufgabe 4.2: größte Zahl in arrayRandom: ");
        System.out.print(max(arrayRandom) + "\n");
    }
    private static void aufgabe4b() {
        System.out.print("Aufgabe 4.1: kleinste Zahl in arrayRandom: ");
        System.out.print(min(arrayRandom) + "\n");
    }
    private static void aufgabe4() {
        fillWithRandoms(arrayRandom);
        printAufgabe("Aufgabe 4: ", arrayRandom);
    }
    private static void aufgabe3b() {
        System.out.print("Aufgabe 3.1: Durchschnitt von array1a = ");
        int durchschnitt = summeOfArray(array1a) / array1a.length;
        System.out.print(durchschnitt + "\n");
    }
    private static void aufgabe3() {
        System.out.print("Aufgabe 3: Summe von array1a = ");
        System.out.print(summeOfArray(array1a) + "\n");
    }
    public static void aufgabe1() {
        fillQuadrat(array1b);
    }
    public static void aufgabe2() {
        printAufgabe("Aufgabe 2: ", array1b);
    }
    public static void removeMrsAndMr(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].startsWith("Mrs.")) {
                array[i] = array[i].substring(4);
            } else {
                array[i] = array[i].substring(3);
            }
        }
    }
    public static void swap(String array[], int a, int b) {
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public static int summeOfArray(int[] array) {
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        return summe;
    }
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void fillWithRandoms(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 50 + 1);
            array[i] = random;
        }
    }
    public static void fillQuadrat(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(2, i);
        }
    }
    public static void printAufgabe(String aufgabeName, int[] array) {
        System.out.print(aufgabeName);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
    public static void printAufgabe(String aufgabeName, String[] array) {
        System.out.print(aufgabeName);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
    public static boolean sindAlleGerade(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    public static int anzahlUmlaut(String[] array) {
        // ö, ä, ü , Ö, Ä, Ü
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].startsWith("ä") || array[i].startsWith("Ä") || array[i].startsWith("ö") || array[i].startsWith("Ö") || array[i].startsWith("ü") || array[i].startsWith("Ü")) {
                counter++;
            }
        }
        return counter;
    }
}

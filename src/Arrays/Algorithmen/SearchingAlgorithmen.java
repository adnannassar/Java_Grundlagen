package Arrays.Algorithmen;

public class SearchingAlgorithmen {
    public static void main(String[] args) {
        String[] names = {"Amani", "Ayat", "Joudi", "Rahaf", "Saif", "Sedra"};
        printArray("Names", names);
        String name = "Sedra";

        if (searchName(name, names)) {
            System.out.println(name + " wurde gefunden!");
        } else {
            System.out.println(name + " wurde nicht gefunden!");
        }
    }


    public static boolean searchName(String name, String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(String arrayName, String[] array) {
        System.out.print(arrayName + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

}

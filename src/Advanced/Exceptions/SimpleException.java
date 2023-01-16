package Advanced.Exceptions;

import java.util.Scanner;

public class SimpleException {


    public static void main(String[] args) {
        System.out.println("Before");
        Scanner scanner = new Scanner(System.in);

        System.out.print("b: ");
        int b = scanner.nextInt();
        try {
            System.out.println(sub(10, b));
        }catch (SecondNumberIsZeroException ex){
            System.out.println(ex.getMessage());
        }

        int[] array = {1, 2, 3, 4, 5};
        printArray(array);
        System.out.println("After");


    }

    public static int sub(int a, int b) throws SecondNumberIsZeroException  {
        if (b != 0) {
            return a / b;
        } else {
            throw new SecondNumberIsZeroException("B is zero!!");
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}

package Operatoren;

public class Operatoren {
    public static void main(String[] args) {
        // + - * / % < > = <= >= ++ -- += -= *= /* %= && || == !=
        int x = 7;
        int y = 100;
        System.out.println(x);

        boolean isBiggerThanZeroAndSmallerThanTen = (x > 0) == (x < 4);
        boolean isBiggerThanZeroAndSmallerThanTen2 = 'a' != 'n';


        System.out.println(x + " +  " + y + " = " + (x + y));
        System.out.println(x + " -  " + y + " = " + (x - y));
        System.out.println(x + " *  " + y + " = " + (x * y));
        System.out.println(x + " /  " + y + " = " + (x / y));
        System.out.println(x + " %  " + y + " = " + (x % y));
        System.out.println(x + " <  " + y + " = " + (x < y));
        System.out.println(x + " >  " + y + " = " + (x > y));
        System.out.println(x + " <= " + y + " = " + (x <= y));
        System.out.println(x + " >= " + y + " = " + (x >= y));


        // Prefix and Postfix
        int number = 10;
        System.out.println("Number: "+ number++);
        System.out.println("Number: "+ ++number);


        int a = 1;
        int b = 2;
        System.out.println(++a);
        System.out.println(a);
        System.out.println(++b); // 3


    }
}

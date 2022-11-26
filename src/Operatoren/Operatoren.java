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

    }
}

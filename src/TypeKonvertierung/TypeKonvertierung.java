package TypeKonvertierung;

public class TypeKonvertierung {

    public static void main(String[] args) {
        int x = 200;
        long y =  x; // implizite
        System.out.println(y);


        int a = 100;
        byte b = (byte) a; // explizite
        System.out.println(b);

    }
}

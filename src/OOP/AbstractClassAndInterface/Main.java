package OOP.AbstractClassAndInterface;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle", "Blue", 2, 2, 2);

        Square square = new Square("Square", "Red", 4);

        Reqtanlge reqtanlge = new Reqtanlge("Reqtangle", "Yellow", 2, 3);

        Circle circle = new Circle("Circle", "Black", 5.2);

        System.out.println(square);
        System.out.println(reqtanlge);
        System.out.println(circle);
        System.out.println(triangle);
    }
}

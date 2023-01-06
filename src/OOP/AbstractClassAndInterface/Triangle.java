package OOP.AbstractClassAndInterface;

public class Triangle extends Form {
   private int len1, len2, len3;

    public Triangle(String name, String color, int len1, int len2, int len3) {
        super(name, color);
        this.len1 = len1;
        this.len2 = len2;
        this.len3 = len3;
    }

    public int getLen1() {
        return len1;
    }

    public void setLen1(int len1) {
        this.len1 = len1;
    }

    public int getLen2() {
        return len2;
    }

    public void setLen2(int len2) {
        this.len2 = len2;
    }

    public int getLen3() {
        return len3;
    }

    public void setLen3(int len3) {
        this.len3 = len3;
    }

    @Override
    public double berechneFläche() {
        return len1 * len2 * len3;
    }
}

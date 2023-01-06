package OOP.AbstractClassAndInterface;

public class Reqtanlge extends Form implements VolumenRechner{
    int length, width;
    public Reqtanlge(String name, String color,  int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double berechneFläche() {
        return length * width;
    }

    @Override
    public double berechneVolumen() {
        return 20;
    }
}

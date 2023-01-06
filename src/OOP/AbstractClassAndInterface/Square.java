package OOP.AbstractClassAndInterface;

public class Square extends Form implements VolumenRechner {
    private int length;

    public Square(String name, String color, int length){
        super(name, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double berechneFläche(){
        return length * length;
    }


    @Override
    public double berechneVolumen() {
        return 10;
    }
}

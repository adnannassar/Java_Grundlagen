package OOP.AbstractClassAndInterface;

public abstract class Form {
    private String name;
    private String color;

    public Form(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract double berechneFläche();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
      return "Name: "+ name + ", Color: " + color + ", Fläche: " + berechneFläche();
    }
}

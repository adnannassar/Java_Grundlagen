package OOP.VMSpeielen;

public class Mannschaft {
    private String name;
    private int points;

    public Mannschaft(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }
}

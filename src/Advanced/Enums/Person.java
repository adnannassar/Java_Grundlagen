package Advanced.Enums;

public class Person {
    private String name;
    private int age;
    private Geschlecht geschlecht;

    public Person(String name, int age, Geschlecht geschlecht) {
        this.name = name;
        this.age = age;
        this.geschlecht = geschlecht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Geschlecht: " + geschlecht.toString().toLowerCase();
    }
}

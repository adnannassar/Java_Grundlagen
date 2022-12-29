package OOP;

public class Student {
    private float note;
    private String name;
    private int age;

    // constructor
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, float note) {
        this.name = name;
        this.age = age;
        this.note = note;
    }


    // Getter
    public String getName() {
        return this.name;
    }

    public float getNote() {
        return this.note;
    }

    public int getAge() {
        return this.age;
    }

    // Setter
    public void setNote(float note) {
        this.note = note;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // actions
    public void showInfo() {
        System.out.println("Name: " + name + "\tAge: " + age + "\tNote: " + note + "\tStatus: " + getStatus());
    }

    public String getStatus() {
        if (note > 4.0) {
            return "Nicht bestanden!";
        } else {
            return "bestanden";
        }
    }

}
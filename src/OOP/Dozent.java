package OOP;

public class Dozent {
    private String name;
    private String lehrgebiet;
    private boolean isDekan = false;
    private char geschlecht;

    Dozent(String name, String lehrgebiet, char geschlecht) {
        this.name = name;
        this.lehrgebiet = lehrgebiet;
        this.geschlecht = geschlecht;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLehrgebiet(String lehrgebiet) {
        this.lehrgebiet = lehrgebiet;
    }

    void setDekan(boolean dekan) {
        isDekan = dekan;
    }

    void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    String getName() {
        return name;
    }

    String getLehrgebiet() {
        return lehrgebiet;
    }

    boolean isDekan() {
        if (isDekan == true) {
            return true;
        } else {
            return false;
        }
    }

    char getGeschlecht() {
        return geschlecht;
    }
}

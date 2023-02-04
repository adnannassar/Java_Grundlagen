package org.example;

public class MyMath {
    private String name;

    public int add(int a, int b) {
        return a + b;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBigger(int a, int b) {
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }


    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero!");
        } else {
            return a / b;
        }
    }
}
